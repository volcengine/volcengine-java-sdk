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
 * LabelForGetTaskOutput
 */



public class LabelForGetTaskOutput {
  @SerializedName("Key")
  private String key = null;

  @SerializedName("KeyID")
  private Long keyID = null;

  @SerializedName("Option")
  private String option = null;

  @SerializedName("OptionID")
  private Long optionID = null;

  public LabelForGetTaskOutput key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public LabelForGetTaskOutput keyID(Long keyID) {
    this.keyID = keyID;
    return this;
  }

   /**
   * Get keyID
   * @return keyID
  **/
  @Schema(description = "")
  public Long getKeyID() {
    return keyID;
  }

  public void setKeyID(Long keyID) {
    this.keyID = keyID;
  }

  public LabelForGetTaskOutput option(String option) {
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @Schema(description = "")
  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public LabelForGetTaskOutput optionID(Long optionID) {
    this.optionID = optionID;
    return this;
  }

   /**
   * Get optionID
   * @return optionID
  **/
  @Schema(description = "")
  public Long getOptionID() {
    return optionID;
  }

  public void setOptionID(Long optionID) {
    this.optionID = optionID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelForGetTaskOutput labelForGetTaskOutput = (LabelForGetTaskOutput) o;
    return Objects.equals(this.key, labelForGetTaskOutput.key) &&
        Objects.equals(this.keyID, labelForGetTaskOutput.keyID) &&
        Objects.equals(this.option, labelForGetTaskOutput.option) &&
        Objects.equals(this.optionID, labelForGetTaskOutput.optionID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, keyID, option, optionID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelForGetTaskOutput {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    optionID: ").append(toIndentedString(optionID)).append("\n");
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
