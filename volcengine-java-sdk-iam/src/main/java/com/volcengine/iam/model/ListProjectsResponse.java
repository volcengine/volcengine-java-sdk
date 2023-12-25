package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ListProjectResponse
 */
public class ListProjectsResponse {


    @SerializedName("Limit")
    private Integer limit = null;

    @SerializedName("Offset")
    private Integer offset = null;

    @SerializedName("Total")
    private Integer total = null;

    @SerializedName("Projects")
    private List<ProjectForListProjectOutput> projects = null;


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

    public ListProjectsResponse limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get offset
     *
     * @return offset
     **/
    @Schema(description = "")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectsResponse offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     **/
    @Schema(description = "")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListProjectsResponse total(Integer total) {
        this.total = total;
        return this;
    }

    public ListProjectsResponse projects(List<ProjectForListProjectOutput> projects) {
        this.projects = projects;
        return this;
    }

    public ListProjectsResponse addProjects(ProjectForListProjectOutput projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<ProjectForListProjectOutput>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    /**
     * Get projects
     *
     * @return
     */
    @Valid
    @Schema(description = "")
    public List<ProjectForListProjectOutput> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectForListProjectOutput> projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectsResponse listProjectsResponse = (ListProjectsResponse) o;
        return Objects.equals(this.limit, listProjectsResponse.limit) &&
                Objects.equals(this.offset, listProjectsResponse.offset) &&
                Objects.equals(this.total, listProjectsResponse.total) &&
                Objects.equals(this.projects, listProjectsResponse.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, total, projects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectResponse {\n");

        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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
