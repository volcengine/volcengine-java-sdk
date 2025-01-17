/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

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
 * CloudVendorForGetApiV1OverviewSecurityScoresOutput
 */



public class CloudVendorForGetApiV1OverviewSecurityScoresOutput {
  @SerializedName("account_num")
  private Integer accountNum = null;

  /**
   * Gets or Sets cloudVendor
   */
  @JsonAdapter(CloudVendorEnum.Adapter.class)
  public enum CloudVendorEnum {
    @SerializedName("volcengine")
    VOLCENGINE("volcengine"),
    @SerializedName("aliyun")
    ALIYUN("aliyun"),
    @SerializedName("huaweicloud")
    HUAWEICLOUD("huaweicloud"),
    @SerializedName("tencent")
    TENCENT("tencent");

    private String value;

    CloudVendorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CloudVendorEnum fromValue(String input) {
      for (CloudVendorEnum b : CloudVendorEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CloudVendorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CloudVendorEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CloudVendorEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CloudVendorEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("cloud_vendor")
  private CloudVendorEnum cloudVendor = null;

  @SerializedName("risk_resource")
  private Integer riskResource = null;

  @SerializedName("security_score")
  private String securityScore = null;

  public CloudVendorForGetApiV1OverviewSecurityScoresOutput accountNum(Integer accountNum) {
    this.accountNum = accountNum;
    return this;
  }

   /**
   * Get accountNum
   * @return accountNum
  **/
  @Schema(description = "")
  public Integer getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(Integer accountNum) {
    this.accountNum = accountNum;
  }

  public CloudVendorForGetApiV1OverviewSecurityScoresOutput cloudVendor(CloudVendorEnum cloudVendor) {
    this.cloudVendor = cloudVendor;
    return this;
  }

   /**
   * Get cloudVendor
   * @return cloudVendor
  **/
  @Schema(description = "")
  public CloudVendorEnum getCloudVendor() {
    return cloudVendor;
  }

  public void setCloudVendor(CloudVendorEnum cloudVendor) {
    this.cloudVendor = cloudVendor;
  }

  public CloudVendorForGetApiV1OverviewSecurityScoresOutput riskResource(Integer riskResource) {
    this.riskResource = riskResource;
    return this;
  }

   /**
   * Get riskResource
   * @return riskResource
  **/
  @Schema(description = "")
  public Integer getRiskResource() {
    return riskResource;
  }

  public void setRiskResource(Integer riskResource) {
    this.riskResource = riskResource;
  }

  public CloudVendorForGetApiV1OverviewSecurityScoresOutput securityScore(String securityScore) {
    this.securityScore = securityScore;
    return this;
  }

   /**
   * Get securityScore
   * @return securityScore
  **/
  @Schema(description = "")
  public String getSecurityScore() {
    return securityScore;
  }

  public void setSecurityScore(String securityScore) {
    this.securityScore = securityScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudVendorForGetApiV1OverviewSecurityScoresOutput cloudVendorForGetApiV1OverviewSecurityScoresOutput = (CloudVendorForGetApiV1OverviewSecurityScoresOutput) o;
    return Objects.equals(this.accountNum, cloudVendorForGetApiV1OverviewSecurityScoresOutput.accountNum) &&
        Objects.equals(this.cloudVendor, cloudVendorForGetApiV1OverviewSecurityScoresOutput.cloudVendor) &&
        Objects.equals(this.riskResource, cloudVendorForGetApiV1OverviewSecurityScoresOutput.riskResource) &&
        Objects.equals(this.securityScore, cloudVendorForGetApiV1OverviewSecurityScoresOutput.securityScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNum, cloudVendor, riskResource, securityScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudVendorForGetApiV1OverviewSecurityScoresOutput {\n");
    
    sb.append("    accountNum: ").append(toIndentedString(accountNum)).append("\n");
    sb.append("    cloudVendor: ").append(toIndentedString(cloudVendor)).append("\n");
    sb.append("    riskResource: ").append(toIndentedString(riskResource)).append("\n");
    sb.append("    securityScore: ").append(toIndentedString(securityScore)).append("\n");
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
