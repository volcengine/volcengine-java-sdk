/*
 * acep
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.acep.model;

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
 * CancelBackupPodRequest
 */



public class CancelBackupPodRequest {
  @SerializedName("PodIdList")
  private List<String> podIdList = null;

  @SerializedName("ProductId")
  private String productId = null;

  public CancelBackupPodRequest podIdList(List<String> podIdList) {
    this.podIdList = podIdList;
    return this;
  }

  public CancelBackupPodRequest addPodIdListItem(String podIdListItem) {
    if (this.podIdList == null) {
      this.podIdList = new ArrayList<String>();
    }
    this.podIdList.add(podIdListItem);
    return this;
  }

   /**
   * Get podIdList
   * @return podIdList
  **/
  @Schema(description = "")
  public List<String> getPodIdList() {
    return podIdList;
  }

  public void setPodIdList(List<String> podIdList) {
    this.podIdList = podIdList;
  }

  public CancelBackupPodRequest productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelBackupPodRequest cancelBackupPodRequest = (CancelBackupPodRequest) o;
    return Objects.equals(this.podIdList, cancelBackupPodRequest.podIdList) &&
        Objects.equals(this.productId, cancelBackupPodRequest.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podIdList, productId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelBackupPodRequest {\n");
    
    sb.append("    podIdList: ").append(toIndentedString(podIdList)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
