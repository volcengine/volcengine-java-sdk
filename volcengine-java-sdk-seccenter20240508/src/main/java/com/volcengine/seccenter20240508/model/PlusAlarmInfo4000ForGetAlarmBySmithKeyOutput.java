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
 * PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput
 */



public class PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput {
  @SerializedName("Sip")
  private String sip = null;

  @SerializedName("Sport")
  private String sport = null;

  @SerializedName("Types")
  private String types = null;

  @SerializedName("User")
  private String user = null;

  public PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput sip(String sip) {
    this.sip = sip;
    return this;
  }

   /**
   * Get sip
   * @return sip
  **/
  @Schema(description = "")
  public String getSip() {
    return sip;
  }

  public void setSip(String sip) {
    this.sip = sip;
  }

  public PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput sport(String sport) {
    this.sport = sport;
    return this;
  }

   /**
   * Get sport
   * @return sport
  **/
  @Schema(description = "")
  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput types(String types) {
    this.types = types;
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @Schema(description = "")
  public String getTypes() {
    return types;
  }

  public void setTypes(String types) {
    this.types = types;
  }

  public PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput plusAlarmInfo4000ForGetAlarmBySmithKeyOutput = (PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput) o;
    return Objects.equals(this.sip, plusAlarmInfo4000ForGetAlarmBySmithKeyOutput.sip) &&
        Objects.equals(this.sport, plusAlarmInfo4000ForGetAlarmBySmithKeyOutput.sport) &&
        Objects.equals(this.types, plusAlarmInfo4000ForGetAlarmBySmithKeyOutput.types) &&
        Objects.equals(this.user, plusAlarmInfo4000ForGetAlarmBySmithKeyOutput.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sip, sport, types, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlusAlarmInfo4000ForGetAlarmBySmithKeyOutput {\n");
    
    sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
    sb.append("    sport: ").append(toIndentedString(sport)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
