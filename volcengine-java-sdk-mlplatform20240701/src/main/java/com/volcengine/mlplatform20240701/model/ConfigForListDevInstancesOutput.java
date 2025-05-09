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
import com.volcengine.mlplatform20240701.model.CfsForListDevInstancesOutput;
import com.volcengine.mlplatform20240701.model.NasForListDevInstancesOutput;
import com.volcengine.mlplatform20240701.model.SfcsForListDevInstancesOutput;
import com.volcengine.mlplatform20240701.model.TosForListDevInstancesOutput;
import com.volcengine.mlplatform20240701.model.VepfsForListDevInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfigForListDevInstancesOutput
 */



public class ConfigForListDevInstancesOutput {
  @SerializedName("Cfs")
  private CfsForListDevInstancesOutput cfs = null;

  @SerializedName("Nas")
  private NasForListDevInstancesOutput nas = null;

  @SerializedName("Sfcs")
  private SfcsForListDevInstancesOutput sfcs = null;

  @SerializedName("Tos")
  private TosForListDevInstancesOutput tos = null;

  @SerializedName("Vepfs")
  private VepfsForListDevInstancesOutput vepfs = null;

  public ConfigForListDevInstancesOutput cfs(CfsForListDevInstancesOutput cfs) {
    this.cfs = cfs;
    return this;
  }

   /**
   * Get cfs
   * @return cfs
  **/
  @Valid
  @Schema(description = "")
  public CfsForListDevInstancesOutput getCfs() {
    return cfs;
  }

  public void setCfs(CfsForListDevInstancesOutput cfs) {
    this.cfs = cfs;
  }

  public ConfigForListDevInstancesOutput nas(NasForListDevInstancesOutput nas) {
    this.nas = nas;
    return this;
  }

   /**
   * Get nas
   * @return nas
  **/
  @Valid
  @Schema(description = "")
  public NasForListDevInstancesOutput getNas() {
    return nas;
  }

  public void setNas(NasForListDevInstancesOutput nas) {
    this.nas = nas;
  }

  public ConfigForListDevInstancesOutput sfcs(SfcsForListDevInstancesOutput sfcs) {
    this.sfcs = sfcs;
    return this;
  }

   /**
   * Get sfcs
   * @return sfcs
  **/
  @Valid
  @Schema(description = "")
  public SfcsForListDevInstancesOutput getSfcs() {
    return sfcs;
  }

  public void setSfcs(SfcsForListDevInstancesOutput sfcs) {
    this.sfcs = sfcs;
  }

  public ConfigForListDevInstancesOutput tos(TosForListDevInstancesOutput tos) {
    this.tos = tos;
    return this;
  }

   /**
   * Get tos
   * @return tos
  **/
  @Valid
  @Schema(description = "")
  public TosForListDevInstancesOutput getTos() {
    return tos;
  }

  public void setTos(TosForListDevInstancesOutput tos) {
    this.tos = tos;
  }

  public ConfigForListDevInstancesOutput vepfs(VepfsForListDevInstancesOutput vepfs) {
    this.vepfs = vepfs;
    return this;
  }

   /**
   * Get vepfs
   * @return vepfs
  **/
  @Valid
  @Schema(description = "")
  public VepfsForListDevInstancesOutput getVepfs() {
    return vepfs;
  }

  public void setVepfs(VepfsForListDevInstancesOutput vepfs) {
    this.vepfs = vepfs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigForListDevInstancesOutput configForListDevInstancesOutput = (ConfigForListDevInstancesOutput) o;
    return Objects.equals(this.cfs, configForListDevInstancesOutput.cfs) &&
        Objects.equals(this.nas, configForListDevInstancesOutput.nas) &&
        Objects.equals(this.sfcs, configForListDevInstancesOutput.sfcs) &&
        Objects.equals(this.tos, configForListDevInstancesOutput.tos) &&
        Objects.equals(this.vepfs, configForListDevInstancesOutput.vepfs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfs, nas, sfcs, tos, vepfs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigForListDevInstancesOutput {\n");
    
    sb.append("    cfs: ").append(toIndentedString(cfs)).append("\n");
    sb.append("    nas: ").append(toIndentedString(nas)).append("\n");
    sb.append("    sfcs: ").append(toIndentedString(sfcs)).append("\n");
    sb.append("    tos: ").append(toIndentedString(tos)).append("\n");
    sb.append("    vepfs: ").append(toIndentedString(vepfs)).append("\n");
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
