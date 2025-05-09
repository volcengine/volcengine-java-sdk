/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mlplatform20240701.model.ConvertWeightForUpdateServiceInput;
import com.volcengine.mlplatform20240701.model.MirrorTrafficPolicyForUpdateServiceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TrafficConfigForUpdateServiceInput
 */



public class TrafficConfigForUpdateServiceInput {
  @SerializedName("Enables")
  private List<String> enables = null;

  @SerializedName("MirrorTrafficPolicy")
  private MirrorTrafficPolicyForUpdateServiceInput mirrorTrafficPolicy = null;

  /**
   * Gets or Sets mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    @SerializedName("Default")
    DEFAULT("Default"),
    @SerializedName("Weight")
    WEIGHT("Weight");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ModeEnum fromValue(String input) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Mode")
  private ModeEnum mode = null;

  @SerializedName("Weights")
  private List<ConvertWeightForUpdateServiceInput> weights = null;

  public TrafficConfigForUpdateServiceInput enables(List<String> enables) {
    this.enables = enables;
    return this;
  }

  public TrafficConfigForUpdateServiceInput addEnablesItem(String enablesItem) {
    if (this.enables == null) {
      this.enables = new ArrayList<String>();
    }
    this.enables.add(enablesItem);
    return this;
  }

   /**
   * Get enables
   * @return enables
  **/
  @Schema(description = "")
  public List<String> getEnables() {
    return enables;
  }

  public void setEnables(List<String> enables) {
    this.enables = enables;
  }

  public TrafficConfigForUpdateServiceInput mirrorTrafficPolicy(MirrorTrafficPolicyForUpdateServiceInput mirrorTrafficPolicy) {
    this.mirrorTrafficPolicy = mirrorTrafficPolicy;
    return this;
  }

   /**
   * Get mirrorTrafficPolicy
   * @return mirrorTrafficPolicy
  **/
  @Valid
  @Schema(description = "")
  public MirrorTrafficPolicyForUpdateServiceInput getMirrorTrafficPolicy() {
    return mirrorTrafficPolicy;
  }

  public void setMirrorTrafficPolicy(MirrorTrafficPolicyForUpdateServiceInput mirrorTrafficPolicy) {
    this.mirrorTrafficPolicy = mirrorTrafficPolicy;
  }

  public TrafficConfigForUpdateServiceInput mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public TrafficConfigForUpdateServiceInput weights(List<ConvertWeightForUpdateServiceInput> weights) {
    this.weights = weights;
    return this;
  }

  public TrafficConfigForUpdateServiceInput addWeightsItem(ConvertWeightForUpdateServiceInput weightsItem) {
    if (this.weights == null) {
      this.weights = new ArrayList<ConvertWeightForUpdateServiceInput>();
    }
    this.weights.add(weightsItem);
    return this;
  }

   /**
   * Get weights
   * @return weights
  **/
  @Valid
  @Schema(description = "")
  public List<ConvertWeightForUpdateServiceInput> getWeights() {
    return weights;
  }

  public void setWeights(List<ConvertWeightForUpdateServiceInput> weights) {
    this.weights = weights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficConfigForUpdateServiceInput trafficConfigForUpdateServiceInput = (TrafficConfigForUpdateServiceInput) o;
    return Objects.equals(this.enables, trafficConfigForUpdateServiceInput.enables) &&
        Objects.equals(this.mirrorTrafficPolicy, trafficConfigForUpdateServiceInput.mirrorTrafficPolicy) &&
        Objects.equals(this.mode, trafficConfigForUpdateServiceInput.mode) &&
        Objects.equals(this.weights, trafficConfigForUpdateServiceInput.weights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enables, mirrorTrafficPolicy, mode, weights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficConfigForUpdateServiceInput {\n");
    
    sb.append("    enables: ").append(toIndentedString(enables)).append("\n");
    sb.append("    mirrorTrafficPolicy: ").append(toIndentedString(mirrorTrafficPolicy)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    weights: ").append(toIndentedString(weights)).append("\n");
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
