/*
 * bytehouse_ce20240831
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bytehousece20240831.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.bytehousece20240831.model.GrantForShowPrivilegesForUserByNameOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForShowPrivilegesForUserByNameOutput
 */



public class DataForShowPrivilegesForUserByNameOutput {
  @SerializedName("Grants")
  private List<GrantForShowPrivilegesForUserByNameOutput> grants = null;

  public DataForShowPrivilegesForUserByNameOutput grants(List<GrantForShowPrivilegesForUserByNameOutput> grants) {
    this.grants = grants;
    return this;
  }

  public DataForShowPrivilegesForUserByNameOutput addGrantsItem(GrantForShowPrivilegesForUserByNameOutput grantsItem) {
    if (this.grants == null) {
      this.grants = new ArrayList<GrantForShowPrivilegesForUserByNameOutput>();
    }
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * Get grants
   * @return grants
  **/
  @Valid
  @Schema(description = "")
  public List<GrantForShowPrivilegesForUserByNameOutput> getGrants() {
    return grants;
  }

  public void setGrants(List<GrantForShowPrivilegesForUserByNameOutput> grants) {
    this.grants = grants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForShowPrivilegesForUserByNameOutput dataForShowPrivilegesForUserByNameOutput = (DataForShowPrivilegesForUserByNameOutput) o;
    return Objects.equals(this.grants, dataForShowPrivilegesForUserByNameOutput.grants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForShowPrivilegesForUserByNameOutput {\n");
    
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
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
