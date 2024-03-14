/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

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
 * AuthInfoForListFinancialRelationOutput
 */


public class AuthInfoForListFinancialRelationOutput {
  @SerializedName("AuthID")
  private String authID = null;

  @SerializedName("AuthList")
  private List<Integer> authList = null;

  @SerializedName("AuthStatus")
  private Integer authStatus = null;

  public AuthInfoForListFinancialRelationOutput authID(String authID) {
    this.authID = authID;
    return this;
  }

   /**
   * Get authID
   * @return authID
  **/
  @Schema(description = "")
  public String getAuthID() {
    return authID;
  }

  public void setAuthID(String authID) {
    this.authID = authID;
  }

  public AuthInfoForListFinancialRelationOutput authList(List<Integer> authList) {
    this.authList = authList;
    return this;
  }

  public AuthInfoForListFinancialRelationOutput addAuthListItem(Integer authListItem) {
    if (this.authList == null) {
      this.authList = new ArrayList<Integer>();
    }
    this.authList.add(authListItem);
    return this;
  }

   /**
   * Get authList
   * @return authList
  **/
  @Schema(description = "")
  public List<Integer> getAuthList() {
    return authList;
  }

  public void setAuthList(List<Integer> authList) {
    this.authList = authList;
  }

  public AuthInfoForListFinancialRelationOutput authStatus(Integer authStatus) {
    this.authStatus = authStatus;
    return this;
  }

   /**
   * Get authStatus
   * @return authStatus
  **/
  @Schema(description = "")
  public Integer getAuthStatus() {
    return authStatus;
  }

  public void setAuthStatus(Integer authStatus) {
    this.authStatus = authStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthInfoForListFinancialRelationOutput authInfoForListFinancialRelationOutput = (AuthInfoForListFinancialRelationOutput) o;
    return Objects.equals(this.authID, authInfoForListFinancialRelationOutput.authID) &&
        Objects.equals(this.authList, authInfoForListFinancialRelationOutput.authList) &&
        Objects.equals(this.authStatus, authInfoForListFinancialRelationOutput.authStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authID, authList, authStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthInfoForListFinancialRelationOutput {\n");
    
    sb.append("    authID: ").append(toIndentedString(authID)).append("\n");
    sb.append("    authList: ").append(toIndentedString(authList)).append("\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
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
