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
import com.volcengine.escloud.model.InstanceConfigurationForDescribeInstancesOutput;
import com.volcengine.escloud.model.KibanaConfigForDescribeInstancesOutput;
import com.volcengine.escloud.model.ResourceTagForDescribeInstancesOutput;
import com.volcengine.escloud.model.SubInstanceForDescribeInstancesOutput;
import com.volcengine.escloud.model.TransferInfoForDescribeInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceForDescribeInstancesOutput
 */



public class InstanceForDescribeInstancesOutput {
  @SerializedName("CerebroEnabled")
  private Boolean cerebroEnabled = null;

  @SerializedName("CerebroPrivateDomain")
  private String cerebroPrivateDomain = null;

  @SerializedName("CerebroPublicDomain")
  private String cerebroPublicDomain = null;

  @SerializedName("ChargeEnabled")
  private Boolean chargeEnabled = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DeletionProtection")
  private Boolean deletionProtection = null;

  @SerializedName("ESEip")
  private String esEip = null;

  @SerializedName("ESEipId")
  private String esEipId = null;

  @SerializedName("ESPrivateEndpoint")
  private String esPrivateEndpoint = null;

  @SerializedName("ESPrivateIpWhitelist")
  private String esPrivateIpWhitelist = null;

  @SerializedName("ESPublicEndpoint")
  private String esPublicEndpoint = null;

  @SerializedName("ESPublicIpWhitelist")
  private String esPublicIpWhitelist = null;

  @SerializedName("EnableESPrivateDomainPublic")
  private Boolean enableESPrivateDomainPublic = null;

  @SerializedName("EnableESPrivateNetwork")
  private Boolean enableESPrivateNetwork = null;

  @SerializedName("EnableESPublicNetwork")
  private Boolean enableESPublicNetwork = null;

  @SerializedName("EnableKibanaPrivateDomainPublic")
  private Boolean enableKibanaPrivateDomainPublic = null;

  @SerializedName("EnableKibanaPrivateNetwork")
  private Boolean enableKibanaPrivateNetwork = null;

  @SerializedName("EnableKibanaPublicNetwork")
  private Boolean enableKibanaPublicNetwork = null;

  @SerializedName("ExpireDate")
  private String expireDate = null;

  @SerializedName("InstanceConfiguration")
  private InstanceConfigurationForDescribeInstancesOutput instanceConfiguration = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("KibanaConfig")
  private KibanaConfigForDescribeInstancesOutput kibanaConfig = null;

  @SerializedName("KibanaEip")
  private String kibanaEip = null;

  @SerializedName("KibanaEipId")
  private String kibanaEipId = null;

  @SerializedName("KibanaPrivateDomain")
  private String kibanaPrivateDomain = null;

  @SerializedName("KibanaPrivateIpWhitelist")
  private String kibanaPrivateIpWhitelist = null;

  @SerializedName("KibanaPublicDomain")
  private String kibanaPublicDomain = null;

  @SerializedName("KibanaPublicIpWhitelist")
  private String kibanaPublicIpWhitelist = null;

  @SerializedName("MainZoneId")
  private String mainZoneId = null;

  @SerializedName("MaintenanceDay")
  private List<String> maintenanceDay = null;

  @SerializedName("MaintenanceTime")
  private String maintenanceTime = null;

