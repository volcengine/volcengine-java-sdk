/*
 * certificate_service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.certificateservice.model;

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
 * SubjectForCertificateGetInstanceOutput
 */



public class SubjectForCertificateGetInstanceOutput {
  @SerializedName("Address")
  private String address = null;

  @SerializedName("CommonName")
  private String commonName = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("Locality")
  private String locality = null;

  @SerializedName("Organization")
  private String organization = null;

  @SerializedName("OrganizationUnit")
  private String organizationUnit = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("Province")
  private String province = null;

  public SubjectForCertificateGetInstanceOutput address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public SubjectForCertificateGetInstanceOutput commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

   /**
   * Get commonName
   * @return commonName
  **/
  @Schema(description = "")
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public SubjectForCertificateGetInstanceOutput country(String country) {
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

  public SubjectForCertificateGetInstanceOutput locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @Schema(description = "")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public SubjectForCertificateGetInstanceOutput organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @Schema(description = "")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public SubjectForCertificateGetInstanceOutput organizationUnit(String organizationUnit) {
    this.organizationUnit = organizationUnit;
    return this;
  }

   /**
   * Get organizationUnit
   * @return organizationUnit
  **/
  @Schema(description = "")
  public String getOrganizationUnit() {
    return organizationUnit;
  }

  public void setOrganizationUnit(String organizationUnit) {
    this.organizationUnit = organizationUnit;
  }

  public SubjectForCertificateGetInstanceOutput postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @Schema(description = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public SubjectForCertificateGetInstanceOutput province(String province) {
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
    SubjectForCertificateGetInstanceOutput subjectForCertificateGetInstanceOutput = (SubjectForCertificateGetInstanceOutput) o;
    return Objects.equals(this.address, subjectForCertificateGetInstanceOutput.address) &&
        Objects.equals(this.commonName, subjectForCertificateGetInstanceOutput.commonName) &&
        Objects.equals(this.country, subjectForCertificateGetInstanceOutput.country) &&
        Objects.equals(this.locality, subjectForCertificateGetInstanceOutput.locality) &&
        Objects.equals(this.organization, subjectForCertificateGetInstanceOutput.organization) &&
        Objects.equals(this.organizationUnit, subjectForCertificateGetInstanceOutput.organizationUnit) &&
        Objects.equals(this.postalCode, subjectForCertificateGetInstanceOutput.postalCode) &&
        Objects.equals(this.province, subjectForCertificateGetInstanceOutput.province);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, commonName, country, locality, organization, organizationUnit, postalCode, province);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectForCertificateGetInstanceOutput {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationUnit: ").append(toIndentedString(organizationUnit)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
