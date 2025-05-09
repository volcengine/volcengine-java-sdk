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
import com.volcengine.certificateservice.model.ContactForCertificateGetOrganizationOutput;
import com.volcengine.certificateservice.model.TagForCertificateGetOrganizationOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CertificateGetOrganizationResponse
 */



public class CertificateGetOrganizationResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Account")
  private String account = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("BusinessLicenseNo")
  private String businessLicenseNo = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Contact")
  private ContactForCertificateGetOrganizationOutput contact = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("Department")
  private String department = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("OrganizationId")
  private String organizationId = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Province")
  private String province = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("Tags")
  private List<TagForCertificateGetOrganizationOutput> tags = null;

  public CertificateGetOrganizationResponse account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public CertificateGetOrganizationResponse address(String address) {
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

  public CertificateGetOrganizationResponse businessLicenseNo(String businessLicenseNo) {
    this.businessLicenseNo = businessLicenseNo;
    return this;
  }

   /**
   * Get businessLicenseNo
   * @return businessLicenseNo
  **/
  @Schema(description = "")
  public String getBusinessLicenseNo() {
    return businessLicenseNo;
  }

  public void setBusinessLicenseNo(String businessLicenseNo) {
    this.businessLicenseNo = businessLicenseNo;
  }

  public CertificateGetOrganizationResponse city(String city) {
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

  public CertificateGetOrganizationResponse contact(ContactForCertificateGetOrganizationOutput contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @Valid
  @Schema(description = "")
  public ContactForCertificateGetOrganizationOutput getContact() {
    return contact;
  }

  public void setContact(ContactForCertificateGetOrganizationOutput contact) {
    this.contact = contact;
  }

  public CertificateGetOrganizationResponse country(String country) {
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

  public CertificateGetOrganizationResponse createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public CertificateGetOrganizationResponse department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @Schema(description = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public CertificateGetOrganizationResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CertificateGetOrganizationResponse name(String name) {
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

  public CertificateGetOrganizationResponse organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @Schema(description = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public CertificateGetOrganizationResponse postalCode(String postalCode) {
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

  public CertificateGetOrganizationResponse projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CertificateGetOrganizationResponse province(String province) {
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

  public CertificateGetOrganizationResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Schema(description = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public CertificateGetOrganizationResponse tags(List<TagForCertificateGetOrganizationOutput> tags) {
    this.tags = tags;
    return this;
  }

  public CertificateGetOrganizationResponse addTagsItem(TagForCertificateGetOrganizationOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCertificateGetOrganizationOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCertificateGetOrganizationOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCertificateGetOrganizationOutput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateGetOrganizationResponse certificateGetOrganizationResponse = (CertificateGetOrganizationResponse) o;
    return Objects.equals(this.account, certificateGetOrganizationResponse.account) &&
        Objects.equals(this.address, certificateGetOrganizationResponse.address) &&
        Objects.equals(this.businessLicenseNo, certificateGetOrganizationResponse.businessLicenseNo) &&
        Objects.equals(this.city, certificateGetOrganizationResponse.city) &&
        Objects.equals(this.contact, certificateGetOrganizationResponse.contact) &&
        Objects.equals(this.country, certificateGetOrganizationResponse.country) &&
        Objects.equals(this.createdTime, certificateGetOrganizationResponse.createdTime) &&
        Objects.equals(this.department, certificateGetOrganizationResponse.department) &&
        Objects.equals(this.email, certificateGetOrganizationResponse.email) &&
        Objects.equals(this.name, certificateGetOrganizationResponse.name) &&
        Objects.equals(this.organizationId, certificateGetOrganizationResponse.organizationId) &&
        Objects.equals(this.postalCode, certificateGetOrganizationResponse.postalCode) &&
        Objects.equals(this.projectName, certificateGetOrganizationResponse.projectName) &&
        Objects.equals(this.province, certificateGetOrganizationResponse.province) &&
        Objects.equals(this.tag, certificateGetOrganizationResponse.tag) &&
        Objects.equals(this.tags, certificateGetOrganizationResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, address, businessLicenseNo, city, contact, country, createdTime, department, email, name, organizationId, postalCode, projectName, province, tag, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateGetOrganizationResponse {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    businessLicenseNo: ").append(toIndentedString(businessLicenseNo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
