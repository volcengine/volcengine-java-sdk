/*
 * sqs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.sqs.model;

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
 * CreateQueueResponse
 */



public class CreateQueueResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("QueueTrn")
  private String queueTrn = null;

  public CreateQueueResponse queueTrn(String queueTrn) {
    this.queueTrn = queueTrn;
    return this;
  }

   /**
   * Get queueTrn
   * @return queueTrn
  **/
  @Schema(description = "")
  public String getQueueTrn() {
    return queueTrn;
  }

  public void setQueueTrn(String queueTrn) {
    this.queueTrn = queueTrn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateQueueResponse createQueueResponse = (CreateQueueResponse) o;
    return Objects.equals(this.queueTrn, createQueueResponse.queueTrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueTrn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQueueResponse {\n");
    
    sb.append("    queueTrn: ").append(toIndentedString(queueTrn)).append("\n");
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
