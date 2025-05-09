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
import com.volcengine.mlplatform20240701.model.ApigConfigForGetServiceOutput;
import com.volcengine.mlplatform20240701.model.CLBConfigForGetServiceOutput;
import com.volcengine.mlplatform20240701.model.PortForGetServiceOutput;
import com.volcengine.mlplatform20240701.model.TrafficConfigForGetServiceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HistoryVersionForGetServiceOutput
 */



public class HistoryVersionForGetServiceOutput {
  @SerializedName("ApigConfig")
  private ApigConfigForGetServiceOutput apigConfig = null;

  @SerializedName("CLBConfig")
  private CLBConfigForGetServiceOutput clBConfig = null;

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

  @SerializedName("Ports")
  private List<PortForGetServiceOutput> ports = null;

  @SerializedName("TrafficConfig")
  private TrafficConfigForGetServiceOutput trafficConfig = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public HistoryVersionForGetServiceOutput apigConfig(ApigConfigForGetServiceOutput apigConfig) {
    this.apigConfig = apigConfig;
    return this;
  }

   /**
   * Get apigConfig
   * @return apigConfig
  **/
  @Valid
  @Schema(description = "")
  public ApigConfigForGetServiceOutput getApigConfig() {
    return apigConfig;
  }

  public void setApigConfig(ApigConfigForGetServiceOutput apigConfig) {
    this.apigConfig = apigConfig;
  }

  public HistoryVersionForGetServiceOutput clBConfig(CLBConfigForGetServiceOutput clBConfig) {
    this.clBConfig = clBConfig;
    return this;
  }

   /**
   * Get clBConfig
   * @return clBConfig
  **/
  @Valid
  @Schema(description = "")
  public CLBConfigForGetServiceOutput getClBConfig() {
    return clBConfig;
  }

  public void setClBConfig(CLBConfigForGetServiceOutput clBConfig) {
    this.clBConfig = clBConfig;
  }

  public HistoryVersionForGetServiceOutput changeType(ChangeTypeEnum changeType) {
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

  public HistoryVersionForGetServiceOutput createTime(String createTime) {
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

  public HistoryVersionForGetServiceOutput id(String id) {
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

  public HistoryVersionForGetServiceOutput ports(List<PortForGetServiceOutput> ports) {
    this.ports = ports;
    return this;
  }

  public HistoryVersionForGetServiceOutput addPortsItem(PortForGetServiceOutput portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<PortForGetServiceOutput>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @Valid
  @Schema(description = "")
  public List<PortForGetServiceOutput> getPorts() {
    return ports;
  }

  public void setPorts(List<PortForGetServiceOutput> ports) {
    this.ports = ports;
  }

  public HistoryVersionForGetServiceOutput trafficConfig(TrafficConfigForGetServiceOutput trafficConfig) {
    this.trafficConfig = trafficConfig;
    return this;
  }

   /**
   * Get trafficConfig
   * @return trafficConfig
  **/
  @Valid
  @Schema(description = "")
  public TrafficConfigForGetServiceOutput getTrafficConfig() {
    return trafficConfig;
  }

  public void setTrafficConfig(TrafficConfigForGetServiceOutput trafficConfig) {
    this.trafficConfig = trafficConfig;
  }

  public HistoryVersionForGetServiceOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryVersionForGetServiceOutput historyVersionForGetServiceOutput = (HistoryVersionForGetServiceOutput) o;
    return Objects.equals(this.apigConfig, historyVersionForGetServiceOutput.apigConfig) &&
        Objects.equals(this.clBConfig, historyVersionForGetServiceOutput.clBConfig) &&
        Objects.equals(this.changeType, historyVersionForGetServiceOutput.changeType) &&
        Objects.equals(this.createTime, historyVersionForGetServiceOutput.createTime) &&
        Objects.equals(this.id, historyVersionForGetServiceOutput.id) &&
        Objects.equals(this.ports, historyVersionForGetServiceOutput.ports) &&
        Objects.equals(this.trafficConfig, historyVersionForGetServiceOutput.trafficConfig) &&
        Objects.equals(this.vpcId, historyVersionForGetServiceOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apigConfig, clBConfig, changeType, createTime, id, ports, trafficConfig, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryVersionForGetServiceOutput {\n");
    
    sb.append("    apigConfig: ").append(toIndentedString(apigConfig)).append("\n");
    sb.append("    clBConfig: ").append(toIndentedString(clBConfig)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    trafficConfig: ").append(toIndentedString(trafficConfig)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
