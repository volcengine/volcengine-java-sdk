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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PrefixListEntryForDescribePrefixListEntriesOutput
 */



public class PrefixListEntryForDescribePrefixListEntriesOutput {
  @SerializedName("Cidr")
  private String cidr = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PrefixListId")
  private String prefixListId = null;

  public PrefixListEntryForDescribePrefixListEntriesOutput cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @Schema(description = "")
  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public PrefixListEntryForDescribePrefixListEntriesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PrefixListEntryForDescribePrefixListEntriesOutput prefixListId(String prefixListId) {
    this.prefixListId = prefixListId;
    return this;
  }

   /**
   * Get prefixListId
   * @return prefixListId
  **/
  @Schema(description = "")
  public String getPrefixListId() {
    return prefixListId;
  }

  public void setPrefixListId(String prefixListId) {
    this.prefixListId = prefixListId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefixListEntryForDescribePrefixListEntriesOutput prefixListEntryForDescribePrefixListEntriesOutput = (PrefixListEntryForDescribePrefixListEntriesOutput) o;
    return Objects.equals(this.cidr, prefixListEntryForDescribePrefixListEntriesOutput.cidr) &&
        Objects.equals(this.description, prefixListEntryForDescribePrefixListEntriesOutput.description) &&
        Objects.equals(this.prefixListId, prefixListEntryForDescribePrefixListEntriesOutput.prefixListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidr, description, prefixListId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefixListEntryForDescribePrefixListEntriesOutput {\n");
    
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    prefixListId: ").append(toIndentedString(prefixListId)).append("\n");
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
