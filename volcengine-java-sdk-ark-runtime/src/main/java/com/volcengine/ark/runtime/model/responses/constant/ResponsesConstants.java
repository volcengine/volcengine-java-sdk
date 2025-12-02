package com.volcengine.ark.runtime.model.responses.constant;

/**
 * Constants for the Responses API.
 */
public class ResponsesConstants {

    // ResponseImageProcessType.Enum
    public static final String IMAGE_PROCESS_TYPE_POINT = "point";
    public static final String IMAGE_PROCESS_TYPE_GROUNDING = "grounding";
    public static final String IMAGE_PROCESS_TYPE_ROTATE = "rotate";
    public static final String IMAGE_PROCESS_TYPE_ZOOM = "zoom";

    // ItemType.Enum
    public static final String ITEM_TYPE_MESSAGE = "message";
    public static final String ITEM_TYPE_FUNCTION_CALL = "function_call";
    public static final String ITEM_TYPE_FUNCTION_CALL_OUTPUT = "function_call_output";
    public static final String ITEM_TYPE_REASONING = "reasoning";
    public static final String ITEM_TYPE_ITEM_REFERENCE = "item_reference";
    public static final String ITEM_TYPE_WEB_SEARCH_CALL = "web_search_call";
    public static final String ITEM_TYPE_IMAGE_PROCESS = "image_process";
    public static final String ITEM_TYPE_MCP_APPROVAL_REQUEST = "mcp_approval_request";
    public static final String ITEM_TYPE_MCP_APPROVAL_RESPONSE = "mcp_approval_response";
    public static final String ITEM_TYPE_MCP_LIST_TOOLS = "mcp_list_tools";
    public static final String ITEM_TYPE_MCP_CALL = "mcp_call";

    // MessageRole.Enum
    public static final String MESSAGE_ROLE_USER = "user";
    public static final String MESSAGE_ROLE_SYSTEM = "system";
    public static final String MESSAGE_ROLE_DEVELOPER = "developer";
    public static final String MESSAGE_ROLE_ASSISTANT = "assistant";

    // ContentItemImageDetail.Enum
    public static final String IMAGE_DETAIL_AUTO = "auto";
    public static final String IMAGE_DETAIL_HIGH = "high";
    public static final String IMAGE_DETAIL_LOW = "low";

    // ContentItemType.Enum
    public static final String CONTENT_ITEM_TYPE_INPUT_TEXT = "input_text";
    public static final String CONTENT_ITEM_TYPE_INPUT_IMAGE = "input_image";
    public static final String CONTENT_ITEM_TYPE_INPUT_VIDEO = "input_video";
    public static final String CONTENT_ITEM_TYPE_INPUT_FILE = "input_file";
    public static final String CONTENT_ITEM_TYPE_OUTPUT_TEXT = "output_text";
    public static final String CONTENT_ITEM_TYPE_SUMMARY_TEXT = "summary_text";

    // ItemStatus.Enum
    public static final String ITEM_STATUS_IN_PROGRESS = "in_progress";
    public static final String ITEM_STATUS_COMPLETED = "completed";
    public static final String ITEM_STATUS_INCOMPLETE = "incomplete";
    public static final String ITEM_STATUS_SEARCHING = "searching";
    public static final String ITEM_STATUS_FAILED = "failed";

    // ResponseStatus.Enum
    public static final String RESPONSE_STATUS_IN_PROGRESS = "in_progress";
    public static final String RESPONSE_STATUS_COMPLETED = "completed";
    public static final String RESPONSE_STATUS_INCOMPLETE = "incomplete";
    public static final String RESPONSE_STATUS_FAILED = "failed";

    // ThinkingType.Enum
    public static final String THINKING_TYPE_AUTO = "auto";
    public static final String THINKING_TYPE_DISABLED = "disabled";
    public static final String THINKING_TYPE_ENABLED = "enabled";

    // TextType.Enum
    public static final String TEXT_TYPE_TEXT = "text";
    public static final String TEXT_TYPE_JSON_OBJECT = "json_object";

