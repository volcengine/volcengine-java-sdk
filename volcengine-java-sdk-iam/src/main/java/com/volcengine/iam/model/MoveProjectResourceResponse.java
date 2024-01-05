package com.volcengine.iam.model;

import java.util.Objects;

/**
 * MoveProjectResourceResponse
 */
public class MoveProjectResourceResponse {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveProjectResourceResponse {\n");

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
