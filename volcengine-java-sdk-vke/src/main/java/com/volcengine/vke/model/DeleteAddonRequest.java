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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteAddonRequest
 */



public class DeleteAddonRequest {
  /**
   * Gets or Sets cascadingDeleteResources
   */
  @JsonAdapter(CascadingDeleteResourcesEnum.Adapter.class)
  public enum CascadingDeleteResourcesEnum {
    @SerializedName("Crd")
    CRD("Crd");

    private String value;

    CascadingDeleteResourcesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CascadingDeleteResourcesEnum fromValue(String input) {
      for (CascadingDeleteResourcesEnum b : CascadingDeleteResourcesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CascadingDeleteResourcesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CascadingDeleteResourcesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CascadingDeleteResourcesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CascadingDeleteResourcesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("CascadingDeleteResources")
  private List<CascadingDeleteResourcesEnum> cascadingDeleteResources = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Name")
  private String name = null;

  /**
   * Gets or Sets retainResources
   */
  @JsonAdapter(RetainResourcesEnum.Adapter.class)
  public enum RetainResourcesEnum {
    @SerializedName("Crd")
    CRD("Crd");

    private String value;

    RetainResourcesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RetainResourcesEnum fromValue(String input) {
      for (RetainResourcesEnum b : RetainResourcesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RetainResourcesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RetainResourcesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RetainResourcesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RetainResourcesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("RetainResources")
  private List<RetainResourcesEnum> retainResources = null;

  public DeleteAddonRequest cascadingDeleteResources(List<CascadingDeleteResourcesEnum> cascadingDeleteResources) {
    this.cascadingDeleteResources = cascadingDeleteResources;
    return this;
  }

  public DeleteAddonRequest addCascadingDeleteResourcesItem(CascadingDeleteResourcesEnum cascadingDeleteResourcesItem) {
    if (this.cascadingDeleteResources == null) {
      this.cascadingDeleteResources = new ArrayList<CascadingDeleteResourcesEnum>();
    }
    this.cascadingDeleteResources.add(cascadingDeleteResourcesItem);
    return this;
  }

   /**
   * Get cascadingDeleteResources
   * @return cascadingDeleteResources
  **/
  @Schema(description = "")
  public List<CascadingDeleteResourcesEnum> getCascadingDeleteResources() {
    return cascadingDeleteResources;
  }

  public void setCascadingDeleteResources(List<CascadingDeleteResourcesEnum> cascadingDeleteResources) {
    this.cascadingDeleteResources = cascadingDeleteResources;
  }

  public DeleteAddonRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public DeleteAddonRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeleteAddonRequest retainResources(List<RetainResourcesEnum> retainResources) {
    this.retainResources = retainResources;
    return this;
  }

  public DeleteAddonRequest addRetainResourcesItem(RetainResourcesEnum retainResourcesItem) {
    if (this.retainResources == null) {
      this.retainResources = new ArrayList<RetainResourcesEnum>();
    }
    this.retainResources.add(retainResourcesItem);
    return this;
  }

   /**
   * Get retainResources
   * @return retainResources
  **/
  @Schema(description = "")
  public List<RetainResourcesEnum> getRetainResources() {
    return retainResources;
  }

  public void setRetainResources(List<RetainResourcesEnum> retainResources) {
    this.retainResources = retainResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAddonRequest deleteAddonRequest = (DeleteAddonRequest) o;
    return Objects.equals(this.cascadingDeleteResources, deleteAddonRequest.cascadingDeleteResources) &&
        Objects.equals(this.clusterId, deleteAddonRequest.clusterId) &&
        Objects.equals(this.name, deleteAddonRequest.name) &&
        Objects.equals(this.retainResources, deleteAddonRequest.retainResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascadingDeleteResources, clusterId, name, retainResources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAddonRequest {\n");
    
    sb.append("    cascadingDeleteResources: ").append(toIndentedString(cascadingDeleteResources)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retainResources: ").append(toIndentedString(retainResources)).append("\n");
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
