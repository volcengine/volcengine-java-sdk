/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.TagForTagResourcesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TagResourcesRequest
 */



public class TagResourcesRequest {
  @SerializedName("ResourceIds")
  private List<String> resourceIds = null;

  /**
   * Gets or Sets resourceType
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    @SerializedName("CLB")
    CLB("CLB"),
    @SerializedName("ACL")
    ACL("ACL"),
    @SerializedName("Certificate")
    CERTIFICATE("Certificate");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceTypeEnum fromValue(String input) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ResourceType")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("Tags")
  private List<TagForTagResourcesInput> tags = null;

  public TagResourcesRequest resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public TagResourcesRequest addResourceIdsItem(String resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<String>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

   /**
   * Get resourceIds
   * @return resourceIds
  **/
  @Schema(description = "")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public TagResourcesRequest resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public TagResourcesRequest tags(List<TagForTagResourcesInput> tags) {
    this.tags = tags;
    return this;
  }

  public TagResourcesRequest addTagsItem(TagForTagResourcesInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForTagResourcesInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForTagResourcesInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForTagResourcesInput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagResourcesRequest tagResourcesRequest = (TagResourcesRequest) o;
    return Objects.equals(this.resourceIds, tagResourcesRequest.resourceIds) &&
        Objects.equals(this.resourceType, tagResourcesRequest.resourceType) &&
        Objects.equals(this.tags, tagResourcesRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceIds, resourceType, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagResourcesRequest {\n");
    
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
