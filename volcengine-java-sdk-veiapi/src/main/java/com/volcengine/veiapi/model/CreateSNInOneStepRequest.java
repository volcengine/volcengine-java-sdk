/*
 * vei_api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.veiapi.model;

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
 * CreateSNInOneStepRequest
 */



public class CreateSNInOneStepRequest {
  @SerializedName("auto_renew")
  private Boolean autoRenew = null;

  @SerializedName("count_of_month")
  private Integer countOfMonth = null;

  @SerializedName("type")
  private Integer type = null;

  public CreateSNInOneStepRequest autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public CreateSNInOneStepRequest countOfMonth(Integer countOfMonth) {
    this.countOfMonth = countOfMonth;
    return this;
  }

   /**
   * Get countOfMonth
   * @return countOfMonth
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getCountOfMonth() {
    return countOfMonth;
  }

  public void setCountOfMonth(Integer countOfMonth) {
    this.countOfMonth = countOfMonth;
  }

  public CreateSNInOneStepRequest type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSNInOneStepRequest createSNInOneStepRequest = (CreateSNInOneStepRequest) o;
    return Objects.equals(this.autoRenew, createSNInOneStepRequest.autoRenew) &&
        Objects.equals(this.countOfMonth, createSNInOneStepRequest.countOfMonth) &&
        Objects.equals(this.type, createSNInOneStepRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, countOfMonth, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSNInOneStepRequest {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    countOfMonth: ").append(toIndentedString(countOfMonth)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
