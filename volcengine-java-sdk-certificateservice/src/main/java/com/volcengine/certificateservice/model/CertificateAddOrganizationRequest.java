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
import com.volcengine.certificateservice.model.ContactForCertificateAddOrganizationInput;
import com.volcengine.certificateservice.model.ConvertTagForCertificateAddOrganizationInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CertificateAddOrganizationRequest
 */



public class CertificateAddOrganizationRequest {
  @SerializedName("Address")
  private String address = null;

  @SerializedName("BusinessLicenseNo")
  private String businessLicenseNo = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Contact")
  private ContactForCertificateAddOrganizationInput contact = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("Department")
  private String department = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Province")
  private String province = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("Tags")
  private List<ConvertTagForCertificateAddOrganizationInput> tags = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("Enterprise")
    ENTERPRISE("Enterprise"),
    @SerializedName("Individual")
    INDIVIDUAL("Individual");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Type")
  private TypeEnum type = null;

  public CertificateAddOrganizationRequest address(String address) {
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

  public CertificateAddOrganizationRequest businessLicenseNo(String businessLicenseNo) {
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

  public CertificateAddOrganizationRequest city(String city) {
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

  public CertificateAddOrganizationRequest contact(ContactForCertificateAddOrganizationInput contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @Valid
  @Schema(description = "")
  public ContactForCertificateAddOrganizationInput getContact() {
    return contact;
  }

  public void setContact(ContactForCertificateAddOrganizationInput contact) {
    this.contact = contact;
  }

  public CertificateAddOrganizationRequest country(String country) {
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

  public CertificateAddOrganizationRequest department(String department) {
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

  public CertificateAddOrganizationRequest email(String email) {
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

  public CertificateAddOrganizationRequest name(String name) {
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

  public CertificateAddOrganizationRequest postalCode(String postalCode) {
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

  public CertificateAddOrganizationRequest projectName(String projectName) {
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

  public CertificateAddOrganizationRequest province(String province) {
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

  public CertificateAddOrganizationRequest tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @NotNull
 @Size(max=100)  @Schema(required = true, description = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public CertificateAddOrganizationRequest tags(List<ConvertTagForCertificateAddOrganizationInput> tags) {
    this.tags = tags;
    return this;
  }

  public CertificateAddOrganizationRequest addTagsItem(ConvertTagForCertificateAddOrganizationInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<ConvertTagForCertificateAddOrganizationInput>();
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
  public List<ConvertTagForCertificateAddOrganizationInput> getTags() {
    return tags;
  }

  public void setTags(List<ConvertTagForCertificateAddOrganizationInput> tags) {
    this.tags = tags;
  }

  public CertificateAddOrganizationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  @Schema(required = true, description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateAddOrganizationRequest certificateAddOrganizationRequest = (CertificateAddOrganizationRequest) o;
    return Objects.equals(this.address, certificateAddOrganizationRequest.address) &&
        Objects.equals(this.businessLicenseNo, certificateAddOrganizationRequest.businessLicenseNo) &&
        Objects.equals(this.city, certificateAddOrganizationRequest.city) &&
        Objects.equals(this.contact, certificateAddOrganizationRequest.contact) &&
        Objects.equals(this.country, certificateAddOrganizationRequest.country) &&
        Objects.equals(this.department, certificateAddOrganizationRequest.department) &&
        Objects.equals(this.email, certificateAddOrganizationRequest.email) &&
        Objects.equals(this.name, certificateAddOrganizationRequest.name) &&
        Objects.equals(this.postalCode, certificateAddOrganizationRequest.postalCode) &&
        Objects.equals(this.projectName, certificateAddOrganizationRequest.projectName) &&
        Objects.equals(this.province, certificateAddOrganizationRequest.province) &&
        Objects.equals(this.tag, certificateAddOrganizationRequest.tag) &&
        Objects.equals(this.tags, certificateAddOrganizationRequest.tags) &&
        Objects.equals(this.type, certificateAddOrganizationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, businessLicenseNo, city, contact, country, department, email, name, postalCode, projectName, province, tag, tags, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateAddOrganizationRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    businessLicenseNo: ").append(toIndentedString(businessLicenseNo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
