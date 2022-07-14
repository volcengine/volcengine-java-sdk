/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.AccountForDescribeImageSharePermissionOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeImageSharePermissionResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:02.442504+08:00[Asia/Shanghai]")
public class DescribeImageSharePermissionResponse {
  @SerializedName("Accounts")
  private List<AccountForDescribeImageSharePermissionOutput> accounts = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeImageSharePermissionResponse accounts(List<AccountForDescribeImageSharePermissionOutput> accounts) {
    this.accounts = accounts;
    return this;
  }

  public DescribeImageSharePermissionResponse addAccountsItem(AccountForDescribeImageSharePermissionOutput accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<AccountForDescribeImageSharePermissionOutput>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @Valid
  @Schema(description = "")
  public List<AccountForDescribeImageSharePermissionOutput> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountForDescribeImageSharePermissionOutput> accounts) {
    this.accounts = accounts;
  }

  public DescribeImageSharePermissionResponse imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public DescribeImageSharePermissionResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeImageSharePermissionResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeImageSharePermissionResponse describeImageSharePermissionResponse = (DescribeImageSharePermissionResponse) o;
    return Objects.equals(this.accounts, describeImageSharePermissionResponse.accounts) &&
        Objects.equals(this.imageId, describeImageSharePermissionResponse.imageId) &&
        Objects.equals(this.nextToken, describeImageSharePermissionResponse.nextToken) &&
        Objects.equals(this.totalCount, describeImageSharePermissionResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, imageId, nextToken, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeImageSharePermissionResponse {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
