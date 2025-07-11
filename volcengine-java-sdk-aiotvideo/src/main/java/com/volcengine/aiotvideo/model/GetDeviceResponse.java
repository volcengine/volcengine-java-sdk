/*
 * aiotvideo
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.aiotvideo.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.aiotvideo.model.AlertNotificationForGetDeviceOutput;
import com.volcengine.aiotvideo.model.CoordinatesForGetDeviceOutput;
import com.volcengine.aiotvideo.model.DeviceStreamsForGetDeviceOutput;
import com.volcengine.aiotvideo.model.DeviceSubStreamForGetDeviceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetDeviceResponse
 */



public class GetDeviceResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AlertNotification")
  private AlertNotificationForGetDeviceOutput alertNotification = null;

  @SerializedName("AutoPullAfterRegister")
  private Boolean autoPullAfterRegister = null;

  @SerializedName("ChannelNum")
  private Integer channelNum = null;

  @SerializedName("Coordinates")
  private CoordinatesForGetDeviceOutput coordinates = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DeviceID")
  private String deviceID = null;

  @SerializedName("DeviceIP")
  private String deviceIP = null;

  @SerializedName("DeviceNSID")
  private String deviceNSID = null;

  @SerializedName("DeviceName")
  private String deviceName = null;

  @SerializedName("DeviceStreams")
  private DeviceStreamsForGetDeviceOutput deviceStreams = null;

  @SerializedName("DeviceSubStreams")
  private List<DeviceSubStreamForGetDeviceOutput> deviceSubStreams = null;

  @SerializedName("Location")
  private String location = null;

  @SerializedName("Manufactory")
  private String manufactory = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("RtpTransportTcp")
  private Boolean rtpTransportTcp = null;

  @SerializedName("SpaceID")
  private String spaceID = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("UseSubStream")
  private Boolean useSubStream = null;

  @SerializedName("Username")
  private String username = null;

  public GetDeviceResponse alertNotification(AlertNotificationForGetDeviceOutput alertNotification) {
    this.alertNotification = alertNotification;
    return this;
  }

   /**
   * Get alertNotification
   * @return alertNotification
  **/
  @Valid
  @Schema(description = "")
  public AlertNotificationForGetDeviceOutput getAlertNotification() {
    return alertNotification;
  }

  public void setAlertNotification(AlertNotificationForGetDeviceOutput alertNotification) {
    this.alertNotification = alertNotification;
  }

  public GetDeviceResponse autoPullAfterRegister(Boolean autoPullAfterRegister) {
    this.autoPullAfterRegister = autoPullAfterRegister;
    return this;
  }

   /**
   * Get autoPullAfterRegister
   * @return autoPullAfterRegister
  **/
  @Schema(description = "")
  public Boolean isAutoPullAfterRegister() {
    return autoPullAfterRegister;
  }

  public void setAutoPullAfterRegister(Boolean autoPullAfterRegister) {
    this.autoPullAfterRegister = autoPullAfterRegister;
  }

  public GetDeviceResponse channelNum(Integer channelNum) {
    this.channelNum = channelNum;
    return this;
  }

   /**
   * Get channelNum
   * @return channelNum
  **/
  @Schema(description = "")
  public Integer getChannelNum() {
    return channelNum;
  }

  public void setChannelNum(Integer channelNum) {
    this.channelNum = channelNum;
  }

  public GetDeviceResponse coordinates(CoordinatesForGetDeviceOutput coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @Valid
  @Schema(description = "")
  public CoordinatesForGetDeviceOutput getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(CoordinatesForGetDeviceOutput coordinates) {
    this.coordinates = coordinates;
  }

  public GetDeviceResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetDeviceResponse description(String description) {
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

  public GetDeviceResponse deviceID(String deviceID) {
    this.deviceID = deviceID;
    return this;
  }

   /**
   * Get deviceID
   * @return deviceID
  **/
  @Schema(description = "")
  public String getDeviceID() {
    return deviceID;
  }

  public void setDeviceID(String deviceID) {
    this.deviceID = deviceID;
  }

  public GetDeviceResponse deviceIP(String deviceIP) {
    this.deviceIP = deviceIP;
    return this;
  }

   /**
   * Get deviceIP
   * @return deviceIP
  **/
  @Schema(description = "")
  public String getDeviceIP() {
    return deviceIP;
  }

  public void setDeviceIP(String deviceIP) {
    this.deviceIP = deviceIP;
  }

  public GetDeviceResponse deviceNSID(String deviceNSID) {
    this.deviceNSID = deviceNSID;
    return this;
  }

   /**
   * Get deviceNSID
   * @return deviceNSID
  **/
  @Schema(description = "")
  public String getDeviceNSID() {
    return deviceNSID;
  }

  public void setDeviceNSID(String deviceNSID) {
    this.deviceNSID = deviceNSID;
  }

  public GetDeviceResponse deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Get deviceName
   * @return deviceName
  **/
  @Schema(description = "")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public GetDeviceResponse deviceStreams(DeviceStreamsForGetDeviceOutput deviceStreams) {
    this.deviceStreams = deviceStreams;
    return this;
  }

   /**
   * Get deviceStreams
   * @return deviceStreams
  **/
  @Valid
  @Schema(description = "")
  public DeviceStreamsForGetDeviceOutput getDeviceStreams() {
    return deviceStreams;
  }

  public void setDeviceStreams(DeviceStreamsForGetDeviceOutput deviceStreams) {
    this.deviceStreams = deviceStreams;
  }

  public GetDeviceResponse deviceSubStreams(List<DeviceSubStreamForGetDeviceOutput> deviceSubStreams) {
    this.deviceSubStreams = deviceSubStreams;
    return this;
  }

  public GetDeviceResponse addDeviceSubStreamsItem(DeviceSubStreamForGetDeviceOutput deviceSubStreamsItem) {
    if (this.deviceSubStreams == null) {
      this.deviceSubStreams = new ArrayList<DeviceSubStreamForGetDeviceOutput>();
    }
    this.deviceSubStreams.add(deviceSubStreamsItem);
    return this;
  }

   /**
   * Get deviceSubStreams
   * @return deviceSubStreams
  **/
  @Valid
  @Schema(description = "")
  public List<DeviceSubStreamForGetDeviceOutput> getDeviceSubStreams() {
    return deviceSubStreams;
  }

  public void setDeviceSubStreams(List<DeviceSubStreamForGetDeviceOutput> deviceSubStreams) {
    this.deviceSubStreams = deviceSubStreams;
  }

  public GetDeviceResponse location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public GetDeviceResponse manufactory(String manufactory) {
    this.manufactory = manufactory;
    return this;
  }

   /**
   * Get manufactory
   * @return manufactory
  **/
  @Schema(description = "")
  public String getManufactory() {
    return manufactory;
  }

  public void setManufactory(String manufactory) {
    this.manufactory = manufactory;
  }

  public GetDeviceResponse password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public GetDeviceResponse rtpTransportTcp(Boolean rtpTransportTcp) {
    this.rtpTransportTcp = rtpTransportTcp;
    return this;
  }

   /**
   * Get rtpTransportTcp
   * @return rtpTransportTcp
  **/
  @Schema(description = "")
  public Boolean isRtpTransportTcp() {
    return rtpTransportTcp;
  }

  public void setRtpTransportTcp(Boolean rtpTransportTcp) {
    this.rtpTransportTcp = rtpTransportTcp;
  }

  public GetDeviceResponse spaceID(String spaceID) {
    this.spaceID = spaceID;
    return this;
  }

   /**
   * Get spaceID
   * @return spaceID
  **/
  @Schema(description = "")
  public String getSpaceID() {
    return spaceID;
  }

  public void setSpaceID(String spaceID) {
    this.spaceID = spaceID;
  }

  public GetDeviceResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetDeviceResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetDeviceResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public GetDeviceResponse useSubStream(Boolean useSubStream) {
    this.useSubStream = useSubStream;
    return this;
  }

   /**
   * Get useSubStream
   * @return useSubStream
  **/
  @Schema(description = "")
  public Boolean isUseSubStream() {
    return useSubStream;
  }

  public void setUseSubStream(Boolean useSubStream) {
    this.useSubStream = useSubStream;
  }

  public GetDeviceResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
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
    GetDeviceResponse getDeviceResponse = (GetDeviceResponse) o;
    return Objects.equals(this.alertNotification, getDeviceResponse.alertNotification) &&
        Objects.equals(this.autoPullAfterRegister, getDeviceResponse.autoPullAfterRegister) &&
        Objects.equals(this.channelNum, getDeviceResponse.channelNum) &&
        Objects.equals(this.coordinates, getDeviceResponse.coordinates) &&
        Objects.equals(this.createdAt, getDeviceResponse.createdAt) &&
        Objects.equals(this.description, getDeviceResponse.description) &&
        Objects.equals(this.deviceID, getDeviceResponse.deviceID) &&
        Objects.equals(this.deviceIP, getDeviceResponse.deviceIP) &&
        Objects.equals(this.deviceNSID, getDeviceResponse.deviceNSID) &&
        Objects.equals(this.deviceName, getDeviceResponse.deviceName) &&
        Objects.equals(this.deviceStreams, getDeviceResponse.deviceStreams) &&
        Objects.equals(this.deviceSubStreams, getDeviceResponse.deviceSubStreams) &&
        Objects.equals(this.location, getDeviceResponse.location) &&
        Objects.equals(this.manufactory, getDeviceResponse.manufactory) &&
        Objects.equals(this.password, getDeviceResponse.password) &&
        Objects.equals(this.rtpTransportTcp, getDeviceResponse.rtpTransportTcp) &&
        Objects.equals(this.spaceID, getDeviceResponse.spaceID) &&
        Objects.equals(this.status, getDeviceResponse.status) &&
        Objects.equals(this.type, getDeviceResponse.type) &&
        Objects.equals(this.updatedAt, getDeviceResponse.updatedAt) &&
        Objects.equals(this.useSubStream, getDeviceResponse.useSubStream) &&
        Objects.equals(this.username, getDeviceResponse.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertNotification, autoPullAfterRegister, channelNum, coordinates, createdAt, description, deviceID, deviceIP, deviceNSID, deviceName, deviceStreams, deviceSubStreams, location, manufactory, password, rtpTransportTcp, spaceID, status, type, updatedAt, useSubStream, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDeviceResponse {\n");
    
    sb.append("    alertNotification: ").append(toIndentedString(alertNotification)).append("\n");
    sb.append("    autoPullAfterRegister: ").append(toIndentedString(autoPullAfterRegister)).append("\n");
    sb.append("    channelNum: ").append(toIndentedString(channelNum)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
    sb.append("    deviceIP: ").append(toIndentedString(deviceIP)).append("\n");
    sb.append("    deviceNSID: ").append(toIndentedString(deviceNSID)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    deviceStreams: ").append(toIndentedString(deviceStreams)).append("\n");
    sb.append("    deviceSubStreams: ").append(toIndentedString(deviceSubStreams)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    manufactory: ").append(toIndentedString(manufactory)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rtpTransportTcp: ").append(toIndentedString(rtpTransportTcp)).append("\n");
    sb.append("    spaceID: ").append(toIndentedString(spaceID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    useSubStream: ").append(toIndentedString(useSubStream)).append("\n");
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
