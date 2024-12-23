/*
 * cv20240606
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cv20240606.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cv20240606.model.LogoInfoForHighAesAnimeV13Input;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HighAesAnimeV13Request
 */



public class HighAesAnimeV13Request {
  @SerializedName("binary_data_base64")
  private List<String> binaryDataBase64 = null;

  @SerializedName("ddim_steps")
  private Integer ddimSteps = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("image_urls")
  private List<String> imageUrls = null;

  @SerializedName("logo_info")
  private LogoInfoForHighAesAnimeV13Input logoInfo = null;

  @SerializedName("model_version")
  private String modelVersion = null;

  @SerializedName("prompt")
  private String prompt = null;

  @SerializedName("req_key")
  private String reqKey = null;

  @SerializedName("return_url")
  private Boolean returnUrl = null;

  @SerializedName("scale")
  private Float scale = null;

  @SerializedName("seed")
  private Integer seed = null;

  @SerializedName("strength")
  private Float strength = null;

  @SerializedName("width")
  private Integer width = null;

  public HighAesAnimeV13Request binaryDataBase64(List<String> binaryDataBase64) {
    this.binaryDataBase64 = binaryDataBase64;
    return this;
  }

  public HighAesAnimeV13Request addBinaryDataBase64Item(String binaryDataBase64Item) {
    if (this.binaryDataBase64 == null) {
      this.binaryDataBase64 = new ArrayList<String>();
    }
    this.binaryDataBase64.add(binaryDataBase64Item);
    return this;
  }

   /**
   * Get binaryDataBase64
   * @return binaryDataBase64
  **/
  @Schema(description = "")
  public List<String> getBinaryDataBase64() {
    return binaryDataBase64;
  }

  public void setBinaryDataBase64(List<String> binaryDataBase64) {
    this.binaryDataBase64 = binaryDataBase64;
  }

  public HighAesAnimeV13Request ddimSteps(Integer ddimSteps) {
    this.ddimSteps = ddimSteps;
    return this;
  }

   /**
   * Get ddimSteps
   * @return ddimSteps
  **/
  @Schema(description = "")
  public Integer getDdimSteps() {
    return ddimSteps;
  }

  public void setDdimSteps(Integer ddimSteps) {
    this.ddimSteps = ddimSteps;
  }

  public HighAesAnimeV13Request height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public HighAesAnimeV13Request imageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public HighAesAnimeV13Request addImageUrlsItem(String imageUrlsItem) {
    if (this.imageUrls == null) {
      this.imageUrls = new ArrayList<String>();
    }
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

   /**
   * Get imageUrls
   * @return imageUrls
  **/
  @Schema(description = "")
  public List<String> getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }

  public HighAesAnimeV13Request logoInfo(LogoInfoForHighAesAnimeV13Input logoInfo) {
    this.logoInfo = logoInfo;
    return this;
  }

   /**
   * Get logoInfo
   * @return logoInfo
  **/
  @Valid
  @Schema(description = "")
  public LogoInfoForHighAesAnimeV13Input getLogoInfo() {
    return logoInfo;
  }

  public void setLogoInfo(LogoInfoForHighAesAnimeV13Input logoInfo) {
    this.logoInfo = logoInfo;
  }

  public HighAesAnimeV13Request modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

   /**
   * Get modelVersion
   * @return modelVersion
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getModelVersion() {
    return modelVersion;
  }

  public void setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
  }

  public HighAesAnimeV13Request prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * Get prompt
   * @return prompt
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public HighAesAnimeV13Request reqKey(String reqKey) {
    this.reqKey = reqKey;
    return this;
  }

   /**
   * Get reqKey
   * @return reqKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getReqKey() {
    return reqKey;
  }

  public void setReqKey(String reqKey) {
    this.reqKey = reqKey;
  }

  public HighAesAnimeV13Request returnUrl(Boolean returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Get returnUrl
   * @return returnUrl
  **/
  @Schema(description = "")
  public Boolean isReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(Boolean returnUrl) {
    this.returnUrl = returnUrl;
  }

  public HighAesAnimeV13Request scale(Float scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @Schema(description = "")
  public Float getScale() {
    return scale;
  }

  public void setScale(Float scale) {
    this.scale = scale;
  }

  public HighAesAnimeV13Request seed(Integer seed) {
    this.seed = seed;
    return this;
  }

   /**
   * Get seed
   * @return seed
  **/
  @Schema(description = "")
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  public HighAesAnimeV13Request strength(Float strength) {
    this.strength = strength;
    return this;
  }

   /**
   * Get strength
   * @return strength
  **/
  @Schema(description = "")
  public Float getStrength() {
    return strength;
  }

  public void setStrength(Float strength) {
    this.strength = strength;
  }

  public HighAesAnimeV13Request width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighAesAnimeV13Request highAesAnimeV13Request = (HighAesAnimeV13Request) o;
    return Objects.equals(this.binaryDataBase64, highAesAnimeV13Request.binaryDataBase64) &&
        Objects.equals(this.ddimSteps, highAesAnimeV13Request.ddimSteps) &&
        Objects.equals(this.height, highAesAnimeV13Request.height) &&
        Objects.equals(this.imageUrls, highAesAnimeV13Request.imageUrls) &&
        Objects.equals(this.logoInfo, highAesAnimeV13Request.logoInfo) &&
        Objects.equals(this.modelVersion, highAesAnimeV13Request.modelVersion) &&
        Objects.equals(this.prompt, highAesAnimeV13Request.prompt) &&
        Objects.equals(this.reqKey, highAesAnimeV13Request.reqKey) &&
        Objects.equals(this.returnUrl, highAesAnimeV13Request.returnUrl) &&
        Objects.equals(this.scale, highAesAnimeV13Request.scale) &&
        Objects.equals(this.seed, highAesAnimeV13Request.seed) &&
        Objects.equals(this.strength, highAesAnimeV13Request.strength) &&
        Objects.equals(this.width, highAesAnimeV13Request.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryDataBase64, ddimSteps, height, imageUrls, logoInfo, modelVersion, prompt, reqKey, returnUrl, scale, seed, strength, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighAesAnimeV13Request {\n");
    
    sb.append("    binaryDataBase64: ").append(toIndentedString(binaryDataBase64)).append("\n");
    sb.append("    ddimSteps: ").append(toIndentedString(ddimSteps)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    logoInfo: ").append(toIndentedString(logoInfo)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    reqKey: ").append(toIndentedString(reqKey)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
