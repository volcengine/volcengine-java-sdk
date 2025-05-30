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
 * CheckInstallRaspResponse
 */



public class CheckInstallRaspResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ChosenCount")
  private Integer chosenCount = null;

  @SerializedName("HitLimit")
  private Boolean hitLimit = null;

  @SerializedName("LeftAuthorizationCount")
  private Integer leftAuthorizationCount = null;

  @SerializedName("OpenCount")
  private Integer openCount = null;

  public CheckInstallRaspResponse chosenCount(Integer chosenCount) {
    this.chosenCount = chosenCount;
    return this;
  }

   /**
   * Get chosenCount
   * @return chosenCount
  **/
  @Schema(description = "")
  public Integer getChosenCount() {
    return chosenCount;
  }

  public void setChosenCount(Integer chosenCount) {
    this.chosenCount = chosenCount;
  }

  public CheckInstallRaspResponse hitLimit(Boolean hitLimit) {
    this.hitLimit = hitLimit;
    return this;
  }

   /**
   * Get hitLimit
   * @return hitLimit
  **/
  @Schema(description = "")
  public Boolean isHitLimit() {
    return hitLimit;
  }

  public void setHitLimit(Boolean hitLimit) {
    this.hitLimit = hitLimit;
  }

  public CheckInstallRaspResponse leftAuthorizationCount(Integer leftAuthorizationCount) {
    this.leftAuthorizationCount = leftAuthorizationCount;
    return this;
  }

   /**
   * Get leftAuthorizationCount
   * @return leftAuthorizationCount
  **/
  @Schema(description = "")
  public Integer getLeftAuthorizationCount() {
    return leftAuthorizationCount;
  }

  public void setLeftAuthorizationCount(Integer leftAuthorizationCount) {
    this.leftAuthorizationCount = leftAuthorizationCount;
  }

  public CheckInstallRaspResponse openCount(Integer openCount) {
    this.openCount = openCount;
    return this;
  }

   /**
   * Get openCount
   * @return openCount
  **/
  @Schema(description = "")
  public Integer getOpenCount() {
    return openCount;
  }

  public void setOpenCount(Integer openCount) {
    this.openCount = openCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckInstallRaspResponse checkInstallRaspResponse = (CheckInstallRaspResponse) o;
    return Objects.equals(this.chosenCount, checkInstallRaspResponse.chosenCount) &&
        Objects.equals(this.hitLimit, checkInstallRaspResponse.hitLimit) &&
        Objects.equals(this.leftAuthorizationCount, checkInstallRaspResponse.leftAuthorizationCount) &&
        Objects.equals(this.openCount, checkInstallRaspResponse.openCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chosenCount, hitLimit, leftAuthorizationCount, openCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInstallRaspResponse {\n");
    
    sb.append("    chosenCount: ").append(toIndentedString(chosenCount)).append("\n");
    sb.append("    hitLimit: ").append(toIndentedString(hitLimit)).append("\n");
    sb.append("    leftAuthorizationCount: ").append(toIndentedString(leftAuthorizationCount)).append("\n");
    sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
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
