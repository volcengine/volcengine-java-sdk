/*
 * vmp
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vmp.model;

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
 * TestDingTalkBotWebhookRequest
 */



public class TestDingTalkBotWebhookRequest {
  @SerializedName("Address")
  private String address = null;

  @SerializedName("AtMobiles")
  private List<String> atMobiles = null;

  @SerializedName("AtUserIds")
  private List<String> atUserIds = null;

  @SerializedName("SecretKey")
  private String secretKey = null;

  public TestDingTalkBotWebhookRequest address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public TestDingTalkBotWebhookRequest atMobiles(List<String> atMobiles) {
    this.atMobiles = atMobiles;
    return this;
  }

  public TestDingTalkBotWebhookRequest addAtMobilesItem(String atMobilesItem) {
    if (this.atMobiles == null) {
      this.atMobiles = new ArrayList<String>();
    }
    this.atMobiles.add(atMobilesItem);
    return this;
  }

   /**
   * Get atMobiles
   * @return atMobiles
  **/
  @Schema(description = "")
  public List<String> getAtMobiles() {
    return atMobiles;
  }

  public void setAtMobiles(List<String> atMobiles) {
    this.atMobiles = atMobiles;
  }

  public TestDingTalkBotWebhookRequest atUserIds(List<String> atUserIds) {
    this.atUserIds = atUserIds;
    return this;
  }

  public TestDingTalkBotWebhookRequest addAtUserIdsItem(String atUserIdsItem) {
    if (this.atUserIds == null) {
      this.atUserIds = new ArrayList<String>();
    }
    this.atUserIds.add(atUserIdsItem);
    return this;
  }

   /**
   * Get atUserIds
   * @return atUserIds
  **/
  @Schema(description = "")
  public List<String> getAtUserIds() {
    return atUserIds;
  }

  public void setAtUserIds(List<String> atUserIds) {
    this.atUserIds = atUserIds;
  }

  public TestDingTalkBotWebhookRequest secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @Schema(description = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestDingTalkBotWebhookRequest testDingTalkBotWebhookRequest = (TestDingTalkBotWebhookRequest) o;
    return Objects.equals(this.address, testDingTalkBotWebhookRequest.address) &&
        Objects.equals(this.atMobiles, testDingTalkBotWebhookRequest.atMobiles) &&
        Objects.equals(this.atUserIds, testDingTalkBotWebhookRequest.atUserIds) &&
        Objects.equals(this.secretKey, testDingTalkBotWebhookRequest.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, atMobiles, atUserIds, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDingTalkBotWebhookRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    atMobiles: ").append(toIndentedString(atMobiles)).append("\n");
    sb.append("    atUserIds: ").append(toIndentedString(atUserIds)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
