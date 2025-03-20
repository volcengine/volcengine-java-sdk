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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DiagnoseDetailForGetTaskResultOutput
 */



public class DiagnoseDetailForGetTaskResultOutput {
  @SerializedName("DNSDetail")
  private String dnSDetail = null;

  @SerializedName("MtrDetail")
  private String mtrDetail = null;

  @SerializedName("PingDetail")
  private String pingDetail = null;

  public DiagnoseDetailForGetTaskResultOutput dnSDetail(String dnSDetail) {
    this.dnSDetail = dnSDetail;
    return this;
  }

   /**
   * Get dnSDetail
   * @return dnSDetail
  **/
  @Schema(description = "")
  public String getDnSDetail() {
    return dnSDetail;
  }

  public void setDnSDetail(String dnSDetail) {
    this.dnSDetail = dnSDetail;
  }

  public DiagnoseDetailForGetTaskResultOutput mtrDetail(String mtrDetail) {
    this.mtrDetail = mtrDetail;
    return this;
  }

   /**
   * Get mtrDetail
   * @return mtrDetail
  **/
  @Schema(description = "")
  public String getMtrDetail() {
    return mtrDetail;
  }

  public void setMtrDetail(String mtrDetail) {
    this.mtrDetail = mtrDetail;
  }

  public DiagnoseDetailForGetTaskResultOutput pingDetail(String pingDetail) {
    this.pingDetail = pingDetail;
    return this;
  }

   /**
   * Get pingDetail
   * @return pingDetail
  **/
  @Schema(description = "")
  public String getPingDetail() {
    return pingDetail;
  }

  public void setPingDetail(String pingDetail) {
    this.pingDetail = pingDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnoseDetailForGetTaskResultOutput diagnoseDetailForGetTaskResultOutput = (DiagnoseDetailForGetTaskResultOutput) o;
    return Objects.equals(this.dnSDetail, diagnoseDetailForGetTaskResultOutput.dnSDetail) &&
        Objects.equals(this.mtrDetail, diagnoseDetailForGetTaskResultOutput.mtrDetail) &&
        Objects.equals(this.pingDetail, diagnoseDetailForGetTaskResultOutput.pingDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnSDetail, mtrDetail, pingDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnoseDetailForGetTaskResultOutput {\n");
    
    sb.append("    dnSDetail: ").append(toIndentedString(dnSDetail)).append("\n");
    sb.append("    mtrDetail: ").append(toIndentedString(mtrDetail)).append("\n");
    sb.append("    pingDetail: ").append(toIndentedString(pingDetail)).append("\n");
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
