/*
 * volc_content_platform
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volccontentplatform.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volccontentplatform.model.UploadVOListForGetArticleBatchUploadDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetArticleBatchUploadDetailResponse
 */



public class GetArticleBatchUploadDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BatchId")
  private String batchId = null;

  @SerializedName("UploadVOList")
  private List<UploadVOListForGetArticleBatchUploadDetailOutput> uploadVOList = null;

  public GetArticleBatchUploadDetailResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @Schema(description = "")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public GetArticleBatchUploadDetailResponse uploadVOList(List<UploadVOListForGetArticleBatchUploadDetailOutput> uploadVOList) {
    this.uploadVOList = uploadVOList;
    return this;
  }

  public GetArticleBatchUploadDetailResponse addUploadVOListItem(UploadVOListForGetArticleBatchUploadDetailOutput uploadVOListItem) {
    if (this.uploadVOList == null) {
      this.uploadVOList = new ArrayList<UploadVOListForGetArticleBatchUploadDetailOutput>();
    }
    this.uploadVOList.add(uploadVOListItem);
    return this;
  }

   /**
   * Get uploadVOList
   * @return uploadVOList
  **/
  @Valid
  @Schema(description = "")
  public List<UploadVOListForGetArticleBatchUploadDetailOutput> getUploadVOList() {
    return uploadVOList;
  }

  public void setUploadVOList(List<UploadVOListForGetArticleBatchUploadDetailOutput> uploadVOList) {
    this.uploadVOList = uploadVOList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetArticleBatchUploadDetailResponse getArticleBatchUploadDetailResponse = (GetArticleBatchUploadDetailResponse) o;
    return Objects.equals(this.batchId, getArticleBatchUploadDetailResponse.batchId) &&
        Objects.equals(this.uploadVOList, getArticleBatchUploadDetailResponse.uploadVOList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, uploadVOList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetArticleBatchUploadDetailResponse {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    uploadVOList: ").append(toIndentedString(uploadVOList)).append("\n");
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
