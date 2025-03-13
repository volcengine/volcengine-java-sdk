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
import com.volcengine.certificateservice.model.TagForQuickApplyCertificateInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QuickApplyCertificateRequest
 */



public class QuickApplyCertificateRequest {
  @SerializedName("CommonName")
  private String commonName = null;

  @SerializedName("Csr")
  private String csr = null;

  /**
   * Gets or Sets keyAlg
   */
  @JsonAdapter(KeyAlgEnum.Adapter.class)
  public enum KeyAlgEnum {
    @SerializedName("rsa")
    RSA("rsa"),
    @SerializedName("ecc")
    ECC("ecc"),
    @SerializedName("SM2")
    SM2("SM2");

    private String value;

    KeyAlgEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static KeyAlgEnum fromValue(String input) {
      for (KeyAlgEnum b : KeyAlgEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<KeyAlgEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyAlgEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public KeyAlgEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return KeyAlgEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("KeyAlg")
  private KeyAlgEnum keyAlg = null;

  @SerializedName("OrganizationId")
  private String organizationId = null;

  @SerializedName("Plan")
  private String plan = null;

  @SerializedName("PrivateKey")
  private String privateKey = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("San")
  private List<String> san = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("Tags")
  private List<TagForQuickApplyCertificateInput> tags = null;

  /**
   * Gets or Sets validationType
   */
  @JsonAdapter(ValidationTypeEnum.Adapter.class)
  public enum ValidationTypeEnum {
    @SerializedName("dns_cname")
    DNS_CNAME("dns_cname"),
    @SerializedName("dns_txt")
    DNS_TXT("dns_txt"),
    @SerializedName("https")
    HTTPS("https"),
    @SerializedName("http")
    HTTP("http");

    private String value;

    ValidationTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ValidationTypeEnum fromValue(String input) {
      for (ValidationTypeEnum b : ValidationTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ValidationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ValidationTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ValidationTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ValidationType")
  private ValidationTypeEnum validationType = null;

  public QuickApplyCertificateRequest commonName(String commonName) {
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

  public QuickApplyCertificateRequest csr(String csr) {
    this.csr = csr;
    return this;
  }

   /**
   * Get csr
   * @return csr
  **/
  @Schema(description = "")
  public String getCsr() {
    return csr;
  }

  public void setCsr(String csr) {
    this.csr = csr;
  }

  public QuickApplyCertificateRequest keyAlg(KeyAlgEnum keyAlg) {
    this.keyAlg = keyAlg;
    return this;
  }

   /**
   * Get keyAlg
   * @return keyAlg
  **/
  @Schema(description = "")
  public KeyAlgEnum getKeyAlg() {
    return keyAlg;
  }

  public void setKeyAlg(KeyAlgEnum keyAlg) {
    this.keyAlg = keyAlg;
  }

  public QuickApplyCertificateRequest organizationId(String organizationId) {
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

  public QuickApplyCertificateRequest plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public QuickApplyCertificateRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @Schema(description = "")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public QuickApplyCertificateRequest projectName(String projectName) {
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

  public QuickApplyCertificateRequest san(List<String> san) {
    this.san = san;
    return this;
  }

  public QuickApplyCertificateRequest addSanItem(String sanItem) {
    if (this.san == null) {
      this.san = new ArrayList<String>();
    }
    this.san.add(sanItem);
    return this;
  }

   /**
   * Get san
   * @return san
  **/
  @Schema(description = "")
  public List<String> getSan() {
    return san;
  }

  public void setSan(List<String> san) {
    this.san = san;
  }

  public QuickApplyCertificateRequest tag(String tag) {
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

  public QuickApplyCertificateRequest tags(List<TagForQuickApplyCertificateInput> tags) {
    this.tags = tags;
    return this;
  }

  public QuickApplyCertificateRequest addTagsItem(TagForQuickApplyCertificateInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForQuickApplyCertificateInput>();
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
  public List<TagForQuickApplyCertificateInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForQuickApplyCertificateInput> tags) {
    this.tags = tags;
  }

  public QuickApplyCertificateRequest validationType(ValidationTypeEnum validationType) {
    this.validationType = validationType;
    return this;
  }

   /**
   * Get validationType
   * @return validationType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public ValidationTypeEnum getValidationType() {
    return validationType;
  }

  public void setValidationType(ValidationTypeEnum validationType) {
    this.validationType = validationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickApplyCertificateRequest quickApplyCertificateRequest = (QuickApplyCertificateRequest) o;
    return Objects.equals(this.commonName, quickApplyCertificateRequest.commonName) &&
        Objects.equals(this.csr, quickApplyCertificateRequest.csr) &&
        Objects.equals(this.keyAlg, quickApplyCertificateRequest.keyAlg) &&
        Objects.equals(this.organizationId, quickApplyCertificateRequest.organizationId) &&
        Objects.equals(this.plan, quickApplyCertificateRequest.plan) &&
        Objects.equals(this.privateKey, quickApplyCertificateRequest.privateKey) &&
        Objects.equals(this.projectName, quickApplyCertificateRequest.projectName) &&
        Objects.equals(this.san, quickApplyCertificateRequest.san) &&
        Objects.equals(this.tag, quickApplyCertificateRequest.tag) &&
        Objects.equals(this.tags, quickApplyCertificateRequest.tags) &&
        Objects.equals(this.validationType, quickApplyCertificateRequest.validationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, csr, keyAlg, organizationId, plan, privateKey, projectName, san, tag, tags, validationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickApplyCertificateRequest {\n");
    
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
    sb.append("    keyAlg: ").append(toIndentedString(keyAlg)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    san: ").append(toIndentedString(san)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
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
