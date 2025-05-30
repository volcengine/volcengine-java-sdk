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
 * StatusForGetServiceOutput
 */



public class StatusForGetServiceOutput {
  @SerializedName("AvailableReplicas")
  private Integer availableReplicas = null;

  @SerializedName("ExpectedReplicias")
  private Integer expectedReplicias = null;

  @SerializedName("ExpectedUpdatedReplicas")
  private Integer expectedUpdatedReplicas = null;

  @SerializedName("TotalReplicas")
  private Integer totalReplicas = null;

  @SerializedName("UpdatedAvailableReplicas")
  private Integer updatedAvailableReplicas = null;

  @SerializedName("UpdatedReplicas")
  private Integer updatedReplicas = null;

  public StatusForGetServiceOutput availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * Get availableReplicas
   * @return availableReplicas
  **/
  @Schema(description = "")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public StatusForGetServiceOutput expectedReplicias(Integer expectedReplicias) {
    this.expectedReplicias = expectedReplicias;
    return this;
  }

   /**
   * Get expectedReplicias
   * @return expectedReplicias
  **/
  @Schema(description = "")
  public Integer getExpectedReplicias() {
    return expectedReplicias;
  }

  public void setExpectedReplicias(Integer expectedReplicias) {
    this.expectedReplicias = expectedReplicias;
  }

  public StatusForGetServiceOutput expectedUpdatedReplicas(Integer expectedUpdatedReplicas) {
    this.expectedUpdatedReplicas = expectedUpdatedReplicas;
    return this;
  }

   /**
   * Get expectedUpdatedReplicas
   * @return expectedUpdatedReplicas
  **/
  @Schema(description = "")
  public Integer getExpectedUpdatedReplicas() {
    return expectedUpdatedReplicas;
  }

  public void setExpectedUpdatedReplicas(Integer expectedUpdatedReplicas) {
    this.expectedUpdatedReplicas = expectedUpdatedReplicas;
  }

  public StatusForGetServiceOutput totalReplicas(Integer totalReplicas) {
    this.totalReplicas = totalReplicas;
    return this;
  }

   /**
   * Get totalReplicas
   * @return totalReplicas
  **/
  @Schema(description = "")
  public Integer getTotalReplicas() {
    return totalReplicas;
  }

  public void setTotalReplicas(Integer totalReplicas) {
    this.totalReplicas = totalReplicas;
  }

  public StatusForGetServiceOutput updatedAvailableReplicas(Integer updatedAvailableReplicas) {
    this.updatedAvailableReplicas = updatedAvailableReplicas;
    return this;
  }

   /**
   * Get updatedAvailableReplicas
   * @return updatedAvailableReplicas
  **/
  @Schema(description = "")
  public Integer getUpdatedAvailableReplicas() {
    return updatedAvailableReplicas;
  }

  public void setUpdatedAvailableReplicas(Integer updatedAvailableReplicas) {
    this.updatedAvailableReplicas = updatedAvailableReplicas;
  }

  public StatusForGetServiceOutput updatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }

   /**
   * Get updatedReplicas
   * @return updatedReplicas
  **/
  @Schema(description = "")
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }

  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusForGetServiceOutput statusForGetServiceOutput = (StatusForGetServiceOutput) o;
    return Objects.equals(this.availableReplicas, statusForGetServiceOutput.availableReplicas) &&
        Objects.equals(this.expectedReplicias, statusForGetServiceOutput.expectedReplicias) &&
        Objects.equals(this.expectedUpdatedReplicas, statusForGetServiceOutput.expectedUpdatedReplicas) &&
        Objects.equals(this.totalReplicas, statusForGetServiceOutput.totalReplicas) &&
        Objects.equals(this.updatedAvailableReplicas, statusForGetServiceOutput.updatedAvailableReplicas) &&
        Objects.equals(this.updatedReplicas, statusForGetServiceOutput.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, expectedReplicias, expectedUpdatedReplicas, totalReplicas, updatedAvailableReplicas, updatedReplicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusForGetServiceOutput {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    expectedReplicias: ").append(toIndentedString(expectedReplicias)).append("\n");
    sb.append("    expectedUpdatedReplicas: ").append(toIndentedString(expectedUpdatedReplicas)).append("\n");
    sb.append("    totalReplicas: ").append(toIndentedString(totalReplicas)).append("\n");
    sb.append("    updatedAvailableReplicas: ").append(toIndentedString(updatedAvailableReplicas)).append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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
