/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

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
 * ModifyNatFirewallControlPolicyPositionRequest
 */



public class ModifyNatFirewallControlPolicyPositionRequest {
  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    @SerializedName("in")
    IN("in"),
    @SerializedName("out")
    OUT("out");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DirectionEnum fromValue(String input) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DirectionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Direction")
  private DirectionEnum direction = null;

  @SerializedName("NatFirewallId")
  private String natFirewallId = null;

  @SerializedName("NewPrio")
  private Integer newPrio = null;

  @SerializedName("RuleId")
  private String ruleId = null;

  public ModifyNatFirewallControlPolicyPositionRequest direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @NotNull
  @Schema(required = true, description = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public ModifyNatFirewallControlPolicyPositionRequest natFirewallId(String natFirewallId) {
    this.natFirewallId = natFirewallId;
    return this;
  }

   /**
   * Get natFirewallId
   * @return natFirewallId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNatFirewallId() {
    return natFirewallId;
  }

  public void setNatFirewallId(String natFirewallId) {
    this.natFirewallId = natFirewallId;
  }

  public ModifyNatFirewallControlPolicyPositionRequest newPrio(Integer newPrio) {
    this.newPrio = newPrio;
    return this;
  }

   /**
   * Get newPrio
   * minimum: 1
   * @return newPrio
  **/
  @NotNull
 @Min(1)  @Schema(required = true, description = "")
  public Integer getNewPrio() {
    return newPrio;
  }

  public void setNewPrio(Integer newPrio) {
    this.newPrio = newPrio;
  }

  public ModifyNatFirewallControlPolicyPositionRequest ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyNatFirewallControlPolicyPositionRequest modifyNatFirewallControlPolicyPositionRequest = (ModifyNatFirewallControlPolicyPositionRequest) o;
    return Objects.equals(this.direction, modifyNatFirewallControlPolicyPositionRequest.direction) &&
        Objects.equals(this.natFirewallId, modifyNatFirewallControlPolicyPositionRequest.natFirewallId) &&
        Objects.equals(this.newPrio, modifyNatFirewallControlPolicyPositionRequest.newPrio) &&
        Objects.equals(this.ruleId, modifyNatFirewallControlPolicyPositionRequest.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, natFirewallId, newPrio, ruleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyNatFirewallControlPolicyPositionRequest {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    natFirewallId: ").append(toIndentedString(natFirewallId)).append("\n");
    sb.append("    newPrio: ").append(toIndentedString(newPrio)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
