/*
 * cloud_detect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clouddetect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clouddetect.model.RequestHeaderForGetTaskResultOutput;
import com.volcengine.clouddetect.model.ResponseHeaderForGetTaskResultOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LocationDetailForGetTaskResultOutput
 */



public class LocationDetailForGetTaskResultOutput {
  @SerializedName("RemoteAddress")
  private String remoteAddress = null;

  @SerializedName("RequestHeaders")
  private List<RequestHeaderForGetTaskResultOutput> requestHeaders = null;

  @SerializedName("ResponseHeaders")
  private List<ResponseHeaderForGetTaskResultOutput> responseHeaders = null;

  @SerializedName("StatusCode")
  private Integer statusCode = null;

  @SerializedName("TimeDNS")
  private Double timeDNS = null;

  @SerializedName("TimeReceive")
  private Double timeReceive = null;

  @SerializedName("TimeSsl")
  private Double timeSsl = null;

  @SerializedName("TimeTCP")
  private Double timeTCP = null;

  @SerializedName("TimeTotal")
  private Double timeTotal = null;

  @SerializedName("TimeWait")
  private Double timeWait = null;

  @SerializedName("URL")
  private String URL = null;

  public LocationDetailForGetTaskResultOutput remoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Get remoteAddress
   * @return remoteAddress
  **/
  @Schema(description = "")
  public String getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public LocationDetailForGetTaskResultOutput requestHeaders(List<RequestHeaderForGetTaskResultOutput> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public LocationDetailForGetTaskResultOutput addRequestHeadersItem(RequestHeaderForGetTaskResultOutput requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new ArrayList<RequestHeaderForGetTaskResultOutput>();
    }
    this.requestHeaders.add(requestHeadersItem);
    return this;
  }

   /**
   * Get requestHeaders
   * @return requestHeaders
  **/
  @Valid
  @Schema(description = "")
  public List<RequestHeaderForGetTaskResultOutput> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(List<RequestHeaderForGetTaskResultOutput> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public LocationDetailForGetTaskResultOutput responseHeaders(List<ResponseHeaderForGetTaskResultOutput> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  public LocationDetailForGetTaskResultOutput addResponseHeadersItem(ResponseHeaderForGetTaskResultOutput responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new ArrayList<ResponseHeaderForGetTaskResultOutput>();
    }
    this.responseHeaders.add(responseHeadersItem);
    return this;
  }

   /**
   * Get responseHeaders
   * @return responseHeaders
  **/
  @Valid
  @Schema(description = "")
  public List<ResponseHeaderForGetTaskResultOutput> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(List<ResponseHeaderForGetTaskResultOutput> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public LocationDetailForGetTaskResultOutput statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(description = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public LocationDetailForGetTaskResultOutput timeDNS(Double timeDNS) {
    this.timeDNS = timeDNS;
    return this;
  }

   /**
   * Get timeDNS
   * @return timeDNS
  **/
  @Schema(description = "")
  public Double getTimeDNS() {
    return timeDNS;
  }

  public void setTimeDNS(Double timeDNS) {
    this.timeDNS = timeDNS;
  }

  public LocationDetailForGetTaskResultOutput timeReceive(Double timeReceive) {
    this.timeReceive = timeReceive;
    return this;
  }

   /**
   * Get timeReceive
   * @return timeReceive
  **/
  @Schema(description = "")
  public Double getTimeReceive() {
    return timeReceive;
  }

  public void setTimeReceive(Double timeReceive) {
    this.timeReceive = timeReceive;
  }

  public LocationDetailForGetTaskResultOutput timeSsl(Double timeSsl) {
    this.timeSsl = timeSsl;
    return this;
  }

   /**
   * Get timeSsl
   * @return timeSsl
  **/
  @Schema(description = "")
  public Double getTimeSsl() {
    return timeSsl;
  }

  public void setTimeSsl(Double timeSsl) {
    this.timeSsl = timeSsl;
  }

  public LocationDetailForGetTaskResultOutput timeTCP(Double timeTCP) {
    this.timeTCP = timeTCP;
    return this;
  }

   /**
   * Get timeTCP
   * @return timeTCP
  **/
  @Schema(description = "")
  public Double getTimeTCP() {
    return timeTCP;
  }

  public void setTimeTCP(Double timeTCP) {
    this.timeTCP = timeTCP;
  }

  public LocationDetailForGetTaskResultOutput timeTotal(Double timeTotal) {
    this.timeTotal = timeTotal;
    return this;
  }

   /**
   * Get timeTotal
   * @return timeTotal
  **/
  @Schema(description = "")
  public Double getTimeTotal() {
    return timeTotal;
  }

  public void setTimeTotal(Double timeTotal) {
    this.timeTotal = timeTotal;
  }

  public LocationDetailForGetTaskResultOutput timeWait(Double timeWait) {
    this.timeWait = timeWait;
    return this;
  }

   /**
   * Get timeWait
   * @return timeWait
  **/
  @Schema(description = "")
  public Double getTimeWait() {
    return timeWait;
  }

  public void setTimeWait(Double timeWait) {
    this.timeWait = timeWait;
  }

  public LocationDetailForGetTaskResultOutput URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * Get URL
   * @return URL
  **/
  @Schema(description = "")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationDetailForGetTaskResultOutput locationDetailForGetTaskResultOutput = (LocationDetailForGetTaskResultOutput) o;
    return Objects.equals(this.remoteAddress, locationDetailForGetTaskResultOutput.remoteAddress) &&
        Objects.equals(this.requestHeaders, locationDetailForGetTaskResultOutput.requestHeaders) &&
        Objects.equals(this.responseHeaders, locationDetailForGetTaskResultOutput.responseHeaders) &&
        Objects.equals(this.statusCode, locationDetailForGetTaskResultOutput.statusCode) &&
        Objects.equals(this.timeDNS, locationDetailForGetTaskResultOutput.timeDNS) &&
        Objects.equals(this.timeReceive, locationDetailForGetTaskResultOutput.timeReceive) &&
        Objects.equals(this.timeSsl, locationDetailForGetTaskResultOutput.timeSsl) &&
        Objects.equals(this.timeTCP, locationDetailForGetTaskResultOutput.timeTCP) &&
        Objects.equals(this.timeTotal, locationDetailForGetTaskResultOutput.timeTotal) &&
        Objects.equals(this.timeWait, locationDetailForGetTaskResultOutput.timeWait) &&
        Objects.equals(this.URL, locationDetailForGetTaskResultOutput.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteAddress, requestHeaders, responseHeaders, statusCode, timeDNS, timeReceive, timeSsl, timeTCP, timeTotal, timeWait, URL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDetailForGetTaskResultOutput {\n");
    
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    timeDNS: ").append(toIndentedString(timeDNS)).append("\n");
    sb.append("    timeReceive: ").append(toIndentedString(timeReceive)).append("\n");
    sb.append("    timeSsl: ").append(toIndentedString(timeSsl)).append("\n");
    sb.append("    timeTCP: ").append(toIndentedString(timeTCP)).append("\n");
    sb.append("    timeTotal: ").append(toIndentedString(timeTotal)).append("\n");
    sb.append("    timeWait: ").append(toIndentedString(timeWait)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
