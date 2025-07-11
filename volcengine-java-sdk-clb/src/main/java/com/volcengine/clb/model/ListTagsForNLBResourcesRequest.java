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
import com.volcengine.clb.model.TagFilterForListTagsForNLBResourcesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListTagsForNLBResourcesRequest
 */



public class ListTagsForNLBResourcesRequest {
  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("ResourceIds")
  private List<String> resourceIds = null;

  /**
   * Gets or Sets resourceType
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    @SerializedName("nlb")
    NLB("nlb"),
    @SerializedName("nlb_listener")
    NLB_LISTENER("nlb_listener"),
    @SerializedName("nlb_servergroup")
    NLB_SERVERGROUP("nlb_servergroup"),
    @SerializedName("nlb_security_policy")
    NLB_SECURITY_POLICY("nlb_security_policy");

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

  @SerializedName("TagFilters")
  private List<TagFilterForListTagsForNLBResourcesInput> tagFilters = null;

  /**
   * Gets or Sets tagType
   */
  @JsonAdapter(TagTypeEnum.Adapter.class)
  public enum TagTypeEnum {
    @SerializedName("custom")
    CUSTOM("custom"),
    @SerializedName("system")
    SYSTEM("system");

    private String value;

    TagTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TagTypeEnum fromValue(String input) {
      for (TagTypeEnum b : TagTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TagTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TagTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TagTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TagTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("TagType")
  private TagTypeEnum tagType = null;

  public ListTagsForNLBResourcesRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public ListTagsForNLBResourcesRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ListTagsForNLBResourcesRequest resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public ListTagsForNLBResourcesRequest addResourceIdsItem(String resourceIdsItem) {
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

  public ListTagsForNLBResourcesRequest resourceType(ResourceTypeEnum resourceType) {
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

  public ListTagsForNLBResourcesRequest tagFilters(List<TagFilterForListTagsForNLBResourcesInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public ListTagsForNLBResourcesRequest addTagFiltersItem(TagFilterForListTagsForNLBResourcesInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForListTagsForNLBResourcesInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForListTagsForNLBResourcesInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForListTagsForNLBResourcesInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public ListTagsForNLBResourcesRequest tagType(TagTypeEnum tagType) {
    this.tagType = tagType;
    return this;
  }

   /**
   * Get tagType
   * @return tagType
  **/
  @Schema(description = "")
  public TagTypeEnum getTagType() {
    return tagType;
  }

  public void setTagType(TagTypeEnum tagType) {
    this.tagType = tagType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTagsForNLBResourcesRequest listTagsForNLBResourcesRequest = (ListTagsForNLBResourcesRequest) o;
    return Objects.equals(this.maxResults, listTagsForNLBResourcesRequest.maxResults) &&
        Objects.equals(this.nextToken, listTagsForNLBResourcesRequest.nextToken) &&
        Objects.equals(this.resourceIds, listTagsForNLBResourcesRequest.resourceIds) &&
        Objects.equals(this.resourceType, listTagsForNLBResourcesRequest.resourceType) &&
        Objects.equals(this.tagFilters, listTagsForNLBResourcesRequest.tagFilters) &&
        Objects.equals(this.tagType, listTagsForNLBResourcesRequest.tagType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, nextToken, resourceIds, resourceType, tagFilters, tagType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTagsForNLBResourcesRequest {\n");
    
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
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
