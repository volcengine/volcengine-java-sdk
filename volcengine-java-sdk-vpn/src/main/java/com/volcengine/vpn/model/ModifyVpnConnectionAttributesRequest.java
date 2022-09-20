/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * ModifyVpnConnectionAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:51.103428+08:00[Asia/Shanghai]")
public class ModifyVpnConnectionAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  /**
   * Gets or Sets dpdAction
   */
  @JsonAdapter(DpdActionEnum.Adapter.class)
  public enum DpdActionEnum {
    NONE("none"),
    CLEAR("clear"),
    HOLD("hold"),
    RESTART("restart");

    private String value;

    DpdActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DpdActionEnum fromValue(String input) {
      for (DpdActionEnum b : DpdActionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DpdActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DpdActionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DpdActionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DpdActionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DpdAction")
  private DpdActionEnum dpdAction = null;

  @SerializedName("IkeConfig")
  private String ikeConfig = null;

  @SerializedName("IpsecConfig")
  private String ipsecConfig = null;

  @SerializedName("LocalSubnet")
  private List<String> localSubnet = null;

  @SerializedName("NatTraversal")
  private Boolean natTraversal = null;

  @SerializedName("RemoteSubnet")
  private List<String> remoteSubnet = null;

  @SerializedName("VpnConnectionId")
  private String vpnConnectionId = null;

  @SerializedName("VpnConnectionName")
  private String vpnConnectionName = null;

  public ModifyVpnConnectionAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyVpnConnectionAttributesRequest dpdAction(DpdActionEnum dpdAction) {
    this.dpdAction = dpdAction;
    return this;
  }

   /**
   * Get dpdAction
   * @return dpdAction
  **/
  @Schema(description = "")
  public DpdActionEnum getDpdAction() {
    return dpdAction;
  }

  public void setDpdAction(DpdActionEnum dpdAction) {
    this.dpdAction = dpdAction;
  }

  public ModifyVpnConnectionAttributesRequest ikeConfig(String ikeConfig) {
    this.ikeConfig = ikeConfig;
    return this;
  }

   /**
   * Get ikeConfig
   * @return ikeConfig
  **/
  @Schema(description = "")
  public String getIkeConfig() {
    return ikeConfig;
  }

  public void setIkeConfig(String ikeConfig) {
    this.ikeConfig = ikeConfig;
  }

  public ModifyVpnConnectionAttributesRequest ipsecConfig(String ipsecConfig) {
    this.ipsecConfig = ipsecConfig;
    return this;
  }

   /**
   * Get ipsecConfig
   * @return ipsecConfig
  **/
  @Schema(description = "")
  public String getIpsecConfig() {
    return ipsecConfig;
  }

  public void setIpsecConfig(String ipsecConfig) {
    this.ipsecConfig = ipsecConfig;
  }

  public ModifyVpnConnectionAttributesRequest localSubnet(List<String> localSubnet) {
    this.localSubnet = localSubnet;
    return this;
  }

  public ModifyVpnConnectionAttributesRequest addLocalSubnetItem(String localSubnetItem) {
    if (this.localSubnet == null) {
      this.localSubnet = new ArrayList<String>();
    }
    this.localSubnet.add(localSubnetItem);
    return this;
  }

   /**
   * Get localSubnet
   * @return localSubnet
  **/
  @Schema(description = "")
  public List<String> getLocalSubnet() {
    return localSubnet;
  }

  public void setLocalSubnet(List<String> localSubnet) {
    this.localSubnet = localSubnet;
  }

  public ModifyVpnConnectionAttributesRequest natTraversal(Boolean natTraversal) {
    this.natTraversal = natTraversal;
    return this;
  }

   /**
   * Get natTraversal
   * @return natTraversal
  **/
  @Schema(description = "")
  public Boolean isNatTraversal() {
    return natTraversal;
  }

  public void setNatTraversal(Boolean natTraversal) {
    this.natTraversal = natTraversal;
  }

  public ModifyVpnConnectionAttributesRequest remoteSubnet(List<String> remoteSubnet) {
    this.remoteSubnet = remoteSubnet;
    return this;
  }

  public ModifyVpnConnectionAttributesRequest addRemoteSubnetItem(String remoteSubnetItem) {
    if (this.remoteSubnet == null) {
      this.remoteSubnet = new ArrayList<String>();
    }
    this.remoteSubnet.add(remoteSubnetItem);
    return this;
  }

   /**
   * Get remoteSubnet
   * @return remoteSubnet
  **/
  @Schema(description = "")
  public List<String> getRemoteSubnet() {
    return remoteSubnet;
  }

  public void setRemoteSubnet(List<String> remoteSubnet) {
    this.remoteSubnet = remoteSubnet;
  }

  public ModifyVpnConnectionAttributesRequest vpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
    return this;
  }

   /**
   * Get vpnConnectionId
   * @return vpnConnectionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpnConnectionId() {
    return vpnConnectionId;
  }

  public void setVpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
  }

  public ModifyVpnConnectionAttributesRequest vpnConnectionName(String vpnConnectionName) {
    this.vpnConnectionName = vpnConnectionName;
    return this;
  }

   /**
   * Get vpnConnectionName
   * @return vpnConnectionName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getVpnConnectionName() {
    return vpnConnectionName;
  }

  public void setVpnConnectionName(String vpnConnectionName) {
    this.vpnConnectionName = vpnConnectionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyVpnConnectionAttributesRequest modifyVpnConnectionAttributesRequest = (ModifyVpnConnectionAttributesRequest) o;
    return Objects.equals(this.description, modifyVpnConnectionAttributesRequest.description) &&
        Objects.equals(this.dpdAction, modifyVpnConnectionAttributesRequest.dpdAction) &&
        Objects.equals(this.ikeConfig, modifyVpnConnectionAttributesRequest.ikeConfig) &&
        Objects.equals(this.ipsecConfig, modifyVpnConnectionAttributesRequest.ipsecConfig) &&
        Objects.equals(this.localSubnet, modifyVpnConnectionAttributesRequest.localSubnet) &&
        Objects.equals(this.natTraversal, modifyVpnConnectionAttributesRequest.natTraversal) &&
        Objects.equals(this.remoteSubnet, modifyVpnConnectionAttributesRequest.remoteSubnet) &&
        Objects.equals(this.vpnConnectionId, modifyVpnConnectionAttributesRequest.vpnConnectionId) &&
        Objects.equals(this.vpnConnectionName, modifyVpnConnectionAttributesRequest.vpnConnectionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dpdAction, ikeConfig, ipsecConfig, localSubnet, natTraversal, remoteSubnet, vpnConnectionId, vpnConnectionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyVpnConnectionAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dpdAction: ").append(toIndentedString(dpdAction)).append("\n");
    sb.append("    ikeConfig: ").append(toIndentedString(ikeConfig)).append("\n");
    sb.append("    ipsecConfig: ").append(toIndentedString(ipsecConfig)).append("\n");
    sb.append("    localSubnet: ").append(toIndentedString(localSubnet)).append("\n");
    sb.append("    natTraversal: ").append(toIndentedString(natTraversal)).append("\n");
    sb.append("    remoteSubnet: ").append(toIndentedString(remoteSubnet)).append("\n");
    sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
    sb.append("    vpnConnectionName: ").append(toIndentedString(vpnConnectionName)).append("\n");
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
