/*
 * bytehouse_ce20240831
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bytehousece20240831.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.bytehousece20240831.model.AssignmentForUpdateGrantsForUserInput;
import com.volcengine.bytehousece20240831.model.GrantForUpdateGrantsForUserInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateGrantsForUserRequest
 */



public class UpdateGrantsForUserRequest {
  /**
   * Gets or Sets actionType
   */
  @JsonAdapter(ActionTypeEnum.Adapter.class)
  public enum ActionTypeEnum {
    @SerializedName("GRANT")
    GRANT("GRANT"),
    @SerializedName("REVOKE")
    REVOKE("REVOKE");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionTypeEnum fromValue(String input) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ActionTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ActionTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ActionType")
  private ActionTypeEnum actionType = null;

  @SerializedName("Assignments")
  private List<AssignmentForUpdateGrantsForUserInput> assignments = null;

  @SerializedName("Grants")
  private List<GrantForUpdateGrantsForUserInput> grants = null;

  @SerializedName("Username")
  private String username = null;

  public UpdateGrantsForUserRequest actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public UpdateGrantsForUserRequest assignments(List<AssignmentForUpdateGrantsForUserInput> assignments) {
    this.assignments = assignments;
    return this;
  }

  public UpdateGrantsForUserRequest addAssignmentsItem(AssignmentForUpdateGrantsForUserInput assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<AssignmentForUpdateGrantsForUserInput>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @Valid
  @Schema(description = "")
  public List<AssignmentForUpdateGrantsForUserInput> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<AssignmentForUpdateGrantsForUserInput> assignments) {
    this.assignments = assignments;
  }

  public UpdateGrantsForUserRequest grants(List<GrantForUpdateGrantsForUserInput> grants) {
    this.grants = grants;
    return this;
  }

  public UpdateGrantsForUserRequest addGrantsItem(GrantForUpdateGrantsForUserInput grantsItem) {
    if (this.grants == null) {
      this.grants = new ArrayList<GrantForUpdateGrantsForUserInput>();
    }
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * Get grants
   * @return grants
  **/
  @Valid
  @Schema(description = "")
  public List<GrantForUpdateGrantsForUserInput> getGrants() {
    return grants;
  }

  public void setGrants(List<GrantForUpdateGrantsForUserInput> grants) {
    this.grants = grants;
  }

  public UpdateGrantsForUserRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGrantsForUserRequest updateGrantsForUserRequest = (UpdateGrantsForUserRequest) o;
    return Objects.equals(this.actionType, updateGrantsForUserRequest.actionType) &&
        Objects.equals(this.assignments, updateGrantsForUserRequest.assignments) &&
        Objects.equals(this.grants, updateGrantsForUserRequest.grants) &&
        Objects.equals(this.username, updateGrantsForUserRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, assignments, grants, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGrantsForUserRequest {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
