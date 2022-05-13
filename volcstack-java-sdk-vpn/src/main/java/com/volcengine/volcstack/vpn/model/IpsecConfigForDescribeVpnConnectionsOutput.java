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

package com.volcengine.volcstack.vpn.model;

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
 * IpsecConfigForDescribeVpnConnectionsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:45.779409+08:00[Asia/Shanghai]")
public class IpsecConfigForDescribeVpnConnectionsOutput {
  @SerializedName("AuthAlg")
  private String authAlg = null;

  @SerializedName("DhGroup")
  private String dhGroup = null;

  @SerializedName("EncAlg")
  private String encAlg = null;

  @SerializedName("Lifetime")
  private Integer lifetime = null;

  public IpsecConfigForDescribeVpnConnectionsOutput authAlg(String authAlg) {
    this.authAlg = authAlg;
    return this;
  }

   /**
   * Get authAlg
   * @return authAlg
  **/
  @Schema(description = "")
  public String getAuthAlg() {
    return authAlg;
  }

  public void setAuthAlg(String authAlg) {
    this.authAlg = authAlg;
  }

  public IpsecConfigForDescribeVpnConnectionsOutput dhGroup(String dhGroup) {
    this.dhGroup = dhGroup;
    return this;
  }

   /**
   * Get dhGroup
   * @return dhGroup
  **/
  @Schema(description = "")
  public String getDhGroup() {
    return dhGroup;
  }

  public void setDhGroup(String dhGroup) {
    this.dhGroup = dhGroup;
  }

  public IpsecConfigForDescribeVpnConnectionsOutput encAlg(String encAlg) {
    this.encAlg = encAlg;
    return this;
  }

   /**
   * Get encAlg
   * @return encAlg
  **/
  @Schema(description = "")
  public String getEncAlg() {
    return encAlg;
  }

  public void setEncAlg(String encAlg) {
    this.encAlg = encAlg;
  }

  public IpsecConfigForDescribeVpnConnectionsOutput lifetime(Integer lifetime) {
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Get lifetime
   * @return lifetime
  **/
  @Schema(description = "")
  public Integer getLifetime() {
    return lifetime;
  }

  public void setLifetime(Integer lifetime) {
    this.lifetime = lifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpsecConfigForDescribeVpnConnectionsOutput ipsecConfigForDescribeVpnConnectionsOutput = (IpsecConfigForDescribeVpnConnectionsOutput) o;
    return Objects.equals(this.authAlg, ipsecConfigForDescribeVpnConnectionsOutput.authAlg) &&
        Objects.equals(this.dhGroup, ipsecConfigForDescribeVpnConnectionsOutput.dhGroup) &&
        Objects.equals(this.encAlg, ipsecConfigForDescribeVpnConnectionsOutput.encAlg) &&
        Objects.equals(this.lifetime, ipsecConfigForDescribeVpnConnectionsOutput.lifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authAlg, dhGroup, encAlg, lifetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpsecConfigForDescribeVpnConnectionsOutput {\n");
    
    sb.append("    authAlg: ").append(toIndentedString(authAlg)).append("\n");
    sb.append("    dhGroup: ").append(toIndentedString(dhGroup)).append("\n");
    sb.append("    encAlg: ").append(toIndentedString(encAlg)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
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
