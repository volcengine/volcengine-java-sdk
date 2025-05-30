/*
 * quota
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.quota.model;

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
 * ModifyQuotaTemplateServiceStatusResponse
 */



public class ModifyQuotaTemplateServiceStatusResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccountID")
  private Long accountID = null;

  @SerializedName("TemplateStatus")
  private Integer templateStatus = null;

  public ModifyQuotaTemplateServiceStatusResponse accountID(Long accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public Long getAccountID() {
    return accountID;
  }

  public void setAccountID(Long accountID) {
    this.accountID = accountID;
  }

  public ModifyQuotaTemplateServiceStatusResponse templateStatus(Integer templateStatus) {
    this.templateStatus = templateStatus;
    return this;
  }

   /**
   * Get templateStatus
   * @return templateStatus
  **/
  @Schema(description = "")
  public Integer getTemplateStatus() {
    return templateStatus;
  }

  public void setTemplateStatus(Integer templateStatus) {
    this.templateStatus = templateStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyQuotaTemplateServiceStatusResponse modifyQuotaTemplateServiceStatusResponse = (ModifyQuotaTemplateServiceStatusResponse) o;
    return Objects.equals(this.accountID, modifyQuotaTemplateServiceStatusResponse.accountID) &&
        Objects.equals(this.templateStatus, modifyQuotaTemplateServiceStatusResponse.templateStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, templateStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyQuotaTemplateServiceStatusResponse {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    templateStatus: ").append(toIndentedString(templateStatus)).append("\n");
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
