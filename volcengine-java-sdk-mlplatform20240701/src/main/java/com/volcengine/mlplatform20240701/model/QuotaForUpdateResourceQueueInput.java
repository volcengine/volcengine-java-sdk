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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QuotaForUpdateResourceQueueInput
 */



public class QuotaForUpdateResourceQueueInput {
  @SerializedName("Cpu")
  private Double cpu = null;

  @SerializedName("Gpu")
  private Double gpu = null;

  @SerializedName("VolumeSizeGiB")
  private Double volumeSizeGiB = null;

  public QuotaForUpdateResourceQueueInput cpu(Double cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @Schema(description = "")
  public Double getCpu() {
    return cpu;
  }

  public void setCpu(Double cpu) {
    this.cpu = cpu;
  }

  public QuotaForUpdateResourceQueueInput gpu(Double gpu) {
    this.gpu = gpu;
    return this;
  }

   /**
   * Get gpu
   * @return gpu
  **/
  @Schema(description = "")
  public Double getGpu() {
    return gpu;
  }

  public void setGpu(Double gpu) {
    this.gpu = gpu;
  }

  public QuotaForUpdateResourceQueueInput volumeSizeGiB(Double volumeSizeGiB) {
    this.volumeSizeGiB = volumeSizeGiB;
    return this;
  }

   /**
   * Get volumeSizeGiB
   * @return volumeSizeGiB
  **/
  @Schema(description = "")
  public Double getVolumeSizeGiB() {
    return volumeSizeGiB;
  }

  public void setVolumeSizeGiB(Double volumeSizeGiB) {
    this.volumeSizeGiB = volumeSizeGiB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaForUpdateResourceQueueInput quotaForUpdateResourceQueueInput = (QuotaForUpdateResourceQueueInput) o;
    return Objects.equals(this.cpu, quotaForUpdateResourceQueueInput.cpu) &&
        Objects.equals(this.gpu, quotaForUpdateResourceQueueInput.gpu) &&
        Objects.equals(this.volumeSizeGiB, quotaForUpdateResourceQueueInput.volumeSizeGiB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, gpu, volumeSizeGiB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaForUpdateResourceQueueInput {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    volumeSizeGiB: ").append(toIndentedString(volumeSizeGiB)).append("\n");
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
