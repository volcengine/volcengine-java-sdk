/*
 * escloud
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.escloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyMaintenanceSettingRequest
 */



public class ModifyMaintenanceSettingRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("MaintenanceDay")
  private List<String> maintenanceDay = null;

  @SerializedName("MaintenanceTime")
  private String maintenanceTime = null;

  public ModifyMaintenanceSettingRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyMaintenanceSettingRequest maintenanceDay(List<String> maintenanceDay) {
    this.maintenanceDay = maintenanceDay;
    return this;
  }

  public ModifyMaintenanceSettingRequest addMaintenanceDayItem(String maintenanceDayItem) {
    if (this.maintenanceDay == null) {
      this.maintenanceDay = new ArrayList<String>();
    }
    this.maintenanceDay.add(maintenanceDayItem);
    return this;
  }

   /**
   * Get maintenanceDay
   * @return maintenanceDay
  **/
  @Schema(description = "")
  public List<String> getMaintenanceDay() {
    return maintenanceDay;
  }

  public void setMaintenanceDay(List<String> maintenanceDay) {
    this.maintenanceDay = maintenanceDay;
  }

  public ModifyMaintenanceSettingRequest maintenanceTime(String maintenanceTime) {
    this.maintenanceTime = maintenanceTime;
    return this;
  }

   /**
   * Get maintenanceTime
   * @return maintenanceTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getMaintenanceTime() {
    return maintenanceTime;
  }

  public void setMaintenanceTime(String maintenanceTime) {
    this.maintenanceTime = maintenanceTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyMaintenanceSettingRequest modifyMaintenanceSettingRequest = (ModifyMaintenanceSettingRequest) o;
    return Objects.equals(this.instanceId, modifyMaintenanceSettingRequest.instanceId) &&
        Objects.equals(this.maintenanceDay, modifyMaintenanceSettingRequest.maintenanceDay) &&
        Objects.equals(this.maintenanceTime, modifyMaintenanceSettingRequest.maintenanceTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, maintenanceDay, maintenanceTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyMaintenanceSettingRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    maintenanceDay: ").append(toIndentedString(maintenanceDay)).append("\n");
    sb.append("    maintenanceTime: ").append(toIndentedString(maintenanceTime)).append("\n");
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
