/*
 * edx
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.edx.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.edx.model.APListForListDXPAccessPointsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CityListForListDXPAccessPointsOutput
 */



public class CityListForListDXPAccessPointsOutput {
  @SerializedName("APList")
  private List<APListForListDXPAccessPointsOutput> apList = null;

  @SerializedName("City")
  private String city = null;

  public CityListForListDXPAccessPointsOutput apList(List<APListForListDXPAccessPointsOutput> apList) {
    this.apList = apList;
    return this;
  }

  public CityListForListDXPAccessPointsOutput addApListItem(APListForListDXPAccessPointsOutput apListItem) {
    if (this.apList == null) {
      this.apList = new ArrayList<APListForListDXPAccessPointsOutput>();
    }
    this.apList.add(apListItem);
    return this;
  }

   /**
   * Get apList
   * @return apList
  **/
  @Valid
  @Schema(description = "")
  public List<APListForListDXPAccessPointsOutput> getApList() {
    return apList;
  }

  public void setApList(List<APListForListDXPAccessPointsOutput> apList) {
    this.apList = apList;
  }

  public CityListForListDXPAccessPointsOutput city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityListForListDXPAccessPointsOutput cityListForListDXPAccessPointsOutput = (CityListForListDXPAccessPointsOutput) o;
    return Objects.equals(this.apList, cityListForListDXPAccessPointsOutput.apList) &&
        Objects.equals(this.city, cityListForListDXPAccessPointsOutput.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apList, city);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityListForListDXPAccessPointsOutput {\n");
    
    sb.append("    apList: ").append(toIndentedString(apList)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
