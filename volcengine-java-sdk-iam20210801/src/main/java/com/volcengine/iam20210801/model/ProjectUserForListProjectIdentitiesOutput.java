/*
 * iam20210801
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam20210801.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.iam20210801.model.PolicyForListProjectIdentitiesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProjectUserForListProjectIdentitiesOutput
 */



public class ProjectUserForListProjectIdentitiesOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("Policy")
  private List<PolicyForListProjectIdentitiesOutput> policy = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  @SerializedName("UserName")
  private String userName = null;

  public ProjectUserForListProjectIdentitiesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectUserForListProjectIdentitiesOutput displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ProjectUserForListProjectIdentitiesOutput policy(List<PolicyForListProjectIdentitiesOutput> policy) {
    this.policy = policy;
    return this;
  }

  public ProjectUserForListProjectIdentitiesOutput addPolicyItem(PolicyForListProjectIdentitiesOutput policyItem) {
    if (this.policy == null) {
      this.policy = new ArrayList<PolicyForListProjectIdentitiesOutput>();
    }
    this.policy.add(policyItem);
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Valid
  @Schema(description = "")
  public List<PolicyForListProjectIdentitiesOutput> getPolicy() {
    return policy;
  }

  public void setPolicy(List<PolicyForListProjectIdentitiesOutput> policy) {
    this.policy = policy;
  }

  public ProjectUserForListProjectIdentitiesOutput updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public ProjectUserForListProjectIdentitiesOutput userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUserForListProjectIdentitiesOutput projectUserForListProjectIdentitiesOutput = (ProjectUserForListProjectIdentitiesOutput) o;
    return Objects.equals(this.description, projectUserForListProjectIdentitiesOutput.description) &&
        Objects.equals(this.displayName, projectUserForListProjectIdentitiesOutput.displayName) &&
        Objects.equals(this.policy, projectUserForListProjectIdentitiesOutput.policy) &&
        Objects.equals(this.updateDate, projectUserForListProjectIdentitiesOutput.updateDate) &&
        Objects.equals(this.userName, projectUserForListProjectIdentitiesOutput.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, policy, updateDate, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUserForListProjectIdentitiesOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
