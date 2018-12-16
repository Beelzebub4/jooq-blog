/*
 * This file is generated by jOOQ.
 */
package com.wuhainan.jooqblog.tables.records;


import com.wuhainan.jooqblog.tables.User;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record19<String, Timestamp, Integer, Integer, Timestamp, Integer, Timestamp, Integer, Integer, Boolean, String, String, String, Timestamp, String, String, String, String, String> {

    private static final long serialVersionUID = -1078877636;

    /**
     * Setter for <code>blog.user.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>blog.user.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>blog.user.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>blog.user.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>blog.user.creator_id</code>.
     */
    public void setCreatorId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>blog.user.creator_id</code>.
     */
    public Integer getCreatorId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>blog.user.delete_status</code>.
     */
    public void setDeleteStatus(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>blog.user.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>blog.user.delete_time</code>.
     */
    public void setDeleteTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>blog.user.delete_time</code>.
     */
    public Timestamp getDeleteTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>blog.user.deleter_id</code>.
     */
    public void setDeleterId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>blog.user.deleter_id</code>.
     */
    public Integer getDeleterId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>blog.user.last_edit_time</code>.
     */
    public void setLastEditTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>blog.user.last_edit_time</code>.
     */
    public Timestamp getLastEditTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>blog.user.last_editor_id</code>.
     */
    public void setLastEditorId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>blog.user.last_editor_id</code>.
     */
    public Integer getLastEditorId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>blog.user.version</code>.
     */
    public void setVersion(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>blog.user.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>blog.user.admin</code>.
     */
    public void setAdmin(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>blog.user.admin</code>.
     */
    public Boolean getAdmin() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>blog.user.avatar</code>.
     */
    public void setAvatar(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>blog.user.avatar</code>.
     */
    public String getAvatar() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blog.user.cellphone_number</code>.
     */
    public void setCellphoneNumber(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>blog.user.cellphone_number</code>.
     */
    public String getCellphoneNumber() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blog.user.email</code>.
     */
    public void setEmail(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>blog.user.email</code>.
     */
    public String getEmail() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blog.user.last_login</code>.
     */
    public void setLastLogin(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>blog.user.last_login</code>.
     */
    public Timestamp getLastLogin() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>blog.user.nickname</code>.
     */
    public void setNickname(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>blog.user.nickname</code>.
     */
    public String getNickname() {
        return (String) get(14);
    }

    /**
     * Setter for <code>blog.user.password</code>.
     */
    public void setPassword(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>blog.user.password</code>.
     */
    public String getPassword() {
        return (String) get(15);
    }

    /**
     * Setter for <code>blog.user.salt</code>.
     */
    public void setSalt(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>blog.user.salt</code>.
     */
    public String getSalt() {
        return (String) get(16);
    }

    /**
     * Setter for <code>blog.user.status</code>.
     */
    public void setStatus(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>blog.user.status</code>.
     */
    public String getStatus() {
        return (String) get(17);
    }

    /**
     * Setter for <code>blog.user.username</code>.
     */
    public void setUsername(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>blog.user.username</code>.
     */
    public String getUsername() {
        return (String) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, Timestamp, Integer, Integer, Timestamp, Integer, Timestamp, Integer, Integer, Boolean, String, String, String, Timestamp, String, String, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, Timestamp, Integer, Integer, Timestamp, Integer, Timestamp, Integer, Integer, Boolean, String, String, String, Timestamp, String, String, String, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return User.USER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return User.USER.CREATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return User.USER.DELETE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return User.USER.DELETE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return User.USER.DELETER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return User.USER.LAST_EDIT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return User.USER.LAST_EDITOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return User.USER.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return User.USER.ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return User.USER.AVATAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return User.USER.CELLPHONE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return User.USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return User.USER.LAST_LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return User.USER.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return User.USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return User.USER.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return User.USER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return User.USER.USERNAME;
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
    public Boolean component10() {
        return getAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCellphoneNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getLastLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getUsername();
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
    public Boolean value10() {
        return getAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCellphoneNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getLastLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(Integer value) {
        setCreatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(Integer value) {
        setDeleteStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(Timestamp value) {
        setDeleteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(Integer value) {
        setDeleterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(Timestamp value) {
        setLastEditTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value8(Integer value) {
        setLastEditorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value9(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value10(Boolean value) {
        setAdmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value11(String value) {
        setAvatar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value12(String value) {
        setCellphoneNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value13(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value14(Timestamp value) {
        setLastLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value15(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value16(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value17(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value18(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value19(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(String value1, Timestamp value2, Integer value3, Integer value4, Timestamp value5, Integer value6, Timestamp value7, Integer value8, Integer value9, Boolean value10, String value11, String value12, String value13, Timestamp value14, String value15, String value16, String value17, String value18, String value19) {
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
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(String id, Timestamp createTime, Integer creatorId, Integer deleteStatus, Timestamp deleteTime, Integer deleterId, Timestamp lastEditTime, Integer lastEditorId, Integer version, Boolean admin, String avatar, String cellphoneNumber, String email, Timestamp lastLogin, String nickname, String password, String salt, String status, String username) {
        super(User.USER);

        set(0, id);
        set(1, createTime);
        set(2, creatorId);
        set(3, deleteStatus);
        set(4, deleteTime);
        set(5, deleterId);
        set(6, lastEditTime);
        set(7, lastEditorId);
        set(8, version);
        set(9, admin);
        set(10, avatar);
        set(11, cellphoneNumber);
        set(12, email);
        set(13, lastLogin);
        set(14, nickname);
        set(15, password);
        set(16, salt);
        set(17, status);
        set(18, username);
    }
}
