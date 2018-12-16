/*
 * This file is generated by jOOQ.
 */
package com.wuhainan.jooqblog.tables;


import com.wuhainan.jooqblog.Blog;
import com.wuhainan.jooqblog.Indexes;
import com.wuhainan.jooqblog.Keys;
import com.wuhainan.jooqblog.tables.records.UserRecord;

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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = -1833327635;

    /**
     * The reference instance of <code>blog.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>blog.user.id</code>.
     */
    public final TableField<UserRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>blog.user.create_time</code>.
     */
    public final TableField<UserRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>blog.user.creator_id</code>.
     */
    public final TableField<UserRecord, Integer> CREATOR_ID = createField("creator_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.user.delete_status</code>.
     */
    public final TableField<UserRecord, Integer> DELETE_STATUS = createField("delete_status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.user.delete_time</code>.
     */
    public final TableField<UserRecord, Timestamp> DELETE_TIME = createField("delete_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>blog.user.deleter_id</code>.
     */
    public final TableField<UserRecord, Integer> DELETER_ID = createField("deleter_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.user.last_edit_time</code>.
     */
    public final TableField<UserRecord, Timestamp> LAST_EDIT_TIME = createField("last_edit_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>blog.user.last_editor_id</code>.
     */
    public final TableField<UserRecord, Integer> LAST_EDITOR_ID = createField("last_editor_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.user.version</code>.
     */
    public final TableField<UserRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>blog.user.admin</code>.
     */
    public final TableField<UserRecord, Boolean> ADMIN = createField("admin", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>blog.user.avatar</code>.
     */
    public final TableField<UserRecord, String> AVATAR = createField("avatar", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.user.cellphone_number</code>.
     */
    public final TableField<UserRecord, String> CELLPHONE_NUMBER = createField("cellphone_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.user.email</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.user.last_login</code>.
     */
    public final TableField<UserRecord, Timestamp> LAST_LOGIN = createField("last_login", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>blog.user.nickname</code>.
     */
    public final TableField<UserRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.user.password</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.user.salt</code>.
     */
    public final TableField<UserRecord, String> SALT = createField("salt", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.user.status</code>.
     */
    public final TableField<UserRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>blog.user.username</code>.
     */
    public final TableField<UserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>blog.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>blog.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>blog.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key) {
        super(child, key, USER);
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
        return Arrays.<Index>asList(Indexes.USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}
