/*
 * organization
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.organization.model;

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
 * RejectInvitationRequest
 */


public class RejectInvitationRequest {
  @SerializedName("InviteId")
  private String inviteId = null;

  @SerializedName("LinkId")
  private String linkId = null;

  @SerializedName("Reason")
  private String reason = null;

  public RejectInvitationRequest inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

   /**
   * Get inviteId
   * @return inviteId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public RejectInvitationRequest linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * Get linkId
   * @return linkId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public RejectInvitationRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectInvitationRequest rejectInvitationRequest = (RejectInvitationRequest) o;
    return Objects.equals(this.inviteId, rejectInvitationRequest.inviteId) &&
        Objects.equals(this.linkId, rejectInvitationRequest.linkId) &&
        Objects.equals(this.reason, rejectInvitationRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteId, linkId, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectInvitationRequest {\n");
    
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
