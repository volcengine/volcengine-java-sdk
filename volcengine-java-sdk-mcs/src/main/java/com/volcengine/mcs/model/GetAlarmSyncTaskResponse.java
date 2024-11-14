/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcs.model.BaseInfoForGetAlarmSyncTaskOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetAlarmSyncTaskResponse
 */



public class GetAlarmSyncTaskResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BaseInfo")
  private BaseInfoForGetAlarmSyncTaskOutput baseInfo = null;

  public GetAlarmSyncTaskResponse baseInfo(BaseInfoForGetAlarmSyncTaskOutput baseInfo) {
    this.baseInfo = baseInfo;
    return this;
  }

   /**
   * Get baseInfo
   * @return baseInfo
  **/
  @Valid
  @Schema(description = "")
  public BaseInfoForGetAlarmSyncTaskOutput getBaseInfo() {
    return baseInfo;
  }

  public void setBaseInfo(BaseInfoForGetAlarmSyncTaskOutput baseInfo) {
    this.baseInfo = baseInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlarmSyncTaskResponse getAlarmSyncTaskResponse = (GetAlarmSyncTaskResponse) o;
    return Objects.equals(this.baseInfo, getAlarmSyncTaskResponse.baseInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlarmSyncTaskResponse {\n");
    
    sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
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
