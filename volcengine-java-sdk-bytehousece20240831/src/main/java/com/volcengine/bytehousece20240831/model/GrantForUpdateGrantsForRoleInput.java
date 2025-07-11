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
import com.volcengine.bytehousece20240831.model.PrivilegeForUpdateGrantsForRoleInput;
import com.volcengine.bytehousece20240831.model.TargetForUpdateGrantsForRoleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GrantForUpdateGrantsForRoleInput
 */



public class GrantForUpdateGrantsForRoleInput {
  @SerializedName("ClusterID")
  private Integer clusterID = null;

  @SerializedName("GrantOption")
  private Boolean grantOption = null;

  @SerializedName("GrantTo")
  private String grantTo = null;

  @SerializedName("OnCluster")
  private String onCluster = null;

  @SerializedName("Privileges")
  private List<PrivilegeForUpdateGrantsForRoleInput> privileges = null;

  @SerializedName("RawSql")
  private String rawSql = null;

  @SerializedName("Targets")
  private List<TargetForUpdateGrantsForRoleInput> targets = null;

  public GrantForUpdateGrantsForRoleInput clusterID(Integer clusterID) {
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

  public GrantForUpdateGrantsForRoleInput grantOption(Boolean grantOption) {
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

  public GrantForUpdateGrantsForRoleInput grantTo(String grantTo) {
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

  public GrantForUpdateGrantsForRoleInput onCluster(String onCluster) {
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

  public GrantForUpdateGrantsForRoleInput privileges(List<PrivilegeForUpdateGrantsForRoleInput> privileges) {
    this.privileges = privileges;
    return this;
  }

  public GrantForUpdateGrantsForRoleInput addPrivilegesItem(PrivilegeForUpdateGrantsForRoleInput privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<PrivilegeForUpdateGrantsForRoleInput>();
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
  public List<PrivilegeForUpdateGrantsForRoleInput> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<PrivilegeForUpdateGrantsForRoleInput> privileges) {
    this.privileges = privileges;
  }

  public GrantForUpdateGrantsForRoleInput rawSql(String rawSql) {
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

  public GrantForUpdateGrantsForRoleInput targets(List<TargetForUpdateGrantsForRoleInput> targets) {
    this.targets = targets;
    return this;
  }

  public GrantForUpdateGrantsForRoleInput addTargetsItem(TargetForUpdateGrantsForRoleInput targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<TargetForUpdateGrantsForRoleInput>();
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
  public List<TargetForUpdateGrantsForRoleInput> getTargets() {
    return targets;
  }

  public void setTargets(List<TargetForUpdateGrantsForRoleInput> targets) {
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
    GrantForUpdateGrantsForRoleInput grantForUpdateGrantsForRoleInput = (GrantForUpdateGrantsForRoleInput) o;
    return Objects.equals(this.clusterID, grantForUpdateGrantsForRoleInput.clusterID) &&
        Objects.equals(this.grantOption, grantForUpdateGrantsForRoleInput.grantOption) &&
        Objects.equals(this.grantTo, grantForUpdateGrantsForRoleInput.grantTo) &&
        Objects.equals(this.onCluster, grantForUpdateGrantsForRoleInput.onCluster) &&
        Objects.equals(this.privileges, grantForUpdateGrantsForRoleInput.privileges) &&
        Objects.equals(this.rawSql, grantForUpdateGrantsForRoleInput.rawSql) &&
        Objects.equals(this.targets, grantForUpdateGrantsForRoleInput.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterID, grantOption, grantTo, onCluster, privileges, rawSql, targets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantForUpdateGrantsForRoleInput {\n");
    
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
