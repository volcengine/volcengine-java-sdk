/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * CreateVpnGatewayRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:33.618811+08:00[Asia/Shanghai]")
public class CreateVpnGatewayRequest {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Period")
  private Integer period = null;

  /**
   * Gets or Sets periodUnit
   */
  @JsonAdapter(PeriodUnitEnum.Adapter.class)
  public enum PeriodUnitEnum {
    MONTH("Month"),
    YEAR("Year");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PeriodUnitEnum fromValue(String input) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PeriodUnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PeriodUnit")
  private PeriodUnitEnum periodUnit = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpnGatewayName")
  private String vpnGatewayName = null;

  public CreateVpnGatewayRequest bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * minimum: 5
   * maximum: 200
   * @return bandwidth
  **/
  @NotNull
 @Min(5) @Max(200)  @Schema(required = true, description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public CreateVpnGatewayRequest billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * minimum: 1
   * maximum: 1
   * @return billingType
  **/
 @Min(1) @Max(1)  @Schema(description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public CreateVpnGatewayRequest description(String description) {
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

  public CreateVpnGatewayRequest period(Integer period) {
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

  public CreateVpnGatewayRequest periodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }

  public CreateVpnGatewayRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public CreateVpnGatewayRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public CreateVpnGatewayRequest vpnGatewayName(String vpnGatewayName) {
    this.vpnGatewayName = vpnGatewayName;
    return this;
  }

   /**
   * Get vpnGatewayName
   * @return vpnGatewayName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getVpnGatewayName() {
    return vpnGatewayName;
  }

  public void setVpnGatewayName(String vpnGatewayName) {
    this.vpnGatewayName = vpnGatewayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVpnGatewayRequest createVpnGatewayRequest = (CreateVpnGatewayRequest) o;
    return Objects.equals(this.bandwidth, createVpnGatewayRequest.bandwidth) &&
        Objects.equals(this.billingType, createVpnGatewayRequest.billingType) &&
        Objects.equals(this.description, createVpnGatewayRequest.description) &&
        Objects.equals(this.period, createVpnGatewayRequest.period) &&
        Objects.equals(this.periodUnit, createVpnGatewayRequest.periodUnit) &&
        Objects.equals(this.subnetId, createVpnGatewayRequest.subnetId) &&
        Objects.equals(this.vpcId, createVpnGatewayRequest.vpcId) &&
        Objects.equals(this.vpnGatewayName, createVpnGatewayRequest.vpnGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, billingType, description, period, periodUnit, subnetId, vpcId, vpnGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVpnGatewayRequest {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpnGatewayName: ").append(toIndentedString(vpnGatewayName)).append("\n");
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
