package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ListProjectIdentitiesRequest
 */
public class ListProjectIdentitiesRequest {
    
    @SerializedName("Limit")
    private Integer limit = null;

    @SerializedName("Offset")
    private Integer offset = null;

    @SerializedName("IdentityType")
    private String identityType = null;

    @SerializedName("Query")
    private String query = null;

    @SerializedName("ProjectName")
    private String projectName = null;

    public ListProjectIdentitiesRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @Schema(description = "")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectIdentitiesRequest offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    @Schema(description = "")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectIdentitiesRequest identityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    @Schema(description = "")
    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public ListProjectIdentitiesRequest query(String query) {
        this.query = query;
        return this;
    }

    @Schema(description = "")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ListProjectIdentitiesRequest projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    @Schema(description = "")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectIdentitiesRequest listProjectIdentitiesRequest = (ListProjectIdentitiesRequest) o;
        return Objects.equals(this.limit, listProjectIdentitiesRequest.limit) &&
                Objects.equals(this.offset, listProjectIdentitiesRequest.offset) &&
                Objects.equals(this.query, listProjectIdentitiesRequest.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, query);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectIdentitiesRequest {\n");

        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
