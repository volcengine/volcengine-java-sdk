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
import com.volcengine.seccenter20240508.model.MappingForListAllCntrStaticDictOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForListAllCntrStaticDictOutput
 */



public class DataForListAllCntrStaticDictOutput {
  @SerializedName("DictName")
  private String dictName = null;

  @SerializedName("Mapping")
  private List<MappingForListAllCntrStaticDictOutput> mapping = null;

  public DataForListAllCntrStaticDictOutput dictName(String dictName) {
    this.dictName = dictName;
    return this;
  }

   /**
   * Get dictName
   * @return dictName
  **/
  @Schema(description = "")
  public String getDictName() {
    return dictName;
  }

  public void setDictName(String dictName) {
    this.dictName = dictName;
  }

  public DataForListAllCntrStaticDictOutput mapping(List<MappingForListAllCntrStaticDictOutput> mapping) {
    this.mapping = mapping;
    return this;
  }

  public DataForListAllCntrStaticDictOutput addMappingItem(MappingForListAllCntrStaticDictOutput mappingItem) {
    if (this.mapping == null) {
      this.mapping = new ArrayList<MappingForListAllCntrStaticDictOutput>();
    }
    this.mapping.add(mappingItem);
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  @Valid
  @Schema(description = "")
  public List<MappingForListAllCntrStaticDictOutput> getMapping() {
    return mapping;
  }

  public void setMapping(List<MappingForListAllCntrStaticDictOutput> mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListAllCntrStaticDictOutput dataForListAllCntrStaticDictOutput = (DataForListAllCntrStaticDictOutput) o;
    return Objects.equals(this.dictName, dataForListAllCntrStaticDictOutput.dictName) &&
        Objects.equals(this.mapping, dataForListAllCntrStaticDictOutput.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dictName, mapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListAllCntrStaticDictOutput {\n");
    
    sb.append("    dictName: ").append(toIndentedString(dictName)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
