/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PlusAlarmInfo42ForGetAlarmBySmithKeyOutput
 */



public class PlusAlarmInfo42ForGetAlarmBySmithKeyOutput {
  @SerializedName("PidTree")
  private String pidTree = null;

  @SerializedName("SshInfo")
  private String sshInfo = null;

  public PlusAlarmInfo42ForGetAlarmBySmithKeyOutput pidTree(String pidTree) {
    this.pidTree = pidTree;
    return this;
  }

   /**
   * Get pidTree
   * @return pidTree
  **/
  @Schema(description = "")
  public String getPidTree() {
    return pidTree;
  }

  public void setPidTree(String pidTree) {
    this.pidTree = pidTree;
  }

  public PlusAlarmInfo42ForGetAlarmBySmithKeyOutput sshInfo(String sshInfo) {
    this.sshInfo = sshInfo;
    return this;
  }

   /**
   * Get sshInfo
   * @return sshInfo
  **/
  @Schema(description = "")
  public String getSshInfo() {
    return sshInfo;
  }

  public void setSshInfo(String sshInfo) {
    this.sshInfo = sshInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlusAlarmInfo42ForGetAlarmBySmithKeyOutput plusAlarmInfo42ForGetAlarmBySmithKeyOutput = (PlusAlarmInfo42ForGetAlarmBySmithKeyOutput) o;
    return Objects.equals(this.pidTree, plusAlarmInfo42ForGetAlarmBySmithKeyOutput.pidTree) &&
        Objects.equals(this.sshInfo, plusAlarmInfo42ForGetAlarmBySmithKeyOutput.sshInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pidTree, sshInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlusAlarmInfo42ForGetAlarmBySmithKeyOutput {\n");
    
    sb.append("    pidTree: ").append(toIndentedString(pidTree)).append("\n");
    sb.append("    sshInfo: ").append(toIndentedString(sshInfo)).append("\n");
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
