package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ListProjectResourcesRequest
 */
public class ListProjectResourcesRequest {

    @SerializedName("Sort")
    private Integer sort = null;

    @SerializedName("Limit")
    private Integer limit = null;

    @SerializedName("Offset")
    private Integer offset = null;

    @SerializedName("WithSubProjectResource")
    private Integer withSubProjectResource = null;

    @SerializedName("Query")
    private String query = null;

    @SerializedName("ResourceType")
    private String resourceType = null;

    @SerializedName("ServiceName")
    private String serviceName = null;

    @SerializedName("ResourceRegion")
    private String resourceRegion = null;

    @SerializedName("OrderBy")
    private String orderBy = null;

    @SerializedName("ProjectName")
    private String projectName = null;


    public ListProjectResourcesRequest sort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get sort
     *
     * @return sort
     */
    @Schema(description = "")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public ListProjectResourcesRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     *
     * @return limit
     */
    @Schema(description = "")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectResourcesRequest offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     *
     * @return offset
     */
    @Schema(description = "")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectResourcesRequest withSubProjectResource(Integer withSubProjectResource) {
        this.withSubProjectResource = withSubProjectResource;
        return this;
    }

    /**
     * Get withSubProjectResource
     *
     * @return withSubProjectResource
     */
    @Schema(description = "")
    public Integer getWithSubProjectResource() {
        return withSubProjectResource;
    }

    public void setWithSubProjectResource(Integer withSubProjectResource) {
        this.withSubProjectResource = withSubProjectResource;
    }

    public ListProjectResourcesRequest query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get query
     *
     * @return query
     */
    @Schema(description = "")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ListProjectResourcesRequest resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @Schema(description = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListProjectResourcesRequest serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get serviceName
     *
     * @return serviceName
     */
    @Schema(description = "")
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ListProjectResourcesRequest resourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
        return this;
    }

    /**
     * Get resourceRegion
     *
     * @return resourceRegion
     */
    @Schema(description = "")
    public String getResourceRegion() {
        return resourceRegion;
    }

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    public ListProjectResourcesRequest orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get orderBy
     *
     * @return orderBy
     */
    @Schema(description = "")
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListProjectResourcesRequest projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get projectName
     *
     * @return projectName
     */
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
        ListProjectResourcesRequest listProjectResourcesRequest = (ListProjectResourcesRequest) o;
        return Objects.equals(this.sort, listProjectResourcesRequest.sort) &&
                Objects.equals(this.limit, listProjectResourcesRequest.limit) &&
                Objects.equals(this.offset, listProjectResourcesRequest.offset) &&
                Objects.equals(this.withSubProjectResource, listProjectResourcesRequest.withSubProjectResource) &&
                Objects.equals(this.query, listProjectResourcesRequest.query) &&
                Objects.equals(this.resourceType, listProjectResourcesRequest.resourceType) &&
                Objects.equals(this.serviceName, listProjectResourcesRequest.serviceName) &&
                Objects.equals(this.resourceRegion, listProjectResourcesRequest.resourceRegion) &&
                Objects.equals(this.orderBy, listProjectResourcesRequest.orderBy) &&
                Objects.equals(this.projectName, listProjectResourcesRequest.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sort, limit, offset, withSubProjectResource, query, resourceType, serviceName, resourceRegion, orderBy, projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectResourcesRequest {\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    withSubProjectResource: ").append(toIndentedString(withSubProjectResource)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    resourceRegion: ").append(toIndentedString(resourceRegion)).append("\n");
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
