/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * GetOAuthProviderResponse
 */



public class GetOAuthProviderResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AuthorizeTemplate")
  private String authorizeTemplate = null;

  @SerializedName("AuthorizeURL")
  private String authorizeURL = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("ClientSecret")
  private String clientSecret = null;

  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IdentityMapType")
  private Integer identityMapType = null;

  @SerializedName("IdpIdentityKey")
  private String idpIdentityKey = null;

  @SerializedName("OAuthProviderName")
  private String oauthProviderName = null;

  @SerializedName("ProviderId")
  private String providerId = null;

  @SerializedName("SSOType")
  private Integer ssOType = null;

  @SerializedName("Scope")
  private String scope = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("TokenURL")
  private String tokenURL = null;

  @SerializedName("Trn")
  private String trn = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  @SerializedName("UserInfoURL")
  private String userInfoURL = null;

  public GetOAuthProviderResponse authorizeTemplate(String authorizeTemplate) {
    this.authorizeTemplate = authorizeTemplate;
    return this;
  }

   /**
   * Get authorizeTemplate
   * @return authorizeTemplate
  **/
  @Schema(description = "")
  public String getAuthorizeTemplate() {
    return authorizeTemplate;
  }

  public void setAuthorizeTemplate(String authorizeTemplate) {
    this.authorizeTemplate = authorizeTemplate;
  }

  public GetOAuthProviderResponse authorizeURL(String authorizeURL) {
    this.authorizeURL = authorizeURL;
    return this;
  }

   /**
   * Get authorizeURL
   * @return authorizeURL
  **/
  @Schema(description = "")
  public String getAuthorizeURL() {
    return authorizeURL;
  }

  public void setAuthorizeURL(String authorizeURL) {
    this.authorizeURL = authorizeURL;
  }

  public GetOAuthProviderResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public GetOAuthProviderResponse clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @Schema(description = "")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public GetOAuthProviderResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @Schema(description = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public GetOAuthProviderResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetOAuthProviderResponse identityMapType(Integer identityMapType) {
    this.identityMapType = identityMapType;
    return this;
  }

   /**
   * Get identityMapType
   * @return identityMapType
  **/
  @Schema(description = "")
  public Integer getIdentityMapType() {
    return identityMapType;
  }

  public void setIdentityMapType(Integer identityMapType) {
    this.identityMapType = identityMapType;
  }

  public GetOAuthProviderResponse idpIdentityKey(String idpIdentityKey) {
    this.idpIdentityKey = idpIdentityKey;
    return this;
  }

   /**
   * Get idpIdentityKey
   * @return idpIdentityKey
  **/
  @Schema(description = "")
  public String getIdpIdentityKey() {
    return idpIdentityKey;
  }

  public void setIdpIdentityKey(String idpIdentityKey) {
    this.idpIdentityKey = idpIdentityKey;
  }

  public GetOAuthProviderResponse oauthProviderName(String oauthProviderName) {
    this.oauthProviderName = oauthProviderName;
    return this;
  }

   /**
   * Get oauthProviderName
   * @return oauthProviderName
  **/
  @Schema(description = "")
  public String getOauthProviderName() {
    return oauthProviderName;
  }

  public void setOauthProviderName(String oauthProviderName) {
    this.oauthProviderName = oauthProviderName;
  }

  public GetOAuthProviderResponse providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @Schema(description = "")
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public GetOAuthProviderResponse ssOType(Integer ssOType) {
    this.ssOType = ssOType;
    return this;
  }

   /**
   * Get ssOType
   * @return ssOType
  **/
  @Schema(description = "")
  public Integer getSsOType() {
    return ssOType;
  }

  public void setSsOType(Integer ssOType) {
    this.ssOType = ssOType;
  }

  public GetOAuthProviderResponse scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public GetOAuthProviderResponse status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public GetOAuthProviderResponse tokenURL(String tokenURL) {
    this.tokenURL = tokenURL;
    return this;
  }

   /**
   * Get tokenURL
   * @return tokenURL
  **/
  @Schema(description = "")
  public String getTokenURL() {
    return tokenURL;
  }

  public void setTokenURL(String tokenURL) {
    this.tokenURL = tokenURL;
  }

  public GetOAuthProviderResponse trn(String trn) {
    this.trn = trn;
    return this;
  }

   /**
   * Get trn
   * @return trn
  **/
  @Schema(description = "")
  public String getTrn() {
    return trn;
  }

  public void setTrn(String trn) {
    this.trn = trn;
  }

  public GetOAuthProviderResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public GetOAuthProviderResponse userInfoURL(String userInfoURL) {
    this.userInfoURL = userInfoURL;
    return this;
  }

   /**
   * Get userInfoURL
   * @return userInfoURL
  **/
  @Schema(description = "")
  public String getUserInfoURL() {
    return userInfoURL;
  }

  public void setUserInfoURL(String userInfoURL) {
    this.userInfoURL = userInfoURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOAuthProviderResponse getOAuthProviderResponse = (GetOAuthProviderResponse) o;
    return Objects.equals(this.authorizeTemplate, getOAuthProviderResponse.authorizeTemplate) &&
        Objects.equals(this.authorizeURL, getOAuthProviderResponse.authorizeURL) &&
        Objects.equals(this.clientId, getOAuthProviderResponse.clientId) &&
        Objects.equals(this.clientSecret, getOAuthProviderResponse.clientSecret) &&
        Objects.equals(this.createDate, getOAuthProviderResponse.createDate) &&
        Objects.equals(this.description, getOAuthProviderResponse.description) &&
        Objects.equals(this.identityMapType, getOAuthProviderResponse.identityMapType) &&
        Objects.equals(this.idpIdentityKey, getOAuthProviderResponse.idpIdentityKey) &&
        Objects.equals(this.oauthProviderName, getOAuthProviderResponse.oauthProviderName) &&
        Objects.equals(this.providerId, getOAuthProviderResponse.providerId) &&
        Objects.equals(this.ssOType, getOAuthProviderResponse.ssOType) &&
        Objects.equals(this.scope, getOAuthProviderResponse.scope) &&
        Objects.equals(this.status, getOAuthProviderResponse.status) &&
        Objects.equals(this.tokenURL, getOAuthProviderResponse.tokenURL) &&
        Objects.equals(this.trn, getOAuthProviderResponse.trn) &&
        Objects.equals(this.updateDate, getOAuthProviderResponse.updateDate) &&
        Objects.equals(this.userInfoURL, getOAuthProviderResponse.userInfoURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizeTemplate, authorizeURL, clientId, clientSecret, createDate, description, identityMapType, idpIdentityKey, oauthProviderName, providerId, ssOType, scope, status, tokenURL, trn, updateDate, userInfoURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOAuthProviderResponse {\n");
    
    sb.append("    authorizeTemplate: ").append(toIndentedString(authorizeTemplate)).append("\n");
    sb.append("    authorizeURL: ").append(toIndentedString(authorizeURL)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    identityMapType: ").append(toIndentedString(identityMapType)).append("\n");
    sb.append("    idpIdentityKey: ").append(toIndentedString(idpIdentityKey)).append("\n");
    sb.append("    oauthProviderName: ").append(toIndentedString(oauthProviderName)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    ssOType: ").append(toIndentedString(ssOType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tokenURL: ").append(toIndentedString(tokenURL)).append("\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    userInfoURL: ").append(toIndentedString(userInfoURL)).append("\n");
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
