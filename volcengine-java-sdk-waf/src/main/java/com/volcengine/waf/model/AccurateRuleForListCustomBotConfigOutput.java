/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * AccurateRuleForListCustomBotConfigOutput
 */



public class AccurateRuleForListCustomBotConfigOutput {
  @SerializedName("HttpObj")
  private String httpObj = null;

  @SerializedName("ObjType")
  private Integer objType = null;

  @SerializedName("Opretar")
  private Integer opretar = null;

  @SerializedName("Property")
  private Integer property = null;

  @SerializedName("ValueString")
  private String valueString = null;

  public AccurateRuleForListCustomBotConfigOutput httpObj(String httpObj) {
    this.httpObj = httpObj;
    return this;
  }

   /**
   * Get httpObj
   * @return httpObj
  **/
  @Schema(description = "")
  public String getHttpObj() {
    return httpObj;
  }

  public void setHttpObj(String httpObj) {
    this.httpObj = httpObj;
  }

  public AccurateRuleForListCustomBotConfigOutput objType(Integer objType) {
    this.objType = objType;
    return this;
  }

   /**
   * Get objType
   * @return objType
  **/
  @Schema(description = "")
  public Integer getObjType() {
    return objType;
  }

  public void setObjType(Integer objType) {
    this.objType = objType;
  }

  public AccurateRuleForListCustomBotConfigOutput opretar(Integer opretar) {
    this.opretar = opretar;
    return this;
  }

   /**
   * Get opretar
   * @return opretar
  **/
  @Schema(description = "")
  public Integer getOpretar() {
    return opretar;
  }

  public void setOpretar(Integer opretar) {
    this.opretar = opretar;
  }

  public AccurateRuleForListCustomBotConfigOutput property(Integer property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @Schema(description = "")
  public Integer getProperty() {
    return property;
  }

  public void setProperty(Integer property) {
    this.property = property;
  }

  public AccurateRuleForListCustomBotConfigOutput valueString(String valueString) {
    this.valueString = valueString;
    return this;
  }

   /**
   * Get valueString
   * @return valueString
  **/
  @Schema(description = "")
  public String getValueString() {
    return valueString;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccurateRuleForListCustomBotConfigOutput accurateRuleForListCustomBotConfigOutput = (AccurateRuleForListCustomBotConfigOutput) o;
    return Objects.equals(this.httpObj, accurateRuleForListCustomBotConfigOutput.httpObj) &&
        Objects.equals(this.objType, accurateRuleForListCustomBotConfigOutput.objType) &&
        Objects.equals(this.opretar, accurateRuleForListCustomBotConfigOutput.opretar) &&
        Objects.equals(this.property, accurateRuleForListCustomBotConfigOutput.property) &&
        Objects.equals(this.valueString, accurateRuleForListCustomBotConfigOutput.valueString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpObj, objType, opretar, property, valueString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccurateRuleForListCustomBotConfigOutput {\n");
    
    sb.append("    httpObj: ").append(toIndentedString(httpObj)).append("\n");
    sb.append("    objType: ").append(toIndentedString(objType)).append("\n");
    sb.append("    opretar: ").append(toIndentedString(opretar)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    valueString: ").append(toIndentedString(valueString)).append("\n");
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
