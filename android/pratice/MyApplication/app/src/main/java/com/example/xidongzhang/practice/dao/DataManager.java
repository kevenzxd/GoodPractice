package com.example.xidongzhang.practice.dao;

import java.util.List;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public interface DataManager<T> extends ParseEntity<T> {

    public static final String Order = "orderBy";
    public static final String selection = "selection";

    public long addSingleContent(T entity) throws DaoException;

    public int addBulkContent(List<T> updateContentList) throws DaoException;

    public int removeContent(String selection, String[] selectionArgs) throws DaoException;

    public int updateContent(String selection, String[] selectionArgs, List<T> updateContent) throws DaoException;

    public T getContent(String key, Object value) throws DaoException;

    public List<T> getContentList(String selection, String[] selectionArgs, String sortOrder) throws DaoException;
}
