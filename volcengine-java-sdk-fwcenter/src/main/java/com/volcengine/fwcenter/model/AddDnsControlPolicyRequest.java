/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.fwcenter.model.SourceForAddDnsControlPolicyInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AddDnsControlPolicyRequest
 */



public class AddDnsControlPolicyRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Destination")
  private String destination = null;

  /**
   * Gets or Sets destinationType
   */
  @JsonAdapter(DestinationTypeEnum.Adapter.class)
  public enum DestinationTypeEnum {
    @SerializedName("group")
    GROUP("group"),
    @SerializedName("domain")
    DOMAIN("domain");

    private String value;

    DestinationTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DestinationTypeEnum fromValue(String input) {
      for (DestinationTypeEnum b : DestinationTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DestinationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DestinationTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DestinationTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DestinationType")
  private DestinationTypeEnum destinationType = null;

  @SerializedName("Source")
  private List<SourceForAddDnsControlPolicyInput> source = null;

  public AddDnsControlPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(max=100)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AddDnsControlPolicyRequest destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public AddDnsControlPolicyRequest destinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public DestinationTypeEnum getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
  }

  public AddDnsControlPolicyRequest source(List<SourceForAddDnsControlPolicyInput> source) {
    this.source = source;
    return this;
  }

  public AddDnsControlPolicyRequest addSourceItem(SourceForAddDnsControlPolicyInput sourceItem) {
    if (this.source == null) {
      this.source = new ArrayList<SourceForAddDnsControlPolicyInput>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Valid
  @Schema(description = "")
  public List<SourceForAddDnsControlPolicyInput> getSource() {
    return source;
  }

  public void setSource(List<SourceForAddDnsControlPolicyInput> source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDnsControlPolicyRequest addDnsControlPolicyRequest = (AddDnsControlPolicyRequest) o;
    return Objects.equals(this.description, addDnsControlPolicyRequest.description) &&
        Objects.equals(this.destination, addDnsControlPolicyRequest.destination) &&
        Objects.equals(this.destinationType, addDnsControlPolicyRequest.destinationType) &&
        Objects.equals(this.source, addDnsControlPolicyRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, destination, destinationType, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDnsControlPolicyRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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