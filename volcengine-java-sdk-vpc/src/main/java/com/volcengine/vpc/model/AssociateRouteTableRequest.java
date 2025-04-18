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
 * AssociateRouteTableRequest
 */



public class AssociateRouteTableRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("GatewayId")
  private String gatewayId = null;

  /**
   * Gets or Sets gatewayType
   */
  @JsonAdapter(GatewayTypeEnum.Adapter.class)
  public enum GatewayTypeEnum {
    @SerializedName("Ipv4Gateway")
    IPV4GATEWAY("Ipv4Gateway"),
    @SerializedName("Ipv6Gateway")
    IPV6GATEWAY("Ipv6Gateway");

    private String value;

    GatewayTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GatewayTypeEnum fromValue(String input) {
      for (GatewayTypeEnum b : GatewayTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GatewayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GatewayTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public GatewayTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return GatewayTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("GatewayType")
  private GatewayTypeEnum gatewayType = null;

  @SerializedName("RouteTableId")
  private String routeTableId = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  public AssociateRouteTableRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public AssociateRouteTableRequest gatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
    return this;
  }

   /**
   * Get gatewayId
   * @return gatewayId
  **/
  @Schema(description = "")
  public String getGatewayId() {
    return gatewayId;
  }

  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }

  public AssociateRouteTableRequest gatewayType(GatewayTypeEnum gatewayType) {
    this.gatewayType = gatewayType;
    return this;
  }

   /**
   * Get gatewayType
   * @return gatewayType
  **/
  @Schema(description = "")
  public GatewayTypeEnum getGatewayType() {
    return gatewayType;
  }

  public void setGatewayType(GatewayTypeEnum gatewayType) {
    this.gatewayType = gatewayType;
  }

  public AssociateRouteTableRequest routeTableId(String routeTableId) {
    this.routeTableId = routeTableId;
    return this;
  }

   /**
   * Get routeTableId
   * @return routeTableId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRouteTableId() {
    return routeTableId;
  }

  public void setRouteTableId(String routeTableId) {
    this.routeTableId = routeTableId;
  }

  public AssociateRouteTableRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateRouteTableRequest associateRouteTableRequest = (AssociateRouteTableRequest) o;
    return Objects.equals(this.clientToken, associateRouteTableRequest.clientToken) &&
        Objects.equals(this.gatewayId, associateRouteTableRequest.gatewayId) &&
        Objects.equals(this.gatewayType, associateRouteTableRequest.gatewayType) &&
        Objects.equals(this.routeTableId, associateRouteTableRequest.routeTableId) &&
        Objects.equals(this.subnetId, associateRouteTableRequest.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, gatewayId, gatewayType, routeTableId, subnetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateRouteTableRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    gatewayType: ").append(toIndentedString(gatewayType)).append("\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
