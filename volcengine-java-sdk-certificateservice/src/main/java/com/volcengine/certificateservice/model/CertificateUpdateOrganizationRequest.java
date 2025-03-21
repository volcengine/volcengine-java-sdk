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
import com.volcengine.certificateservice.model.ContactForCertificateUpdateOrganizationInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CertificateUpdateOrganizationRequest
 */



public class CertificateUpdateOrganizationRequest {
  @SerializedName("Address")
  private String address = null;

  @SerializedName("BusinessLicenseNo")
  private String businessLicenseNo = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Contact")
  private ContactForCertificateUpdateOrganizationInput contact = null;

  @SerializedName("Country")
  private String country = null;

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

  @SerializedName("Province")
  private String province = null;

  @SerializedName("Tag")
  private String tag = null;

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

  public CertificateUpdateOrganizationRequest address(String address) {
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

  public CertificateUpdateOrganizationRequest businessLicenseNo(String businessLicenseNo) {
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

  public CertificateUpdateOrganizationRequest city(String city) {
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

  public CertificateUpdateOrganizationRequest contact(ContactForCertificateUpdateOrganizationInput contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @Valid
  @Schema(description = "")
  public ContactForCertificateUpdateOrganizationInput getContact() {
    return contact;
  }

  public void setContact(ContactForCertificateUpdateOrganizationInput contact) {
    this.contact = contact;
  }

  public CertificateUpdateOrganizationRequest country(String country) {
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

  public CertificateUpdateOrganizationRequest department(String department) {
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

  public CertificateUpdateOrganizationRequest email(String email) {
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

  public CertificateUpdateOrganizationRequest name(String name) {
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

  public CertificateUpdateOrganizationRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public CertificateUpdateOrganizationRequest postalCode(String postalCode) {
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

  public CertificateUpdateOrganizationRequest province(String province) {
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

  public CertificateUpdateOrganizationRequest tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
 @Size(max=100)  @Schema(description = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public CertificateUpdateOrganizationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
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
    CertificateUpdateOrganizationRequest certificateUpdateOrganizationRequest = (CertificateUpdateOrganizationRequest) o;
    return Objects.equals(this.address, certificateUpdateOrganizationRequest.address) &&
        Objects.equals(this.businessLicenseNo, certificateUpdateOrganizationRequest.businessLicenseNo) &&
        Objects.equals(this.city, certificateUpdateOrganizationRequest.city) &&
        Objects.equals(this.contact, certificateUpdateOrganizationRequest.contact) &&
        Objects.equals(this.country, certificateUpdateOrganizationRequest.country) &&
        Objects.equals(this.department, certificateUpdateOrganizationRequest.department) &&
        Objects.equals(this.email, certificateUpdateOrganizationRequest.email) &&
        Objects.equals(this.name, certificateUpdateOrganizationRequest.name) &&
        Objects.equals(this.organizationId, certificateUpdateOrganizationRequest.organizationId) &&
        Objects.equals(this.postalCode, certificateUpdateOrganizationRequest.postalCode) &&
        Objects.equals(this.province, certificateUpdateOrganizationRequest.province) &&
        Objects.equals(this.tag, certificateUpdateOrganizationRequest.tag) &&
        Objects.equals(this.type, certificateUpdateOrganizationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, businessLicenseNo, city, contact, country, department, email, name, organizationId, postalCode, province, tag, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateUpdateOrganizationRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    businessLicenseNo: ").append(toIndentedString(businessLicenseNo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
