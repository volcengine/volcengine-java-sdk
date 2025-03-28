/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

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
 * DatabaseForDescribeDatabasesOutput
 */



public class DatabaseForDescribeDatabasesOutput {
  @SerializedName("CType")
  private String ctype = null;

  @SerializedName("CharacterSetName")
  private String characterSetName = null;

  @SerializedName("Collate")
  private String collate = null;

  @SerializedName("DBName")
  private String dbName = null;

  @SerializedName("DBStatus")
  private String dbStatus = null;

  @SerializedName("Owner")
  private String owner = null;

  public DatabaseForDescribeDatabasesOutput ctype(String ctype) {
    this.ctype = ctype;
    return this;
  }

   /**
   * Get ctype
   * @return ctype
  **/
  @Schema(description = "")
  public String getCtype() {
    return ctype;
  }

  public void setCtype(String ctype) {
    this.ctype = ctype;
  }

  public DatabaseForDescribeDatabasesOutput characterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
    return this;
  }

   /**
   * Get characterSetName
   * @return characterSetName
  **/
  @Schema(description = "")
  public String getCharacterSetName() {
    return characterSetName;
  }

  public void setCharacterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
  }

  public DatabaseForDescribeDatabasesOutput collate(String collate) {
    this.collate = collate;
    return this;
  }

   /**
   * Get collate
   * @return collate
  **/
  @Schema(description = "")
  public String getCollate() {
    return collate;
  }

  public void setCollate(String collate) {
    this.collate = collate;
  }

  public DatabaseForDescribeDatabasesOutput dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @Schema(description = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public DatabaseForDescribeDatabasesOutput dbStatus(String dbStatus) {
    this.dbStatus = dbStatus;
    return this;
  }

   /**
   * Get dbStatus
   * @return dbStatus
  **/
  @Schema(description = "")
  public String getDbStatus() {
    return dbStatus;
  }

  public void setDbStatus(String dbStatus) {
    this.dbStatus = dbStatus;
  }

  public DatabaseForDescribeDatabasesOutput owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseForDescribeDatabasesOutput databaseForDescribeDatabasesOutput = (DatabaseForDescribeDatabasesOutput) o;
    return Objects.equals(this.ctype, databaseForDescribeDatabasesOutput.ctype) &&
        Objects.equals(this.characterSetName, databaseForDescribeDatabasesOutput.characterSetName) &&
        Objects.equals(this.collate, databaseForDescribeDatabasesOutput.collate) &&
        Objects.equals(this.dbName, databaseForDescribeDatabasesOutput.dbName) &&
        Objects.equals(this.dbStatus, databaseForDescribeDatabasesOutput.dbStatus) &&
        Objects.equals(this.owner, databaseForDescribeDatabasesOutput.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ctype, characterSetName, collate, dbName, dbStatus, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseForDescribeDatabasesOutput {\n");
    
    sb.append("    ctype: ").append(toIndentedString(ctype)).append("\n");
    sb.append("    characterSetName: ").append(toIndentedString(characterSetName)).append("\n");
    sb.append("    collate: ").append(toIndentedString(collate)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    dbStatus: ").append(toIndentedString(dbStatus)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
