package com.volcengine.auth;

import com.squareup.okhttp.*;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.Http1xStream;
import com.volcengine.ApiException;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

import javax.net.SocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/** Scoped CONNECT support for OkHttp 2.7.5, including proxies closing a 407. */
final class StsProxySupport {
    private StsProxySupport() {
    }

    static final class AuthenticationException extends IOException {
        AuthenticationException() {
            super("STS proxy authentication failed");
        }
    }

    // Translate only after OkHttp has released the failed tunnel allocation.
    // The normal response path preserves 407 for both SDK retry policies and callbacks.
    static final Interceptor PROXY_AUTH_RESPONSE = chain -> {
        try {
            return chain.proceed(chain.request());
        } catch (AuthenticationException e) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1)
                    .code(407).message(e.getMessage())
                    .body(ResponseBody.create(null, "")).build();
        }
    };

    static void configure(OkHttpClient client, String proxyUrl, String endpoint) throws ApiException {
        final Proxy proxy = StsFormRequest.parseProxy(proxyUrl);
        final boolean hasCredentials = StsFormRequest.proxyAuthorizationHeader(proxyUrl) != null;
        // Preserve caller authentication when the proxy URL has no credentials.
        final Authenticator authenticator = hasCredentials
                ? StsFormRequest.proxyAuthenticator(proxyUrl) : null;
        client.setProxy(proxy);
        if (hasCredentials) {
            client.setAuthenticator(authenticator);
        }
        final HttpUrl target = HttpUrl.parse(endpoint);
        if (target == null || !target.isHttps()) {
            return;
        }
        final SocketFactory sockets = client.getSocketFactory() == null
                ? SocketFactory.getDefault() : client.getSocketFactory();
        final int readTimeout = client.getReadTimeout();
        final int writeTimeout = client.getWriteTimeout();
        // OkHttp 2.7.5 retries CONNECT on the same stream after 407. Establish
        // the tunnel ourselves; OkHttp still performs TLS, hostname checking,
        // certificate pinning and the actual request on this socket.
        client.setProxy(Proxy.NO_PROXY);
        client.setDns(host -> {
            if (!host.equals(target.host())) {
                throw new UnknownHostException("STS proxy redirect target changed");
            }
            // The proxy resolves the origin. No local origin DNS lookup is needed.
            return Collections.singletonList(InetAddress.getByAddress(host, new byte[]{127, 0, 0, 1}));
        });
        client.setFollowRedirects(false);
        client.setFollowSslRedirects(false);
        client.setSocketFactory(new SocketFactory() {
            @Override public Socket createSocket() {
                return new TunnelSocket(sockets, proxy, authenticator, target, readTimeout, writeTimeout);
            }
            @Override public Socket createSocket(String host, int port) throws IOException {
                throw new IOException("Connected socket creation is unsupported");
            }
            @Override public Socket createSocket(String host, int port, InetAddress local, int localPort) throws IOException {
                throw new IOException("Connected socket creation is unsupported");
            }
            @Override public Socket createSocket(InetAddress host, int port) throws IOException {
                throw new IOException("Connected socket creation is unsupported");
            }
            @Override public Socket createSocket(InetAddress host, int port, InetAddress local, int localPort) throws IOException {
                throw new IOException("Connected socket creation is unsupported");
            }
        });
    }

    private static final class TunnelSocket extends Socket {
        private final SocketFactory sockets;
        private final Proxy proxy;
        private final Authenticator authenticator;
        private final HttpUrl target;
        private final int writeTimeout;
        private int readTimeout;
        private volatile Socket delegate;
        private volatile boolean closed;

        TunnelSocket(SocketFactory sockets, Proxy proxy, Authenticator authenticator,
                     HttpUrl target, int readTimeout, int writeTimeout) {
            this.sockets = sockets;
            this.proxy = proxy;
            this.authenticator = authenticator;
            this.target = target;
            this.readTimeout = readTimeout;
            this.writeTimeout = writeTimeout;
        }

        @Override public void connect(SocketAddress ignored, int timeout) throws IOException {
            String authority = (target.host().contains(":") ? "[" + target.host() + "]" : target.host())
                    + ":" + target.port();
            Request request = new Request.Builder().url(target)
                    .header("Host", authority).method("CONNECT", null).build();
            for (int attempt = 0; attempt < 2; attempt++) {
                Socket socket = sockets.createSocket();
                delegate = socket;
                if (closed) {
                    socket.close();
                    throw new IOException("Socket closed");
                }
                boolean established = false;
                try {
                    socket.setSoTimeout(readTimeout);
                    try {
                        socket.connect(proxy.address(), timeout);
                    } catch (ConnectException e) {
                        // Avoid OkHttp rewriting the address to the synthetic origin.
                        // SocketException preserves SDK network retries; other failures,
                        // especially interrupted I/O, must retain their original type.
                        InetSocketAddress address = (InetSocketAddress) proxy.address();
                        String host = address.getHostString();
                        SocketException failure = new SocketException(
                                "Failed to connect to STS proxy at "
                                        + (host.contains(":") ? "[" + host + "]" : host)
                                        + ":" + address.getPort() + ": " + e.getMessage());
                        failure.initCause(e);
                        throw failure;
                    }
                    BufferedSource source = Okio.buffer(Okio.source(socket));
                    BufferedSink sink = Okio.buffer(Okio.sink(socket));
                    source.timeout().timeout(readTimeout, TimeUnit.MILLISECONDS);
                    sink.timeout().timeout(writeTimeout, TimeUnit.MILLISECONDS);
                    Http1xStream stream = new Http1xStream(null, source, sink);
                    stream.writeRequest(request.headers(), "CONNECT " + authority + " HTTP/1.1");
                    stream.finishRequest();
                    Response response = stream.readResponse().request(request).build();
                    if (response.code() == 200) {
                        if (source.buffer().size() != 0) {
                            throw new IOException("Unexpected bytes after CONNECT");
                        }
                        established = true;
                        return;
                    }
                    if (response.code() != 407) {
                        throw new IOException("STS proxy CONNECT failed with status " + response.code());
                    }
                    Request authenticated = authenticator == null
                            ? null : authenticator.authenticateProxy(proxy, response);
                    if (authenticated == null || attempt != 0) {
                        throw new AuthenticationException();
                    }
                    request = authenticated;
                } finally {
                    if (!established) {
                        Util.closeQuietly(socket);
                    }
                }
            }
            throw new AuthenticationException();
        }

        @Override public void connect(SocketAddress address) throws IOException { connect(address, 0); }
        @Override public InputStream getInputStream() throws IOException { return delegate.getInputStream(); }
        @Override public OutputStream getOutputStream() throws IOException { return delegate.getOutputStream(); }
        @Override public synchronized void close() throws IOException {
            closed = true;
            if (delegate != null) delegate.close();
            super.close();
        }
        @Override public boolean isConnected() { return delegate != null && delegate.isConnected(); }
        @Override public boolean isClosed() { return closed || (delegate != null && delegate.isClosed()); }
        @Override public boolean isInputShutdown() { return delegate != null && delegate.isInputShutdown(); }
        @Override public boolean isOutputShutdown() { return delegate != null && delegate.isOutputShutdown(); }
        @Override public void shutdownInput() throws IOException { delegate.shutdownInput(); }
        @Override public void shutdownOutput() throws IOException { delegate.shutdownOutput(); }
        @Override public void setSoTimeout(int timeout) throws SocketException {
            readTimeout = timeout;
            if (delegate != null) delegate.setSoTimeout(timeout);
        }
        @Override public int getSoTimeout() throws SocketException { return readTimeout; }
        @Override public void setTcpNoDelay(boolean enabled) throws SocketException {
            if (delegate != null) delegate.setTcpNoDelay(enabled);
        }
        @Override public boolean getTcpNoDelay() throws SocketException { return delegate.getTcpNoDelay(); }
        @Override public InetAddress getInetAddress() { return delegate.getInetAddress(); }
        @Override public InetAddress getLocalAddress() { return delegate.getLocalAddress(); }
        @Override public int getPort() { return delegate.getPort(); }
        @Override public int getLocalPort() { return delegate.getLocalPort(); }
        @Override public SocketAddress getRemoteSocketAddress() { return delegate.getRemoteSocketAddress(); }
        @Override public SocketAddress getLocalSocketAddress() { return delegate.getLocalSocketAddress(); }
    }
}
