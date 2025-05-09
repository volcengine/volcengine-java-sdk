/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.DataVolumeForCreateNodePoolInput;
import com.volcengine.vke.model.PublicAccessConfigForCreateNodePoolInput;
import com.volcengine.vke.model.SecurityForCreateNodePoolInput;
import com.volcengine.vke.model.SystemVolumeForCreateNodePoolInput;
import com.volcengine.vke.model.TagForCreateNodePoolInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NodeConfigForCreateNodePoolInput
 */



public class NodeConfigForCreateNodePoolInput {
  @SerializedName("AdditionalContainerStorageEnabled")
  private Boolean additionalContainerStorageEnabled = null;

  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("AutoRenewPeriod")
  private Integer autoRenewPeriod = null;

  @SerializedName("DataVolumes")
  private List<DataVolumeForCreateNodePoolInput> dataVolumes = null;

  @SerializedName("DeploymentSetGroupNumber")
  private Integer deploymentSetGroupNumber = null;

  @SerializedName("DeploymentSetId")
  private String deploymentSetId = null;

  @SerializedName("HpcClusterIds")
  private List<String> hpcClusterIds = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InitializeScript")
  private String initializeScript = null;

  /**
   * Gets or Sets instanceChargeType
   */
  @JsonAdapter(InstanceChargeTypeEnum.Adapter.class)
  public enum InstanceChargeTypeEnum {
    @SerializedName("PostPaid")
    POSTPAID("PostPaid"),
    @SerializedName("PrePaid")
    PREPAID("PrePaid");

    private String value;

    InstanceChargeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InstanceChargeTypeEnum fromValue(String input) {
      for (InstanceChargeTypeEnum b : InstanceChargeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InstanceChargeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstanceChargeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InstanceChargeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InstanceChargeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("InstanceChargeType")
  private InstanceChargeTypeEnum instanceChargeType = null;

  @SerializedName("InstanceTypeIds")
  private List<String> instanceTypeIds = null;

  @SerializedName("NamePrefix")
  private String namePrefix = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("PublicAccessConfig")
  private PublicAccessConfigForCreateNodePoolInput publicAccessConfig = null;

  @SerializedName("PublicAccessEnabled")
  private Boolean publicAccessEnabled = null;

  @SerializedName("Security")
  private SecurityForCreateNodePoolInput security = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("SystemVolume")
  private SystemVolumeForCreateNodePoolInput systemVolume = null;

  @SerializedName("Tags")
  private List<TagForCreateNodePoolInput> tags = null;

  public NodeConfigForCreateNodePoolInput additionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
    return this;
  }

   /**
   * Get additionalContainerStorageEnabled
   * @return additionalContainerStorageEnabled
  **/
  @Schema(description = "")
  public Boolean isAdditionalContainerStorageEnabled() {
    return additionalContainerStorageEnabled;
  }

  public void setAdditionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
  }

  public NodeConfigForCreateNodePoolInput autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public NodeConfigForCreateNodePoolInput autoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
    return this;
  }

   /**
   * Get autoRenewPeriod
   * @return autoRenewPeriod
  **/
  @Schema(description = "")
  public Integer getAutoRenewPeriod() {
    return autoRenewPeriod;
  }

