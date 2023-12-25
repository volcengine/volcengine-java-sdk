package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ListProjectResourcesResponse
 */
public class ListProjectResourcesResponse {

    @SerializedName("Limit")
    private Integer limit = null;

    @SerializedName("Offset")
    private Integer offset = null;
    
    @SerializedName("ProjectResources")
    private List<ProjectResourcesForListProjectResourcesOutput> projectResources = null;

    @SerializedName("Total")
    private Integer total = null;


    public ListProjectResourcesResponse limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * @return limit
     **/
    @Schema(description = "")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectResourcesResponse offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     * @return offset
     **/
    @Schema(description = "")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectResourcesResponse projectResources(List<ProjectResourcesForListProjectResourcesOutput> projectResources) {
        this.projectResources= projectResources;
        return this;
    }

    public ListProjectResourcesResponse addProjectResourcesItem(ProjectResourcesForListProjectResourcesOutput projectResourcesItem) {
        if (this.projectResources== null) {
            this.projectResources= new ArrayList<ProjectResourcesForListProjectResourcesOutput>();
        }
        this.projectResources.add(projectResourcesItem);
        return this;
    }

    /**
     * Get projectResources
     * @return projectResources
     **/
    @Valid
    @Schema(description = "")
    public List<ProjectResourcesForListProjectResourcesOutput> getProjectResources() {
        return projectResources;
    }

    public void setProjectResources(List<ProjectResourcesForListProjectResourcesOutput> projectResources) {
        this.projectResources= projectResources;
    }

    public ListProjectResourcesResponse total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     **/
    @Schema(description = "")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectResourcesResponse listProjectResourcesResponse = (ListProjectResourcesResponse) o;
        return Objects.equals(this.limit, listProjectResourcesResponse.limit) &&
                Objects.equals(this.offset, listProjectResourcesResponse.offset) &&
                Objects.equals(this.projectResources, listProjectResourcesResponse.projectResources) &&
                Objects.equals(this.total, listProjectResourcesResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, projectResources, total);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectResourcesResponse {\n");

        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    projectResources: ").append(toIndentedString(projectResources)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
