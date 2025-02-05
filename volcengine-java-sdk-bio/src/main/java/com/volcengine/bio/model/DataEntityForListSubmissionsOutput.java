/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

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
 * DataEntityForListSubmissionsOutput
 */



public class DataEntityForListSubmissionsOutput {
  @SerializedName("ID")
  private String ID = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RowIDs")
  private List<String> rowIDs = null;

  public DataEntityForListSubmissionsOutput ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public DataEntityForListSubmissionsOutput name(String name) {
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

  public DataEntityForListSubmissionsOutput rowIDs(List<String> rowIDs) {
    this.rowIDs = rowIDs;
    return this;
  }

  public DataEntityForListSubmissionsOutput addRowIDsItem(String rowIDsItem) {
    if (this.rowIDs == null) {
      this.rowIDs = new ArrayList<String>();
    }
    this.rowIDs.add(rowIDsItem);
    return this;
  }

   /**
   * Get rowIDs
   * @return rowIDs
  **/
  @Schema(description = "")
  public List<String> getRowIDs() {
    return rowIDs;
  }

  public void setRowIDs(List<String> rowIDs) {
    this.rowIDs = rowIDs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataEntityForListSubmissionsOutput dataEntityForListSubmissionsOutput = (DataEntityForListSubmissionsOutput) o;
    return Objects.equals(this.ID, dataEntityForListSubmissionsOutput.ID) &&
        Objects.equals(this.name, dataEntityForListSubmissionsOutput.name) &&
        Objects.equals(this.rowIDs, dataEntityForListSubmissionsOutput.rowIDs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, rowIDs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataEntityForListSubmissionsOutput {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rowIDs: ").append(toIndentedString(rowIDs)).append("\n");
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
