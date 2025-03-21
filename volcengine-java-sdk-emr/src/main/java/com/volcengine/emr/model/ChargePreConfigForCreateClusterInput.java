/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

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
 * ChargePreConfigForCreateClusterInput
 */



public class ChargePreConfigForCreateClusterInput {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("AutoRenewPeriod")
  private Integer autoRenewPeriod = null;

  /**
   * Gets or Sets autoRenewPeriodUnit
   */
  @JsonAdapter(AutoRenewPeriodUnitEnum.Adapter.class)
  public enum AutoRenewPeriodUnitEnum {
    @SerializedName("Month")
    MONTH("Month"),
    @SerializedName("Year")
    YEAR("Year");

    private String value;

    AutoRenewPeriodUnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AutoRenewPeriodUnitEnum fromValue(String input) {
      for (AutoRenewPeriodUnitEnum b : AutoRenewPeriodUnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AutoRenewPeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutoRenewPeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AutoRenewPeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AutoRenewPeriodUnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("AutoRenewPeriodUnit")
  private AutoRenewPeriodUnitEnum autoRenewPeriodUnit = null;

  @SerializedName("ChargePeriod")
  private Integer chargePeriod = null;

  /**
   * Gets or Sets chargePeriodUnit
   */
  @JsonAdapter(ChargePeriodUnitEnum.Adapter.class)
  public enum ChargePeriodUnitEnum {
    @SerializedName("Month")
    MONTH("Month"),
    @SerializedName("Year")
    YEAR("Year");

    private String value;

    ChargePeriodUnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChargePeriodUnitEnum fromValue(String input) {
      for (ChargePeriodUnitEnum b : ChargePeriodUnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChargePeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargePeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ChargePeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ChargePeriodUnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ChargePeriodUnit")
  private ChargePeriodUnitEnum chargePeriodUnit = null;

  /**
   * Gets or Sets chargeType
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    @SerializedName("PRE")
    PRE("PRE"),
    @SerializedName("POST")
    POST("POST");

    private String value;

    ChargeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChargeTypeEnum fromValue(String input) {
      for (ChargeTypeEnum b : ChargeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChargeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ChargeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ChargeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ChargeType")
  private ChargeTypeEnum chargeType = null;

  public ChargePreConfigForCreateClusterInput autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public ChargePreConfigForCreateClusterInput autoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
    return this;
  }

   /**
   * Get autoRenewPeriod
   * @return autoRenewPeriod
  **/
  @Schema(description = "")
  public Integer getAutoRenewPeriod() {
    return autoRenewPeriod;
  }

  public void setAutoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
  }

  public ChargePreConfigForCreateClusterInput autoRenewPeriodUnit(AutoRenewPeriodUnitEnum autoRenewPeriodUnit) {
    this.autoRenewPeriodUnit = autoRenewPeriodUnit;
    return this;
  }

   /**
   * Get autoRenewPeriodUnit
   * @return autoRenewPeriodUnit
  **/
  @Schema(description = "")
  public AutoRenewPeriodUnitEnum getAutoRenewPeriodUnit() {
    return autoRenewPeriodUnit;
  }

  public void setAutoRenewPeriodUnit(AutoRenewPeriodUnitEnum autoRenewPeriodUnit) {
    this.autoRenewPeriodUnit = autoRenewPeriodUnit;
  }

  public ChargePreConfigForCreateClusterInput chargePeriod(Integer chargePeriod) {
    this.chargePeriod = chargePeriod;
    return this;
  }

   /**
   * Get chargePeriod
   * @return chargePeriod
  **/
  @Schema(description = "")
  public Integer getChargePeriod() {
    return chargePeriod;
  }

  public void setChargePeriod(Integer chargePeriod) {
    this.chargePeriod = chargePeriod;
  }

  public ChargePreConfigForCreateClusterInput chargePeriodUnit(ChargePeriodUnitEnum chargePeriodUnit) {
    this.chargePeriodUnit = chargePeriodUnit;
    return this;
  }

   /**
   * Get chargePeriodUnit
   * @return chargePeriodUnit
  **/
  @Schema(description = "")
  public ChargePeriodUnitEnum getChargePeriodUnit() {
    return chargePeriodUnit;
  }

  public void setChargePeriodUnit(ChargePeriodUnitEnum chargePeriodUnit) {
    this.chargePeriodUnit = chargePeriodUnit;
  }

  public ChargePreConfigForCreateClusterInput chargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public ChargeTypeEnum getChargeType() {
    return chargeType;
  }

  public void setChargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargePreConfigForCreateClusterInput chargePreConfigForCreateClusterInput = (ChargePreConfigForCreateClusterInput) o;
    return Objects.equals(this.autoRenew, chargePreConfigForCreateClusterInput.autoRenew) &&
        Objects.equals(this.autoRenewPeriod, chargePreConfigForCreateClusterInput.autoRenewPeriod) &&
        Objects.equals(this.autoRenewPeriodUnit, chargePreConfigForCreateClusterInput.autoRenewPeriodUnit) &&
        Objects.equals(this.chargePeriod, chargePreConfigForCreateClusterInput.chargePeriod) &&
        Objects.equals(this.chargePeriodUnit, chargePreConfigForCreateClusterInput.chargePeriodUnit) &&
        Objects.equals(this.chargeType, chargePreConfigForCreateClusterInput.chargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, autoRenewPeriod, autoRenewPeriodUnit, chargePeriod, chargePeriodUnit, chargeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargePreConfigForCreateClusterInput {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    autoRenewPeriod: ").append(toIndentedString(autoRenewPeriod)).append("\n");
    sb.append("    autoRenewPeriodUnit: ").append(toIndentedString(autoRenewPeriodUnit)).append("\n");
    sb.append("    chargePeriod: ").append(toIndentedString(chargePeriod)).append("\n");
    sb.append("    chargePeriodUnit: ").append(toIndentedString(chargePeriodUnit)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
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
