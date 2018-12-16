/*
 * This file is generated by jOOQ.
 */
package com.wuhainan.jooqblog.tables.records;


import com.wuhainan.jooqblog.tables.Comment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommentRecord extends UpdatableRecordImpl<CommentRecord> implements Record14<String, Timestamp, Integer, Integer, Timestamp, Integer, Timestamp, Integer, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 1646803498;

    /**
     * Setter for <code>blog.comment.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>blog.comment.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>blog.comment.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>blog.comment.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>blog.comment.creator_id</code>.
     */
    public void setCreatorId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>blog.comment.creator_id</code>.
     */
    public Integer getCreatorId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>blog.comment.delete_status</code>.
     */
    public void setDeleteStatus(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>blog.comment.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>blog.comment.delete_time</code>.
     */
    public void setDeleteTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>blog.comment.delete_time</code>.
     */
    public Timestamp getDeleteTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>blog.comment.deleter_id</code>.
     */
    public void setDeleterId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>blog.comment.deleter_id</code>.
     */
    public Integer getDeleterId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>blog.comment.last_edit_time</code>.
     */
    public void setLastEditTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>blog.comment.last_edit_time</code>.
     */
    public Timestamp getLastEditTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>blog.comment.last_editor_id</code>.
     */
    public void setLastEditorId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>blog.comment.last_editor_id</code>.
     */
    public Integer getLastEditorId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>blog.comment.version</code>.
     */
    public void setVersion(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>blog.comment.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>blog.comment.children_ids</code>.
     */
    public void setChildrenIds(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>blog.comment.children_ids</code>.
     */
    public String getChildrenIds() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blog.comment.content</code>.
     */
    public void setContent(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>blog.comment.content</code>.
     */
    public String getContent() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blog.comment.parent_id</code>.
     */
    public void setParentId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>blog.comment.parent_id</code>.
     */
    public String getParentId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blog.comment.to_user_id</code>.
     */
    public void setToUserId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>blog.comment.to_user_id</code>.
     */
    public String getToUserId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blog.comment.type</code>.
     */
    public void setType(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>blog.comment.type</code>.
     */
    public String getType() {
        return (String) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, Timestamp, Integer, Integer, Timestamp, Integer, Timestamp, Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, Timestamp, Integer, Integer, Timestamp, Integer, Timestamp, Integer, Integer, String, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Comment.COMMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Comment.COMMENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Comment.COMMENT.CREATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Comment.COMMENT.DELETE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Comment.COMMENT.DELETE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Comment.COMMENT.DELETER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Comment.COMMENT.LAST_EDIT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Comment.COMMENT.LAST_EDITOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Comment.COMMENT.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Comment.COMMENT.CHILDREN_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Comment.COMMENT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Comment.COMMENT.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Comment.COMMENT.TO_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Comment.COMMENT.TYPE;
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
    public Integer component3() {
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
    public Integer component6() {
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
    public Integer component8() {
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
        return getChildrenIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getToUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getType();
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
    public Integer value3() {
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
    public Integer value6() {
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
    public Integer value8() {
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
        return getChildrenIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getToUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value2(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value3(Integer value) {
        setCreatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value4(Integer value) {
        setDeleteStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value5(Timestamp value) {
        setDeleteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value6(Integer value) {
        setDeleterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value7(Timestamp value) {
        setLastEditTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value8(Integer value) {
        setLastEditorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value9(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value10(String value) {
        setChildrenIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value11(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value12(String value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value13(String value) {
        setToUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord value14(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentRecord values(String value1, Timestamp value2, Integer value3, Integer value4, Timestamp value5, Integer value6, Timestamp value7, Integer value8, Integer value9, String value10, String value11, String value12, String value13, String value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CommentRecord
     */
    public CommentRecord() {
        super(Comment.COMMENT);
    }

    /**
     * Create a detached, initialised CommentRecord
     */
    public CommentRecord(String id, Timestamp createTime, Integer creatorId, Integer deleteStatus, Timestamp deleteTime, Integer deleterId, Timestamp lastEditTime, Integer lastEditorId, Integer version, String childrenIds, String content, String parentId, String toUserId, String type) {
        super(Comment.COMMENT);

        set(0, id);
        set(1, createTime);
        set(2, creatorId);
        set(3, deleteStatus);
        set(4, deleteTime);
        set(5, deleterId);
        set(6, lastEditTime);
        set(7, lastEditorId);
        set(8, version);
        set(9, childrenIds);
        set(10, content);
        set(11, parentId);
        set(12, toUserId);
        set(13, type);
    }
}