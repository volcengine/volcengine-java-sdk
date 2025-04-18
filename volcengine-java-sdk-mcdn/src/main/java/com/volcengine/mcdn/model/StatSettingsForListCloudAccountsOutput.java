/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcdn.model.ConvertAwsForListCloudAccountsOutput;
import com.volcengine.mcdn.model.OfflineDataSettingForListCloudAccountsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StatSettingsForListCloudAccountsOutput
 */



public class StatSettingsForListCloudAccountsOutput {
  @SerializedName("Aws")
  private ConvertAwsForListCloudAccountsOutput aws = null;

  @SerializedName("OfflineDataSetting")
  private OfflineDataSettingForListCloudAccountsOutput offlineDataSetting = null;

  public StatSettingsForListCloudAccountsOutput aws(ConvertAwsForListCloudAccountsOutput aws) {
    this.aws = aws;
    return this;
  }

   /**
   * Get aws
   * @return aws
  **/
  @Valid
  @Schema(description = "")
  public ConvertAwsForListCloudAccountsOutput getAws() {
    return aws;
  }

  public void setAws(ConvertAwsForListCloudAccountsOutput aws) {
    this.aws = aws;
  }

  public StatSettingsForListCloudAccountsOutput offlineDataSetting(OfflineDataSettingForListCloudAccountsOutput offlineDataSetting) {
    this.offlineDataSetting = offlineDataSetting;
    return this;
  }

   /**
   * Get offlineDataSetting
   * @return offlineDataSetting
  **/
  @Valid
  @Schema(description = "")
  public OfflineDataSettingForListCloudAccountsOutput getOfflineDataSetting() {
    return offlineDataSetting;
  }

  public void setOfflineDataSetting(OfflineDataSettingForListCloudAccountsOutput offlineDataSetting) {
    this.offlineDataSetting = offlineDataSetting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatSettingsForListCloudAccountsOutput statSettingsForListCloudAccountsOutput = (StatSettingsForListCloudAccountsOutput) o;
    return Objects.equals(this.aws, statSettingsForListCloudAccountsOutput.aws) &&
        Objects.equals(this.offlineDataSetting, statSettingsForListCloudAccountsOutput.offlineDataSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aws, offlineDataSetting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatSettingsForListCloudAccountsOutput {\n");
    
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
    sb.append("    offlineDataSetting: ").append(toIndentedString(offlineDataSetting)).append("\n");
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
