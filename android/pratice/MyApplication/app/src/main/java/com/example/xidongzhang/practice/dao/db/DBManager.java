package com.example.xidongzhang.practice.dao.db;

import android.content.ContentValues;
import android.content.Context;
import com.example.xidongzhang.practice.dao.DaoException;
import com.example.xidongzhang.practice.dao.DataManager;
import com.example.xidongzhang.practice.dao.ParseEntity;

import java.util.List;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public abstract class DBManager<T> implements DataManager {

    protected Context mContext;

    public DBManager(Context context) {
        mContext = context;
    }


    @Override
    public long addSingleContent(Object entity) throws DaoException {
        return 0;
    }

    @Override
    public int addBulkContent(List list) {
        return insertBulkContentIntoDb(list);
    }

    @Override
    public int removeContent(String selection, String[] selectionArgs) throws DaoException {
        return 0;
    }

    @Override
    public int updateContent(String selection, String[] selectionArgs, List updateContent) throws DaoException {
        return 0;
    }

    @Override
    public T getContent(String key, Object value) throws DaoException {
        return null;
    }

    @Override
    public List<T> getContentList(String selection, String[] selectionArgs, String sortOrder) throws DaoException {
        return null;
    }

    protected abstract long insertSingleContentIntoDb(T entity);
    protected abstract int insertBulkContentIntoDb(List contentValues);
    protected abstract int removeContentByKey(ContentValues contentValue);
    protected abstract int updateContentByKey(String key, ContentValues contentValue);
    protected abstract T getContentByKey(ContentValues contentValue);
    protected abstract List<T> getContentListByKey(ContentValues contentValue);

}
