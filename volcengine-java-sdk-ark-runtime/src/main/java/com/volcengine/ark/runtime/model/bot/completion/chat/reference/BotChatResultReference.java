package com.volcengine.ark.runtime.model.bot.completion.chat.reference;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BotChatResultReference {

    /**
     * Search: Url
     */
    private String url;

    /**
     * Search: Logo Url
     */
    @JsonProperty("logo_url")
    private String logoUrl;

    /**
     * Search: Mobile Url
     */
    @JsonProperty("mobile_url")
    private String mobileUrl;

    /**
     * Search: Site Name
     */
    @JsonProperty("site_name")
    private String siteName;

    /**
     * Search: Title
     */
    private String title;

    /**
     * Search: CoverImage
     */
    @JsonProperty("cover_image")
    private BotCoverImage coverImage;

    /**
     * Search: Summary
     */
    private String summary;

    /**
     * Search: Publish Time
     */
    @JsonProperty("publish_time")
    private String publishTime;

    /**
     * KnowledgeBase: Collection Name
     */
    @JsonProperty("collection_name")
    private String collectionName;

    /**
     * KnowledgeBase: Project Name
     */
    private String project;

    /**
     * KnowledgeBase: Doc Id
     */
    @JsonProperty("doc_id")
    private String docId;

    /**
     * KnowledgeBase: Doc Name
     */
    @JsonProperty("doc_name")
    private String docName;

    /**
     * KnowledgeBase: Doc Type
     */
    @JsonProperty("doc_type")
    private String docType;

    /**
     * KnowledgeBase: Doc Title
     */
    @JsonProperty("doc_title")
    private String docTitle;

    /**
     * KnowledgeBase: Chunk Id
     */
    @JsonProperty("chunk_id")
    private String chunkId;

    /**
     * KnowledgeBase: Chunk Title
     */
    @JsonProperty("chunk_title")
    private String chunkTitle;

    /**
     * Page Nums
     * <p>
     *
     *
     */
    @JsonProperty("page_nums")
    private String pageNums;
    /**
     * Origin Text Token Len
     * <p>
     *
     *
     */
    @JsonProperty("origin_text_token_len")
    private Integer originTextTokenLen;
    /**
     * File Name
     * <p>
     *
     *
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Extra
     */
    @JsonProperty("extra")
    private Map<String, Object> extra;
}