  public void setAutoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
  }

  public NodeConfigForCreateNodePoolInput dataVolumes(List<DataVolumeForCreateNodePoolInput> dataVolumes) {
    this.dataVolumes = dataVolumes;
    return this;
  }

  public NodeConfigForCreateNodePoolInput addDataVolumesItem(DataVolumeForCreateNodePoolInput dataVolumesItem) {
    if (this.dataVolumes == null) {
      this.dataVolumes = new ArrayList<DataVolumeForCreateNodePoolInput>();
    }
    this.dataVolumes.add(dataVolumesItem);
    return this;
  }

   /**
   * Get dataVolumes
   * @return dataVolumes
  **/
  @Valid
  @Schema(description = "")
  public List<DataVolumeForCreateNodePoolInput> getDataVolumes() {
    return dataVolumes;
  }

  public void setDataVolumes(List<DataVolumeForCreateNodePoolInput> dataVolumes) {
    this.dataVolumes = dataVolumes;
  }

  public NodeConfigForCreateNodePoolInput deploymentSetGroupNumber(Integer deploymentSetGroupNumber) {
    this.deploymentSetGroupNumber = deploymentSetGroupNumber;
    return this;
  }

   /**
   * Get deploymentSetGroupNumber
   * @return deploymentSetGroupNumber
  **/
  @Schema(description = "")
  public Integer getDeploymentSetGroupNumber() {
    return deploymentSetGroupNumber;
  }

  public void setDeploymentSetGroupNumber(Integer deploymentSetGroupNumber) {
    this.deploymentSetGroupNumber = deploymentSetGroupNumber;
  }

  public NodeConfigForCreateNodePoolInput deploymentSetId(String deploymentSetId) {
    this.deploymentSetId = deploymentSetId;
    return this;
  }

   /**
   * Get deploymentSetId
   * @return deploymentSetId
  **/
  @Schema(description = "")
  public String getDeploymentSetId() {
    return deploymentSetId;
  }

  public void setDeploymentSetId(String deploymentSetId) {
    this.deploymentSetId = deploymentSetId;
  }

  public NodeConfigForCreateNodePoolInput hpcClusterIds(List<String> hpcClusterIds) {
    this.hpcClusterIds = hpcClusterIds;
    return this;
  }

  public NodeConfigForCreateNodePoolInput addHpcClusterIdsItem(String hpcClusterIdsItem) {
    if (this.hpcClusterIds == null) {
      this.hpcClusterIds = new ArrayList<String>();
    }
    this.hpcClusterIds.add(hpcClusterIdsItem);
    return this;
  }

   /**
   * Get hpcClusterIds
   * @return hpcClusterIds
  **/
  @Schema(description = "")
  public List<String> getHpcClusterIds() {
    return hpcClusterIds;
  }

  public void setHpcClusterIds(List<String> hpcClusterIds) {
    this.hpcClusterIds = hpcClusterIds;
  }

  public NodeConfigForCreateNodePoolInput imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public NodeConfigForCreateNodePoolInput initializeScript(String initializeScript) {
    this.initializeScript = initializeScript;
    return this;
  }

   /**
   * Get initializeScript
   * @return initializeScript
  **/
  @Schema(description = "")
  public String getInitializeScript() {
    return initializeScript;
  }

  public void setInitializeScript(String initializeScript) {
    this.initializeScript = initializeScript;
  }

  public NodeConfigForCreateNodePoolInput instanceChargeType(InstanceChargeTypeEnum instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
    return this;
  }

   /**
   * Get instanceChargeType
   * @return instanceChargeType
  **/
  @Schema(description = "")
  public InstanceChargeTypeEnum getInstanceChargeType() {
    return instanceChargeType;
  }

  public void setInstanceChargeType(InstanceChargeTypeEnum instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
  }

  public NodeConfigForCreateNodePoolInput instanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
    return this;
  }

  public NodeConfigForCreateNodePoolInput addInstanceTypeIdsItem(String instanceTypeIdsItem) {
    if (this.instanceTypeIds == null) {
      this.instanceTypeIds = new ArrayList<String>();
    }
    this.instanceTypeIds.add(instanceTypeIdsItem);
    return this;
  }

   /**
   * Get instanceTypeIds
   * @return instanceTypeIds
  **/
  @Schema(description = "")
  public List<String> getInstanceTypeIds() {
    return instanceTypeIds;
  }

  public void setInstanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
  }

  public NodeConfigForCreateNodePoolInput namePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * Get namePrefix
   * @return namePrefix
  **/
  @Schema(description = "")
  public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public NodeConfigForCreateNodePoolInput period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public NodeConfigForCreateNodePoolInput projectName(String projectName) {
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

  public NodeConfigForCreateNodePoolInput publicAccessConfig(PublicAccessConfigForCreateNodePoolInput publicAccessConfig) {
    this.publicAccessConfig = publicAccessConfig;
    return this;
  }

   /**
   * Get publicAccessConfig
   * @return publicAccessConfig
  **/
  @Valid
  @Schema(description = "")
  public PublicAccessConfigForCreateNodePoolInput getPublicAccessConfig() {
    return publicAccessConfig;
  }

  public void setPublicAccessConfig(PublicAccessConfigForCreateNodePoolInput publicAccessConfig) {
    this.publicAccessConfig = publicAccessConfig;
  }

  public NodeConfigForCreateNodePoolInput publicAccessEnabled(Boolean publicAccessEnabled) {
    this.publicAccessEnabled = publicAccessEnabled;
    return this;
  }

   /**
   * Get publicAccessEnabled
   * @return publicAccessEnabled
  **/
  @Schema(description = "")
  public Boolean isPublicAccessEnabled() {
    return publicAccessEnabled;
  }

  public void setPublicAccessEnabled(Boolean publicAccessEnabled) {
    this.publicAccessEnabled = publicAccessEnabled;
  }

  public NodeConfigForCreateNodePoolInput security(SecurityForCreateNodePoolInput security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @Valid
  @Schema(description = "")
  public SecurityForCreateNodePoolInput getSecurity() {
    return security;
  }

  public void setSecurity(SecurityForCreateNodePoolInput security) {
    this.security = security;
  }

  public NodeConfigForCreateNodePoolInput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public NodeConfigForCreateNodePoolInput addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<String>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * Get subnetIds
   * @return subnetIds
  **/
  @Schema(description = "")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  public NodeConfigForCreateNodePoolInput systemVolume(SystemVolumeForCreateNodePoolInput systemVolume) {
    this.systemVolume = systemVolume;
    return this;
  }

   /**
   * Get systemVolume
   * @return systemVolume
  **/
  @Valid
  @Schema(description = "")
  public SystemVolumeForCreateNodePoolInput getSystemVolume() {
    return systemVolume;
  }

  public void setSystemVolume(SystemVolumeForCreateNodePoolInput systemVolume) {
    this.systemVolume = systemVolume;
  }

  public NodeConfigForCreateNodePoolInput tags(List<TagForCreateNodePoolInput> tags) {
    this.tags = tags;
    return this;
  }

  public NodeConfigForCreateNodePoolInput addTagsItem(TagForCreateNodePoolInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateNodePoolInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateNodePoolInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateNodePoolInput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeConfigForCreateNodePoolInput nodeConfigForCreateNodePoolInput = (NodeConfigForCreateNodePoolInput) o;
    return Objects.equals(this.additionalContainerStorageEnabled, nodeConfigForCreateNodePoolInput.additionalContainerStorageEnabled) &&
        Objects.equals(this.autoRenew, nodeConfigForCreateNodePoolInput.autoRenew) &&
        Objects.equals(this.autoRenewPeriod, nodeConfigForCreateNodePoolInput.autoRenewPeriod) &&
        Objects.equals(this.dataVolumes, nodeConfigForCreateNodePoolInput.dataVolumes) &&
        Objects.equals(this.deploymentSetGroupNumber, nodeConfigForCreateNodePoolInput.deploymentSetGroupNumber) &&
        Objects.equals(this.deploymentSetId, nodeConfigForCreateNodePoolInput.deploymentSetId) &&
        Objects.equals(this.hpcClusterIds, nodeConfigForCreateNodePoolInput.hpcClusterIds) &&
        Objects.equals(this.imageId, nodeConfigForCreateNodePoolInput.imageId) &&
        Objects.equals(this.initializeScript, nodeConfigForCreateNodePoolInput.initializeScript) &&
        Objects.equals(this.instanceChargeType, nodeConfigForCreateNodePoolInput.instanceChargeType) &&
        Objects.equals(this.instanceTypeIds, nodeConfigForCreateNodePoolInput.instanceTypeIds) &&
        Objects.equals(this.namePrefix, nodeConfigForCreateNodePoolInput.namePrefix) &&
        Objects.equals(this.period, nodeConfigForCreateNodePoolInput.period) &&
        Objects.equals(this.projectName, nodeConfigForCreateNodePoolInput.projectName) &&
        Objects.equals(this.publicAccessConfig, nodeConfigForCreateNodePoolInput.publicAccessConfig) &&
        Objects.equals(this.publicAccessEnabled, nodeConfigForCreateNodePoolInput.publicAccessEnabled) &&
        Objects.equals(this.security, nodeConfigForCreateNodePoolInput.security) &&
        Objects.equals(this.subnetIds, nodeConfigForCreateNodePoolInput.subnetIds) &&
        Objects.equals(this.systemVolume, nodeConfigForCreateNodePoolInput.systemVolume) &&
        Objects.equals(this.tags, nodeConfigForCreateNodePoolInput.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalContainerStorageEnabled, autoRenew, autoRenewPeriod, dataVolumes, deploymentSetGroupNumber, deploymentSetId, hpcClusterIds, imageId, initializeScript, instanceChargeType, instanceTypeIds, namePrefix, period, projectName, publicAccessConfig, publicAccessEnabled, security, subnetIds, systemVolume, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeConfigForCreateNodePoolInput {\n");
    
    sb.append("    additionalContainerStorageEnabled: ").append(toIndentedString(additionalContainerStorageEnabled)).append("\n");
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    autoRenewPeriod: ").append(toIndentedString(autoRenewPeriod)).append("\n");
    sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
    sb.append("    deploymentSetGroupNumber: ").append(toIndentedString(deploymentSetGroupNumber)).append("\n");
    sb.append("    deploymentSetId: ").append(toIndentedString(deploymentSetId)).append("\n");
    sb.append("    hpcClusterIds: ").append(toIndentedString(hpcClusterIds)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    initializeScript: ").append(toIndentedString(initializeScript)).append("\n");
    sb.append("    instanceChargeType: ").append(toIndentedString(instanceChargeType)).append("\n");
    sb.append("    instanceTypeIds: ").append(toIndentedString(instanceTypeIds)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    publicAccessConfig: ").append(toIndentedString(publicAccessConfig)).append("\n");
    sb.append("    publicAccessEnabled: ").append(toIndentedString(publicAccessEnabled)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    systemVolume: ").append(toIndentedString(systemVolume)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
