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

package com.volcengine.volcstack.vpn.model;

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
 * RenewVpnGatewayRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:45.779409+08:00[Asia/Shanghai]")
public class RenewVpnGatewayRequest {
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

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  public RenewVpnGatewayRequest period(Integer period) {
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

  public RenewVpnGatewayRequest periodUnit(PeriodUnitEnum periodUnit) {
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

  public RenewVpnGatewayRequest vpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
    return this;
  }

   /**
   * Get vpnGatewayId
   * @return vpnGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpnGatewayId() {
    return vpnGatewayId;
  }

  public void setVpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewVpnGatewayRequest renewVpnGatewayRequest = (RenewVpnGatewayRequest) o;
    return Objects.equals(this.period, renewVpnGatewayRequest.period) &&
        Objects.equals(this.periodUnit, renewVpnGatewayRequest.periodUnit) &&
        Objects.equals(this.vpnGatewayId, renewVpnGatewayRequest.vpnGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, periodUnit, vpnGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewVpnGatewayRequest {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
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
