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
import com.volcengine.cv20240606.model.ControlnetArgForImg2ImgXLSftInput;
import com.volcengine.cv20240606.model.LogoInfoForImg2ImgXLSftInput;
import com.volcengine.cv20240606.model.StyleReferenceArgsForImg2ImgXLSftInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Img2ImgXLSftRequest
 */



public class Img2ImgXLSftRequest {
  @SerializedName("binary_data_base64")
  private List<String> binaryDataBase64 = null;

  @SerializedName("controlnet_args")
  private List<ControlnetArgForImg2ImgXLSftInput> controlnetArgs = null;

  @SerializedName("ddim_step")
  private Integer ddimStep = null;

  @SerializedName("image_urls")
  private List<String> imageUrls = null;

  @SerializedName("logo_info")
  private LogoInfoForImg2ImgXLSftInput logoInfo = null;

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

  @SerializedName("style_reference_args")
  private StyleReferenceArgsForImg2ImgXLSftInput styleReferenceArgs = null;

  public Img2ImgXLSftRequest binaryDataBase64(List<String> binaryDataBase64) {
    this.binaryDataBase64 = binaryDataBase64;
    return this;
  }

  public Img2ImgXLSftRequest addBinaryDataBase64Item(String binaryDataBase64Item) {
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

  public Img2ImgXLSftRequest controlnetArgs(List<ControlnetArgForImg2ImgXLSftInput> controlnetArgs) {
    this.controlnetArgs = controlnetArgs;
    return this;
  }

  public Img2ImgXLSftRequest addControlnetArgsItem(ControlnetArgForImg2ImgXLSftInput controlnetArgsItem) {
    if (this.controlnetArgs == null) {
      this.controlnetArgs = new ArrayList<ControlnetArgForImg2ImgXLSftInput>();
    }
    this.controlnetArgs.add(controlnetArgsItem);
    return this;
  }

   /**
   * Get controlnetArgs
   * @return controlnetArgs
  **/
  @Valid
  @Schema(description = "")
  public List<ControlnetArgForImg2ImgXLSftInput> getControlnetArgs() {
    return controlnetArgs;
  }

  public void setControlnetArgs(List<ControlnetArgForImg2ImgXLSftInput> controlnetArgs) {
    this.controlnetArgs = controlnetArgs;
  }

  public Img2ImgXLSftRequest ddimStep(Integer ddimStep) {
    this.ddimStep = ddimStep;
    return this;
  }

   /**
   * Get ddimStep
   * @return ddimStep
  **/
  @Schema(description = "")
  public Integer getDdimStep() {
    return ddimStep;
  }

  public void setDdimStep(Integer ddimStep) {
    this.ddimStep = ddimStep;
  }

  public Img2ImgXLSftRequest imageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public Img2ImgXLSftRequest addImageUrlsItem(String imageUrlsItem) {
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

  public Img2ImgXLSftRequest logoInfo(LogoInfoForImg2ImgXLSftInput logoInfo) {
    this.logoInfo = logoInfo;
    return this;
  }

   /**
   * Get logoInfo
   * @return logoInfo
  **/
  @Valid
  @Schema(description = "")
  public LogoInfoForImg2ImgXLSftInput getLogoInfo() {
    return logoInfo;
  }

  public void setLogoInfo(LogoInfoForImg2ImgXLSftInput logoInfo) {
    this.logoInfo = logoInfo;
  }

  public Img2ImgXLSftRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * Get prompt
   * @return prompt
  **/
  @Schema(description = "")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public Img2ImgXLSftRequest reqKey(String reqKey) {
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

  public Img2ImgXLSftRequest returnUrl(Boolean returnUrl) {
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

  public Img2ImgXLSftRequest scale(Float scale) {
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

  public Img2ImgXLSftRequest seed(Integer seed) {
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

  public Img2ImgXLSftRequest styleReferenceArgs(StyleReferenceArgsForImg2ImgXLSftInput styleReferenceArgs) {
    this.styleReferenceArgs = styleReferenceArgs;
    return this;
  }

   /**
   * Get styleReferenceArgs
   * @return styleReferenceArgs
  **/
  @Valid
  @Schema(description = "")
  public StyleReferenceArgsForImg2ImgXLSftInput getStyleReferenceArgs() {
    return styleReferenceArgs;
  }

  public void setStyleReferenceArgs(StyleReferenceArgsForImg2ImgXLSftInput styleReferenceArgs) {
    this.styleReferenceArgs = styleReferenceArgs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Img2ImgXLSftRequest img2ImgXLSftRequest = (Img2ImgXLSftRequest) o;
    return Objects.equals(this.binaryDataBase64, img2ImgXLSftRequest.binaryDataBase64) &&
        Objects.equals(this.controlnetArgs, img2ImgXLSftRequest.controlnetArgs) &&
        Objects.equals(this.ddimStep, img2ImgXLSftRequest.ddimStep) &&
        Objects.equals(this.imageUrls, img2ImgXLSftRequest.imageUrls) &&
        Objects.equals(this.logoInfo, img2ImgXLSftRequest.logoInfo) &&
        Objects.equals(this.prompt, img2ImgXLSftRequest.prompt) &&
        Objects.equals(this.reqKey, img2ImgXLSftRequest.reqKey) &&
        Objects.equals(this.returnUrl, img2ImgXLSftRequest.returnUrl) &&
        Objects.equals(this.scale, img2ImgXLSftRequest.scale) &&
        Objects.equals(this.seed, img2ImgXLSftRequest.seed) &&
        Objects.equals(this.styleReferenceArgs, img2ImgXLSftRequest.styleReferenceArgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryDataBase64, controlnetArgs, ddimStep, imageUrls, logoInfo, prompt, reqKey, returnUrl, scale, seed, styleReferenceArgs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Img2ImgXLSftRequest {\n");
    
    sb.append("    binaryDataBase64: ").append(toIndentedString(binaryDataBase64)).append("\n");
    sb.append("    controlnetArgs: ").append(toIndentedString(controlnetArgs)).append("\n");
    sb.append("    ddimStep: ").append(toIndentedString(ddimStep)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    logoInfo: ").append(toIndentedString(logoInfo)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    reqKey: ").append(toIndentedString(reqKey)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    styleReferenceArgs: ").append(toIndentedString(styleReferenceArgs)).append("\n");
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