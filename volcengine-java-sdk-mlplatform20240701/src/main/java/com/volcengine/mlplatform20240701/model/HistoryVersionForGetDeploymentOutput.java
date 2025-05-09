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
import com.volcengine.mlplatform20240701.model.RoleForGetDeploymentOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HistoryVersionForGetDeploymentOutput
 */



public class HistoryVersionForGetDeploymentOutput {
  /**
   * Gets or Sets changeType
   */
  @JsonAdapter(ChangeTypeEnum.Adapter.class)
  public enum ChangeTypeEnum {
    @SerializedName("CreateService")
    CREATESERVICE("CreateService"),
    @SerializedName("UpdateService")
    UPDATESERVICE("UpdateService"),
    @SerializedName("MigrateService")
    MIGRATESERVICE("MigrateService"),
    @SerializedName("StopService")
    STOPSERVICE("StopService"),
    @SerializedName("StartService")
    STARTSERVICE("StartService"),
    @SerializedName("DeleteService")
    DELETESERVICE("DeleteService"),
    @SerializedName("CreateDeployment")
    CREATEDEPLOYMENT("CreateDeployment"),
    @SerializedName("UpdateDeployment")
    UPDATEDEPLOYMENT("UpdateDeployment"),
    @SerializedName("MigrateDeployment")
    MIGRATEDEPLOYMENT("MigrateDeployment"),
    @SerializedName("StopDeployment")
    STOPDEPLOYMENT("StopDeployment"),
    @SerializedName("StartDeployment")
    STARTDEPLOYMENT("StartDeployment"),
    @SerializedName("ScaleDeployment")
    SCALEDEPLOYMENT("ScaleDeployment"),
    @SerializedName("DeleteDeployment")
    DELETEDEPLOYMENT("DeleteDeployment");

    private String value;

    ChangeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChangeTypeEnum fromValue(String input) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChangeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChangeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ChangeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ChangeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ChangeType")
  private ChangeTypeEnum changeType = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("ResourceQueueId")
  private String resourceQueueId = null;

  @SerializedName("Roles")
  private List<RoleForGetDeploymentOutput> roles = null;

  public HistoryVersionForGetDeploymentOutput changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

   /**
   * Get changeType
   * @return changeType
  **/
  @Schema(description = "")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public HistoryVersionForGetDeploymentOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public HistoryVersionForGetDeploymentOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoryVersionForGetDeploymentOutput priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public HistoryVersionForGetDeploymentOutput resourceQueueId(String resourceQueueId) {
    this.resourceQueueId = resourceQueueId;
    return this;
  }

   /**
   * Get resourceQueueId
   * @return resourceQueueId
  **/
  @Schema(description = "")
  public String getResourceQueueId() {
    return resourceQueueId;
  }

  public void setResourceQueueId(String resourceQueueId) {
    this.resourceQueueId = resourceQueueId;
  }

  public HistoryVersionForGetDeploymentOutput roles(List<RoleForGetDeploymentOutput> roles) {
    this.roles = roles;
    return this;
  }

  public HistoryVersionForGetDeploymentOutput addRolesItem(RoleForGetDeploymentOutput rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RoleForGetDeploymentOutput>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Valid
  @Schema(description = "")
  public List<RoleForGetDeploymentOutput> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleForGetDeploymentOutput> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryVersionForGetDeploymentOutput historyVersionForGetDeploymentOutput = (HistoryVersionForGetDeploymentOutput) o;
    return Objects.equals(this.changeType, historyVersionForGetDeploymentOutput.changeType) &&
        Objects.equals(this.createTime, historyVersionForGetDeploymentOutput.createTime) &&
        Objects.equals(this.id, historyVersionForGetDeploymentOutput.id) &&
        Objects.equals(this.priority, historyVersionForGetDeploymentOutput.priority) &&
        Objects.equals(this.resourceQueueId, historyVersionForGetDeploymentOutput.resourceQueueId) &&
        Objects.equals(this.roles, historyVersionForGetDeploymentOutput.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeType, createTime, id, priority, resourceQueueId, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryVersionForGetDeploymentOutput {\n");
    
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    resourceQueueId: ").append(toIndentedString(resourceQueueId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
