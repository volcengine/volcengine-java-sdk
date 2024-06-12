/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

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
 * PermissionRuleForDescribePermissionRulesOutput
 */



public class PermissionRuleForDescribePermissionRulesOutput {
  @SerializedName("CidrIp")
  private String cidrIp = null;

  @SerializedName("PermissionRuleId")
  private String permissionRuleId = null;

  /**
   * Gets or Sets rwMode
   */
  @JsonAdapter(RwModeEnum.Adapter.class)
  public enum RwModeEnum {
    @SerializedName("RW")
    RW("RW"),
    @SerializedName("RO")
    RO("RO");

    private String value;

    RwModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RwModeEnum fromValue(String input) {
      for (RwModeEnum b : RwModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RwModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RwModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RwModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RwModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("RwMode")
  private RwModeEnum rwMode = null;

  /**
   * Gets or Sets userMode
   */
  @JsonAdapter(UserModeEnum.Adapter.class)
  public enum UserModeEnum {
    @SerializedName("All_squash")
    ALL_SQUASH("All_squash"),
    @SerializedName("No_all_squash")
    NO_ALL_SQUASH("No_all_squash"),
    @SerializedName("Root_squash")
    ROOT_SQUASH("Root_squash"),
    @SerializedName("No_root_squash")
    NO_ROOT_SQUASH("No_root_squash");

    private String value;

    UserModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UserModeEnum fromValue(String input) {
      for (UserModeEnum b : UserModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UserModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public UserModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return UserModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("UserMode")
  private UserModeEnum userMode = null;

  public PermissionRuleForDescribePermissionRulesOutput cidrIp(String cidrIp) {
    this.cidrIp = cidrIp;
    return this;
  }

   /**
   * Get cidrIp
   * @return cidrIp
  **/
  @Schema(description = "")
  public String getCidrIp() {
    return cidrIp;
  }

  public void setCidrIp(String cidrIp) {
    this.cidrIp = cidrIp;
  }

  public PermissionRuleForDescribePermissionRulesOutput permissionRuleId(String permissionRuleId) {
    this.permissionRuleId = permissionRuleId;
    return this;
  }

   /**
   * Get permissionRuleId
   * @return permissionRuleId
  **/
  @Schema(description = "")
  public String getPermissionRuleId() {
    return permissionRuleId;
  }

  public void setPermissionRuleId(String permissionRuleId) {
    this.permissionRuleId = permissionRuleId;
  }

  public PermissionRuleForDescribePermissionRulesOutput rwMode(RwModeEnum rwMode) {
    this.rwMode = rwMode;
    return this;
  }

   /**
   * Get rwMode
   * @return rwMode
  **/
  @Schema(description = "")
  public RwModeEnum getRwMode() {
    return rwMode;
  }

  public void setRwMode(RwModeEnum rwMode) {
    this.rwMode = rwMode;
  }

  public PermissionRuleForDescribePermissionRulesOutput userMode(UserModeEnum userMode) {
    this.userMode = userMode;
    return this;
  }

   /**
   * Get userMode
   * @return userMode
  **/
  @Schema(description = "")
  public UserModeEnum getUserMode() {
    return userMode;
  }

  public void setUserMode(UserModeEnum userMode) {
    this.userMode = userMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionRuleForDescribePermissionRulesOutput permissionRuleForDescribePermissionRulesOutput = (PermissionRuleForDescribePermissionRulesOutput) o;
    return Objects.equals(this.cidrIp, permissionRuleForDescribePermissionRulesOutput.cidrIp) &&
        Objects.equals(this.permissionRuleId, permissionRuleForDescribePermissionRulesOutput.permissionRuleId) &&
        Objects.equals(this.rwMode, permissionRuleForDescribePermissionRulesOutput.rwMode) &&
        Objects.equals(this.userMode, permissionRuleForDescribePermissionRulesOutput.userMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrIp, permissionRuleId, rwMode, userMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRuleForDescribePermissionRulesOutput {\n");
    
    sb.append("    cidrIp: ").append(toIndentedString(cidrIp)).append("\n");
    sb.append("    permissionRuleId: ").append(toIndentedString(permissionRuleId)).append("\n");
    sb.append("    rwMode: ").append(toIndentedString(rwMode)).append("\n");
    sb.append("    userMode: ").append(toIndentedString(userMode)).append("\n");
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
