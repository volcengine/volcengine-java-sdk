/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.AddPrefixListEntryForModifyPrefixListInput;
import com.volcengine.vpc.model.RemovePrefixListEntryForModifyPrefixListInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyPrefixListRequest
 */


public class ModifyPrefixListRequest {
  @SerializedName("AddPrefixListEntries")
  private List<AddPrefixListEntryForModifyPrefixListInput> addPrefixListEntries = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DryRun")
  private String dryRun = null;

  @SerializedName("MaxEntries")
  private Integer maxEntries = null;

  @SerializedName("PrefixListId")
  private String prefixListId = null;

  @SerializedName("PrefixListName")
  private String prefixListName = null;

  @SerializedName("RemovePrefixListEntries")
  private List<RemovePrefixListEntryForModifyPrefixListInput> removePrefixListEntries = null;

  public ModifyPrefixListRequest addPrefixListEntries(List<AddPrefixListEntryForModifyPrefixListInput> addPrefixListEntries) {
    this.addPrefixListEntries = addPrefixListEntries;
    return this;
  }

  public ModifyPrefixListRequest addAddPrefixListEntriesItem(AddPrefixListEntryForModifyPrefixListInput addPrefixListEntriesItem) {
    if (this.addPrefixListEntries == null) {
      this.addPrefixListEntries = new ArrayList<AddPrefixListEntryForModifyPrefixListInput>();
    }
    this.addPrefixListEntries.add(addPrefixListEntriesItem);
    return this;
  }

   /**
   * Get addPrefixListEntries
   * @return addPrefixListEntries
  **/
  @Valid
  @Schema(description = "")
  public List<AddPrefixListEntryForModifyPrefixListInput> getAddPrefixListEntries() {
    return addPrefixListEntries;
  }

  public void setAddPrefixListEntries(List<AddPrefixListEntryForModifyPrefixListInput> addPrefixListEntries) {
    this.addPrefixListEntries = addPrefixListEntries;
  }

  public ModifyPrefixListRequest clientToken(String clientToken) {
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

  public ModifyPrefixListRequest description(String description) {
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

  public ModifyPrefixListRequest dryRun(String dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @Schema(description = "")
  public String getDryRun() {
    return dryRun;
  }

  public void setDryRun(String dryRun) {
    this.dryRun = dryRun;
  }

  public ModifyPrefixListRequest maxEntries(Integer maxEntries) {
    this.maxEntries = maxEntries;
    return this;
  }

   /**
   * Get maxEntries
   * @return maxEntries
  **/
  @Schema(description = "")
  public Integer getMaxEntries() {
    return maxEntries;
  }

  public void setMaxEntries(Integer maxEntries) {
    this.maxEntries = maxEntries;
  }

  public ModifyPrefixListRequest prefixListId(String prefixListId) {
    this.prefixListId = prefixListId;
    return this;
  }

   /**
   * Get prefixListId
   * @return prefixListId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPrefixListId() {
    return prefixListId;
  }

  public void setPrefixListId(String prefixListId) {
    this.prefixListId = prefixListId;
  }

  public ModifyPrefixListRequest prefixListName(String prefixListName) {
    this.prefixListName = prefixListName;
    return this;
  }

   /**
   * Get prefixListName
   * @return prefixListName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getPrefixListName() {
    return prefixListName;
  }

  public void setPrefixListName(String prefixListName) {
    this.prefixListName = prefixListName;
  }

  public ModifyPrefixListRequest removePrefixListEntries(List<RemovePrefixListEntryForModifyPrefixListInput> removePrefixListEntries) {
    this.removePrefixListEntries = removePrefixListEntries;
    return this;
  }

  public ModifyPrefixListRequest addRemovePrefixListEntriesItem(RemovePrefixListEntryForModifyPrefixListInput removePrefixListEntriesItem) {
    if (this.removePrefixListEntries == null) {
      this.removePrefixListEntries = new ArrayList<RemovePrefixListEntryForModifyPrefixListInput>();
    }
    this.removePrefixListEntries.add(removePrefixListEntriesItem);
    return this;
  }

   /**
   * Get removePrefixListEntries
   * @return removePrefixListEntries
  **/
  @Valid
  @Schema(description = "")
  public List<RemovePrefixListEntryForModifyPrefixListInput> getRemovePrefixListEntries() {
    return removePrefixListEntries;
  }

  public void setRemovePrefixListEntries(List<RemovePrefixListEntryForModifyPrefixListInput> removePrefixListEntries) {
    this.removePrefixListEntries = removePrefixListEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyPrefixListRequest modifyPrefixListRequest = (ModifyPrefixListRequest) o;
    return Objects.equals(this.addPrefixListEntries, modifyPrefixListRequest.addPrefixListEntries) &&
        Objects.equals(this.clientToken, modifyPrefixListRequest.clientToken) &&
        Objects.equals(this.description, modifyPrefixListRequest.description) &&
        Objects.equals(this.dryRun, modifyPrefixListRequest.dryRun) &&
        Objects.equals(this.maxEntries, modifyPrefixListRequest.maxEntries) &&
        Objects.equals(this.prefixListId, modifyPrefixListRequest.prefixListId) &&
        Objects.equals(this.prefixListName, modifyPrefixListRequest.prefixListName) &&
        Objects.equals(this.removePrefixListEntries, modifyPrefixListRequest.removePrefixListEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addPrefixListEntries, clientToken, description, dryRun, maxEntries, prefixListId, prefixListName, removePrefixListEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyPrefixListRequest {\n");
    
    sb.append("    addPrefixListEntries: ").append(toIndentedString(addPrefixListEntries)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    maxEntries: ").append(toIndentedString(maxEntries)).append("\n");
    sb.append("    prefixListId: ").append(toIndentedString(prefixListId)).append("\n");
    sb.append("    prefixListName: ").append(toIndentedString(prefixListName)).append("\n");
    sb.append("    removePrefixListEntries: ").append(toIndentedString(removePrefixListEntries)).append("\n");
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
