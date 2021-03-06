/*
 * This file is generated by jOOQ.
 */
package com.wuhainan.jooqblog.tables;


import com.wuhainan.jooqblog.Blog;
import com.wuhainan.jooqblog.Indexes;
import com.wuhainan.jooqblog.Keys;
import com.wuhainan.jooqblog.tables.records.CommentRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Comment extends TableImpl<CommentRecord> {

    private static final long serialVersionUID = 410723764;

    /**
     * The reference instance of <code>blog.comment</code>
     */
    public static final Comment COMMENT = new Comment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentRecord> getRecordType() {
        return CommentRecord.class;
    }

    /**
     * The column <code>blog.comment.id</code>.
     */
    public final TableField<CommentRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>blog.comment.create_time</code>.
     */
    public final TableField<CommentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>blog.comment.creator_id</code>.
     */
    public final TableField<CommentRecord, Integer> CREATOR_ID = createField("creator_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.comment.delete_status</code>.
     */
    public final TableField<CommentRecord, Integer> DELETE_STATUS = createField("delete_status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.comment.delete_time</code>.
     */
    public final TableField<CommentRecord, Timestamp> DELETE_TIME = createField("delete_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>blog.comment.deleter_id</code>.
     */
    public final TableField<CommentRecord, Integer> DELETER_ID = createField("deleter_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.comment.last_edit_time</code>.
     */
    public final TableField<CommentRecord, Timestamp> LAST_EDIT_TIME = createField("last_edit_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>blog.comment.last_editor_id</code>.
     */
    public final TableField<CommentRecord, Integer> LAST_EDITOR_ID = createField("last_editor_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.comment.version</code>.
     */
    public final TableField<CommentRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.comment.children_ids</code>.
     */
    public final TableField<CommentRecord, String> CHILDREN_IDS = createField("children_ids", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.comment.content</code>.
     */
    public final TableField<CommentRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.comment.parent_id</code>.
     */
    public final TableField<CommentRecord, String> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.comment.to_user_id</code>.
     */
    public final TableField<CommentRecord, String> TO_USER_ID = createField("to_user_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.comment.type</code>.
     */
    public final TableField<CommentRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>blog.comment</code> table reference
     */
    public Comment() {
        this(DSL.name("comment"), null);
    }

    /**
     * Create an aliased <code>blog.comment</code> table reference
     */
    public Comment(String alias) {
        this(DSL.name(alias), COMMENT);
    }

    /**
     * Create an aliased <code>blog.comment</code> table reference
     */
    public Comment(Name alias) {
        this(alias, COMMENT);
    }

    private Comment(Name alias, Table<CommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Comment(Name alias, Table<CommentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Comment(Table<O> child, ForeignKey<O, CommentRecord> key) {
        super(child, key, COMMENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Blog.BLOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommentRecord> getPrimaryKey() {
        return Keys.KEY_COMMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommentRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentRecord>>asList(Keys.KEY_COMMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Comment as(String alias) {
        return new Comment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Comment as(Name alias) {
        return new Comment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Comment rename(String name) {
        return new Comment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Comment rename(Name name) {
        return new Comment(name, null);
    }
}
