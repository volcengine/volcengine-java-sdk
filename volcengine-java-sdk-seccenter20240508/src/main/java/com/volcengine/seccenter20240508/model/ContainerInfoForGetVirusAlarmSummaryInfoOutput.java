/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * ContainerInfoForGetVirusAlarmSummaryInfoOutput
 */



public class ContainerInfoForGetVirusAlarmSummaryInfoOutput {
  @SerializedName("ContainerCreateTime")
  private String containerCreateTime = null;

  @SerializedName("ContainerCreateTimestamp")
  private Integer containerCreateTimestamp = null;

  @SerializedName("ContainerHostName")
  private String containerHostName = null;

  @SerializedName("ContainerID")
  private String containerID = null;

  @SerializedName("ContainerIP")
  private String containerIP = null;

  @SerializedName("ContainerName")
  private String containerName = null;

  @SerializedName("ContainerNetMode")
  private String containerNetMode = null;

  @SerializedName("ContainerPns")
  private String containerPns = null;

  @SerializedName("ContainerQueryResult")
  private String containerQueryResult = null;

  @SerializedName("ContainerRuntime")
  private String containerRuntime = null;

  @SerializedName("ContainerState")
  private String containerState = null;

  @SerializedName("ImageID")
  private String imageID = null;

  @SerializedName("ImageName")
  private String imageName = null;

  @SerializedName("PodID")
  private String podID = null;

  @SerializedName("PodName")
  private String podName = null;

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerCreateTime(String containerCreateTime) {
    this.containerCreateTime = containerCreateTime;
    return this;
  }

   /**
   * Get containerCreateTime
   * @return containerCreateTime
  **/
  @Schema(description = "")
  public String getContainerCreateTime() {
    return containerCreateTime;
  }