    // ToolChoiceMode.Enum
    public static final String TOOL_CHOICE_MODE_AUTO = "auto";
    public static final String TOOL_CHOICE_MODE_NONE = "none";
    public static final String TOOL_CHOICE_MODE_REQUIRED = "required";

    // ToolType.Enum
    public static final String TOOL_TYPE_FUNCTION = "function";
    public static final String TOOL_TYPE_WEB_SEARCH = "web_search";
    public static final String TOOL_TYPE_IMAGE_PROCESS = "image_process";
    public static final String TOOL_TYPE_MCP = "mcp";
    public static final String TOOL_TYPE_DOUBAO_APP = "doubao_app";

    // UserLocationType.Enum
    public static final String USER_LOCATION_TYPE_APPROXIMATE = "approximate";

    // ObjectType.Enum
    public static final String OBJECT_TYPE_RESPONSE = "response";
    public static final String OBJECT_TYPE_LIST = "list";

    // Response lifecycle events
    public static final String EVENT_TYPE_RESPONSE_CREATED = "response.created";
    public static final String EVENT_TYPE_RESPONSE_IN_PROGRESS = "response.in_progress";
    public static final String EVENT_TYPE_RESPONSE_COMPLETED = "response.completed";
    public static final String EVENT_TYPE_RESPONSE_FAILED = "response.failed";
    public static final String EVENT_TYPE_RESPONSE_INCOMPLETE = "response.incomplete";

    // Output item events
    public static final String EVENT_TYPE_RESPONSE_OUTPUT_ITEM_ADDED = "response.output_item.added";
    public static final String EVENT_TYPE_RESPONSE_OUTPUT_ITEM_DONE = "response.output_item.done";

    // Content part events
    public static final String EVENT_TYPE_RESPONSE_CONTENT_PART_ADDED = "response.content_part.added";
    public static final String EVENT_TYPE_RESPONSE_CONTENT_PART_DONE = "response.content_part.done";

    // Output text events
    public static final String EVENT_TYPE_RESPONSE_OUTPUT_TEXT_DELTA = "response.output_text.delta";
    public static final String EVENT_TYPE_RESPONSE_OUTPUT_TEXT_DONE = "response.output_text.done";
    public static final String EVENT_TYPE_RESPONSE_OUTPUT_TEXT_ANNOTATION_ADDED = "response.output_text.annotation.added";

    // Reasoning summary events
    public static final String EVENT_TYPE_RESPONSE_REASONING_SUMMARY_TEXT_DELTA = "response.reasoning_summary_text.delta";
    public static final String EVENT_TYPE_RESPONSE_REASONING_SUMMARY_TEXT_DONE = "response.reasoning_summary_text.done";
    public static final String EVENT_TYPE_RESPONSE_REASONING_SUMMARY_PART_ADDED = "response.reasoning_summary_part.added";
    public static final String EVENT_TYPE_RESPONSE_REASONING_SUMMARY_PART_DONE = "response.reasoning_summary_part.done";

    // Function call events
    public static final String EVENT_TYPE_RESPONSE_FUNCTION_CALL_ARGUMENTS_DELTA = "response.function_call_arguments.delta";
    public static final String EVENT_TYPE_RESPONSE_FUNCTION_CALL_ARGUMENTS_DONE = "response.function_call_arguments.done";

    // Error events
    public static final String EVENT_TYPE_ERROR = "error";

    // Web search events
    public static final String EVENT_TYPE_RESPONSE_WEB_SEARCH_CALL_IN_PROGRESS = "response.web_search_call.in_progress";
    public static final String EVENT_TYPE_RESPONSE_WEB_SEARCH_CALL_SEARCHING = "response.web_search_call.searching";
    public static final String EVENT_TYPE_RESPONSE_WEB_SEARCH_CALL_COMPLETED = "response.web_search_call.completed";