  @SerializedName("ResourceTags")
  private List<ResourceTagForDescribeInstancesOutput> resourceTags = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("Init")
    INIT("Init"),
    @SerializedName("WaitingPaid")
    WAITINGPAID("WaitingPaid"),
    @SerializedName("WaitCreate")
    WAITCREATE("WaitCreate"),
    @SerializedName("Creating")
    CREATING("Creating"),
    @SerializedName("Running")
    RUNNING("Running"),
    @SerializedName("Restarting")
    RESTARTING("Restarting"),
    @SerializedName("Updating")
    UPDATING("Updating"),
    @SerializedName("WaitScale")
    WAITSCALE("WaitScale"),
    @SerializedName("Scaling")
    SCALING("Scaling"),
    @SerializedName("Restoring")
    RESTORING("Restoring"),
    @SerializedName("Upgrading")
    UPGRADING("Upgrading"),
    @SerializedName("Closing")
    CLOSING("Closing"),
    @SerializedName("Closed")
    CLOSED("Closed"),
    @SerializedName("Reclaiming")
    RECLAIMING("Reclaiming"),
    @SerializedName("Resuming")
    RESUMING("Resuming"),
    @SerializedName("WaitRelease")
    WAITRELEASE("WaitRelease"),
    @SerializedName("Releasing")
    RELEASING("Releasing"),
    @SerializedName("Released")
    RELEASED("Released"),
    @SerializedName("Deleted")
    DELETED("Deleted"),
    @SerializedName("Destroying")
    DESTROYING("Destroying"),
    @SerializedName("Destroyed")
    DESTROYED("Destroyed"),
    @SerializedName("CreateFailed")
    CREATEFAILED("CreateFailed"),
    @SerializedName("TaskFailed")
    TASKFAILED("TaskFailed"),
    @SerializedName("Error")
    ERROR("Error"),
    @SerializedName("Warn")
    WARN("Warn"),
    @SerializedName("Unknown")
    UNKNOWN("Unknown");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("SubInstances")
  private List<SubInstanceForDescribeInstancesOutput> subInstances = null;

  @SerializedName("SupportColdNode")
  private Boolean supportColdNode = null;

  @SerializedName("TotalNodes")
  private Integer totalNodes = null;

  @SerializedName("TransferInfo")
  private TransferInfoForDescribeInstancesOutput transferInfo = null;

  @SerializedName("UserId")
  private String userId = null;

  public InstanceForDescribeInstancesOutput cerebroEnabled(Boolean cerebroEnabled) {
    this.cerebroEnabled = cerebroEnabled;
    return this;
  }

   /**
   * Get cerebroEnabled
   * @return cerebroEnabled
  **/
  @Schema(description = "")
  public Boolean isCerebroEnabled() {
    return cerebroEnabled;
  }

  public void setCerebroEnabled(Boolean cerebroEnabled) {
    this.cerebroEnabled = cerebroEnabled;
  }

  public InstanceForDescribeInstancesOutput cerebroPrivateDomain(String cerebroPrivateDomain) {
    this.cerebroPrivateDomain = cerebroPrivateDomain;
    return this;
  }

   /**
   * Get cerebroPrivateDomain
   * @return cerebroPrivateDomain
  **/
  @Schema(description = "")
  public String getCerebroPrivateDomain() {
    return cerebroPrivateDomain;
  }

  public void setCerebroPrivateDomain(String cerebroPrivateDomain) {
    this.cerebroPrivateDomain = cerebroPrivateDomain;
  }

  public InstanceForDescribeInstancesOutput cerebroPublicDomain(String cerebroPublicDomain) {
    this.cerebroPublicDomain = cerebroPublicDomain;
    return this;
  }

   /**
   * Get cerebroPublicDomain
   * @return cerebroPublicDomain
  **/
  @Schema(description = "")
  public String getCerebroPublicDomain() {
    return cerebroPublicDomain;
  }

  public void setCerebroPublicDomain(String cerebroPublicDomain) {
    this.cerebroPublicDomain = cerebroPublicDomain;
  }

  public InstanceForDescribeInstancesOutput chargeEnabled(Boolean chargeEnabled) {
    this.chargeEnabled = chargeEnabled;
    return this;
  }

   /**
   * Get chargeEnabled
   * @return chargeEnabled
  **/
  @Schema(description = "")
  public Boolean isChargeEnabled() {
    return chargeEnabled;
  }

  public void setChargeEnabled(Boolean chargeEnabled) {
    this.chargeEnabled = chargeEnabled;
  }

