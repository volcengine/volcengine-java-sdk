/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.iam.model.CertificateForListSAMLProviderCertificatesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListSAMLProviderCertificatesResponse
 */



public class ListSAMLProviderCertificatesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Certificates")
  private List<CertificateForListSAMLProviderCertificatesOutput> certificates = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListSAMLProviderCertificatesResponse certificates(List<CertificateForListSAMLProviderCertificatesOutput> certificates) {
    this.certificates = certificates;
    return this;
  }

  public ListSAMLProviderCertificatesResponse addCertificatesItem(CertificateForListSAMLProviderCertificatesOutput certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<CertificateForListSAMLProviderCertificatesOutput>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @Valid
  @Schema(description = "")
  public List<CertificateForListSAMLProviderCertificatesOutput> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<CertificateForListSAMLProviderCertificatesOutput> certificates) {
    this.certificates = certificates;
  }

  public ListSAMLProviderCertificatesResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSAMLProviderCertificatesResponse listSAMLProviderCertificatesResponse = (ListSAMLProviderCertificatesResponse) o;
    return Objects.equals(this.certificates, listSAMLProviderCertificatesResponse.certificates) &&
        Objects.equals(this.total, listSAMLProviderCertificatesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSAMLProviderCertificatesResponse {\n");
    
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