    // Image process events
    public static final String EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_IN_PROGRESS = "response.image_process_call.in_progress";
    public static final String EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_PROGRESSING = "response.image_process_call.progressing";
    public static final String EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_COMPLETED = "response.image_process_call.completed";
    public static final String EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_FAILED = "response.image_process_call.failed";

    // MCP events
    public static final String EVENT_TYPE_RESPONSE_MCP_LIST_TOOLS_IN_PROGRESS = "response.mcp_list_tools.in_progress";
    public static final String EVENT_TYPE_RESPONSE_MCP_LIST_TOOLS_COMPLETED = "response.mcp_list_tools.completed";
    public static final String EVENT_TYPE_RESPONSE_MCP_CALL_IN_PROGRESS = "response.mcp_call.in_progress";
    public static final String EVENT_TYPE_RESPONSE_MCP_CALL_ARGUMENTS_DELTA = "response.mcp_call_arguments.delta";
    public static final String EVENT_TYPE_RESPONSE_MCP_CALL_ARGUMENTS_DONE = "response.mcp_call_arguments.done";
    public static final String EVENT_TYPE_RESPONSE_MCP_CALL_COMPLETED = "response.mcp_call.completed";
    public static final String EVENT_TYPE_RESPONSE_MCP_CALL_FAILED = "response.mcp_call.failed";

    // Doubao app events
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_IN_PROGRESS = "response.doubao_app_call.in_progress";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_COMPLETED = "response.doubao_app_call.completed";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_FAILED = "response.doubao_app_call.failed";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_OUTPUT_TEXT_DELTA = "response.doubao_app_call.output_text.delta";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_OUTPUT_TEXT_DONE = "response.doubao_app_call.output_text.done";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_SEARCH_IN_PROGRESS = "response.doubao_app_call.search.in_progress";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_SEARCH_SEARCHING = "response.doubao_app_call.search.searching";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_SEARCH_COMPLETED = "response.doubao_app_call.search.completed";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_REASONING_TEXT_DELTA = "response.doubao_app_call.reasoning_text.delta";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_REASONING_TEXT_DONE = "response.doubao_app_call.reasoning_text.done";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_REASONING_SEARCH_IN_PROGRESS = "response.doubao_app_call.reasoning_search.in_progress";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_REASONING_SEARCH_SEARCHING = "response.doubao_app_call.reasoning_search.searching";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_REASONING_SEARCH_COMPLETED = "response.doubao_app_call.reasoning_search.completed";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_BLOCK_ADDED = "response.doubao_app_call.block.added";
    public static final String EVENT_TYPE_RESPONSE_DOBAO_APP_CALL_BLOCK_DONE = "response.doubao_app_call.block.done";

    // IncludeType.Enum
    public static final String INCLUDE_TYPE_IMAGE_URL = "message.input_image.image_url";

    // CacheType.Enum
    public static final String CACHE_TYPE_DISABLED = "disabled";
    public static final String CACHE_TYPE_ENABLED = "enabled";

    // MCP Enum
    public static final String MCP_APPROVAL_MODE_ALWAYS = "always";
    public static final String MCP_APPROVAL_MODE_NEVER = "never";

    // DoubaoAppBlockType.Enum
    public static final String DOBAO_APP_BLOCK_TYPE_OUTPUT_TEXT = "output_text";
    public static final String DOBAO_APP_BLOCK_TYPE_REASONING_TEXT = "reasoning_text";
    public static final String DOBAO_APP_BLOCK_TYPE_SEARCH = "search";
    public static final String DOBAO_APP_BLOCK_TYPE_REASONING_SEARCH = "reasoning_search";

    // ResponseDoubaoAppFeatureType.Enum
    public static final String RESPONSE_DOBAO_APP_FEATURE_TYPE_UNSPECIFIED = "unspecified";
    public static final String RESPONSE_DOBAO_APP_FEATURE_TYPE_ENABLED = "enabled";
    public static final String RESPONSE_DOBAO_APP_FEATURE_TYPE_DISABLED = "disabled";

    private ResponsesConstants() {
        // Prevent instantiation
    }
}