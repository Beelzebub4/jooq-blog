/*
 * This file is generated by jOOQ.
 */
package com.wuhainan.jooqblog.tables.daos;


import com.wuhainan.jooqblog.tables.Category;
import com.wuhainan.jooqblog.tables.records.CategoryRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class CategoryDao extends DAOImpl<CategoryRecord, com.wuhainan.jooqblog.tables.pojos.Category, String> {

    /**
     * Create a new CategoryDao without any configuration
     */
    public CategoryDao() {
        super(Category.CATEGORY, com.wuhainan.jooqblog.tables.pojos.Category.class);
    }

    /**
     * Create a new CategoryDao with an attached configuration
     */
    public CategoryDao(Configuration configuration) {
        super(Category.CATEGORY, com.wuhainan.jooqblog.tables.pojos.Category.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.wuhainan.jooqblog.tables.pojos.Category object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchById(String... values) {
        return fetch(Category.CATEGORY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.wuhainan.jooqblog.tables.pojos.Category fetchOneById(String value) {
        return fetchOne(Category.CATEGORY.ID, value);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByCreateTime(Timestamp... values) {
        return fetch(Category.CATEGORY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>creator_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByCreatorId(Integer... values) {
        return fetch(Category.CATEGORY.CREATOR_ID, values);
    }

    /**
     * Fetch records that have <code>delete_status IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByDeleteStatus(Integer... values) {
        return fetch(Category.CATEGORY.DELETE_STATUS, values);
    }

    /**
     * Fetch records that have <code>delete_time IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByDeleteTime(Timestamp... values) {
        return fetch(Category.CATEGORY.DELETE_TIME, values);
    }

    /**
     * Fetch records that have <code>deleter_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByDeleterId(Integer... values) {
        return fetch(Category.CATEGORY.DELETER_ID, values);
    }

    /**
     * Fetch records that have <code>last_edit_time IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByLastEditTime(Timestamp... values) {
        return fetch(Category.CATEGORY.LAST_EDIT_TIME, values);
    }

    /**
     * Fetch records that have <code>last_editor_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByLastEditorId(Integer... values) {
        return fetch(Category.CATEGORY.LAST_EDITOR_ID, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByVersion(Integer... values) {
        return fetch(Category.CATEGORY.VERSION, values);
    }

    /**
     * Fetch records that have <code>avatar IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByAvatar(String... values) {
        return fetch(Category.CATEGORY.AVATAR, values);
    }

    /**
     * Fetch records that have <code>category_name IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByCategoryName(String... values) {
        return fetch(Category.CATEGORY.CATEGORY_NAME, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Category> fetchByDescription(String... values) {
        return fetch(Category.CATEGORY.DESCRIPTION, values);
    }
}