  public InstanceForDescribeInstancesOutput clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public InstanceForDescribeInstancesOutput createTime(String createTime) {
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

  public InstanceForDescribeInstancesOutput deletionProtection(Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
    return this;
  }

   /**
   * Get deletionProtection
   * @return deletionProtection
  **/
  @Schema(description = "")
  public Boolean isDeletionProtection() {
    return deletionProtection;
  }

  public void setDeletionProtection(Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
  }

  public InstanceForDescribeInstancesOutput esEip(String esEip) {
    this.esEip = esEip;
    return this;
  }

   /**
   * Get esEip
   * @return esEip
  **/
  @Schema(description = "")
  public String getEsEip() {
    return esEip;
  }

  public void setEsEip(String esEip) {
    this.esEip = esEip;
  }

  public InstanceForDescribeInstancesOutput esEipId(String esEipId) {
    this.esEipId = esEipId;
    return this;
  }

   /**
   * Get esEipId
   * @return esEipId
  **/
  @Schema(description = "")
  public String getEsEipId() {
    return esEipId;
  }

  public void setEsEipId(String esEipId) {
    this.esEipId = esEipId;
  }

  public InstanceForDescribeInstancesOutput esPrivateEndpoint(String esPrivateEndpoint) {
    this.esPrivateEndpoint = esPrivateEndpoint;
    return this;
  }

   /**
   * Get esPrivateEndpoint
   * @return esPrivateEndpoint
  **/
  @Schema(description = "")
  public String getEsPrivateEndpoint() {
    return esPrivateEndpoint;
  }

  public void setEsPrivateEndpoint(String esPrivateEndpoint) {
    this.esPrivateEndpoint = esPrivateEndpoint;
  }

  public InstanceForDescribeInstancesOutput esPrivateIpWhitelist(String esPrivateIpWhitelist) {
    this.esPrivateIpWhitelist = esPrivateIpWhitelist;
    return this;
  }

   /**
   * Get esPrivateIpWhitelist
   * @return esPrivateIpWhitelist
  **/
  @Schema(description = "")
  public String getEsPrivateIpWhitelist() {
    return esPrivateIpWhitelist;
  }

  public void setEsPrivateIpWhitelist(String esPrivateIpWhitelist) {
    this.esPrivateIpWhitelist = esPrivateIpWhitelist;
  }

  public InstanceForDescribeInstancesOutput esPublicEndpoint(String esPublicEndpoint) {
    this.esPublicEndpoint = esPublicEndpoint;
    return this;
  }

   /**
   * Get esPublicEndpoint
   * @return esPublicEndpoint
  **/
  @Schema(description = "")
  public String getEsPublicEndpoint() {
    return esPublicEndpoint;
  }

  public void setEsPublicEndpoint(String esPublicEndpoint) {
    this.esPublicEndpoint = esPublicEndpoint;
  }

  public InstanceForDescribeInstancesOutput esPublicIpWhitelist(String esPublicIpWhitelist) {
    this.esPublicIpWhitelist = esPublicIpWhitelist;
    return this;
  }

   /**
   * Get esPublicIpWhitelist
   * @return esPublicIpWhitelist
  **/
  @Schema(description = "")
  public String getEsPublicIpWhitelist() {
    return esPublicIpWhitelist;
  }

  public void setEsPublicIpWhitelist(String esPublicIpWhitelist) {
    this.esPublicIpWhitelist = esPublicIpWhitelist;
  }

  public InstanceForDescribeInstancesOutput enableESPrivateDomainPublic(Boolean enableESPrivateDomainPublic) {
    this.enableESPrivateDomainPublic = enableESPrivateDomainPublic;
    return this;
  }

   /**
   * Get enableESPrivateDomainPublic
   * @return enableESPrivateDomainPublic
  **/
  @Schema(description = "")
  public Boolean isEnableESPrivateDomainPublic() {
    return enableESPrivateDomainPublic;
  }

  public void setEnableESPrivateDomainPublic(Boolean enableESPrivateDomainPublic) {
    this.enableESPrivateDomainPublic = enableESPrivateDomainPublic;
  }

  public InstanceForDescribeInstancesOutput enableESPrivateNetwork(Boolean enableESPrivateNetwork) {
    this.enableESPrivateNetwork = enableESPrivateNetwork;
    return this;
  }

   /**
   * Get enableESPrivateNetwork
   * @return enableESPrivateNetwork
  **/
  @Schema(description = "")
  public Boolean isEnableESPrivateNetwork() {
    return enableESPrivateNetwork;
  }

  public void setEnableESPrivateNetwork(Boolean enableESPrivateNetwork) {
    this.enableESPrivateNetwork = enableESPrivateNetwork;
  }

  public InstanceForDescribeInstancesOutput enableESPublicNetwork(Boolean enableESPublicNetwork) {
    this.enableESPublicNetwork = enableESPublicNetwork;
    return this;
  }

   /**
   * Get enableESPublicNetwork
   * @return enableESPublicNetwork
  **/
  @Schema(description = "")
  public Boolean isEnableESPublicNetwork() {
    return enableESPublicNetwork;
  }

  public void setEnableESPublicNetwork(Boolean enableESPublicNetwork) {
    this.enableESPublicNetwork = enableESPublicNetwork;
  }

  public InstanceForDescribeInstancesOutput enableKibanaPrivateDomainPublic(Boolean enableKibanaPrivateDomainPublic) {
    this.enableKibanaPrivateDomainPublic = enableKibanaPrivateDomainPublic;
    return this;
  }

   /**
   * Get enableKibanaPrivateDomainPublic
   * @return enableKibanaPrivateDomainPublic
  **/
  @Schema(description = "")
  public Boolean isEnableKibanaPrivateDomainPublic() {
    return enableKibanaPrivateDomainPublic;
  }

  public void setEnableKibanaPrivateDomainPublic(Boolean enableKibanaPrivateDomainPublic) {
    this.enableKibanaPrivateDomainPublic = enableKibanaPrivateDomainPublic;
  }

  public InstanceForDescribeInstancesOutput enableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
    this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
    return this;
  }

