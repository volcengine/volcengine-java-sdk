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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SLBListenerInfoForGetRiskOutput
 */



public class SLBListenerInfoForGetRiskOutput {
  @SerializedName("AclGroupUIDs")
  private List<String> aclGroupUIDs = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Port")
  private Long port = null;

  /**
   * Gets or Sets protocolType
   */
  @JsonAdapter(ProtocolTypeEnum.Adapter.class)
  public enum ProtocolTypeEnum {
    @SerializedName("ipv4")
    IPV4("ipv4"),
    @SerializedName("ipv6")
    IPV6("ipv6");

    private String value;

    ProtocolTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProtocolTypeEnum fromValue(String input) {
      for (ProtocolTypeEnum b : ProtocolTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProtocolTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProtocolTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProtocolTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ProtocolType")
  private ProtocolTypeEnum protocolType = null;

  @SerializedName("UID")
  private String UID = null;

  public SLBListenerInfoForGetRiskOutput aclGroupUIDs(List<String> aclGroupUIDs) {
    this.aclGroupUIDs = aclGroupUIDs;
    return this;
  }

  public SLBListenerInfoForGetRiskOutput addAclGroupUIDsItem(String aclGroupUIDsItem) {
    if (this.aclGroupUIDs == null) {
      this.aclGroupUIDs = new ArrayList<String>();
    }
    this.aclGroupUIDs.add(aclGroupUIDsItem);
    return this;
  }

   /**
   * Get aclGroupUIDs
   * @return aclGroupUIDs
  **/
  @Schema(description = "")
  public List<String> getAclGroupUIDs() {
    return aclGroupUIDs;
  }

  public void setAclGroupUIDs(List<String> aclGroupUIDs) {
    this.aclGroupUIDs = aclGroupUIDs;
  }

  public SLBListenerInfoForGetRiskOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SLBListenerInfoForGetRiskOutput port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public SLBListenerInfoForGetRiskOutput protocolType(ProtocolTypeEnum protocolType) {
    this.protocolType = protocolType;
    return this;
  }

   /**
   * Get protocolType
   * @return protocolType
  **/
  @Schema(description = "")
  public ProtocolTypeEnum getProtocolType() {
    return protocolType;
  }

  public void setProtocolType(ProtocolTypeEnum protocolType) {
    this.protocolType = protocolType;
  }

  public SLBListenerInfoForGetRiskOutput UID(String UID) {
    this.UID = UID;
    return this;
  }

   /**
   * Get UID
   * @return UID
  **/
  @Schema(description = "")
  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLBListenerInfoForGetRiskOutput slBListenerInfoForGetRiskOutput = (SLBListenerInfoForGetRiskOutput) o;
    return Objects.equals(this.aclGroupUIDs, slBListenerInfoForGetRiskOutput.aclGroupUIDs) &&
        Objects.equals(this.name, slBListenerInfoForGetRiskOutput.name) &&
        Objects.equals(this.port, slBListenerInfoForGetRiskOutput.port) &&
        Objects.equals(this.protocolType, slBListenerInfoForGetRiskOutput.protocolType) &&
        Objects.equals(this.UID, slBListenerInfoForGetRiskOutput.UID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclGroupUIDs, name, port, protocolType, UID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLBListenerInfoForGetRiskOutput {\n");
    
    sb.append("    aclGroupUIDs: ").append(toIndentedString(aclGroupUIDs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
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