/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.seccenter20240508.model.ConditionsForCreateHostTagInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateHostTagRequest
 */



public class CreateHostTagRequest {
  @SerializedName("BeforeTag")
  private String beforeTag = null;

  @SerializedName("Conditions")
  private ConditionsForCreateHostTagInput conditions = null;

  @SerializedName("IdList")
  private List<String> idList = null;

  @SerializedName("Tags")
  private List<String> tags = null;

  public CreateHostTagRequest beforeTag(String beforeTag) {
    this.beforeTag = beforeTag;
    return this;
  }

   /**
   * Get beforeTag
   * @return beforeTag
  **/
  @Schema(description = "")
  public String getBeforeTag() {
    return beforeTag;
  }

  public void setBeforeTag(String beforeTag) {
    this.beforeTag = beforeTag;
  }

  public CreateHostTagRequest conditions(ConditionsForCreateHostTagInput conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Valid
  @Schema(description = "")
  public ConditionsForCreateHostTagInput getConditions() {
    return conditions;
  }

  public void setConditions(ConditionsForCreateHostTagInput conditions) {
    this.conditions = conditions;
  }

  public CreateHostTagRequest idList(List<String> idList) {
    this.idList = idList;
    return this;
  }

  public CreateHostTagRequest addIdListItem(String idListItem) {
    if (this.idList == null) {
      this.idList = new ArrayList<String>();
    }
    this.idList.add(idListItem);
    return this;
  }

   /**
   * Get idList
   * @return idList
  **/
  @Schema(description = "")
  public List<String> getIdList() {
    return idList;
  }

  public void setIdList(List<String> idList) {
    this.idList = idList;
  }

  public CreateHostTagRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateHostTagRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
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
    CreateHostTagRequest createHostTagRequest = (CreateHostTagRequest) o;
    return Objects.equals(this.beforeTag, createHostTagRequest.beforeTag) &&
        Objects.equals(this.conditions, createHostTagRequest.conditions) &&
        Objects.equals(this.idList, createHostTagRequest.idList) &&
        Objects.equals(this.tags, createHostTagRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beforeTag, conditions, idList, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHostTagRequest {\n");
    
    sb.append("    beforeTag: ").append(toIndentedString(beforeTag)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
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
