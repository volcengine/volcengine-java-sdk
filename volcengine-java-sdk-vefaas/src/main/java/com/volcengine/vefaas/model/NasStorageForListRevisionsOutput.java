/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vefaas.model.NasConfigForListRevisionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NasStorageForListRevisionsOutput
 */



public class NasStorageForListRevisionsOutput {
  @SerializedName("EnableNas")
  private Boolean enableNas = null;

  @SerializedName("NasConfigs")
  private List<NasConfigForListRevisionsOutput> nasConfigs = null;

  public NasStorageForListRevisionsOutput enableNas(Boolean enableNas) {
    this.enableNas = enableNas;
    return this;
  }

   /**
   * Get enableNas
   * @return enableNas
  **/
  @Schema(description = "")
  public Boolean isEnableNas() {
    return enableNas;
  }

  public void setEnableNas(Boolean enableNas) {
    this.enableNas = enableNas;
  }

  public NasStorageForListRevisionsOutput nasConfigs(List<NasConfigForListRevisionsOutput> nasConfigs) {
    this.nasConfigs = nasConfigs;
    return this;
  }

  public NasStorageForListRevisionsOutput addNasConfigsItem(NasConfigForListRevisionsOutput nasConfigsItem) {
    if (this.nasConfigs == null) {
      this.nasConfigs = new ArrayList<NasConfigForListRevisionsOutput>();
    }
    this.nasConfigs.add(nasConfigsItem);
    return this;
  }

   /**
   * Get nasConfigs
   * @return nasConfigs
  **/
  @Valid
  @Schema(description = "")
  public List<NasConfigForListRevisionsOutput> getNasConfigs() {
    return nasConfigs;
  }

  public void setNasConfigs(List<NasConfigForListRevisionsOutput> nasConfigs) {
    this.nasConfigs = nasConfigs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NasStorageForListRevisionsOutput nasStorageForListRevisionsOutput = (NasStorageForListRevisionsOutput) o;
    return Objects.equals(this.enableNas, nasStorageForListRevisionsOutput.enableNas) &&
        Objects.equals(this.nasConfigs, nasStorageForListRevisionsOutput.nasConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableNas, nasConfigs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NasStorageForListRevisionsOutput {\n");
    
    sb.append("    enableNas: ").append(toIndentedString(enableNas)).append("\n");
    sb.append("    nasConfigs: ").append(toIndentedString(nasConfigs)).append("\n");
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
