/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * DataForListRiskVulnAffectRepoImageOutput
 */



public class DataForListRiskVulnAffectRepoImageOutput {
  @SerializedName("AssetID")
  private String assetID = null;

  @SerializedName("ImageID")
  private String imageID = null;

  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("RegistryID")
  private String registryID = null;

  @SerializedName("RegistryName")
  private String registryName = null;

  @SerializedName("Repo")
  private String repo = null;

  @SerializedName("Tag")
  private String tag = null;

  public DataForListRiskVulnAffectRepoImageOutput assetID(String assetID) {
    this.assetID = assetID;
    return this;
  }

   /**
   * Get assetID
   * @return assetID
  **/
  @Schema(description = "")
  public String getAssetID() {
    return assetID;
  }

  public void setAssetID(String assetID) {
    this.assetID = assetID;
  }

  public DataForListRiskVulnAffectRepoImageOutput imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

   /**
   * Get imageID
   * @return imageID
  **/
  @Schema(description = "")
  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }

  public DataForListRiskVulnAffectRepoImageOutput namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @Schema(description = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public DataForListRiskVulnAffectRepoImageOutput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public DataForListRiskVulnAffectRepoImageOutput registryID(String registryID) {
    this.registryID = registryID;
    return this;
  }

   /**
   * Get registryID
   * @return registryID
  **/
  @Schema(description = "")
  public String getRegistryID() {
    return registryID;
  }

  public void setRegistryID(String registryID) {
    this.registryID = registryID;
  }

  public DataForListRiskVulnAffectRepoImageOutput registryName(String registryName) {
    this.registryName = registryName;
    return this;
  }

   /**
   * Get registryName
   * @return registryName
  **/
  @Schema(description = "")
  public String getRegistryName() {
    return registryName;
  }

  public void setRegistryName(String registryName) {
    this.registryName = registryName;
  }

  public DataForListRiskVulnAffectRepoImageOutput repo(String repo) {
    this.repo = repo;
    return this;
  }

   /**
   * Get repo
   * @return repo
  **/
  @Schema(description = "")
  public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public DataForListRiskVulnAffectRepoImageOutput tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Schema(description = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListRiskVulnAffectRepoImageOutput dataForListRiskVulnAffectRepoImageOutput = (DataForListRiskVulnAffectRepoImageOutput) o;
    return Objects.equals(this.assetID, dataForListRiskVulnAffectRepoImageOutput.assetID) &&
        Objects.equals(this.imageID, dataForListRiskVulnAffectRepoImageOutput.imageID) &&
        Objects.equals(this.namespace, dataForListRiskVulnAffectRepoImageOutput.namespace) &&
        Objects.equals(this.region, dataForListRiskVulnAffectRepoImageOutput.region) &&
        Objects.equals(this.registryID, dataForListRiskVulnAffectRepoImageOutput.registryID) &&
        Objects.equals(this.registryName, dataForListRiskVulnAffectRepoImageOutput.registryName) &&
        Objects.equals(this.repo, dataForListRiskVulnAffectRepoImageOutput.repo) &&
        Objects.equals(this.tag, dataForListRiskVulnAffectRepoImageOutput.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetID, imageID, namespace, region, registryID, registryName, repo, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListRiskVulnAffectRepoImageOutput {\n");
    
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    registryID: ").append(toIndentedString(registryID)).append("\n");
    sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
