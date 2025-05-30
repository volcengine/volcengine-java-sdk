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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssetScanRequest
 */



public class AssetScanRequest {
  @SerializedName("AssetID")
  private String assetID = null;

  @SerializedName("AssetType")
  private String assetType = null;

  @SerializedName("ScanItems")
  private List<String> scanItems = null;

  public AssetScanRequest assetID(String assetID) {
    this.assetID = assetID;
    return this;
  }

   /**
   * Get assetID
   * @return assetID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAssetID() {
    return assetID;
  }

  public void setAssetID(String assetID) {
    this.assetID = assetID;
  }

  public AssetScanRequest assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public AssetScanRequest scanItems(List<String> scanItems) {
    this.scanItems = scanItems;
    return this;
  }

  public AssetScanRequest addScanItemsItem(String scanItemsItem) {
    if (this.scanItems == null) {
      this.scanItems = new ArrayList<String>();
    }
    this.scanItems.add(scanItemsItem);
    return this;
  }

   /**
   * Get scanItems
   * @return scanItems
  **/
  @Schema(description = "")
  public List<String> getScanItems() {
    return scanItems;
  }

  public void setScanItems(List<String> scanItems) {
    this.scanItems = scanItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetScanRequest assetScanRequest = (AssetScanRequest) o;
    return Objects.equals(this.assetID, assetScanRequest.assetID) &&
        Objects.equals(this.assetType, assetScanRequest.assetType) &&
        Objects.equals(this.scanItems, assetScanRequest.scanItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetID, assetType, scanItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetScanRequest {\n");
    
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    scanItems: ").append(toIndentedString(scanItems)).append("\n");
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
