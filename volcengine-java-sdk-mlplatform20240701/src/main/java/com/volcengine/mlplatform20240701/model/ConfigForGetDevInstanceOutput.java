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
import com.volcengine.mlplatform20240701.model.CfsForGetDevInstanceOutput;
import com.volcengine.mlplatform20240701.model.NasForGetDevInstanceOutput;
import com.volcengine.mlplatform20240701.model.SfcsForGetDevInstanceOutput;
import com.volcengine.mlplatform20240701.model.TosForGetDevInstanceOutput;
import com.volcengine.mlplatform20240701.model.VepfsForGetDevInstanceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfigForGetDevInstanceOutput
 */



public class ConfigForGetDevInstanceOutput {
  @SerializedName("Cfs")
  private CfsForGetDevInstanceOutput cfs = null;

  @SerializedName("Nas")
  private NasForGetDevInstanceOutput nas = null;

  @SerializedName("Sfcs")
  private SfcsForGetDevInstanceOutput sfcs = null;

  @SerializedName("Tos")
  private TosForGetDevInstanceOutput tos = null;

  @SerializedName("Vepfs")
  private VepfsForGetDevInstanceOutput vepfs = null;

  public ConfigForGetDevInstanceOutput cfs(CfsForGetDevInstanceOutput cfs) {
    this.cfs = cfs;
    return this;
  }

   /**
   * Get cfs
   * @return cfs
  **/
  @Valid
  @Schema(description = "")
  public CfsForGetDevInstanceOutput getCfs() {
    return cfs;
  }

  public void setCfs(CfsForGetDevInstanceOutput cfs) {
    this.cfs = cfs;
  }

  public ConfigForGetDevInstanceOutput nas(NasForGetDevInstanceOutput nas) {
    this.nas = nas;
    return this;
  }

   /**
   * Get nas
   * @return nas
  **/
  @Valid
  @Schema(description = "")
  public NasForGetDevInstanceOutput getNas() {
    return nas;
  }

  public void setNas(NasForGetDevInstanceOutput nas) {
    this.nas = nas;
  }

  public ConfigForGetDevInstanceOutput sfcs(SfcsForGetDevInstanceOutput sfcs) {
    this.sfcs = sfcs;
    return this;
  }

   /**
   * Get sfcs
   * @return sfcs
  **/
  @Valid
  @Schema(description = "")
  public SfcsForGetDevInstanceOutput getSfcs() {
    return sfcs;
  }

  public void setSfcs(SfcsForGetDevInstanceOutput sfcs) {
    this.sfcs = sfcs;
  }

  public ConfigForGetDevInstanceOutput tos(TosForGetDevInstanceOutput tos) {
    this.tos = tos;
    return this;
  }

   /**
   * Get tos
   * @return tos
  **/
  @Valid
  @Schema(description = "")
  public TosForGetDevInstanceOutput getTos() {
    return tos;
  }

  public void setTos(TosForGetDevInstanceOutput tos) {
    this.tos = tos;
  }

  public ConfigForGetDevInstanceOutput vepfs(VepfsForGetDevInstanceOutput vepfs) {
    this.vepfs = vepfs;
    return this;
  }

   /**
   * Get vepfs
   * @return vepfs
  **/
  @Valid
  @Schema(description = "")
  public VepfsForGetDevInstanceOutput getVepfs() {
    return vepfs;
  }

  public void setVepfs(VepfsForGetDevInstanceOutput vepfs) {
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
    ConfigForGetDevInstanceOutput configForGetDevInstanceOutput = (ConfigForGetDevInstanceOutput) o;
    return Objects.equals(this.cfs, configForGetDevInstanceOutput.cfs) &&
        Objects.equals(this.nas, configForGetDevInstanceOutput.nas) &&
        Objects.equals(this.sfcs, configForGetDevInstanceOutput.sfcs) &&
        Objects.equals(this.tos, configForGetDevInstanceOutput.tos) &&
        Objects.equals(this.vepfs, configForGetDevInstanceOutput.vepfs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfs, nas, sfcs, tos, vepfs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigForGetDevInstanceOutput {\n");
    
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
