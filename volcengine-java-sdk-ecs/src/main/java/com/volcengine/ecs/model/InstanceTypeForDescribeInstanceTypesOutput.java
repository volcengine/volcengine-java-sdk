/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.GpuForDescribeInstanceTypesOutput;
import com.volcengine.ecs.model.LocalVolumeForDescribeInstanceTypesOutput;
import com.volcengine.ecs.model.MemoryForDescribeInstanceTypesOutput;
import com.volcengine.ecs.model.NetworkForDescribeInstanceTypesOutput;
import com.volcengine.ecs.model.ProcessorForDescribeInstanceTypesOutput;
import com.volcengine.ecs.model.RdmaForDescribeInstanceTypesOutput;
import com.volcengine.ecs.model.VolumeForDescribeInstanceTypesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceTypeForDescribeInstanceTypesOutput
 */



public class InstanceTypeForDescribeInstanceTypesOutput {
  @SerializedName("AffinityGroupSizes")
  private List<Integer> affinityGroupSizes = null;

  @SerializedName("BaselineCredit")
  private Long baselineCredit = null;

  @SerializedName("Gpu")
  private GpuForDescribeInstanceTypesOutput gpu = null;

  @SerializedName("InitialCredit")
  private Long initialCredit = null;

  @SerializedName("InstanceTypeFamily")
  private String instanceTypeFamily = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("IsSupportAffinityGroup")
  private Boolean isSupportAffinityGroup = null;

  @SerializedName("LocalVolumes")
  private List<LocalVolumeForDescribeInstanceTypesOutput> localVolumes = null;

  @SerializedName("Memory")
  private MemoryForDescribeInstanceTypesOutput memory = null;

  @SerializedName("Network")
  private NetworkForDescribeInstanceTypesOutput network = null;

  @SerializedName("Processor")
  private ProcessorForDescribeInstanceTypesOutput processor = null;

  @SerializedName("Rdma")
  private RdmaForDescribeInstanceTypesOutput rdma = null;

  @SerializedName("Volume")
  private VolumeForDescribeInstanceTypesOutput volume = null;

  public InstanceTypeForDescribeInstanceTypesOutput affinityGroupSizes(List<Integer> affinityGroupSizes) {
    this.affinityGroupSizes = affinityGroupSizes;
    return this;
  }

  public InstanceTypeForDescribeInstanceTypesOutput addAffinityGroupSizesItem(Integer affinityGroupSizesItem) {
    if (this.affinityGroupSizes == null) {
      this.affinityGroupSizes = new ArrayList<Integer>();
    }
    this.affinityGroupSizes.add(affinityGroupSizesItem);
    return this;
  }

   /**
   * Get affinityGroupSizes
   * @return affinityGroupSizes
  **/
  @Schema(description = "")
  public List<Integer> getAffinityGroupSizes() {
    return affinityGroupSizes;
  }

  public void setAffinityGroupSizes(List<Integer> affinityGroupSizes) {
    this.affinityGroupSizes = affinityGroupSizes;
  }

  public InstanceTypeForDescribeInstanceTypesOutput baselineCredit(Long baselineCredit) {
    this.baselineCredit = baselineCredit;
    return this;
  }

   /**
   * Get baselineCredit
   * @return baselineCredit
  **/
  @Schema(description = "")
  public Long getBaselineCredit() {
    return baselineCredit;
  }

  public void setBaselineCredit(Long baselineCredit) {
    this.baselineCredit = baselineCredit;
  }

  public InstanceTypeForDescribeInstanceTypesOutput gpu(GpuForDescribeInstanceTypesOutput gpu) {
    this.gpu = gpu;
    return this;
  }

   /**
   * Get gpu
   * @return gpu
  **/
  @Valid
  @Schema(description = "")
  public GpuForDescribeInstanceTypesOutput getGpu() {
    return gpu;
  }

  public void setGpu(GpuForDescribeInstanceTypesOutput gpu) {
    this.gpu = gpu;
  }

  public InstanceTypeForDescribeInstanceTypesOutput initialCredit(Long initialCredit) {
    this.initialCredit = initialCredit;
    return this;
  }

   /**
   * Get initialCredit
   * @return initialCredit
  **/
  @Schema(description = "")
  public Long getInitialCredit() {
    return initialCredit;
  }

  public void setInitialCredit(Long initialCredit) {
    this.initialCredit = initialCredit;
  }

  public InstanceTypeForDescribeInstanceTypesOutput instanceTypeFamily(String instanceTypeFamily) {
    this.instanceTypeFamily = instanceTypeFamily;
    return this;
  }

   /**
   * Get instanceTypeFamily
   * @return instanceTypeFamily
  **/
  @Schema(description = "")
  public String getInstanceTypeFamily() {
    return instanceTypeFamily;
  }

  public void setInstanceTypeFamily(String instanceTypeFamily) {
    this.instanceTypeFamily = instanceTypeFamily;
  }

