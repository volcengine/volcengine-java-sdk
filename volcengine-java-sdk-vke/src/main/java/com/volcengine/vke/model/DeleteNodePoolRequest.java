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
 * DeleteNodePoolRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:54.001539+08:00[Asia/Shanghai]")
public class DeleteNodePoolRequest {
  /**
   * Gets or Sets cascadingDeleteResources
   */
  @JsonAdapter(CascadingDeleteResourcesEnum.Adapter.class)
  public enum CascadingDeleteResourcesEnum {
    ECS("Ecs");

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

  @SerializedName("Id")
  private String id = null;

  public DeleteNodePoolRequest cascadingDeleteResources(List<CascadingDeleteResourcesEnum> cascadingDeleteResources) {
    this.cascadingDeleteResources = cascadingDeleteResources;
    return this;
  }

  public DeleteNodePoolRequest addCascadingDeleteResourcesItem(CascadingDeleteResourcesEnum cascadingDeleteResourcesItem) {
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

  public DeleteNodePoolRequest clusterId(String clusterId) {
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

  public DeleteNodePoolRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteNodePoolRequest deleteNodePoolRequest = (DeleteNodePoolRequest) o;
    return Objects.equals(this.cascadingDeleteResources, deleteNodePoolRequest.cascadingDeleteResources) &&
        Objects.equals(this.clusterId, deleteNodePoolRequest.clusterId) &&
        Objects.equals(this.id, deleteNodePoolRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascadingDeleteResources, clusterId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteNodePoolRequest {\n");
    
    sb.append("    cascadingDeleteResources: ").append(toIndentedString(cascadingDeleteResources)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
