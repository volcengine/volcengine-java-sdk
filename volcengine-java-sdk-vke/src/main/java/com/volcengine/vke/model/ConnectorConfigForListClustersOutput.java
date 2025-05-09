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
import com.volcengine.vke.model.ProxyConfigForListClustersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConnectorConfigForListClustersOutput
 */



public class ConnectorConfigForListClustersOutput {
  /**
   * Gets or Sets provider
   */
  @JsonAdapter(ProviderEnum.Adapter.class)
  public enum ProviderEnum {
    @SerializedName("Ack")
    ACK("Ack"),
    @SerializedName("Tke")
    TKE("Tke"),
    @SerializedName("Cce")
    CCE("Cce"),
    @SerializedName("Gke")
    GKE("Gke"),
    @SerializedName("Eks")
    EKS("Eks"),
    @SerializedName("BaiduCce")
    BAIDUCCE("BaiduCce"),
    @SerializedName("None")
    NONE("None");

    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProviderEnum fromValue(String input) {
      for (ProviderEnum b : ProviderEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProviderEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProviderEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Provider")
  private ProviderEnum provider = null;

  @SerializedName("ProxyConfig")
  private ProxyConfigForListClustersOutput proxyConfig = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("Direct")
    DIRECT("Direct"),
    @SerializedName("Agent")
    AGENT("Agent");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Type")
  private TypeEnum type = null;

  public ConnectorConfigForListClustersOutput provider(ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @Schema(description = "")
  public ProviderEnum getProvider() {
    return provider;
  }

  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }

  public ConnectorConfigForListClustersOutput proxyConfig(ProxyConfigForListClustersOutput proxyConfig) {
    this.proxyConfig = proxyConfig;
    return this;
  }

   /**
   * Get proxyConfig
   * @return proxyConfig
  **/
  @Valid
  @Schema(description = "")
  public ProxyConfigForListClustersOutput getProxyConfig() {
    return proxyConfig;
  }

  public void setProxyConfig(ProxyConfigForListClustersOutput proxyConfig) {
    this.proxyConfig = proxyConfig;
  }

  public ConnectorConfigForListClustersOutput type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorConfigForListClustersOutput connectorConfigForListClustersOutput = (ConnectorConfigForListClustersOutput) o;
    return Objects.equals(this.provider, connectorConfigForListClustersOutput.provider) &&
        Objects.equals(this.proxyConfig, connectorConfigForListClustersOutput.proxyConfig) &&
        Objects.equals(this.type, connectorConfigForListClustersOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, proxyConfig, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorConfigForListClustersOutput {\n");
    
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    proxyConfig: ").append(toIndentedString(proxyConfig)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
