/*
 * vei_api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.veiapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.veiapi.model.ObjBboxForGetMediapipeEventOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetMediapipeEventResponse
 */



public class GetMediapipeEventResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("base64_image_string")
  private String base64ImageString = null;

  @SerializedName("create_time")
  private String createTime = null;

  @SerializedName("event_id")
  private String eventId = null;

  @SerializedName("event_type")
  private String eventType = null;

  @SerializedName("instance_id")
  private String instanceId = null;

  @SerializedName("instance_name")
  private String instanceName = null;

  @SerializedName("json_all_string")
  private String jsonAllString = null;

  @SerializedName("obj_bboxes")
  private List<ObjBboxForGetMediapipeEventOutput> objBboxes = null;

  @SerializedName("project_id")
  private String projectId = null;

  @SerializedName("source_id")
  private String sourceId = null;

  @SerializedName("source_type")
  private String sourceType = null;

  public GetMediapipeEventResponse base64ImageString(String base64ImageString) {
    this.base64ImageString = base64ImageString;
    return this;
  }

   /**
   * Get base64ImageString
   * @return base64ImageString
  **/
  @Schema(description = "")
  public String getBase64ImageString() {
    return base64ImageString;
  }

  public void setBase64ImageString(String base64ImageString) {
    this.base64ImageString = base64ImageString;
  }

  public GetMediapipeEventResponse createTime(String createTime) {
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

  public GetMediapipeEventResponse eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @Schema(description = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public GetMediapipeEventResponse eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(description = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public GetMediapipeEventResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public GetMediapipeEventResponse instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public GetMediapipeEventResponse jsonAllString(String jsonAllString) {
    this.jsonAllString = jsonAllString;
    return this;
  }

   /**
   * Get jsonAllString
   * @return jsonAllString
  **/
  @Schema(description = "")
  public String getJsonAllString() {
    return jsonAllString;
  }

  public void setJsonAllString(String jsonAllString) {
    this.jsonAllString = jsonAllString;
  }

  public GetMediapipeEventResponse objBboxes(List<ObjBboxForGetMediapipeEventOutput> objBboxes) {
    this.objBboxes = objBboxes;
    return this;
  }

  public GetMediapipeEventResponse addObjBboxesItem(ObjBboxForGetMediapipeEventOutput objBboxesItem) {
    if (this.objBboxes == null) {
      this.objBboxes = new ArrayList<ObjBboxForGetMediapipeEventOutput>();
    }
    this.objBboxes.add(objBboxesItem);
    return this;
  }

   /**
   * Get objBboxes
   * @return objBboxes
  **/
  @Valid
  @Schema(description = "")
  public List<ObjBboxForGetMediapipeEventOutput> getObjBboxes() {
    return objBboxes;
  }

  public void setObjBboxes(List<ObjBboxForGetMediapipeEventOutput> objBboxes) {
    this.objBboxes = objBboxes;
  }

  public GetMediapipeEventResponse projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public GetMediapipeEventResponse sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @Schema(description = "")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public GetMediapipeEventResponse sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @Schema(description = "")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMediapipeEventResponse getMediapipeEventResponse = (GetMediapipeEventResponse) o;
    return Objects.equals(this.base64ImageString, getMediapipeEventResponse.base64ImageString) &&
        Objects.equals(this.createTime, getMediapipeEventResponse.createTime) &&
        Objects.equals(this.eventId, getMediapipeEventResponse.eventId) &&
        Objects.equals(this.eventType, getMediapipeEventResponse.eventType) &&
        Objects.equals(this.instanceId, getMediapipeEventResponse.instanceId) &&
        Objects.equals(this.instanceName, getMediapipeEventResponse.instanceName) &&
        Objects.equals(this.jsonAllString, getMediapipeEventResponse.jsonAllString) &&
        Objects.equals(this.objBboxes, getMediapipeEventResponse.objBboxes) &&
        Objects.equals(this.projectId, getMediapipeEventResponse.projectId) &&
        Objects.equals(this.sourceId, getMediapipeEventResponse.sourceId) &&
        Objects.equals(this.sourceType, getMediapipeEventResponse.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64ImageString, createTime, eventId, eventType, instanceId, instanceName, jsonAllString, objBboxes, projectId, sourceId, sourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMediapipeEventResponse {\n");
    
    sb.append("    base64ImageString: ").append(toIndentedString(base64ImageString)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    jsonAllString: ").append(toIndentedString(jsonAllString)).append("\n");
    sb.append("    objBboxes: ").append(toIndentedString(objBboxes)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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
