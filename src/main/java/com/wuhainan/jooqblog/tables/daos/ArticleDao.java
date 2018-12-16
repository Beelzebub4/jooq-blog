/*
 * This file is generated by jOOQ.
 */
package com.wuhainan.jooqblog.tables.daos;


import com.wuhainan.jooqblog.tables.Article;
import com.wuhainan.jooqblog.tables.records.ArticleRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.List;


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
public class ArticleDao extends DAOImpl<ArticleRecord, com.wuhainan.jooqblog.tables.pojos.Article, String> {

    /**
     * Create a new ArticleDao without any configuration
     */
    public ArticleDao() {
        super(Article.ARTICLE, com.wuhainan.jooqblog.tables.pojos.Article.class);
    }

    /**
     * Create a new ArticleDao with an attached configuration
     */
    public ArticleDao(Configuration configuration) {
        super(Article.ARTICLE, com.wuhainan.jooqblog.tables.pojos.Article.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.wuhainan.jooqblog.tables.pojos.Article object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchById(String... values) {
        return fetch(Article.ARTICLE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.wuhainan.jooqblog.tables.pojos.Article fetchOneById(String value) {
        return fetchOne(Article.ARTICLE.ID, value);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByCreateTime(Timestamp... values) {
        return fetch(Article.ARTICLE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>creator_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByCreatorId(String... values) {
        return fetch(Article.ARTICLE.CREATOR_ID, values);
    }

    /**
     * Fetch records that have <code>delete_status IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByDeleteStatus(Integer... values) {
        return fetch(Article.ARTICLE.DELETE_STATUS, values);
    }

    /**
     * Fetch records that have <code>delete_time IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByDeleteTime(Timestamp... values) {
        return fetch(Article.ARTICLE.DELETE_TIME, values);
    }

    /**
     * Fetch records that have <code>deleter_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByDeleterId(String... values) {
        return fetch(Article.ARTICLE.DELETER_ID, values);
    }

    /**
     * Fetch records that have <code>last_edit_time IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByLastEditTime(Timestamp... values) {
        return fetch(Article.ARTICLE.LAST_EDIT_TIME, values);
    }

    /**
     * Fetch records that have <code>last_editor_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByLastEditorId(String... values) {
        return fetch(Article.ARTICLE.LAST_EDITOR_ID, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByVersion(Integer... values) {
        return fetch(Article.ARTICLE.VERSION, values);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByCategoryId(String... values) {
        return fetch(Article.ARTICLE.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>comment_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByCommentId(String... values) {
        return fetch(Article.ARTICLE.COMMENT_ID, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByContent(String... values) {
        return fetch(Article.ARTICLE.CONTENT, values);
    }

    /**
     * Fetch records that have <code>content_html IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByContentHtml(String... values) {
        return fetch(Article.ARTICLE.CONTENT_HTML, values);
    }

    /**
     * Fetch records that have <code>summary IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchBySummary(String... values) {
        return fetch(Article.ARTICLE.SUMMARY, values);
    }

    /**
     * Fetch records that have <code>tag_id IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByTagId(String... values) {
        return fetch(Article.ARTICLE.TAG_ID, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByTitle(String... values) {
        return fetch(Article.ARTICLE.TITLE, values);
    }

    /**
     * Fetch records that have <code>topping IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByTopping(Integer... values) {
        return fetch(Article.ARTICLE.TOPPING, values);
    }

    /**
     * Fetch records that have <code>view_counts IN (values)</code>
     */
    public List<com.wuhainan.jooqblog.tables.pojos.Article> fetchByViewCounts(Integer... values) {
        return fetch(Article.ARTICLE.VIEW_COUNTS, values);
    }
}
