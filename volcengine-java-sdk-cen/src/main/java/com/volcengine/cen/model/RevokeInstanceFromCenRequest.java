/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cen.model;

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
 * RevokeInstanceFromCenRequest
 */


public class RevokeInstanceFromCenRequest {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("CenOwnerId")
  private String cenOwnerId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceRegionId")
  private String instanceRegionId = null;

  /**
   * Gets or Sets instanceType
   */
  @JsonAdapter(InstanceTypeEnum.Adapter.class)
  public enum InstanceTypeEnum {
    VPC("VPC"),
    DCGW("DCGW");

    private String value;

    InstanceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InstanceTypeEnum fromValue(String input) {
      for (InstanceTypeEnum b : InstanceTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InstanceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstanceTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InstanceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InstanceTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("InstanceType")
  private InstanceTypeEnum instanceType = null;

  public RevokeInstanceFromCenRequest cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public RevokeInstanceFromCenRequest cenOwnerId(String cenOwnerId) {
    this.cenOwnerId = cenOwnerId;
    return this;
  }

   /**
   * Get cenOwnerId
   * @return cenOwnerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCenOwnerId() {
    return cenOwnerId;
  }

  public void setCenOwnerId(String cenOwnerId) {
    this.cenOwnerId = cenOwnerId;
  }

  public RevokeInstanceFromCenRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public RevokeInstanceFromCenRequest instanceRegionId(String instanceRegionId) {
    this.instanceRegionId = instanceRegionId;
    return this;
  }

   /**
   * Get instanceRegionId
   * @return instanceRegionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceRegionId() {
    return instanceRegionId;
  }

  public void setInstanceRegionId(String instanceRegionId) {
    this.instanceRegionId = instanceRegionId;
  }

  public RevokeInstanceFromCenRequest instanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public InstanceTypeEnum getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeInstanceFromCenRequest revokeInstanceFromCenRequest = (RevokeInstanceFromCenRequest) o;
    return Objects.equals(this.cenId, revokeInstanceFromCenRequest.cenId) &&
        Objects.equals(this.cenOwnerId, revokeInstanceFromCenRequest.cenOwnerId) &&
        Objects.equals(this.instanceId, revokeInstanceFromCenRequest.instanceId) &&
        Objects.equals(this.instanceRegionId, revokeInstanceFromCenRequest.instanceRegionId) &&
        Objects.equals(this.instanceType, revokeInstanceFromCenRequest.instanceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, cenOwnerId, instanceId, instanceRegionId, instanceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeInstanceFromCenRequest {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    cenOwnerId: ").append(toIndentedString(cenOwnerId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceRegionId: ").append(toIndentedString(instanceRegionId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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
