/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.BackupOriginForListDomainConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConditionalOriginForListDomainConfigOutput
 */



public class ConditionalOriginForListDomainConfigOutput {
  @SerializedName("BackupOrigins")
  private List<BackupOriginForListDomainConfigOutput> backupOrigins = null;

  @SerializedName("MatchingRuleGroupJSON")
  private String matchingRuleGroupJSON = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Origins")
  private List<BackupOriginForListDomainConfigOutput> origins = null;

  public ConditionalOriginForListDomainConfigOutput backupOrigins(List<BackupOriginForListDomainConfigOutput> backupOrigins) {
    this.backupOrigins = backupOrigins;
    return this;
  }

  public ConditionalOriginForListDomainConfigOutput addBackupOriginsItem(BackupOriginForListDomainConfigOutput backupOriginsItem) {
    if (this.backupOrigins == null) {
      this.backupOrigins = new ArrayList<BackupOriginForListDomainConfigOutput>();
    }
    this.backupOrigins.add(backupOriginsItem);
    return this;
  }

   /**
   * Get backupOrigins
   * @return backupOrigins
  **/
  @Valid
  @Schema(description = "")
  public List<BackupOriginForListDomainConfigOutput> getBackupOrigins() {
    return backupOrigins;
  }

  public void setBackupOrigins(List<BackupOriginForListDomainConfigOutput> backupOrigins) {
    this.backupOrigins = backupOrigins;
  }

  public ConditionalOriginForListDomainConfigOutput matchingRuleGroupJSON(String matchingRuleGroupJSON) {
    this.matchingRuleGroupJSON = matchingRuleGroupJSON;
    return this;
  }

   /**
   * Get matchingRuleGroupJSON
   * @return matchingRuleGroupJSON
  **/
  @Schema(description = "")
  public String getMatchingRuleGroupJSON() {
    return matchingRuleGroupJSON;
  }

  public void setMatchingRuleGroupJSON(String matchingRuleGroupJSON) {
    this.matchingRuleGroupJSON = matchingRuleGroupJSON;
  }

  public ConditionalOriginForListDomainConfigOutput name(String name) {
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

  public ConditionalOriginForListDomainConfigOutput origins(List<BackupOriginForListDomainConfigOutput> origins) {
    this.origins = origins;
    return this;
  }

  public ConditionalOriginForListDomainConfigOutput addOriginsItem(BackupOriginForListDomainConfigOutput originsItem) {
    if (this.origins == null) {
      this.origins = new ArrayList<BackupOriginForListDomainConfigOutput>();
    }
    this.origins.add(originsItem);
    return this;
  }

   /**
   * Get origins
   * @return origins
  **/
  @Valid
  @Schema(description = "")
  public List<BackupOriginForListDomainConfigOutput> getOrigins() {
    return origins;
  }

  public void setOrigins(List<BackupOriginForListDomainConfigOutput> origins) {
    this.origins = origins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalOriginForListDomainConfigOutput conditionalOriginForListDomainConfigOutput = (ConditionalOriginForListDomainConfigOutput) o;
    return Objects.equals(this.backupOrigins, conditionalOriginForListDomainConfigOutput.backupOrigins) &&
        Objects.equals(this.matchingRuleGroupJSON, conditionalOriginForListDomainConfigOutput.matchingRuleGroupJSON) &&
        Objects.equals(this.name, conditionalOriginForListDomainConfigOutput.name) &&
        Objects.equals(this.origins, conditionalOriginForListDomainConfigOutput.origins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupOrigins, matchingRuleGroupJSON, name, origins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalOriginForListDomainConfigOutput {\n");
    
    sb.append("    backupOrigins: ").append(toIndentedString(backupOrigins)).append("\n");
    sb.append("    matchingRuleGroupJSON: ").append(toIndentedString(matchingRuleGroupJSON)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
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
