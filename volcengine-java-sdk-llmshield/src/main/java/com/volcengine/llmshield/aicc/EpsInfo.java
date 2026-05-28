package com.bytedance.jeddak_secure_channel;

import java.util.Locale;

final class EpsInfo {
    final String url;

    final String podName;

    final boolean needEvidence;

    final boolean attestGpu;

    EpsInfo(String url, String podName, boolean needEvidence, boolean attestGpu) {
        this.url = url;
        this.podName = podName;
        this.needEvidence = needEvidence;
        this.attestGpu = attestGpu;
    }

    static EpsInfo fromConfig(ServerConfig config) {
        String host = System.getenv("JPCC_HOST_IP");
        if (host == null) {
            host = "localhost";
        }
        String epsUrl = "http://" + host + ":8006";

        String podName = System.getenv("HOSTNAME");
        if (podName == null) {
            podName = "";
        }

        boolean needEvidence;
        String needEvidenceEnv = System.getenv("NEED_EVIDENCE");
        if (needEvidenceEnv != null) {
            needEvidence = !needEvidenceEnv.toLowerCase(Locale.ROOT).equals("false");
        } else {
            needEvidence = config.needEvidence;
        }

        boolean attestGpu;
        String attestGpuEnv = System.getenv("ATTEST_GPU");
        if (attestGpuEnv != null) {
            attestGpu = !attestGpuEnv.toLowerCase(Locale.ROOT).equals("false");
        } else {
            attestGpu = config.attestGpu;
        }

        return new EpsInfo(epsUrl, podName, needEvidence, attestGpu);
    }
}
