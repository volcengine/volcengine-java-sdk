/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * AutoRenewReservedStorageCapacityRequest
 */



public class AutoRenewReservedStorageCapacityRequest {
  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  @SerializedName("RSCAutoRenew")
  private Boolean rsCAutoRenew = null;

  @SerializedName("RSCId")
  private String rsCId = null;

  public AutoRenewReservedStorageCapacityRequest period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public AutoRenewReservedStorageCapacityRequest periodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public String getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }

  public AutoRenewReservedStorageCapacityRequest rsCAutoRenew(Boolean rsCAutoRenew) {
    this.rsCAutoRenew = rsCAutoRenew;
    return this;
  }

   /**
   * Get rsCAutoRenew
   * @return rsCAutoRenew
  **/
  @Schema(description = "")
  public Boolean isRsCAutoRenew() {
    return rsCAutoRenew;
  }

  public void setRsCAutoRenew(Boolean rsCAutoRenew) {
    this.rsCAutoRenew = rsCAutoRenew;
  }

  public AutoRenewReservedStorageCapacityRequest rsCId(String rsCId) {
    this.rsCId = rsCId;
    return this;
  }

   /**
   * Get rsCId
   * @return rsCId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRsCId() {
    return rsCId;
  }

  public void setRsCId(String rsCId) {
    this.rsCId = rsCId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoRenewReservedStorageCapacityRequest autoRenewReservedStorageCapacityRequest = (AutoRenewReservedStorageCapacityRequest) o;
    return Objects.equals(this.period, autoRenewReservedStorageCapacityRequest.period) &&
        Objects.equals(this.periodUnit, autoRenewReservedStorageCapacityRequest.periodUnit) &&
        Objects.equals(this.rsCAutoRenew, autoRenewReservedStorageCapacityRequest.rsCAutoRenew) &&
        Objects.equals(this.rsCId, autoRenewReservedStorageCapacityRequest.rsCId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, periodUnit, rsCAutoRenew, rsCId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoRenewReservedStorageCapacityRequest {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    rsCAutoRenew: ").append(toIndentedString(rsCAutoRenew)).append("\n");
    sb.append("    rsCId: ").append(toIndentedString(rsCId)).append("\n");
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
