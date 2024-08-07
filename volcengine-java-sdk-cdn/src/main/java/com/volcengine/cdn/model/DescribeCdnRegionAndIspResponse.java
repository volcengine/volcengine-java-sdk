/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.IspForDescribeCdnRegionAndIspOutput;
import com.volcengine.cdn.model.RegionForDescribeCdnRegionAndIspOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCdnRegionAndIspResponse
 */



public class DescribeCdnRegionAndIspResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Isps")
  private List<IspForDescribeCdnRegionAndIspOutput> isps = null;

  @SerializedName("Regions")
  private List<RegionForDescribeCdnRegionAndIspOutput> regions = null;

  public DescribeCdnRegionAndIspResponse isps(List<IspForDescribeCdnRegionAndIspOutput> isps) {
    this.isps = isps;
    return this;
  }

  public DescribeCdnRegionAndIspResponse addIspsItem(IspForDescribeCdnRegionAndIspOutput ispsItem) {
    if (this.isps == null) {
      this.isps = new ArrayList<IspForDescribeCdnRegionAndIspOutput>();
    }
    this.isps.add(ispsItem);
    return this;
  }

   /**
   * Get isps
   * @return isps
  **/
  @Valid
  @Schema(description = "")
  public List<IspForDescribeCdnRegionAndIspOutput> getIsps() {
    return isps;
  }

  public void setIsps(List<IspForDescribeCdnRegionAndIspOutput> isps) {
    this.isps = isps;
  }

  public DescribeCdnRegionAndIspResponse regions(List<RegionForDescribeCdnRegionAndIspOutput> regions) {
    this.regions = regions;
    return this;
  }

  public DescribeCdnRegionAndIspResponse addRegionsItem(RegionForDescribeCdnRegionAndIspOutput regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<RegionForDescribeCdnRegionAndIspOutput>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @Valid
  @Schema(description = "")
  public List<RegionForDescribeCdnRegionAndIspOutput> getRegions() {
    return regions;
  }

  public void setRegions(List<RegionForDescribeCdnRegionAndIspOutput> regions) {
    this.regions = regions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCdnRegionAndIspResponse describeCdnRegionAndIspResponse = (DescribeCdnRegionAndIspResponse) o;
    return Objects.equals(this.isps, describeCdnRegionAndIspResponse.isps) &&
        Objects.equals(this.regions, describeCdnRegionAndIspResponse.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isps, regions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCdnRegionAndIspResponse {\n");
    
    sb.append("    isps: ").append(toIndentedString(isps)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
