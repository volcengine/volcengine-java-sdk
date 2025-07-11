/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteIPSetRequest
 */



public class DeleteIPSetRequest {
  @SerializedName("AcceleratorId")
  private String acceleratorId = null;

  @SerializedName("DeleteIPSets")
  private List<String> deleteIPSets = null;

  @SerializedName("IPSetId")
  private String ipSetId = null;

  @SerializedName("IPVersion")
  private String ipVersion = null;

  public DeleteIPSetRequest acceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
    return this;
  }

   /**
   * Get acceleratorId
   * @return acceleratorId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAcceleratorId() {
    return acceleratorId;
  }

  public void setAcceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
  }

  public DeleteIPSetRequest deleteIPSets(List<String> deleteIPSets) {
    this.deleteIPSets = deleteIPSets;
    return this;
  }

  public DeleteIPSetRequest addDeleteIPSetsItem(String deleteIPSetsItem) {
    if (this.deleteIPSets == null) {
      this.deleteIPSets = new ArrayList<String>();
    }
    this.deleteIPSets.add(deleteIPSetsItem);
    return this;
  }

   /**
   * Get deleteIPSets
   * @return deleteIPSets
  **/
  @Schema(description = "")
  public List<String> getDeleteIPSets() {
    return deleteIPSets;
  }

  public void setDeleteIPSets(List<String> deleteIPSets) {
    this.deleteIPSets = deleteIPSets;
  }

  public DeleteIPSetRequest ipSetId(String ipSetId) {
    this.ipSetId = ipSetId;
    return this;
  }

   /**
   * Get ipSetId
   * @return ipSetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpSetId() {
    return ipSetId;
  }

  public void setIpSetId(String ipSetId) {
    this.ipSetId = ipSetId;
  }

  public DeleteIPSetRequest ipVersion(String ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

   /**
   * Get ipVersion
   * @return ipVersion
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(String ipVersion) {
    this.ipVersion = ipVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteIPSetRequest deleteIPSetRequest = (DeleteIPSetRequest) o;
    return Objects.equals(this.acceleratorId, deleteIPSetRequest.acceleratorId) &&
        Objects.equals(this.deleteIPSets, deleteIPSetRequest.deleteIPSets) &&
        Objects.equals(this.ipSetId, deleteIPSetRequest.ipSetId) &&
        Objects.equals(this.ipVersion, deleteIPSetRequest.ipVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratorId, deleteIPSets, ipSetId, ipVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteIPSetRequest {\n");
    
    sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
    sb.append("    deleteIPSets: ").append(toIndentedString(deleteIPSets)).append("\n");
    sb.append("    ipSetId: ").append(toIndentedString(ipSetId)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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
