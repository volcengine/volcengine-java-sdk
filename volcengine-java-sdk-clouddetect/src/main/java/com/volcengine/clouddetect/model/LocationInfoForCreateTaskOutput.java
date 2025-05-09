/*
 * cloud_detect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clouddetect.model;

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
 * LocationInfoForCreateTaskOutput
 */



public class LocationInfoForCreateTaskOutput {
  @SerializedName("City")
  private String city = null;

  @SerializedName("Continent")
  private String continent = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("Isp")
  private String isp = null;

  @SerializedName("Province")
  private String province = null;

  public LocationInfoForCreateTaskOutput city(String city) {
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

  public LocationInfoForCreateTaskOutput continent(String continent) {
    this.continent = continent;
    return this;
  }

   /**
   * Get continent
   * @return continent
  **/
  @Schema(description = "")
  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public LocationInfoForCreateTaskOutput country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LocationInfoForCreateTaskOutput isp(String isp) {
    this.isp = isp;
    return this;
  }

   /**
   * Get isp
   * @return isp
  **/
  @Schema(description = "")
  public String getIsp() {
    return isp;
  }

  public void setIsp(String isp) {
    this.isp = isp;
  }

  public LocationInfoForCreateTaskOutput province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @Schema(description = "")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationInfoForCreateTaskOutput locationInfoForCreateTaskOutput = (LocationInfoForCreateTaskOutput) o;
    return Objects.equals(this.city, locationInfoForCreateTaskOutput.city) &&
        Objects.equals(this.continent, locationInfoForCreateTaskOutput.continent) &&
        Objects.equals(this.country, locationInfoForCreateTaskOutput.country) &&
        Objects.equals(this.isp, locationInfoForCreateTaskOutput.isp) &&
        Objects.equals(this.province, locationInfoForCreateTaskOutput.province);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, continent, country, isp, province);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationInfoForCreateTaskOutput {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
