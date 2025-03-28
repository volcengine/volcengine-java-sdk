/*
 * advdefence
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence.model;

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
 * DescWebAtkTopSrcIpResponse
 */



public class DescWebAtkTopSrcIpResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AttackCount")
  private Integer attackCount = null;

  @SerializedName("AttackIP")
  private String attackIP = null;

  @SerializedName("Percentage")
  private Float percentage = null;

  @SerializedName("Region")
  private String region = null;

  public DescWebAtkTopSrcIpResponse attackCount(Integer attackCount) {
    this.attackCount = attackCount;
    return this;
  }

   /**
   * Get attackCount
   * @return attackCount
  **/
  @Schema(description = "")
  public Integer getAttackCount() {
    return attackCount;
  }

  public void setAttackCount(Integer attackCount) {
    this.attackCount = attackCount;
  }

  public DescWebAtkTopSrcIpResponse attackIP(String attackIP) {
    this.attackIP = attackIP;
    return this;
  }

   /**
   * Get attackIP
   * @return attackIP
  **/
  @Schema(description = "")
  public String getAttackIP() {
    return attackIP;
  }

  public void setAttackIP(String attackIP) {
    this.attackIP = attackIP;
  }

  public DescWebAtkTopSrcIpResponse percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @Schema(description = "")
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public DescWebAtkTopSrcIpResponse region(String region) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescWebAtkTopSrcIpResponse descWebAtkTopSrcIpResponse = (DescWebAtkTopSrcIpResponse) o;
    return Objects.equals(this.attackCount, descWebAtkTopSrcIpResponse.attackCount) &&
        Objects.equals(this.attackIP, descWebAtkTopSrcIpResponse.attackIP) &&
        Objects.equals(this.percentage, descWebAtkTopSrcIpResponse.percentage) &&
        Objects.equals(this.region, descWebAtkTopSrcIpResponse.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackCount, attackIP, percentage, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescWebAtkTopSrcIpResponse {\n");
    
    sb.append("    attackCount: ").append(toIndentedString(attackCount)).append("\n");
    sb.append("    attackIP: ").append(toIndentedString(attackIP)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
