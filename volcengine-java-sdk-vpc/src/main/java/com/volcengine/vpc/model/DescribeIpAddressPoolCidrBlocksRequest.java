/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * DescribeIpAddressPoolCidrBlocksRequest
 */



public class DescribeIpAddressPoolCidrBlocksRequest {
  @SerializedName("CidrBlock")
  private String cidrBlock = null;

  @SerializedName("IpAddressPoolId")
  private String ipAddressPoolId = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public DescribeIpAddressPoolCidrBlocksRequest cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Get cidrBlock
   * @return cidrBlock
  **/
  @Schema(description = "")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public DescribeIpAddressPoolCidrBlocksRequest ipAddressPoolId(String ipAddressPoolId) {
    this.ipAddressPoolId = ipAddressPoolId;
    return this;
  }

   /**
   * Get ipAddressPoolId
   * @return ipAddressPoolId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpAddressPoolId() {
    return ipAddressPoolId;
  }

  public void setIpAddressPoolId(String ipAddressPoolId) {
    this.ipAddressPoolId = ipAddressPoolId;
  }

  public DescribeIpAddressPoolCidrBlocksRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeIpAddressPoolCidrBlocksRequest nextToken(String nextToken) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeIpAddressPoolCidrBlocksRequest describeIpAddressPoolCidrBlocksRequest = (DescribeIpAddressPoolCidrBlocksRequest) o;
    return Objects.equals(this.cidrBlock, describeIpAddressPoolCidrBlocksRequest.cidrBlock) &&
        Objects.equals(this.ipAddressPoolId, describeIpAddressPoolCidrBlocksRequest.ipAddressPoolId) &&
        Objects.equals(this.maxResults, describeIpAddressPoolCidrBlocksRequest.maxResults) &&
        Objects.equals(this.nextToken, describeIpAddressPoolCidrBlocksRequest.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, ipAddressPoolId, maxResults, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeIpAddressPoolCidrBlocksRequest {\n");
    
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    ipAddressPoolId: ").append(toIndentedString(ipAddressPoolId)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
