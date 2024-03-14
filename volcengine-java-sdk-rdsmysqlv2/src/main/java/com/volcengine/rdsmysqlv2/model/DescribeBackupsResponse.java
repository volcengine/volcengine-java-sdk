/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.BackupForDescribeBackupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeBackupsResponse
 */


public class DescribeBackupsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Backups")
  private List<BackupForDescribeBackupsOutput> backups = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeBackupsResponse backups(List<BackupForDescribeBackupsOutput> backups) {
    this.backups = backups;
    return this;
  }

  public DescribeBackupsResponse addBackupsItem(BackupForDescribeBackupsOutput backupsItem) {
    if (this.backups == null) {
      this.backups = new ArrayList<BackupForDescribeBackupsOutput>();
    }
    this.backups.add(backupsItem);
    return this;
  }

   /**
   * Get backups
   * @return backups
  **/
  @Valid
  @Schema(description = "")
  public List<BackupForDescribeBackupsOutput> getBackups() {
    return backups;
  }

  public void setBackups(List<BackupForDescribeBackupsOutput> backups) {
    this.backups = backups;
  }

  public DescribeBackupsResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBackupsResponse describeBackupsResponse = (DescribeBackupsResponse) o;
    return Objects.equals(this.backups, describeBackupsResponse.backups) &&
        Objects.equals(this.total, describeBackupsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backups, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBackupsResponse {\n");
    
    sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
