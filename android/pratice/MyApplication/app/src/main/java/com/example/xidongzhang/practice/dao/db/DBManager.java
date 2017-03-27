package com.example.xidongzhang.practice.dao.db;

import android.content.ContentValues;
import android.content.Context;
import com.example.xidongzhang.practice.dao.DataManager;

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
    public long addSingleContent(ContentValues contentValue) {
        return insertSingleContentIntoDb(contentValue);
    }

    @Override
    public int removeContent(ContentValues contentValue) {
        return removeContentByKey(contentValue);
    }

    @Override
    public int updateContent(String key, ContentValues contentValue) {
        return updateContentByKey(key, contentValue);
    }

    @Override
    public T getContent(ContentValues contentValue) {
        return getContentByKey(contentValue);
    }

    @Override
    public List<T> getContentList(ContentValues contentValue) {
        return getContentListByKey(contentValue);
    }

    @Override
    public int addBulkContent(List list) {
        return insertBulkContentIntoDb(list);
    }

    protected abstract long insertSingleContentIntoDb(ContentValues contentValue);
    protected abstract int insertBulkContentIntoDb(List contentValues);
    protected abstract int removeContentByKey(ContentValues contentValue);
    protected abstract int updateContentByKey(String key, ContentValues contentValue);
    protected abstract T getContentByKey(ContentValues contentValue);
    protected abstract List<T> getContentListByKey(ContentValues contentValue);
}
