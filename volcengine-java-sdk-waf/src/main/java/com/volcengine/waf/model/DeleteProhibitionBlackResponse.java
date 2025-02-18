/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.waf.model.IpFailedForDeleteProhibitionBlackOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteProhibitionBlackResponse
 */



public class DeleteProhibitionBlackResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("IpFailed")
  private List<IpFailedForDeleteProhibitionBlackOutput> ipFailed = null;

  @SerializedName("IpSuccess")
  private List<String> ipSuccess = null;

  public DeleteProhibitionBlackResponse ipFailed(List<IpFailedForDeleteProhibitionBlackOutput> ipFailed) {
    this.ipFailed = ipFailed;
    return this;
  }

  public DeleteProhibitionBlackResponse addIpFailedItem(IpFailedForDeleteProhibitionBlackOutput ipFailedItem) {
    if (this.ipFailed == null) {
      this.ipFailed = new ArrayList<IpFailedForDeleteProhibitionBlackOutput>();
    }
    this.ipFailed.add(ipFailedItem);
    return this;
  }

   /**
   * Get ipFailed
   * @return ipFailed
  **/
  @Valid
  @Schema(description = "")
  public List<IpFailedForDeleteProhibitionBlackOutput> getIpFailed() {
    return ipFailed;
  }

  public void setIpFailed(List<IpFailedForDeleteProhibitionBlackOutput> ipFailed) {
    this.ipFailed = ipFailed;
  }

  public DeleteProhibitionBlackResponse ipSuccess(List<String> ipSuccess) {
    this.ipSuccess = ipSuccess;
    return this;
  }

  public DeleteProhibitionBlackResponse addIpSuccessItem(String ipSuccessItem) {
    if (this.ipSuccess == null) {
      this.ipSuccess = new ArrayList<String>();
    }
    this.ipSuccess.add(ipSuccessItem);
    return this;
  }

   /**
   * Get ipSuccess
   * @return ipSuccess
  **/
  @Schema(description = "")
  public List<String> getIpSuccess() {
    return ipSuccess;
  }

  public void setIpSuccess(List<String> ipSuccess) {
    this.ipSuccess = ipSuccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteProhibitionBlackResponse deleteProhibitionBlackResponse = (DeleteProhibitionBlackResponse) o;
    return Objects.equals(this.ipFailed, deleteProhibitionBlackResponse.ipFailed) &&
        Objects.equals(this.ipSuccess, deleteProhibitionBlackResponse.ipSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipFailed, ipSuccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteProhibitionBlackResponse {\n");
    
    sb.append("    ipFailed: ").append(toIndentedString(ipFailed)).append("\n");
    sb.append("    ipSuccess: ").append(toIndentedString(ipSuccess)).append("\n");
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
