/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcdn.model.CountryForListViewsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListViewsResponse
 */



public class ListViewsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Countries")
  private List<CountryForListViewsOutput> countries = null;

  @SerializedName("Version")
  private String version = null;

  public ListViewsResponse countries(List<CountryForListViewsOutput> countries) {
    this.countries = countries;
    return this;
  }

  public ListViewsResponse addCountriesItem(CountryForListViewsOutput countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<CountryForListViewsOutput>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @Valid
  @Schema(description = "")
  public List<CountryForListViewsOutput> getCountries() {
    return countries;
  }

  public void setCountries(List<CountryForListViewsOutput> countries) {
    this.countries = countries;
  }

  public ListViewsResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListViewsResponse listViewsResponse = (ListViewsResponse) o;
    return Objects.equals(this.countries, listViewsResponse.countries) &&
        Objects.equals(this.version, listViewsResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListViewsResponse {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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