   /**
   * Get enableKibanaPrivateNetwork
   * @return enableKibanaPrivateNetwork
  **/
  @Schema(description = "")
  public Boolean isEnableKibanaPrivateNetwork() {
    return enableKibanaPrivateNetwork;
  }

  public void setEnableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
    this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
  }

  public InstanceForDescribeInstancesOutput enableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
    this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
    return this;
  }

   /**
   * Get enableKibanaPublicNetwork
   * @return enableKibanaPublicNetwork
  **/
  @Schema(description = "")
  public Boolean isEnableKibanaPublicNetwork() {
    return enableKibanaPublicNetwork;
  }

  public void setEnableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
    this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
  }

  public InstanceForDescribeInstancesOutput expireDate(String expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @Schema(description = "")
  public String getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }

  public InstanceForDescribeInstancesOutput instanceConfiguration(InstanceConfigurationForDescribeInstancesOutput instanceConfiguration) {
    this.instanceConfiguration = instanceConfiguration;
    return this;
  }

   /**
   * Get instanceConfiguration
   * @return instanceConfiguration
  **/
  @Valid
  @Schema(description = "")
  public InstanceConfigurationForDescribeInstancesOutput getInstanceConfiguration() {
    return instanceConfiguration;
  }

  public void setInstanceConfiguration(InstanceConfigurationForDescribeInstancesOutput instanceConfiguration) {
    this.instanceConfiguration = instanceConfiguration;
  }

  public InstanceForDescribeInstancesOutput instanceId(String instanceId) {
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

  public InstanceForDescribeInstancesOutput kibanaConfig(KibanaConfigForDescribeInstancesOutput kibanaConfig) {
    this.kibanaConfig = kibanaConfig;
    return this;
  }

   /**
   * Get kibanaConfig
   * @return kibanaConfig
  **/
  @Valid
  @Schema(description = "")
  public KibanaConfigForDescribeInstancesOutput getKibanaConfig() {
    return kibanaConfig;
  }

  public void setKibanaConfig(KibanaConfigForDescribeInstancesOutput kibanaConfig) {
    this.kibanaConfig = kibanaConfig;
  }

  public InstanceForDescribeInstancesOutput kibanaEip(String kibanaEip) {
    this.kibanaEip = kibanaEip;
    return this;
  }

   /**
   * Get kibanaEip
   * @return kibanaEip
  **/
  @Schema(description = "")
  public String getKibanaEip() {
    return kibanaEip;
  }

  public void setKibanaEip(String kibanaEip) {
    this.kibanaEip = kibanaEip;
  }

  public InstanceForDescribeInstancesOutput kibanaEipId(String kibanaEipId) {
    this.kibanaEipId = kibanaEipId;
    return this;
  }

   /**
   * Get kibanaEipId
   * @return kibanaEipId
  **/
  @Schema(description = "")
  public String getKibanaEipId() {
    return kibanaEipId;
  }

  public void setKibanaEipId(String kibanaEipId) {
    this.kibanaEipId = kibanaEipId;
  }

  public InstanceForDescribeInstancesOutput kibanaPrivateDomain(String kibanaPrivateDomain) {
    this.kibanaPrivateDomain = kibanaPrivateDomain;
    return this;
  }

   /**
   * Get kibanaPrivateDomain
   * @return kibanaPrivateDomain
  **/
  @Schema(description = "")
  public String getKibanaPrivateDomain() {
    return kibanaPrivateDomain;
  }

  public void setKibanaPrivateDomain(String kibanaPrivateDomain) {
    this.kibanaPrivateDomain = kibanaPrivateDomain;
  }

  public InstanceForDescribeInstancesOutput kibanaPrivateIpWhitelist(String kibanaPrivateIpWhitelist) {
    this.kibanaPrivateIpWhitelist = kibanaPrivateIpWhitelist;
    return this;
  }

   /**
   * Get kibanaPrivateIpWhitelist
   * @return kibanaPrivateIpWhitelist
  **/
  @Schema(description = "")
  public String getKibanaPrivateIpWhitelist() {
    return kibanaPrivateIpWhitelist;
  }

  public void setKibanaPrivateIpWhitelist(String kibanaPrivateIpWhitelist) {
    this.kibanaPrivateIpWhitelist = kibanaPrivateIpWhitelist;
  }

  public InstanceForDescribeInstancesOutput kibanaPublicDomain(String kibanaPublicDomain) {
    this.kibanaPublicDomain = kibanaPublicDomain;
    return this;
  }

   /**
   * Get kibanaPublicDomain
   * @return kibanaPublicDomain
  **/
  @Schema(description = "")
  public String getKibanaPublicDomain() {
    return kibanaPublicDomain;
  }

  public void setKibanaPublicDomain(String kibanaPublicDomain) {
    this.kibanaPublicDomain = kibanaPublicDomain;
  }

  public InstanceForDescribeInstancesOutput kibanaPublicIpWhitelist(String kibanaPublicIpWhitelist) {
    this.kibanaPublicIpWhitelist = kibanaPublicIpWhitelist;
    return this;
  }

   /**
   * Get kibanaPublicIpWhitelist
   * @return kibanaPublicIpWhitelist
  **/
  @Schema(description = "")
  public String getKibanaPublicIpWhitelist() {
    return kibanaPublicIpWhitelist;
  }

  public void setKibanaPublicIpWhitelist(String kibanaPublicIpWhitelist) {
    this.kibanaPublicIpWhitelist = kibanaPublicIpWhitelist;
  }

  public InstanceForDescribeInstancesOutput mainZoneId(String mainZoneId) {
    this.mainZoneId = mainZoneId;
    return this;
  }

   /**
   * Get mainZoneId
   * @return mainZoneId
  **/
  @Schema(description = "")
  public String getMainZoneId() {
    return mainZoneId;
  }

  public void setMainZoneId(String mainZoneId) {
    this.mainZoneId = mainZoneId;
  }

  public InstanceForDescribeInstancesOutput maintenanceDay(List<String> maintenanceDay) {
    this.maintenanceDay = maintenanceDay;
    return this;
  }

  public InstanceForDescribeInstancesOutput addMaintenanceDayItem(String maintenanceDayItem) {
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

  public InstanceForDescribeInstancesOutput maintenanceTime(String maintenanceTime) {
    this.maintenanceTime = maintenanceTime;
    return this;
  }

   /**
   * Get maintenanceTime
   * @return maintenanceTime
  **/
  @Schema(description = "")
  public String getMaintenanceTime() {
    return maintenanceTime;
  }

  public void setMaintenanceTime(String maintenanceTime) {
    this.maintenanceTime = maintenanceTime;
  }

  public InstanceForDescribeInstancesOutput resourceTags(List<ResourceTagForDescribeInstancesOutput> resourceTags) {
    this.resourceTags = resourceTags;
    return this;
  }

  public InstanceForDescribeInstancesOutput addResourceTagsItem(ResourceTagForDescribeInstancesOutput resourceTagsItem) {
    if (this.resourceTags == null) {
      this.resourceTags = new ArrayList<ResourceTagForDescribeInstancesOutput>();
    }
    this.resourceTags.add(resourceTagsItem);
    return this;
  }

   /**
   * Get resourceTags
   * @return resourceTags
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceTagForDescribeInstancesOutput> getResourceTags() {
    return resourceTags;
  }

  public void setResourceTags(List<ResourceTagForDescribeInstancesOutput> resourceTags) {
    this.resourceTags = resourceTags;
  }

  public InstanceForDescribeInstancesOutput status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InstanceForDescribeInstancesOutput subInstances(List<SubInstanceForDescribeInstancesOutput> subInstances) {
    this.subInstances = subInstances;
    return this;
  }

  public InstanceForDescribeInstancesOutput addSubInstancesItem(SubInstanceForDescribeInstancesOutput subInstancesItem) {
    if (this.subInstances == null) {
      this.subInstances = new ArrayList<SubInstanceForDescribeInstancesOutput>();
    }
    this.subInstances.add(subInstancesItem);
    return this;
  }

   /**
   * Get subInstances
   * @return subInstances
  **/
  @Valid
  @Schema(description = "")
  public List<SubInstanceForDescribeInstancesOutput> getSubInstances() {
    return subInstances;
  }

  public void setSubInstances(List<SubInstanceForDescribeInstancesOutput> subInstances) {
    this.subInstances = subInstances;
  }

  public InstanceForDescribeInstancesOutput supportColdNode(Boolean supportColdNode) {
    this.supportColdNode = supportColdNode;
    return this;
  }

   /**
   * Get supportColdNode
   * @return supportColdNode
  **/
  @Schema(description = "")
  public Boolean isSupportColdNode() {
    return supportColdNode;
  }

  public void setSupportColdNode(Boolean supportColdNode) {
    this.supportColdNode = supportColdNode;
  }

  public InstanceForDescribeInstancesOutput totalNodes(Integer totalNodes) {
    this.totalNodes = totalNodes;
    return this;
  }

   /**
   * Get totalNodes
   * @return totalNodes
  **/
  @Schema(description = "")
  public Integer getTotalNodes() {
    return totalNodes;
  }

  public void setTotalNodes(Integer totalNodes) {
    this.totalNodes = totalNodes;
  }

  public InstanceForDescribeInstancesOutput transferInfo(TransferInfoForDescribeInstancesOutput transferInfo) {
    this.transferInfo = transferInfo;
    return this;
  }

   /**
   * Get transferInfo
   * @return transferInfo
  **/
  @Valid
  @Schema(description = "")
  public TransferInfoForDescribeInstancesOutput getTransferInfo() {
    return transferInfo;
  }

  public void setTransferInfo(TransferInfoForDescribeInstancesOutput transferInfo) {
    this.transferInfo = transferInfo;
  }

  public InstanceForDescribeInstancesOutput userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceForDescribeInstancesOutput instanceForDescribeInstancesOutput = (InstanceForDescribeInstancesOutput) o;
    return Objects.equals(this.cerebroEnabled, instanceForDescribeInstancesOutput.cerebroEnabled) &&
        Objects.equals(this.cerebroPrivateDomain, instanceForDescribeInstancesOutput.cerebroPrivateDomain) &&
        Objects.equals(this.cerebroPublicDomain, instanceForDescribeInstancesOutput.cerebroPublicDomain) &&
        Objects.equals(this.chargeEnabled, instanceForDescribeInstancesOutput.chargeEnabled) &&
        Objects.equals(this.clusterId, instanceForDescribeInstancesOutput.clusterId) &&
        Objects.equals(this.createTime, instanceForDescribeInstancesOutput.createTime) &&
        Objects.equals(this.deletionProtection, instanceForDescribeInstancesOutput.deletionProtection) &&
        Objects.equals(this.esEip, instanceForDescribeInstancesOutput.esEip) &&
        Objects.equals(this.esEipId, instanceForDescribeInstancesOutput.esEipId) &&
        Objects.equals(this.esPrivateEndpoint, instanceForDescribeInstancesOutput.esPrivateEndpoint) &&
        Objects.equals(this.esPrivateIpWhitelist, instanceForDescribeInstancesOutput.esPrivateIpWhitelist) &&
        Objects.equals(this.esPublicEndpoint, instanceForDescribeInstancesOutput.esPublicEndpoint) &&
        Objects.equals(this.esPublicIpWhitelist, instanceForDescribeInstancesOutput.esPublicIpWhitelist) &&
        Objects.equals(this.enableESPrivateDomainPublic, instanceForDescribeInstancesOutput.enableESPrivateDomainPublic) &&
        Objects.equals(this.enableESPrivateNetwork, instanceForDescribeInstancesOutput.enableESPrivateNetwork) &&
        Objects.equals(this.enableESPublicNetwork, instanceForDescribeInstancesOutput.enableESPublicNetwork) &&
        Objects.equals(this.enableKibanaPrivateDomainPublic, instanceForDescribeInstancesOutput.enableKibanaPrivateDomainPublic) &&
        Objects.equals(this.enableKibanaPrivateNetwork, instanceForDescribeInstancesOutput.enableKibanaPrivateNetwork) &&
        Objects.equals(this.enableKibanaPublicNetwork, instanceForDescribeInstancesOutput.enableKibanaPublicNetwork) &&
        Objects.equals(this.expireDate, instanceForDescribeInstancesOutput.expireDate) &&
        Objects.equals(this.instanceConfiguration, instanceForDescribeInstancesOutput.instanceConfiguration) &&
        Objects.equals(this.instanceId, instanceForDescribeInstancesOutput.instanceId) &&
        Objects.equals(this.kibanaConfig, instanceForDescribeInstancesOutput.kibanaConfig) &&
        Objects.equals(this.kibanaEip, instanceForDescribeInstancesOutput.kibanaEip) &&
        Objects.equals(this.kibanaEipId, instanceForDescribeInstancesOutput.kibanaEipId) &&
        Objects.equals(this.kibanaPrivateDomain, instanceForDescribeInstancesOutput.kibanaPrivateDomain) &&
        Objects.equals(this.kibanaPrivateIpWhitelist, instanceForDescribeInstancesOutput.kibanaPrivateIpWhitelist) &&
        Objects.equals(this.kibanaPublicDomain, instanceForDescribeInstancesOutput.kibanaPublicDomain) &&
        Objects.equals(this.kibanaPublicIpWhitelist, instanceForDescribeInstancesOutput.kibanaPublicIpWhitelist) &&
        Objects.equals(this.mainZoneId, instanceForDescribeInstancesOutput.mainZoneId) &&
        Objects.equals(this.maintenanceDay, instanceForDescribeInstancesOutput.maintenanceDay) &&
        Objects.equals(this.maintenanceTime, instanceForDescribeInstancesOutput.maintenanceTime) &&
        Objects.equals(this.resourceTags, instanceForDescribeInstancesOutput.resourceTags) &&
        Objects.equals(this.status, instanceForDescribeInstancesOutput.status) &&
        Objects.equals(this.subInstances, instanceForDescribeInstancesOutput.subInstances) &&
        Objects.equals(this.supportColdNode, instanceForDescribeInstancesOutput.supportColdNode) &&
        Objects.equals(this.totalNodes, instanceForDescribeInstancesOutput.totalNodes) &&
        Objects.equals(this.transferInfo, instanceForDescribeInstancesOutput.transferInfo) &&
        Objects.equals(this.userId, instanceForDescribeInstancesOutput.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cerebroEnabled, cerebroPrivateDomain, cerebroPublicDomain, chargeEnabled, clusterId, createTime, deletionProtection, esEip, esEipId, esPrivateEndpoint, esPrivateIpWhitelist, esPublicEndpoint, esPublicIpWhitelist, enableESPrivateDomainPublic, enableESPrivateNetwork, enableESPublicNetwork, enableKibanaPrivateDomainPublic, enableKibanaPrivateNetwork, enableKibanaPublicNetwork, expireDate, instanceConfiguration, instanceId, kibanaConfig, kibanaEip, kibanaEipId, kibanaPrivateDomain, kibanaPrivateIpWhitelist, kibanaPublicDomain, kibanaPublicIpWhitelist, mainZoneId, maintenanceDay, maintenanceTime, resourceTags, status, subInstances, supportColdNode, totalNodes, transferInfo, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceForDescribeInstancesOutput {\n");
    
    sb.append("    cerebroEnabled: ").append(toIndentedString(cerebroEnabled)).append("\n");
    sb.append("    cerebroPrivateDomain: ").append(toIndentedString(cerebroPrivateDomain)).append("\n");
    sb.append("    cerebroPublicDomain: ").append(toIndentedString(cerebroPublicDomain)).append("\n");
    sb.append("    chargeEnabled: ").append(toIndentedString(chargeEnabled)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
    sb.append("    esEip: ").append(toIndentedString(esEip)).append("\n");
    sb.append("    esEipId: ").append(toIndentedString(esEipId)).append("\n");
    sb.append("    esPrivateEndpoint: ").append(toIndentedString(esPrivateEndpoint)).append("\n");
    sb.append("    esPrivateIpWhitelist: ").append(toIndentedString(esPrivateIpWhitelist)).append("\n");
    sb.append("    esPublicEndpoint: ").append(toIndentedString(esPublicEndpoint)).append("\n");
    sb.append("    esPublicIpWhitelist: ").append(toIndentedString(esPublicIpWhitelist)).append("\n");
    sb.append("    enableESPrivateDomainPublic: ").append(toIndentedString(enableESPrivateDomainPublic)).append("\n");
    sb.append("    enableESPrivateNetwork: ").append(toIndentedString(enableESPrivateNetwork)).append("\n");
    sb.append("    enableESPublicNetwork: ").append(toIndentedString(enableESPublicNetwork)).append("\n");
    sb.append("    enableKibanaPrivateDomainPublic: ").append(toIndentedString(enableKibanaPrivateDomainPublic)).append("\n");
    sb.append("    enableKibanaPrivateNetwork: ").append(toIndentedString(enableKibanaPrivateNetwork)).append("\n");
    sb.append("    enableKibanaPublicNetwork: ").append(toIndentedString(enableKibanaPublicNetwork)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    instanceConfiguration: ").append(toIndentedString(instanceConfiguration)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    kibanaConfig: ").append(toIndentedString(kibanaConfig)).append("\n");
    sb.append("    kibanaEip: ").append(toIndentedString(kibanaEip)).append("\n");
    sb.append("    kibanaEipId: ").append(toIndentedString(kibanaEipId)).append("\n");
    sb.append("    kibanaPrivateDomain: ").append(toIndentedString(kibanaPrivateDomain)).append("\n");
    sb.append("    kibanaPrivateIpWhitelist: ").append(toIndentedString(kibanaPrivateIpWhitelist)).append("\n");
    sb.append("    kibanaPublicDomain: ").append(toIndentedString(kibanaPublicDomain)).append("\n");
    sb.append("    kibanaPublicIpWhitelist: ").append(toIndentedString(kibanaPublicIpWhitelist)).append("\n");
    sb.append("    mainZoneId: ").append(toIndentedString(mainZoneId)).append("\n");
    sb.append("    maintenanceDay: ").append(toIndentedString(maintenanceDay)).append("\n");
    sb.append("    maintenanceTime: ").append(toIndentedString(maintenanceTime)).append("\n");
    sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subInstances: ").append(toIndentedString(subInstances)).append("\n");
    sb.append("    supportColdNode: ").append(toIndentedString(supportColdNode)).append("\n");
    sb.append("    totalNodes: ").append(toIndentedString(totalNodes)).append("\n");
    sb.append("    transferInfo: ").append(toIndentedString(transferInfo)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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