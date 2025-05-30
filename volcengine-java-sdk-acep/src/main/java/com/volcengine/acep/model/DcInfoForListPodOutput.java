/*
 * acep
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.acep.model;

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
 * DcInfoForListPodOutput
 */



public class DcInfoForListPodOutput {
  @SerializedName("Dc")
  private String dc = null;

  @SerializedName("DcName")
  private String dcName = null;

  @SerializedName("Isp")
  private Integer isp = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DcInfoForListPodOutput dc(String dc) {
    this.dc = dc;
    return this;
  }

   /**
   * Get dc
   * @return dc
  **/
  @Schema(description = "")
  public String getDc() {
    return dc;
  }

  public void setDc(String dc) {
    this.dc = dc;
  }

  public DcInfoForListPodOutput dcName(String dcName) {
    this.dcName = dcName;
    return this;
  }

   /**
   * Get dcName
   * @return dcName
  **/
  @Schema(description = "")
  public String getDcName() {
    return dcName;
  }

  public void setDcName(String dcName) {
    this.dcName = dcName;
  }

  public DcInfoForListPodOutput isp(Integer isp) {
    this.isp = isp;
    return this;
  }

   /**
   * Get isp
   * @return isp
  **/
  @Schema(description = "")
  public Integer getIsp() {
    return isp;
  }

  public void setIsp(Integer isp) {
    this.isp = isp;
  }

  public DcInfoForListPodOutput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public DcInfoForListPodOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DcInfoForListPodOutput dcInfoForListPodOutput = (DcInfoForListPodOutput) o;
    return Objects.equals(this.dc, dcInfoForListPodOutput.dc) &&
        Objects.equals(this.dcName, dcInfoForListPodOutput.dcName) &&
        Objects.equals(this.isp, dcInfoForListPodOutput.isp) &&
        Objects.equals(this.region, dcInfoForListPodOutput.region) &&
        Objects.equals(this.zoneId, dcInfoForListPodOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dc, dcName, isp, region, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DcInfoForListPodOutput {\n");
    
    sb.append("    dc: ").append(toIndentedString(dc)).append("\n");
    sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
    sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
