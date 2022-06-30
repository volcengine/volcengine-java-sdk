/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.AccountDistributionForv1ListResourceStatisticsOutput;
import com.volcengine.ecs.model.FlavorDistributionForv1ListResourceStatisticsOutput;
import com.volcengine.ecs.model.ProjectDistributionForv1ListResourceStatisticsOutput;
import com.volcengine.ecs.model.ZoneDistributionForv1ListResourceStatisticsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DistributionForv1ListResourceStatisticsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class DistributionForv1ListResourceStatisticsOutput {
  @SerializedName("AccountDistribution")
  private List<AccountDistributionForv1ListResourceStatisticsOutput> accountDistribution = null;

  @SerializedName("FlavorDistribution")
  private List<FlavorDistributionForv1ListResourceStatisticsOutput> flavorDistribution = null;

  @SerializedName("ProjectDistribution")
  private List<ProjectDistributionForv1ListResourceStatisticsOutput> projectDistribution = null;

  @SerializedName("ZoneDistribution")
  private List<ZoneDistributionForv1ListResourceStatisticsOutput> zoneDistribution = null;

  public DistributionForv1ListResourceStatisticsOutput accountDistribution(List<AccountDistributionForv1ListResourceStatisticsOutput> accountDistribution) {
    this.accountDistribution = accountDistribution;
    return this;
  }

  public DistributionForv1ListResourceStatisticsOutput addAccountDistributionItem(AccountDistributionForv1ListResourceStatisticsOutput accountDistributionItem) {
    if (this.accountDistribution == null) {
      this.accountDistribution = new ArrayList<AccountDistributionForv1ListResourceStatisticsOutput>();
    }
    this.accountDistribution.add(accountDistributionItem);
    return this;
  }

   /**
   * Get accountDistribution
   * @return accountDistribution
  **/
  @Valid
  @Schema(description = "")
  public List<AccountDistributionForv1ListResourceStatisticsOutput> getAccountDistribution() {
    return accountDistribution;
  }

  public void setAccountDistribution(List<AccountDistributionForv1ListResourceStatisticsOutput> accountDistribution) {
    this.accountDistribution = accountDistribution;
  }

  public DistributionForv1ListResourceStatisticsOutput flavorDistribution(List<FlavorDistributionForv1ListResourceStatisticsOutput> flavorDistribution) {
    this.flavorDistribution = flavorDistribution;
    return this;
  }

  public DistributionForv1ListResourceStatisticsOutput addFlavorDistributionItem(FlavorDistributionForv1ListResourceStatisticsOutput flavorDistributionItem) {
    if (this.flavorDistribution == null) {
      this.flavorDistribution = new ArrayList<FlavorDistributionForv1ListResourceStatisticsOutput>();
    }
    this.flavorDistribution.add(flavorDistributionItem);
    return this;
  }

   /**
   * Get flavorDistribution
   * @return flavorDistribution
  **/
  @Valid
  @Schema(description = "")
  public List<FlavorDistributionForv1ListResourceStatisticsOutput> getFlavorDistribution() {
    return flavorDistribution;
  }

  public void setFlavorDistribution(List<FlavorDistributionForv1ListResourceStatisticsOutput> flavorDistribution) {
    this.flavorDistribution = flavorDistribution;
  }

  public DistributionForv1ListResourceStatisticsOutput projectDistribution(List<ProjectDistributionForv1ListResourceStatisticsOutput> projectDistribution) {
    this.projectDistribution = projectDistribution;
    return this;
  }

  public DistributionForv1ListResourceStatisticsOutput addProjectDistributionItem(ProjectDistributionForv1ListResourceStatisticsOutput projectDistributionItem) {
    if (this.projectDistribution == null) {
      this.projectDistribution = new ArrayList<ProjectDistributionForv1ListResourceStatisticsOutput>();
    }
    this.projectDistribution.add(projectDistributionItem);
    return this;
  }

   /**
   * Get projectDistribution
   * @return projectDistribution
  **/
  @Valid
  @Schema(description = "")
  public List<ProjectDistributionForv1ListResourceStatisticsOutput> getProjectDistribution() {
    return projectDistribution;
  }

  public void setProjectDistribution(List<ProjectDistributionForv1ListResourceStatisticsOutput> projectDistribution) {
    this.projectDistribution = projectDistribution;
  }

  public DistributionForv1ListResourceStatisticsOutput zoneDistribution(List<ZoneDistributionForv1ListResourceStatisticsOutput> zoneDistribution) {
    this.zoneDistribution = zoneDistribution;
    return this;
  }

  public DistributionForv1ListResourceStatisticsOutput addZoneDistributionItem(ZoneDistributionForv1ListResourceStatisticsOutput zoneDistributionItem) {
    if (this.zoneDistribution == null) {
      this.zoneDistribution = new ArrayList<ZoneDistributionForv1ListResourceStatisticsOutput>();
    }
    this.zoneDistribution.add(zoneDistributionItem);
    return this;
  }

   /**
   * Get zoneDistribution
   * @return zoneDistribution
  **/
  @Valid
  @Schema(description = "")
  public List<ZoneDistributionForv1ListResourceStatisticsOutput> getZoneDistribution() {
    return zoneDistribution;
  }

  public void setZoneDistribution(List<ZoneDistributionForv1ListResourceStatisticsOutput> zoneDistribution) {
    this.zoneDistribution = zoneDistribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionForv1ListResourceStatisticsOutput distributionForv1ListResourceStatisticsOutput = (DistributionForv1ListResourceStatisticsOutput) o;
    return Objects.equals(this.accountDistribution, distributionForv1ListResourceStatisticsOutput.accountDistribution) &&
        Objects.equals(this.flavorDistribution, distributionForv1ListResourceStatisticsOutput.flavorDistribution) &&
        Objects.equals(this.projectDistribution, distributionForv1ListResourceStatisticsOutput.projectDistribution) &&
        Objects.equals(this.zoneDistribution, distributionForv1ListResourceStatisticsOutput.zoneDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDistribution, flavorDistribution, projectDistribution, zoneDistribution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionForv1ListResourceStatisticsOutput {\n");
    
    sb.append("    accountDistribution: ").append(toIndentedString(accountDistribution)).append("\n");
    sb.append("    flavorDistribution: ").append(toIndentedString(flavorDistribution)).append("\n");
    sb.append("    projectDistribution: ").append(toIndentedString(projectDistribution)).append("\n");
    sb.append("    zoneDistribution: ").append(toIndentedString(zoneDistribution)).append("\n");
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