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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BotCoverImage getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(BotCoverImage coverImage) {
        this.coverImage = coverImage;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle;
    }

    public String getChunkId() {
        return chunkId;
    }

    public void setChunkId(String chunkId) {
        this.chunkId = chunkId;
    }

    public String getChunkTitle() {
        return chunkTitle;
    }

    public void setChunkTitle(String chunkTitle) {
        this.chunkTitle = chunkTitle;
    }

    public String getPageNums() {
        return pageNums;
    }

    public void setPageNums(String pageNums) {
        this.pageNums = pageNums;
    }

    public Integer getOriginTextTokenLen() {
        return originTextTokenLen;
    }

    public void setOriginTextTokenLen(Integer originTextTokenLen) {
        this.originTextTokenLen = originTextTokenLen;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }
}
