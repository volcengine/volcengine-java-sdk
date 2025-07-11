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
import com.volcengine.bytehousece20240831.model.PrivilegeForGrantPrivilegesToUserByIDInput;
import com.volcengine.bytehousece20240831.model.TargetForGrantPrivilegesToUserByIDInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GrantForGrantPrivilegesToUserByIDInput
 */



public class GrantForGrantPrivilegesToUserByIDInput {
  @SerializedName("ClusterID")
  private Integer clusterID = null;

  @SerializedName("GrantOption")
  private Boolean grantOption = null;

  @SerializedName("GrantTo")
  private String grantTo = null;

  @SerializedName("OnCluster")
  private String onCluster = null;

  @SerializedName("Privileges")
  private List<PrivilegeForGrantPrivilegesToUserByIDInput> privileges = null;

  @SerializedName("RawSql")
  private String rawSql = null;

  @SerializedName("Targets")
  private List<TargetForGrantPrivilegesToUserByIDInput> targets = null;

  public GrantForGrantPrivilegesToUserByIDInput clusterID(Integer clusterID) {
    this.clusterID = clusterID;
    return this;
  }

   /**
   * Get clusterID
   * @return clusterID
  **/
  @Schema(description = "")
  public Integer getClusterID() {
    return clusterID;
  }

  public void setClusterID(Integer clusterID) {
    this.clusterID = clusterID;
  }

  public GrantForGrantPrivilegesToUserByIDInput grantOption(Boolean grantOption) {
    this.grantOption = grantOption;
    return this;
  }

   /**
   * Get grantOption
   * @return grantOption
  **/
  @Schema(description = "")
  public Boolean isGrantOption() {
    return grantOption;
  }

  public void setGrantOption(Boolean grantOption) {
    this.grantOption = grantOption;
  }

  public GrantForGrantPrivilegesToUserByIDInput grantTo(String grantTo) {
    this.grantTo = grantTo;
    return this;
  }

   /**
   * Get grantTo
   * @return grantTo
  **/
  @Schema(description = "")
  public String getGrantTo() {
    return grantTo;
  }

  public void setGrantTo(String grantTo) {
    this.grantTo = grantTo;
  }

  public GrantForGrantPrivilegesToUserByIDInput onCluster(String onCluster) {
    this.onCluster = onCluster;
    return this;
  }

   /**
   * Get onCluster
   * @return onCluster
  **/
  @Schema(description = "")
  public String getOnCluster() {
    return onCluster;
  }

  public void setOnCluster(String onCluster) {
    this.onCluster = onCluster;
  }

  public GrantForGrantPrivilegesToUserByIDInput privileges(List<PrivilegeForGrantPrivilegesToUserByIDInput> privileges) {
    this.privileges = privileges;
    return this;
  }

  public GrantForGrantPrivilegesToUserByIDInput addPrivilegesItem(PrivilegeForGrantPrivilegesToUserByIDInput privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<PrivilegeForGrantPrivilegesToUserByIDInput>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Get privileges
   * @return privileges
  **/
  @Valid
  @Schema(description = "")
  public List<PrivilegeForGrantPrivilegesToUserByIDInput> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<PrivilegeForGrantPrivilegesToUserByIDInput> privileges) {
    this.privileges = privileges;
  }

  public GrantForGrantPrivilegesToUserByIDInput rawSql(String rawSql) {
    this.rawSql = rawSql;
    return this;
  }

   /**
   * Get rawSql
   * @return rawSql
  **/
  @Schema(description = "")
  public String getRawSql() {
    return rawSql;
  }

  public void setRawSql(String rawSql) {
    this.rawSql = rawSql;
  }

  public GrantForGrantPrivilegesToUserByIDInput targets(List<TargetForGrantPrivilegesToUserByIDInput> targets) {
    this.targets = targets;
    return this;
  }

  public GrantForGrantPrivilegesToUserByIDInput addTargetsItem(TargetForGrantPrivilegesToUserByIDInput targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<TargetForGrantPrivilegesToUserByIDInput>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @Valid
  @Schema(description = "")
  public List<TargetForGrantPrivilegesToUserByIDInput> getTargets() {
    return targets;
  }

  public void setTargets(List<TargetForGrantPrivilegesToUserByIDInput> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantForGrantPrivilegesToUserByIDInput grantForGrantPrivilegesToUserByIDInput = (GrantForGrantPrivilegesToUserByIDInput) o;
    return Objects.equals(this.clusterID, grantForGrantPrivilegesToUserByIDInput.clusterID) &&
        Objects.equals(this.grantOption, grantForGrantPrivilegesToUserByIDInput.grantOption) &&
        Objects.equals(this.grantTo, grantForGrantPrivilegesToUserByIDInput.grantTo) &&
        Objects.equals(this.onCluster, grantForGrantPrivilegesToUserByIDInput.onCluster) &&
        Objects.equals(this.privileges, grantForGrantPrivilegesToUserByIDInput.privileges) &&
        Objects.equals(this.rawSql, grantForGrantPrivilegesToUserByIDInput.rawSql) &&
        Objects.equals(this.targets, grantForGrantPrivilegesToUserByIDInput.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterID, grantOption, grantTo, onCluster, privileges, rawSql, targets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantForGrantPrivilegesToUserByIDInput {\n");
    
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    grantOption: ").append(toIndentedString(grantOption)).append("\n");
    sb.append("    grantTo: ").append(toIndentedString(grantTo)).append("\n");
    sb.append("    onCluster: ").append(toIndentedString(onCluster)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    rawSql: ").append(toIndentedString(rawSql)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
