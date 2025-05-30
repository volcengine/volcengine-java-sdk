/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * StatusForListNodesInput
 */



public class StatusForListNodesInput {
  /**
   * Gets or Sets conditionsType
   */
  @JsonAdapter(ConditionsTypeEnum.Adapter.class)
  public enum ConditionsTypeEnum {
    @SerializedName("Ok")
    OK("Ok"),
    @SerializedName("Unschedulable")
    UNSCHEDULABLE("Unschedulable"),
    @SerializedName("NotReady")
    NOTREADY("NotReady"),
    @SerializedName("InitializeFailed")
    INITIALIZEFAILED("InitializeFailed"),
    @SerializedName("ResourceCleanupFailed")
    RESOURCECLEANUPFAILED("ResourceCleanupFailed"),
    @SerializedName("Security")
    SECURITY("Security"),
    @SerializedName("Balance")
    BALANCE("Balance"),
    @SerializedName("Unknown")
    UNKNOWN("Unknown"),
    @SerializedName("Progressing")
    PROGRESSING("Progressing");

    private String value;

    ConditionsTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConditionsTypeEnum fromValue(String input) {
      for (ConditionsTypeEnum b : ConditionsTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConditionsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionsTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ConditionsTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ConditionsTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Conditions.Type")
  private ConditionsTypeEnum conditionsType = null;

  /**
   * Gets or Sets phase
   */
  @JsonAdapter(PhaseEnum.Adapter.class)
  public enum PhaseEnum {
    @SerializedName("Creating")
    CREATING("Creating"),
    @SerializedName("Running")
    RUNNING("Running"),
    @SerializedName("Deleting")
    DELETING("Deleting"),
    @SerializedName("Updating")
    UPDATING("Updating"),
    @SerializedName("Failed")
    FAILED("Failed"),
    @SerializedName("Starting")
    STARTING("Starting"),
    @SerializedName("Stopping")
    STOPPING("Stopping"),
    @SerializedName("Stopped")
    STOPPED("Stopped");

    private String value;

    PhaseEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PhaseEnum fromValue(String input) {
      for (PhaseEnum b : PhaseEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PhaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhaseEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PhaseEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PhaseEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Phase")
  private PhaseEnum phase = null;

  public StatusForListNodesInput conditionsType(ConditionsTypeEnum conditionsType) {
    this.conditionsType = conditionsType;
    return this;
  }

   /**
   * Get conditionsType
   * @return conditionsType
  **/
  @Schema(description = "")
  public ConditionsTypeEnum getConditionsType() {
    return conditionsType;
  }

  public void setConditionsType(ConditionsTypeEnum conditionsType) {
    this.conditionsType = conditionsType;
  }

  public StatusForListNodesInput phase(PhaseEnum phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @Schema(description = "")
  public PhaseEnum getPhase() {
    return phase;
  }

  public void setPhase(PhaseEnum phase) {
    this.phase = phase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusForListNodesInput statusForListNodesInput = (StatusForListNodesInput) o;
    return Objects.equals(this.conditionsType, statusForListNodesInput.conditionsType) &&
        Objects.equals(this.phase, statusForListNodesInput.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionsType, phase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusForListNodesInput {\n");
    
    sb.append("    conditionsType: ").append(toIndentedString(conditionsType)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