  public InstanceTypeForDescribeInstanceTypesOutput instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @Schema(description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public InstanceTypeForDescribeInstanceTypesOutput isSupportAffinityGroup(Boolean isSupportAffinityGroup) {
    this.isSupportAffinityGroup = isSupportAffinityGroup;
    return this;
  }

   /**
   * Get isSupportAffinityGroup
   * @return isSupportAffinityGroup
  **/
  @Schema(description = "")
  public Boolean isIsSupportAffinityGroup() {
    return isSupportAffinityGroup;
  }

  public void setIsSupportAffinityGroup(Boolean isSupportAffinityGroup) {
    this.isSupportAffinityGroup = isSupportAffinityGroup;
  }

  public InstanceTypeForDescribeInstanceTypesOutput localVolumes(List<LocalVolumeForDescribeInstanceTypesOutput> localVolumes) {
    this.localVolumes = localVolumes;
    return this;
  }

  public InstanceTypeForDescribeInstanceTypesOutput addLocalVolumesItem(LocalVolumeForDescribeInstanceTypesOutput localVolumesItem) {
    if (this.localVolumes == null) {
      this.localVolumes = new ArrayList<LocalVolumeForDescribeInstanceTypesOutput>();
    }
    this.localVolumes.add(localVolumesItem);
    return this;
  }

   /**
   * Get localVolumes
   * @return localVolumes
  **/
  @Valid
  @Schema(description = "")
  public List<LocalVolumeForDescribeInstanceTypesOutput> getLocalVolumes() {
    return localVolumes;
  }

  public void setLocalVolumes(List<LocalVolumeForDescribeInstanceTypesOutput> localVolumes) {
    this.localVolumes = localVolumes;
  }

  public InstanceTypeForDescribeInstanceTypesOutput memory(MemoryForDescribeInstanceTypesOutput memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Valid
  @Schema(description = "")
  public MemoryForDescribeInstanceTypesOutput getMemory() {
    return memory;
  }

  public void setMemory(MemoryForDescribeInstanceTypesOutput memory) {
    this.memory = memory;
  }

  public InstanceTypeForDescribeInstanceTypesOutput network(NetworkForDescribeInstanceTypesOutput network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @Valid
  @Schema(description = "")
  public NetworkForDescribeInstanceTypesOutput getNetwork() {
    return network;
  }

  public void setNetwork(NetworkForDescribeInstanceTypesOutput network) {
    this.network = network;
  }

  public InstanceTypeForDescribeInstanceTypesOutput processor(ProcessorForDescribeInstanceTypesOutput processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @Valid
  @Schema(description = "")
  public ProcessorForDescribeInstanceTypesOutput getProcessor() {
    return processor;
  }

  public void setProcessor(ProcessorForDescribeInstanceTypesOutput processor) {
    this.processor = processor;
  }

  public InstanceTypeForDescribeInstanceTypesOutput rdma(RdmaForDescribeInstanceTypesOutput rdma) {
    this.rdma = rdma;
    return this;
  }

   /**
   * Get rdma
   * @return rdma
  **/
  @Valid
  @Schema(description = "")
  public RdmaForDescribeInstanceTypesOutput getRdma() {
    return rdma;
  }

  public void setRdma(RdmaForDescribeInstanceTypesOutput rdma) {
    this.rdma = rdma;
  }

  public InstanceTypeForDescribeInstanceTypesOutput volume(VolumeForDescribeInstanceTypesOutput volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @Valid
  @Schema(description = "")
  public VolumeForDescribeInstanceTypesOutput getVolume() {
    return volume;
  }

  public void setVolume(VolumeForDescribeInstanceTypesOutput volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTypeForDescribeInstanceTypesOutput instanceTypeForDescribeInstanceTypesOutput = (InstanceTypeForDescribeInstanceTypesOutput) o;
    return Objects.equals(this.affinityGroupSizes, instanceTypeForDescribeInstanceTypesOutput.affinityGroupSizes) &&
        Objects.equals(this.baselineCredit, instanceTypeForDescribeInstanceTypesOutput.baselineCredit) &&
        Objects.equals(this.gpu, instanceTypeForDescribeInstanceTypesOutput.gpu) &&
        Objects.equals(this.initialCredit, instanceTypeForDescribeInstanceTypesOutput.initialCredit) &&
        Objects.equals(this.instanceTypeFamily, instanceTypeForDescribeInstanceTypesOutput.instanceTypeFamily) &&
        Objects.equals(this.instanceTypeId, instanceTypeForDescribeInstanceTypesOutput.instanceTypeId) &&
        Objects.equals(this.isSupportAffinityGroup, instanceTypeForDescribeInstanceTypesOutput.isSupportAffinityGroup) &&
        Objects.equals(this.localVolumes, instanceTypeForDescribeInstanceTypesOutput.localVolumes) &&
        Objects.equals(this.memory, instanceTypeForDescribeInstanceTypesOutput.memory) &&
        Objects.equals(this.network, instanceTypeForDescribeInstanceTypesOutput.network) &&
        Objects.equals(this.processor, instanceTypeForDescribeInstanceTypesOutput.processor) &&
        Objects.equals(this.rdma, instanceTypeForDescribeInstanceTypesOutput.rdma) &&
        Objects.equals(this.volume, instanceTypeForDescribeInstanceTypesOutput.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinityGroupSizes, baselineCredit, gpu, initialCredit, instanceTypeFamily, instanceTypeId, isSupportAffinityGroup, localVolumes, memory, network, processor, rdma, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTypeForDescribeInstanceTypesOutput {\n");
    
    sb.append("    affinityGroupSizes: ").append(toIndentedString(affinityGroupSizes)).append("\n");
    sb.append("    baselineCredit: ").append(toIndentedString(baselineCredit)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    initialCredit: ").append(toIndentedString(initialCredit)).append("\n");
    sb.append("    instanceTypeFamily: ").append(toIndentedString(instanceTypeFamily)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    isSupportAffinityGroup: ").append(toIndentedString(isSupportAffinityGroup)).append("\n");
    sb.append("    localVolumes: ").append(toIndentedString(localVolumes)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    rdma: ").append(toIndentedString(rdma)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