  public void setContainerCreateTime(String containerCreateTime) {
    this.containerCreateTime = containerCreateTime;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerCreateTimestamp(Integer containerCreateTimestamp) {
    this.containerCreateTimestamp = containerCreateTimestamp;
    return this;
  }

   /**
   * Get containerCreateTimestamp
   * @return containerCreateTimestamp
  **/
  @Schema(description = "")
  public Integer getContainerCreateTimestamp() {
    return containerCreateTimestamp;
  }

  public void setContainerCreateTimestamp(Integer containerCreateTimestamp) {
    this.containerCreateTimestamp = containerCreateTimestamp;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerHostName(String containerHostName) {
    this.containerHostName = containerHostName;
    return this;
  }

   /**
   * Get containerHostName
   * @return containerHostName
  **/
  @Schema(description = "")
  public String getContainerHostName() {
    return containerHostName;
  }

  public void setContainerHostName(String containerHostName) {
    this.containerHostName = containerHostName;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

   /**
   * Get containerID
   * @return containerID
  **/
  @Schema(description = "")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerIP(String containerIP) {
    this.containerIP = containerIP;
    return this;
  }

   /**
   * Get containerIP
   * @return containerIP
  **/
  @Schema(description = "")
  public String getContainerIP() {
    return containerIP;
  }

  public void setContainerIP(String containerIP) {
    this.containerIP = containerIP;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * Get containerName
   * @return containerName
  **/
  @Schema(description = "")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerNetMode(String containerNetMode) {
    this.containerNetMode = containerNetMode;
    return this;
  }

   /**
   * Get containerNetMode
   * @return containerNetMode
  **/
  @Schema(description = "")
  public String getContainerNetMode() {
    return containerNetMode;
  }

  public void setContainerNetMode(String containerNetMode) {
    this.containerNetMode = containerNetMode;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerPns(String containerPns) {
    this.containerPns = containerPns;
    return this;
  }

   /**
   * Get containerPns
   * @return containerPns
  **/
  @Schema(description = "")
  public String getContainerPns() {
    return containerPns;
  }

  public void setContainerPns(String containerPns) {
    this.containerPns = containerPns;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerQueryResult(String containerQueryResult) {
    this.containerQueryResult = containerQueryResult;
    return this;
  }

   /**
   * Get containerQueryResult
   * @return containerQueryResult
  **/
  @Schema(description = "")
  public String getContainerQueryResult() {
    return containerQueryResult;
  }

  public void setContainerQueryResult(String containerQueryResult) {
    this.containerQueryResult = containerQueryResult;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerRuntime(String containerRuntime) {
    this.containerRuntime = containerRuntime;
    return this;
  }

   /**
   * Get containerRuntime
   * @return containerRuntime
  **/
  @Schema(description = "")
  public String getContainerRuntime() {
    return containerRuntime;
  }

  public void setContainerRuntime(String containerRuntime) {
    this.containerRuntime = containerRuntime;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput containerState(String containerState) {
    this.containerState = containerState;
    return this;
  }

   /**
   * Get containerState
   * @return containerState
  **/
  @Schema(description = "")
  public String getContainerState() {
    return containerState;
  }

  public void setContainerState(String containerState) {
    this.containerState = containerState;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

   /**
   * Get imageID
   * @return imageID
  **/
  @Schema(description = "")
  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Get imageName
   * @return imageName
  **/
  @Schema(description = "")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput podID(String podID) {
    this.podID = podID;
    return this;
  }

   /**
   * Get podID
   * @return podID
  **/
  @Schema(description = "")
  public String getPodID() {
    return podID;
  }

  public void setPodID(String podID) {
    this.podID = podID;
  }

  public ContainerInfoForGetVirusAlarmSummaryInfoOutput podName(String podName) {
    this.podName = podName;
    return this;
  }

   /**
   * Get podName
   * @return podName
  **/
  @Schema(description = "")
  public String getPodName() {
    return podName;
  }

  public void setPodName(String podName) {
    this.podName = podName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerInfoForGetVirusAlarmSummaryInfoOutput containerInfoForGetVirusAlarmSummaryInfoOutput = (ContainerInfoForGetVirusAlarmSummaryInfoOutput) o;
    return Objects.equals(this.containerCreateTime, containerInfoForGetVirusAlarmSummaryInfoOutput.containerCreateTime) &&
        Objects.equals(this.containerCreateTimestamp, containerInfoForGetVirusAlarmSummaryInfoOutput.containerCreateTimestamp) &&
        Objects.equals(this.containerHostName, containerInfoForGetVirusAlarmSummaryInfoOutput.containerHostName) &&
        Objects.equals(this.containerID, containerInfoForGetVirusAlarmSummaryInfoOutput.containerID) &&
        Objects.equals(this.containerIP, containerInfoForGetVirusAlarmSummaryInfoOutput.containerIP) &&
        Objects.equals(this.containerName, containerInfoForGetVirusAlarmSummaryInfoOutput.containerName) &&
        Objects.equals(this.containerNetMode, containerInfoForGetVirusAlarmSummaryInfoOutput.containerNetMode) &&
        Objects.equals(this.containerPns, containerInfoForGetVirusAlarmSummaryInfoOutput.containerPns) &&
        Objects.equals(this.containerQueryResult, containerInfoForGetVirusAlarmSummaryInfoOutput.containerQueryResult) &&
        Objects.equals(this.containerRuntime, containerInfoForGetVirusAlarmSummaryInfoOutput.containerRuntime) &&
        Objects.equals(this.containerState, containerInfoForGetVirusAlarmSummaryInfoOutput.containerState) &&
        Objects.equals(this.imageID, containerInfoForGetVirusAlarmSummaryInfoOutput.imageID) &&
        Objects.equals(this.imageName, containerInfoForGetVirusAlarmSummaryInfoOutput.imageName) &&
        Objects.equals(this.podID, containerInfoForGetVirusAlarmSummaryInfoOutput.podID) &&
        Objects.equals(this.podName, containerInfoForGetVirusAlarmSummaryInfoOutput.podName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerCreateTime, containerCreateTimestamp, containerHostName, containerID, containerIP, containerName, containerNetMode, containerPns, containerQueryResult, containerRuntime, containerState, imageID, imageName, podID, podName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerInfoForGetVirusAlarmSummaryInfoOutput {\n");
    
    sb.append("    containerCreateTime: ").append(toIndentedString(containerCreateTime)).append("\n");
    sb.append("    containerCreateTimestamp: ").append(toIndentedString(containerCreateTimestamp)).append("\n");
    sb.append("    containerHostName: ").append(toIndentedString(containerHostName)).append("\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    containerIP: ").append(toIndentedString(containerIP)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    containerNetMode: ").append(toIndentedString(containerNetMode)).append("\n");
    sb.append("    containerPns: ").append(toIndentedString(containerPns)).append("\n");
    sb.append("    containerQueryResult: ").append(toIndentedString(containerQueryResult)).append("\n");
    sb.append("    containerRuntime: ").append(toIndentedString(containerRuntime)).append("\n");
    sb.append("    containerState: ").append(toIndentedString(containerState)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    podID: ").append(toIndentedString(podID)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
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
