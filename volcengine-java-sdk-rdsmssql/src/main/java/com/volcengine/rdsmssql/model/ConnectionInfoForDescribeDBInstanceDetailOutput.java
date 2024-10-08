/*
 * rds_mssql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmssql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmssql.model.AddressForDescribeDBInstanceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConnectionInfoForDescribeDBInstanceDetailOutput
 */



public class ConnectionInfoForDescribeDBInstanceDetailOutput {
  @SerializedName("Address")
  private List<AddressForDescribeDBInstanceDetailOutput> address = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  @SerializedName("EndpointType")
  private String endpointType = null;

  public ConnectionInfoForDescribeDBInstanceDetailOutput address(List<AddressForDescribeDBInstanceDetailOutput> address) {
    this.address = address;
    return this;
  }

  public ConnectionInfoForDescribeDBInstanceDetailOutput addAddressItem(AddressForDescribeDBInstanceDetailOutput addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<AddressForDescribeDBInstanceDetailOutput>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Valid
  @Schema(description = "")
  public List<AddressForDescribeDBInstanceDetailOutput> getAddress() {
    return address;
  }

  public void setAddress(List<AddressForDescribeDBInstanceDetailOutput> address) {
    this.address = address;
  }

  public ConnectionInfoForDescribeDBInstanceDetailOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConnectionInfoForDescribeDBInstanceDetailOutput endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @Schema(description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public ConnectionInfoForDescribeDBInstanceDetailOutput endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public ConnectionInfoForDescribeDBInstanceDetailOutput endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @Schema(description = "")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionInfoForDescribeDBInstanceDetailOutput connectionInfoForDescribeDBInstanceDetailOutput = (ConnectionInfoForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.address, connectionInfoForDescribeDBInstanceDetailOutput.address) &&
        Objects.equals(this.description, connectionInfoForDescribeDBInstanceDetailOutput.description) &&
        Objects.equals(this.endpointId, connectionInfoForDescribeDBInstanceDetailOutput.endpointId) &&
        Objects.equals(this.endpointName, connectionInfoForDescribeDBInstanceDetailOutput.endpointName) &&
        Objects.equals(this.endpointType, connectionInfoForDescribeDBInstanceDetailOutput.endpointType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, description, endpointId, endpointName, endpointType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInfoForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
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
