/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

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
 * ListForListResourcePackagesOutput
 */



public class ListForListResourcePackagesOutput {
  @SerializedName("AvailableAmount")
  private String availableAmount = null;

  @SerializedName("BillTime")
  private String billTime = null;

  @SerializedName("ConfigurationCode")
  private String configurationCode = null;

  @SerializedName("ConfigurationName")
  private String configurationName = null;

  @SerializedName("EffectiveTime")
  private String effectiveTime = null;

  @SerializedName("ExpiryTime")
  private String expiryTime = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceNo")
  private String instanceNo = null;

  @SerializedName("OwnerID")
  private String ownerID = null;

  @SerializedName("PackageType")
  private String packageType = null;

  @SerializedName("Product")
  private String product = null;

  @SerializedName("ProductName")
  private String productName = null;

  @SerializedName("RegionCode")
  private String regionCode = null;

  @SerializedName("ResetByNaturalMonth")
  private String resetByNaturalMonth = null;

  @SerializedName("ResetPeriod")
  private String resetPeriod = null;

  @SerializedName("SpecCalculateFactor")
  private String specCalculateFactor = null;

  @SerializedName("Specification")
  private String specification = null;

  @SerializedName("SpecificationUnit")
  private String specificationUnit = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("Effective")
    EFFECTIVE("Effective"),
    @SerializedName("NotEffective")
    NOTEFFECTIVE("NotEffective"),
    @SerializedName("FailedToCreate")
    FAILEDTOCREATE("FailedToCreate"),
    @SerializedName("UsedUp")
    USEDUP("UsedUp"),
    @SerializedName("Expired")
    EXPIRED("Expired"),
    @SerializedName("Refunded")
    REFUNDED("Refunded");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("SubjectNo")
  private String subjectNo = null;

  @SerializedName("TotalAmount")
  private String totalAmount = null;

  @SerializedName("Unit")
  private String unit = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("ZoneCode")
  private String zoneCode = null;

  public ListForListResourcePackagesOutput availableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * Get availableAmount
   * @return availableAmount
  **/
  @Schema(description = "")
  public String getAvailableAmount() {
    return availableAmount;
  }

