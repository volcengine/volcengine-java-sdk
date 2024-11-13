/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.fwcenter.model.AssetListForUpdateAssetSwitchInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateAssetSwitchRequest
 */



public class UpdateAssetSwitchRequest {
  @SerializedName("AssetList")
  private List<AssetListForUpdateAssetSwitchInput> assetList = null;

  @SerializedName("Enable")
  private Integer enable = null;

  public UpdateAssetSwitchRequest assetList(List<AssetListForUpdateAssetSwitchInput> assetList) {
    this.assetList = assetList;
    return this;
  }

  public UpdateAssetSwitchRequest addAssetListItem(AssetListForUpdateAssetSwitchInput assetListItem) {
    if (this.assetList == null) {
      this.assetList = new ArrayList<AssetListForUpdateAssetSwitchInput>();
    }
    this.assetList.add(assetListItem);
    return this;
  }

   /**
   * Get assetList
   * @return assetList
  **/
  @Valid
  @Schema(description = "")
  public List<AssetListForUpdateAssetSwitchInput> getAssetList() {
    return assetList;
  }

  public void setAssetList(List<AssetListForUpdateAssetSwitchInput> assetList) {
    this.assetList = assetList;
  }

  public UpdateAssetSwitchRequest enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAssetSwitchRequest updateAssetSwitchRequest = (UpdateAssetSwitchRequest) o;
    return Objects.equals(this.assetList, updateAssetSwitchRequest.assetList) &&
        Objects.equals(this.enable, updateAssetSwitchRequest.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetList, enable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetSwitchRequest {\n");
    
    sb.append("    assetList: ").append(toIndentedString(assetList)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
