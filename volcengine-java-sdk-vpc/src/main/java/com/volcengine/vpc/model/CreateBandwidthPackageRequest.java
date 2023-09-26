/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.TagForCreateBandwidthPackageInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateBandwidthPackageRequest
 */


public class CreateBandwidthPackageRequest {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BandwidthPackageName")
  private String bandwidthPackageName = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("Description")
  private String description = null;

  /**
   * Gets or Sets ISP
   */
  @JsonAdapter(ISPEnum.Adapter.class)
  public enum ISPEnum {
    BGP("BGP"),
    SINGLELINE_BGP("SingleLine_BGP"),
    FUSION_BGP("Fusion_BGP"),
    CHINAMOBILE("ChinaMobile"),
    CHINAUNICOM("ChinaUnicom"),
    CHINATELECOM("ChinaTelecom"),
    CHINAMOBILE_VALUE("ChinaMobile_Value"),
    CHINAUNICOM_VALUE("ChinaUnicom_Value"),
    CHINATELECOM_VALUE("ChinaTelecom_Value");

    private String value;

    ISPEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ISPEnum fromValue(String input) {
      for (ISPEnum b : ISPEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ISPEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ISPEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ISPEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ISPEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ISP")
  private ISPEnum ISP = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private Integer periodUnit = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  /**
   * Gets or Sets protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    IPV4("IPv4"),
    IPV6("IPv6");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProtocolEnum fromValue(String input) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProtocolEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Protocol")
  private ProtocolEnum protocol = null;

  @SerializedName("SecurityProtectionTypes")
  private List<String> securityProtectionTypes = null;

  @SerializedName("Tags")
  private List<TagForCreateBandwidthPackageInput> tags = null;

  public CreateBandwidthPackageRequest bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * minimum: 2
   * maximum: 5000
   * @return bandwidth
  **/
  @NotNull
 @Min(2) @Max(5000)  @Schema(required = true, description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public CreateBandwidthPackageRequest bandwidthPackageName(String bandwidthPackageName) {
    this.bandwidthPackageName = bandwidthPackageName;
    return this;
  }

   /**
   * Get bandwidthPackageName
   * @return bandwidthPackageName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getBandwidthPackageName() {
    return bandwidthPackageName;
  }

  public void setBandwidthPackageName(String bandwidthPackageName) {
    this.bandwidthPackageName = bandwidthPackageName;
  }

  public CreateBandwidthPackageRequest billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * minimum: 1
   * maximum: 4
   * @return billingType
  **/
 @Min(1) @Max(4)  @Schema(description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public CreateBandwidthPackageRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateBandwidthPackageRequest ISP(ISPEnum ISP) {
    this.ISP = ISP;
    return this;
  }

   /**
   * Get ISP
   * @return ISP
  **/
  @Schema(description = "")
  public ISPEnum getISP() {
    return ISP;
  }

  public void setISP(ISPEnum ISP) {
    this.ISP = ISP;
  }

  public CreateBandwidthPackageRequest period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public CreateBandwidthPackageRequest periodUnit(Integer periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * minimum: 1
   * maximum: 2
   * @return periodUnit
  **/
 @Min(1) @Max(2)  @Schema(description = "")
  public Integer getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(Integer periodUnit) {
    this.periodUnit = periodUnit;
  }

  public CreateBandwidthPackageRequest projectName(String projectName) {
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

  public CreateBandwidthPackageRequest protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public CreateBandwidthPackageRequest securityProtectionTypes(List<String> securityProtectionTypes) {
    this.securityProtectionTypes = securityProtectionTypes;
    return this;
  }

  public CreateBandwidthPackageRequest addSecurityProtectionTypesItem(String securityProtectionTypesItem) {
    if (this.securityProtectionTypes == null) {
      this.securityProtectionTypes = new ArrayList<String>();
    }
    this.securityProtectionTypes.add(securityProtectionTypesItem);
    return this;
  }

   /**
   * Get securityProtectionTypes
   * @return securityProtectionTypes
  **/
  @Schema(description = "")
  public List<String> getSecurityProtectionTypes() {
    return securityProtectionTypes;
  }

  public void setSecurityProtectionTypes(List<String> securityProtectionTypes) {
    this.securityProtectionTypes = securityProtectionTypes;
  }

  public CreateBandwidthPackageRequest tags(List<TagForCreateBandwidthPackageInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateBandwidthPackageRequest addTagsItem(TagForCreateBandwidthPackageInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateBandwidthPackageInput>();
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
  public List<TagForCreateBandwidthPackageInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateBandwidthPackageInput> tags) {
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
    CreateBandwidthPackageRequest createBandwidthPackageRequest = (CreateBandwidthPackageRequest) o;
    return Objects.equals(this.bandwidth, createBandwidthPackageRequest.bandwidth) &&
        Objects.equals(this.bandwidthPackageName, createBandwidthPackageRequest.bandwidthPackageName) &&
        Objects.equals(this.billingType, createBandwidthPackageRequest.billingType) &&
        Objects.equals(this.description, createBandwidthPackageRequest.description) &&
        Objects.equals(this.ISP, createBandwidthPackageRequest.ISP) &&
        Objects.equals(this.period, createBandwidthPackageRequest.period) &&
        Objects.equals(this.periodUnit, createBandwidthPackageRequest.periodUnit) &&
        Objects.equals(this.projectName, createBandwidthPackageRequest.projectName) &&
        Objects.equals(this.protocol, createBandwidthPackageRequest.protocol) &&
        Objects.equals(this.securityProtectionTypes, createBandwidthPackageRequest.securityProtectionTypes) &&
        Objects.equals(this.tags, createBandwidthPackageRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, bandwidthPackageName, billingType, description, ISP, period, periodUnit, projectName, protocol, securityProtectionTypes, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBandwidthPackageRequest {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    bandwidthPackageName: ").append(toIndentedString(bandwidthPackageName)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ISP: ").append(toIndentedString(ISP)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    securityProtectionTypes: ").append(toIndentedString(securityProtectionTypes)).append("\n");
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
