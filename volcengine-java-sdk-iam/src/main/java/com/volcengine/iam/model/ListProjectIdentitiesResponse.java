package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ListProjectIdentitiesResponse
 */
public class ListProjectIdentitiesResponse {
    @SerializedName("Limit")
    private Integer limit = null;

    @SerializedName("Offset")
    private Integer offset = null;

    @SerializedName("Total")
    private Integer total = null;

    @SerializedName("ProjectUserGroups")
    private List<ProjectUserGroupsForListProjectIdentitiesOutput> projectUserGroups = null;

    @SerializedName("ProjectUsers")
    private List<ProjectUsersForListProjectIdentitiesOutput> projectUsers = null;

    @SerializedName("ProjectRoles")
    private List<ProjectRolesForListProjectIdentitiesOutput> projectRoles = null;


    public ListProjectIdentitiesResponse limit(Integer limit) {
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

    public ListProjectIdentitiesResponse offset(Integer offset) {
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

    public ListProjectIdentitiesResponse total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     */
    @Schema(description = "")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListProjectIdentitiesResponse projectUserGroups(List<ProjectUserGroupsForListProjectIdentitiesOutput> projectUserGroups) {
        this.projectUserGroups = projectUserGroups;
        return this;
    }

    public ListProjectIdentitiesResponse addProjectUserGroupsItem(ProjectUserGroupsForListProjectIdentitiesOutput projectUserGroupsItem) {
        if (this.projectUserGroups == null) {
            this.projectUserGroups = new ArrayList<ProjectUserGroupsForListProjectIdentitiesOutput>();
        }
        this.projectUserGroups.add(projectUserGroupsItem);
        return this;
    }

    /**
     * Get projectUserGroups
     *
     * @return projectUserGroups
     */
    @Schema(description = "")
    public List<ProjectUserGroupsForListProjectIdentitiesOutput> getProjectUserGroups() {
        return projectUserGroups;
    }

    public void setProjectUserGroups(List<ProjectUserGroupsForListProjectIdentitiesOutput> projectUserGroups) {
        this.projectUserGroups = projectUserGroups;
    }

    public ListProjectIdentitiesResponse projectUsers(List<ProjectUsersForListProjectIdentitiesOutput> projectUsers) {
        this.projectUsers = projectUsers;
        return this;
    }

    public ListProjectIdentitiesResponse addProjectUsersItem(ProjectUsersForListProjectIdentitiesOutput projectUsersItem) {
        if (this.projectUsers == null) {
            this.projectUsers = new ArrayList<ProjectUsersForListProjectIdentitiesOutput>();
        }
        this.projectUsers.add(projectUsersItem);
        return this;
    }

    /**
     * Get projectUsers
     *
     * @return projectUsers
     */
    @Schema(description = "")
    public List<ProjectUsersForListProjectIdentitiesOutput> getProjectUsers() {
        return projectUsers;
    }

    public void setProjectUsers(List<ProjectUsersForListProjectIdentitiesOutput> projectUsers) {
        this.projectUsers = projectUsers;
    }

    public ListProjectIdentitiesResponse projectRoles(List<ProjectRolesForListProjectIdentitiesOutput> projectRoles) {
        this.projectRoles = projectRoles;
        return this;
    }

    public ListProjectIdentitiesResponse addProjectRolesItem(ProjectRolesForListProjectIdentitiesOutput projectRolesItem) {
        if (this.projectRoles == null) {
            this.projectRoles = new ArrayList<ProjectRolesForListProjectIdentitiesOutput>();
        }
        this.projectRoles.add(projectRolesItem);
        return this;
    }

    /**
     * Get projectRoles
     *
     * @return projectRoles
     */
    @Schema(description = "")
    public List<ProjectRolesForListProjectIdentitiesOutput> getProjectRoles() {
        return projectRoles;
    }

    public void setProjectRoles(List<ProjectRolesForListProjectIdentitiesOutput> projectRoles) {
        this.projectRoles = projectRoles;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectIdentitiesResponse listProjectIdentitiesResponse = (ListProjectIdentitiesResponse) o;
        return Objects.equals(this.limit, listProjectIdentitiesResponse.limit) &&
                Objects.equals(this.offset, listProjectIdentitiesResponse.offset) &&
                Objects.equals(this.total, listProjectIdentitiesResponse.total) &&
                Objects.equals(this.projectUserGroups, listProjectIdentitiesResponse.projectUserGroups) &&
                Objects.equals(this.projectUsers, listProjectIdentitiesResponse.projectUsers) &&
                Objects.equals(this.projectRoles, listProjectIdentitiesResponse.projectRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, total, projectUserGroups, projectUsers, projectRoles);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectIdentitiesResponse {\n");

        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    projectUserGroups: ").append(toIndentedString(projectUserGroups)).append("\n");
        sb.append("    projectUsers: ").append(toIndentedString(projectUsers)).append("\n");
        sb.append("    projectRoles: ").append(toIndentedString(projectRoles)).append("\n");
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
