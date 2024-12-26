/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.waf.model.FieldListForGetTLSConfigOutput;
import com.volcengine.waf.model.WafActionListForGetTLSConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetTLSConfigResponse
 */



public class GetTLSConfigResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AlarmThreshold")
  private Integer alarmThreshold = null;

  @SerializedName("CapacityAlert")
  private Boolean capacityAlert = null;

  @SerializedName("CapacityAlertInterval")
  private Integer capacityAlertInterval = null;

  @SerializedName("DomainList")
  private List<String> domainList = null;

  @SerializedName("FieldList")
  private FieldListForGetTLSConfigOutput fieldList = null;

  @SerializedName("FieldSelectAll")
  private Boolean fieldSelectAll = null;

  @SerializedName("ProjectID")
  private String projectID = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("TLSRegion")
  private String tlSRegion = null;

  @SerializedName("TLSStorageTime")
  private Integer tlSStorageTime = null;

  @SerializedName("TLSTotalCapacity")
  private Integer tlSTotalCapacity = null;

  @SerializedName("TLSTotalUsage")
  private Integer tlSTotalUsage = null;

  @SerializedName("TopicID")
  private String topicID = null;

  @SerializedName("TopicName")
  private String topicName = null;

  @SerializedName("TotalDomainList")
  private List<String> totalDomainList = null;

  @SerializedName("WafActionList")
  private WafActionListForGetTLSConfigOutput wafActionList = null;

  @SerializedName("WafActionSelectAll")
  private Boolean wafActionSelectAll = null;

  public GetTLSConfigResponse alarmThreshold(Integer alarmThreshold) {
    this.alarmThreshold = alarmThreshold;
    return this;
  }

   /**
   * Get alarmThreshold
   * @return alarmThreshold
  **/
  @Schema(description = "")
  public Integer getAlarmThreshold() {
    return alarmThreshold;
  }

  public void setAlarmThreshold(Integer alarmThreshold) {
    this.alarmThreshold = alarmThreshold;
  }

  public GetTLSConfigResponse capacityAlert(Boolean capacityAlert) {
    this.capacityAlert = capacityAlert;
    return this;
  }

   /**
   * Get capacityAlert
   * @return capacityAlert
  **/
  @Schema(description = "")
  public Boolean isCapacityAlert() {
    return capacityAlert;
  }

  public void setCapacityAlert(Boolean capacityAlert) {
    this.capacityAlert = capacityAlert;
  }

  public GetTLSConfigResponse capacityAlertInterval(Integer capacityAlertInterval) {
    this.capacityAlertInterval = capacityAlertInterval;
    return this;
  }

   /**
   * Get capacityAlertInterval
   * @return capacityAlertInterval
  **/
  @Schema(description = "")
  public Integer getCapacityAlertInterval() {
    return capacityAlertInterval;
  }

  public void setCapacityAlertInterval(Integer capacityAlertInterval) {
    this.capacityAlertInterval = capacityAlertInterval;
  }

  public GetTLSConfigResponse domainList(List<String> domainList) {
    this.domainList = domainList;
    return this;
  }

  public GetTLSConfigResponse addDomainListItem(String domainListItem) {
    if (this.domainList == null) {
      this.domainList = new ArrayList<String>();
    }
    this.domainList.add(domainListItem);
    return this;
  }

   /**
   * Get domainList
   * @return domainList
  **/
  @Schema(description = "")
  public List<String> getDomainList() {
    return domainList;
  }

  public void setDomainList(List<String> domainList) {
    this.domainList = domainList;
  }

  public GetTLSConfigResponse fieldList(FieldListForGetTLSConfigOutput fieldList) {
    this.fieldList = fieldList;
    return this;
  }

   /**
   * Get fieldList
   * @return fieldList
  **/
  @Valid
  @Schema(description = "")
  public FieldListForGetTLSConfigOutput getFieldList() {
    return fieldList;
  }

  public void setFieldList(FieldListForGetTLSConfigOutput fieldList) {
    this.fieldList = fieldList;
  }

  public GetTLSConfigResponse fieldSelectAll(Boolean fieldSelectAll) {
    this.fieldSelectAll = fieldSelectAll;
    return this;
  }

   /**
   * Get fieldSelectAll
   * @return fieldSelectAll
  **/
  @Schema(description = "")
  public Boolean isFieldSelectAll() {
    return fieldSelectAll;
  }

  public void setFieldSelectAll(Boolean fieldSelectAll) {
    this.fieldSelectAll = fieldSelectAll;
  }

  public GetTLSConfigResponse projectID(String projectID) {
    this.projectID = projectID;
    return this;
  }

   /**
   * Get projectID
   * @return projectID
  **/
  @Schema(description = "")
  public String getProjectID() {
    return projectID;
  }

  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  public GetTLSConfigResponse projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public GetTLSConfigResponse tlSRegion(String tlSRegion) {
    this.tlSRegion = tlSRegion;
    return this;
  }

   /**
   * Get tlSRegion
   * @return tlSRegion
  **/
  @Schema(description = "")
  public String getTlSRegion() {
    return tlSRegion;
  }

  public void setTlSRegion(String tlSRegion) {
    this.tlSRegion = tlSRegion;
  }

  public GetTLSConfigResponse tlSStorageTime(Integer tlSStorageTime) {
    this.tlSStorageTime = tlSStorageTime;
    return this;
  }

   /**
   * Get tlSStorageTime
   * @return tlSStorageTime
  **/
  @Schema(description = "")
  public Integer getTlSStorageTime() {
    return tlSStorageTime;
  }

  public void setTlSStorageTime(Integer tlSStorageTime) {
    this.tlSStorageTime = tlSStorageTime;
  }

  public GetTLSConfigResponse tlSTotalCapacity(Integer tlSTotalCapacity) {
    this.tlSTotalCapacity = tlSTotalCapacity;
    return this;
  }

   /**
   * Get tlSTotalCapacity
   * @return tlSTotalCapacity
  **/
  @Schema(description = "")
  public Integer getTlSTotalCapacity() {
    return tlSTotalCapacity;
  }

  public void setTlSTotalCapacity(Integer tlSTotalCapacity) {
    this.tlSTotalCapacity = tlSTotalCapacity;
  }

  public GetTLSConfigResponse tlSTotalUsage(Integer tlSTotalUsage) {
    this.tlSTotalUsage = tlSTotalUsage;
    return this;
  }

   /**
   * Get tlSTotalUsage
   * @return tlSTotalUsage
  **/
  @Schema(description = "")
  public Integer getTlSTotalUsage() {
    return tlSTotalUsage;
  }

  public void setTlSTotalUsage(Integer tlSTotalUsage) {
    this.tlSTotalUsage = tlSTotalUsage;
  }

  public GetTLSConfigResponse topicID(String topicID) {
    this.topicID = topicID;
    return this;
  }

   /**
   * Get topicID
   * @return topicID
  **/
  @Schema(description = "")
  public String getTopicID() {
    return topicID;
  }

  public void setTopicID(String topicID) {
    this.topicID = topicID;
  }

  public GetTLSConfigResponse topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @Schema(description = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public GetTLSConfigResponse totalDomainList(List<String> totalDomainList) {
    this.totalDomainList = totalDomainList;
    return this;
  }

  public GetTLSConfigResponse addTotalDomainListItem(String totalDomainListItem) {
    if (this.totalDomainList == null) {
      this.totalDomainList = new ArrayList<String>();
    }
    this.totalDomainList.add(totalDomainListItem);
    return this;
  }

   /**
   * Get totalDomainList
   * @return totalDomainList
  **/
  @Schema(description = "")
  public List<String> getTotalDomainList() {
    return totalDomainList;
  }

  public void setTotalDomainList(List<String> totalDomainList) {
    this.totalDomainList = totalDomainList;
  }

  public GetTLSConfigResponse wafActionList(WafActionListForGetTLSConfigOutput wafActionList) {
    this.wafActionList = wafActionList;
    return this;
  }

   /**
   * Get wafActionList
   * @return wafActionList
  **/
  @Valid
  @Schema(description = "")
  public WafActionListForGetTLSConfigOutput getWafActionList() {
    return wafActionList;
  }

  public void setWafActionList(WafActionListForGetTLSConfigOutput wafActionList) {
    this.wafActionList = wafActionList;
  }

  public GetTLSConfigResponse wafActionSelectAll(Boolean wafActionSelectAll) {
    this.wafActionSelectAll = wafActionSelectAll;
    return this;
  }

   /**
   * Get wafActionSelectAll
   * @return wafActionSelectAll
  **/
  @Schema(description = "")
  public Boolean isWafActionSelectAll() {
    return wafActionSelectAll;
  }

  public void setWafActionSelectAll(Boolean wafActionSelectAll) {
    this.wafActionSelectAll = wafActionSelectAll;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTLSConfigResponse getTLSConfigResponse = (GetTLSConfigResponse) o;
    return Objects.equals(this.alarmThreshold, getTLSConfigResponse.alarmThreshold) &&
        Objects.equals(this.capacityAlert, getTLSConfigResponse.capacityAlert) &&
        Objects.equals(this.capacityAlertInterval, getTLSConfigResponse.capacityAlertInterval) &&
        Objects.equals(this.domainList, getTLSConfigResponse.domainList) &&
        Objects.equals(this.fieldList, getTLSConfigResponse.fieldList) &&
        Objects.equals(this.fieldSelectAll, getTLSConfigResponse.fieldSelectAll) &&
        Objects.equals(this.projectID, getTLSConfigResponse.projectID) &&
        Objects.equals(this.projectName, getTLSConfigResponse.projectName) &&
        Objects.equals(this.tlSRegion, getTLSConfigResponse.tlSRegion) &&
        Objects.equals(this.tlSStorageTime, getTLSConfigResponse.tlSStorageTime) &&
        Objects.equals(this.tlSTotalCapacity, getTLSConfigResponse.tlSTotalCapacity) &&
        Objects.equals(this.tlSTotalUsage, getTLSConfigResponse.tlSTotalUsage) &&
        Objects.equals(this.topicID, getTLSConfigResponse.topicID) &&
        Objects.equals(this.topicName, getTLSConfigResponse.topicName) &&
        Objects.equals(this.totalDomainList, getTLSConfigResponse.totalDomainList) &&
        Objects.equals(this.wafActionList, getTLSConfigResponse.wafActionList) &&
        Objects.equals(this.wafActionSelectAll, getTLSConfigResponse.wafActionSelectAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmThreshold, capacityAlert, capacityAlertInterval, domainList, fieldList, fieldSelectAll, projectID, projectName, tlSRegion, tlSStorageTime, tlSTotalCapacity, tlSTotalUsage, topicID, topicName, totalDomainList, wafActionList, wafActionSelectAll);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTLSConfigResponse {\n");
    
    sb.append("    alarmThreshold: ").append(toIndentedString(alarmThreshold)).append("\n");
    sb.append("    capacityAlert: ").append(toIndentedString(capacityAlert)).append("\n");
    sb.append("    capacityAlertInterval: ").append(toIndentedString(capacityAlertInterval)).append("\n");
    sb.append("    domainList: ").append(toIndentedString(domainList)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    fieldSelectAll: ").append(toIndentedString(fieldSelectAll)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tlSRegion: ").append(toIndentedString(tlSRegion)).append("\n");
    sb.append("    tlSStorageTime: ").append(toIndentedString(tlSStorageTime)).append("\n");
    sb.append("    tlSTotalCapacity: ").append(toIndentedString(tlSTotalCapacity)).append("\n");
    sb.append("    tlSTotalUsage: ").append(toIndentedString(tlSTotalUsage)).append("\n");
    sb.append("    topicID: ").append(toIndentedString(topicID)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    totalDomainList: ").append(toIndentedString(totalDomainList)).append("\n");
    sb.append("    wafActionList: ").append(toIndentedString(wafActionList)).append("\n");
    sb.append("    wafActionSelectAll: ").append(toIndentedString(wafActionSelectAll)).append("\n");
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
