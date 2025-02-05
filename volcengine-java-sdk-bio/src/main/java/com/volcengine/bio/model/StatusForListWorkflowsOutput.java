/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

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
 * StatusForListWorkflowsOutput
 */



public class StatusForListWorkflowsOutput {
  @SerializedName("Message")
  private String message = null;

  /**
   * Gets or Sets phase
   */
  @JsonAdapter(PhaseEnum.Adapter.class)
  public enum PhaseEnum {
    @SerializedName("Importing")
    IMPORTING("Importing"),
    @SerializedName("Succeeded")
    SUCCEEDED("Succeeded"),
    @SerializedName("Failed")
    FAILED("Failed");

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

  public StatusForListWorkflowsOutput message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public StatusForListWorkflowsOutput phase(PhaseEnum phase) {
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
    StatusForListWorkflowsOutput statusForListWorkflowsOutput = (StatusForListWorkflowsOutput) o;
    return Objects.equals(this.message, statusForListWorkflowsOutput.message) &&
        Objects.equals(this.phase, statusForListWorkflowsOutput.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, phase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusForListWorkflowsOutput {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
