package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ListProjectRequest
 */
public class ListProjectsRequest {

    @SerializedName("Query")
    private String query = null;

    @SerializedName("WithParentProject")
    private Integer withParentProject = null;

    @SerializedName("Limit")
    private Integer limit = null;

    @SerializedName("Offset")
    private String offset = null;


    public ListProjectsRequest query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get query
     *
     * @return query
     **/
    @Schema(description = "")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ListProjectsRequest withParentProject(Integer withParentProject) {
        this.withParentProject = withParentProject;
        return this;
    }

    /**
     * Get withParentProject
     *
     * @return withParentProject
     **/
    @Schema(description = "")
    public Integer getWithParentProject() {
        return withParentProject;
    }

    public void setWithParentProject(Integer withParentProject) {
        this.withParentProject = withParentProject;
    }

    public ListProjectsRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     *
     * @return limit
     **/
    @Schema(description = "")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectsRequest offset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     *
     * @return offset
     **/
    @Schema(description = "")
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectsRequest listProjectsRequest = (ListProjectsRequest) o;
        return Objects.equals(this.query, listProjectsRequest.query) &&
                Objects.equals(this.withParentProject, listProjectsRequest.withParentProject) &&
                Objects.equals(this.limit, listProjectsRequest.limit) &&
                Objects.equals(this.offset, listProjectsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query, withParentProject, limit, offset);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectRequest {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    withParentProject: ").append(toIndentedString(withParentProject)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
