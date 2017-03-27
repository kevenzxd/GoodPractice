package com.example.xidongzhang.practice.dao;

import android.content.ContentValues;

import java.util.List;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public interface DataManager<T> {

    public long addSingleContent(ContentValues contentValue) throws DaoException;

    public int addBulkContent(List<ContentValues> contentValuesList) throws DaoException;

    public int removeContent(ContentValues contentValue) throws DaoException;

    public int updateContent(String key, ContentValues contentValue) throws DaoException;

    public T getContent(ContentValues contentValue) throws DaoException;

    public List<T> getContentList(ContentValues contentValue) throws DaoException;
}
