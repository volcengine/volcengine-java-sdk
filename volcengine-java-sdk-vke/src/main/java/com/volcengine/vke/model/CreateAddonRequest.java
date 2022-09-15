/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * CreateAddonRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-15T17:50:31.831766+08:00[Asia/Shanghai]")
public class CreateAddonRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Config")
  private String config = null;

  /**
   * Gets or Sets deployMode
   */
  @JsonAdapter(DeployModeEnum.Adapter.class)
  public enum DeployModeEnum {
    MANAGED("Managed"),
    UNMANAGED("Unmanaged");

    private String value;

    DeployModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DeployModeEnum fromValue(String input) {
      for (DeployModeEnum b : DeployModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DeployModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeployModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DeployModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DeployModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DeployMode")
  private DeployModeEnum deployMode = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Version")
  private String version = null;

  public CreateAddonRequest clientToken(String clientToken) {
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

  public CreateAddonRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public CreateAddonRequest config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(description = "")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public CreateAddonRequest deployMode(DeployModeEnum deployMode) {
    this.deployMode = deployMode;
    return this;
  }

   /**
   * Get deployMode
   * @return deployMode
  **/
  @Schema(description = "")
  public DeployModeEnum getDeployMode() {
    return deployMode;
  }

  public void setDeployMode(DeployModeEnum deployMode) {
    this.deployMode = deployMode;
  }

  public CreateAddonRequest name(String name) {
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

  public CreateAddonRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAddonRequest createAddonRequest = (CreateAddonRequest) o;
    return Objects.equals(this.clientToken, createAddonRequest.clientToken) &&
        Objects.equals(this.clusterId, createAddonRequest.clusterId) &&
        Objects.equals(this.config, createAddonRequest.config) &&
        Objects.equals(this.deployMode, createAddonRequest.deployMode) &&
        Objects.equals(this.name, createAddonRequest.name) &&
        Objects.equals(this.version, createAddonRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, clusterId, config, deployMode, name, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAddonRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
