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
import com.volcengine.mlplatform20240701.model.CfsForCreateDeploymentInput;
import com.volcengine.mlplatform20240701.model.NasForCreateDeploymentInput;
import com.volcengine.mlplatform20240701.model.SfcsForCreateDeploymentInput;
import com.volcengine.mlplatform20240701.model.TosForCreateDeploymentInput;
import com.volcengine.mlplatform20240701.model.VepfsForCreateDeploymentInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfigForCreateDeploymentInput
 */



public class ConfigForCreateDeploymentInput {
  @SerializedName("Cfs")
  private CfsForCreateDeploymentInput cfs = null;

  @SerializedName("Nas")
  private NasForCreateDeploymentInput nas = null;

  @SerializedName("Sfcs")
  private SfcsForCreateDeploymentInput sfcs = null;

  @SerializedName("Tos")
  private TosForCreateDeploymentInput tos = null;

  @SerializedName("Vepfs")
  private VepfsForCreateDeploymentInput vepfs = null;

  public ConfigForCreateDeploymentInput cfs(CfsForCreateDeploymentInput cfs) {
    this.cfs = cfs;
    return this;
  }

   /**
   * Get cfs
   * @return cfs
  **/
  @Valid
  @Schema(description = "")
  public CfsForCreateDeploymentInput getCfs() {
    return cfs;
  }

  public void setCfs(CfsForCreateDeploymentInput cfs) {
    this.cfs = cfs;
  }

  public ConfigForCreateDeploymentInput nas(NasForCreateDeploymentInput nas) {
    this.nas = nas;
    return this;
  }

   /**
   * Get nas
   * @return nas
  **/
  @Valid
  @Schema(description = "")
  public NasForCreateDeploymentInput getNas() {
    return nas;
  }

  public void setNas(NasForCreateDeploymentInput nas) {
    this.nas = nas;
  }

  public ConfigForCreateDeploymentInput sfcs(SfcsForCreateDeploymentInput sfcs) {
    this.sfcs = sfcs;
    return this;
  }

   /**
   * Get sfcs
   * @return sfcs
  **/
  @Valid
  @Schema(description = "")
  public SfcsForCreateDeploymentInput getSfcs() {
    return sfcs;
  }

  public void setSfcs(SfcsForCreateDeploymentInput sfcs) {
    this.sfcs = sfcs;
  }

  public ConfigForCreateDeploymentInput tos(TosForCreateDeploymentInput tos) {
    this.tos = tos;
    return this;
  }

   /**
   * Get tos
   * @return tos
  **/
  @Valid
  @Schema(description = "")
  public TosForCreateDeploymentInput getTos() {
    return tos;
  }

  public void setTos(TosForCreateDeploymentInput tos) {
    this.tos = tos;
  }

  public ConfigForCreateDeploymentInput vepfs(VepfsForCreateDeploymentInput vepfs) {
    this.vepfs = vepfs;
    return this;
  }

   /**
   * Get vepfs
   * @return vepfs
  **/
  @Valid
  @Schema(description = "")
  public VepfsForCreateDeploymentInput getVepfs() {
    return vepfs;
  }

  public void setVepfs(VepfsForCreateDeploymentInput vepfs) {
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
    ConfigForCreateDeploymentInput configForCreateDeploymentInput = (ConfigForCreateDeploymentInput) o;
    return Objects.equals(this.cfs, configForCreateDeploymentInput.cfs) &&
        Objects.equals(this.nas, configForCreateDeploymentInput.nas) &&
        Objects.equals(this.sfcs, configForCreateDeploymentInput.sfcs) &&
        Objects.equals(this.tos, configForCreateDeploymentInput.tos) &&
        Objects.equals(this.vepfs, configForCreateDeploymentInput.vepfs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfs, nas, sfcs, tos, vepfs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigForCreateDeploymentInput {\n");
    
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
