/*
 * This file is generated by jOOQ.
 */
package com.wuhainan.jooqblog.tables.records;


import com.wuhainan.jooqblog.tables.Article;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArticleRecord extends UpdatableRecordImpl<ArticleRecord> implements Record18<String, Timestamp, String, Integer, Timestamp, String, Timestamp, String, Integer, String, String, String, String, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = -1994597461;

    /**
     * Setter for <code>blog.article.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>blog.article.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>blog.article.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>blog.article.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>blog.article.creator_id</code>.
     */
    public void setCreatorId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>blog.article.creator_id</code>.
     */
    public String getCreatorId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blog.article.delete_status</code>.
     */
    public void setDeleteStatus(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>blog.article.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>blog.article.delete_time</code>.
     */
    public void setDeleteTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>blog.article.delete_time</code>.
     */
    public Timestamp getDeleteTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>blog.article.deleter_id</code>.
     */
    public void setDeleterId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>blog.article.deleter_id</code>.
     */
    public String getDeleterId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blog.article.last_edit_time</code>.
     */
    public void setLastEditTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>blog.article.last_edit_time</code>.
     */
    public Timestamp getLastEditTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>blog.article.last_editor_id</code>.
     */
    public void setLastEditorId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>blog.article.last_editor_id</code>.
     */
    public String getLastEditorId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blog.article.version</code>.
     */
    public void setVersion(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>blog.article.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>blog.article.category_id</code>.
     */
    public void setCategoryId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>blog.article.category_id</code>.
     */
    public String getCategoryId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blog.article.comment_id</code>.
     */
    public void setCommentId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>blog.article.comment_id</code>.
     */
    public String getCommentId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blog.article.content</code>.
     */
    public void setContent(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>blog.article.content</code>.
     */
    public String getContent() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blog.article.content_html</code>.
     */
    public void setContentHtml(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>blog.article.content_html</code>.
     */
    public String getContentHtml() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blog.article.summary</code>.
     */
    public void setSummary(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>blog.article.summary</code>.
     */
    public String getSummary() {
        return (String) get(13);
    }

    /**
     * Setter for <code>blog.article.tag_id</code>.
     */
    public void setTagId(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>blog.article.tag_id</code>.
     */
    public String getTagId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>blog.article.title</code>.
     */
    public void setTitle(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>blog.article.title</code>.
     */
    public String getTitle() {
        return (String) get(15);
    }

    /**
     * Setter for <code>blog.article.topping</code>.
     */
    public void setTopping(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>blog.article.topping</code>.
     */
    public Integer getTopping() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>blog.article.view_counts</code>.
     */
    public void setViewCounts(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>blog.article.view_counts</code>.
     */
    public Integer getViewCounts() {
        return (Integer) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, Timestamp, String, Integer, Timestamp, String, Timestamp, String, Integer, String, String, String, String, String, String, String, Integer, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, Timestamp, String, Integer, Timestamp, String, Timestamp, String, Integer, String, String, String, String, String, String, String, Integer, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Article.ARTICLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Article.ARTICLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Article.ARTICLE.CREATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Article.ARTICLE.DELETE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Article.ARTICLE.DELETE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Article.ARTICLE.DELETER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Article.ARTICLE.LAST_EDIT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Article.ARTICLE.LAST_EDITOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Article.ARTICLE.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Article.ARTICLE.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Article.ARTICLE.COMMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Article.ARTICLE.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Article.ARTICLE.CONTENT_HTML;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Article.ARTICLE.SUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Article.ARTICLE.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Article.ARTICLE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return Article.ARTICLE.TOPPING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return Article.ARTICLE.VIEW_COUNTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDeleteStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDeleterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getLastEditTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getLastEditorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCommentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getContentHtml();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getTopping();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getViewCounts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDeleteStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDeleterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastEditTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLastEditorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCommentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getContentHtml();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getTopping();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getViewCounts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value2(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value3(String value) {
        setCreatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value4(Integer value) {
        setDeleteStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value5(Timestamp value) {
        setDeleteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value6(String value) {
        setDeleterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value7(Timestamp value) {
        setLastEditTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value8(String value) {
        setLastEditorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value9(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value10(String value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value11(String value) {
        setCommentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value12(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value13(String value) {
        setContentHtml(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value14(String value) {
        setSummary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value15(String value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value16(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value17(Integer value) {
        setTopping(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord value18(Integer value) {
        setViewCounts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleRecord values(String value1, Timestamp value2, String value3, Integer value4, Timestamp value5, String value6, Timestamp value7, String value8, Integer value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, Integer value17, Integer value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ArticleRecord
     */
    public ArticleRecord() {
        super(Article.ARTICLE);
    }

    /**
     * Create a detached, initialised ArticleRecord
     */
    public ArticleRecord(String id, Timestamp createTime, String creatorId, Integer deleteStatus, Timestamp deleteTime, String deleterId, Timestamp lastEditTime, String lastEditorId, Integer version, String categoryId, String commentId, String content, String contentHtml, String summary, String tagId, String title, Integer topping, Integer viewCounts) {
        super(Article.ARTICLE);

        set(0, id);
        set(1, createTime);
        set(2, creatorId);
        set(3, deleteStatus);
        set(4, deleteTime);
        set(5, deleterId);
        set(6, lastEditTime);
        set(7, lastEditorId);
        set(8, version);
        set(9, categoryId);
        set(10, commentId);
        set(11, content);
        set(12, contentHtml);
        set(13, summary);
        set(14, tagId);
        set(15, title);
        set(16, topping);
        set(17, viewCounts);
    }
}
