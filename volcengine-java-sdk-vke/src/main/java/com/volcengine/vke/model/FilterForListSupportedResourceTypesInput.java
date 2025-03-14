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
 * FilterForListSupportedResourceTypesInput
 */



public class FilterForListSupportedResourceTypesInput {
  /**
   * Gets or Sets resourceTypes
   */
  @JsonAdapter(ResourceTypesEnum.Adapter.class)
  public enum ResourceTypesEnum {
    @SerializedName("Ecs")
    ECS("Ecs"),
    @SerializedName("Zone")
    ZONE("Zone");

    private String value;

    ResourceTypesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceTypesEnum fromValue(String input) {
      for (ResourceTypesEnum b : ResourceTypesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ResourceTypesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ResourceTypesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ResourceTypes")
  private List<ResourceTypesEnum> resourceTypes = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  public FilterForListSupportedResourceTypesInput resourceTypes(List<ResourceTypesEnum> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public FilterForListSupportedResourceTypesInput addResourceTypesItem(ResourceTypesEnum resourceTypesItem) {
    if (this.resourceTypes == null) {
      this.resourceTypes = new ArrayList<ResourceTypesEnum>();
    }
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

   /**
   * Get resourceTypes
   * @return resourceTypes
  **/
  @Schema(description = "")
  public List<ResourceTypesEnum> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(List<ResourceTypesEnum> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }

  public FilterForListSupportedResourceTypesInput zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public FilterForListSupportedResourceTypesInput addZoneIdsItem(String zoneIdsItem) {
    if (this.zoneIds == null) {
      this.zoneIds = new ArrayList<String>();
    }
    this.zoneIds.add(zoneIdsItem);
    return this;
  }

   /**
   * Get zoneIds
   * @return zoneIds
  **/
  @Schema(description = "")
  public List<String> getZoneIds() {
    return zoneIds;
  }

  public void setZoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListSupportedResourceTypesInput filterForListSupportedResourceTypesInput = (FilterForListSupportedResourceTypesInput) o;
    return Objects.equals(this.resourceTypes, filterForListSupportedResourceTypesInput.resourceTypes) &&
        Objects.equals(this.zoneIds, filterForListSupportedResourceTypesInput.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypes, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListSupportedResourceTypesInput {\n");
    
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
    sb.append("    zoneIds: ").append(toIndentedString(zoneIds)).append("\n");
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