  public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
  }

  public ListForListResourcePackagesOutput billTime(String billTime) {
    this.billTime = billTime;
    return this;
  }

   /**
   * Get billTime
   * @return billTime
  **/
  @Schema(description = "")
  public String getBillTime() {
    return billTime;
  }

  public void setBillTime(String billTime) {
    this.billTime = billTime;
  }

  public ListForListResourcePackagesOutput configurationCode(String configurationCode) {
    this.configurationCode = configurationCode;
    return this;
  }

   /**
   * Get configurationCode
   * @return configurationCode
  **/
  @Schema(description = "")
  public String getConfigurationCode() {
    return configurationCode;
  }

  public void setConfigurationCode(String configurationCode) {
    this.configurationCode = configurationCode;
  }

  public ListForListResourcePackagesOutput configurationName(String configurationName) {
    this.configurationName = configurationName;
    return this;
  }

   /**
   * Get configurationName
   * @return configurationName
  **/
  @Schema(description = "")
  public String getConfigurationName() {
    return configurationName;
  }

  public void setConfigurationName(String configurationName) {
    this.configurationName = configurationName;
  }

  public ListForListResourcePackagesOutput effectiveTime(String effectiveTime) {
    this.effectiveTime = effectiveTime;
    return this;
  }

   /**
   * Get effectiveTime
   * @return effectiveTime
  **/
  @Schema(description = "")
  public String getEffectiveTime() {
    return effectiveTime;
  }

  public void setEffectiveTime(String effectiveTime) {
    this.effectiveTime = effectiveTime;
  }

  public ListForListResourcePackagesOutput expiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * Get expiryTime
   * @return expiryTime
  **/
  @Schema(description = "")
  public String getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  public ListForListResourcePackagesOutput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public ListForListResourcePackagesOutput instanceNo(String instanceNo) {
    this.instanceNo = instanceNo;
    return this;
  }

   /**
   * Get instanceNo
   * @return instanceNo
  **/
  @Schema(description = "")
  public String getInstanceNo() {
    return instanceNo;
  }

  public void setInstanceNo(String instanceNo) {
    this.instanceNo = instanceNo;
  }

  public ListForListResourcePackagesOutput ownerID(String ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Get ownerID
   * @return ownerID
  **/
  @Schema(description = "")
  public String getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(String ownerID) {
    this.ownerID = ownerID;
  }

  public ListForListResourcePackagesOutput packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

   /**
   * Get packageType
   * @return packageType
  **/
  @Schema(description = "")
  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public ListForListResourcePackagesOutput product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public ListForListResourcePackagesOutput productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @Schema(description = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ListForListResourcePackagesOutput regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * Get regionCode
   * @return regionCode
  **/
  @Schema(description = "")
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public ListForListResourcePackagesOutput resetByNaturalMonth(String resetByNaturalMonth) {
    this.resetByNaturalMonth = resetByNaturalMonth;
    return this;
  }

   /**
   * Get resetByNaturalMonth
   * @return resetByNaturalMonth
  **/
  @Schema(description = "")
  public String getResetByNaturalMonth() {
    return resetByNaturalMonth;
  }

  public void setResetByNaturalMonth(String resetByNaturalMonth) {
    this.resetByNaturalMonth = resetByNaturalMonth;
  }

  public ListForListResourcePackagesOutput resetPeriod(String resetPeriod) {
    this.resetPeriod = resetPeriod;
    return this;
  }

   /**
   * Get resetPeriod
   * @return resetPeriod
  **/
  @Schema(description = "")
  public String getResetPeriod() {
    return resetPeriod;
  }

  public void setResetPeriod(String resetPeriod) {
    this.resetPeriod = resetPeriod;
  }

  public ListForListResourcePackagesOutput specCalculateFactor(String specCalculateFactor) {
    this.specCalculateFactor = specCalculateFactor;
    return this;
  }

   /**
   * Get specCalculateFactor
   * @return specCalculateFactor
  **/
  @Schema(description = "")
  public String getSpecCalculateFactor() {
    return specCalculateFactor;
  }

  public void setSpecCalculateFactor(String specCalculateFactor) {
    this.specCalculateFactor = specCalculateFactor;
  }

  public ListForListResourcePackagesOutput specification(String specification) {
    this.specification = specification;
    return this;
  }

   /**
   * Get specification
   * @return specification
  **/
  @Schema(description = "")
  public String getSpecification() {
    return specification;
  }

  public void setSpecification(String specification) {
    this.specification = specification;
  }

  public ListForListResourcePackagesOutput specificationUnit(String specificationUnit) {
    this.specificationUnit = specificationUnit;
    return this;
  }

   /**
   * Get specificationUnit
   * @return specificationUnit
  **/
  @Schema(description = "")
  public String getSpecificationUnit() {
    return specificationUnit;
  }

  public void setSpecificationUnit(String specificationUnit) {
    this.specificationUnit = specificationUnit;
  }

  public ListForListResourcePackagesOutput status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ListForListResourcePackagesOutput subjectNo(String subjectNo) {
    this.subjectNo = subjectNo;
    return this;
  }

   /**
   * Get subjectNo
   * @return subjectNo
  **/
  @Schema(description = "")
  public String getSubjectNo() {
    return subjectNo;
  }

  public void setSubjectNo(String subjectNo) {
    this.subjectNo = subjectNo;
  }

  public ListForListResourcePackagesOutput totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @Schema(description = "")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public ListForListResourcePackagesOutput unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @Schema(description = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ListForListResourcePackagesOutput userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ListForListResourcePackagesOutput zoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
    return this;
  }

   /**
   * Get zoneCode
   * @return zoneCode
  **/
  @Schema(description = "")
  public String getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListForListResourcePackagesOutput listForListResourcePackagesOutput = (ListForListResourcePackagesOutput) o;
    return Objects.equals(this.availableAmount, listForListResourcePackagesOutput.availableAmount) &&
        Objects.equals(this.billTime, listForListResourcePackagesOutput.billTime) &&
        Objects.equals(this.configurationCode, listForListResourcePackagesOutput.configurationCode) &&
        Objects.equals(this.configurationName, listForListResourcePackagesOutput.configurationName) &&
        Objects.equals(this.effectiveTime, listForListResourcePackagesOutput.effectiveTime) &&
        Objects.equals(this.expiryTime, listForListResourcePackagesOutput.expiryTime) &&
        Objects.equals(this.instanceName, listForListResourcePackagesOutput.instanceName) &&
        Objects.equals(this.instanceNo, listForListResourcePackagesOutput.instanceNo) &&
        Objects.equals(this.ownerID, listForListResourcePackagesOutput.ownerID) &&
        Objects.equals(this.packageType, listForListResourcePackagesOutput.packageType) &&
        Objects.equals(this.product, listForListResourcePackagesOutput.product) &&
        Objects.equals(this.productName, listForListResourcePackagesOutput.productName) &&
        Objects.equals(this.regionCode, listForListResourcePackagesOutput.regionCode) &&
        Objects.equals(this.resetByNaturalMonth, listForListResourcePackagesOutput.resetByNaturalMonth) &&
        Objects.equals(this.resetPeriod, listForListResourcePackagesOutput.resetPeriod) &&
        Objects.equals(this.specCalculateFactor, listForListResourcePackagesOutput.specCalculateFactor) &&
        Objects.equals(this.specification, listForListResourcePackagesOutput.specification) &&
        Objects.equals(this.specificationUnit, listForListResourcePackagesOutput.specificationUnit) &&
        Objects.equals(this.status, listForListResourcePackagesOutput.status) &&
        Objects.equals(this.subjectNo, listForListResourcePackagesOutput.subjectNo) &&
        Objects.equals(this.totalAmount, listForListResourcePackagesOutput.totalAmount) &&
        Objects.equals(this.unit, listForListResourcePackagesOutput.unit) &&
        Objects.equals(this.userName, listForListResourcePackagesOutput.userName) &&
        Objects.equals(this.zoneCode, listForListResourcePackagesOutput.zoneCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableAmount, billTime, configurationCode, configurationName, effectiveTime, expiryTime, instanceName, instanceNo, ownerID, packageType, product, productName, regionCode, resetByNaturalMonth, resetPeriod, specCalculateFactor, specification, specificationUnit, status, subjectNo, totalAmount, unit, userName, zoneCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListForListResourcePackagesOutput {\n");
    
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    billTime: ").append(toIndentedString(billTime)).append("\n");
    sb.append("    configurationCode: ").append(toIndentedString(configurationCode)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceNo: ").append(toIndentedString(instanceNo)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    resetByNaturalMonth: ").append(toIndentedString(resetByNaturalMonth)).append("\n");
    sb.append("    resetPeriod: ").append(toIndentedString(resetPeriod)).append("\n");
    sb.append("    specCalculateFactor: ").append(toIndentedString(specCalculateFactor)).append("\n");
    sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
    sb.append("    specificationUnit: ").append(toIndentedString(specificationUnit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectNo: ").append(toIndentedString(subjectNo)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
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
