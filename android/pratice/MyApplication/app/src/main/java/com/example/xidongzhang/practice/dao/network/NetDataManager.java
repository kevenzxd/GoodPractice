package com.example.xidongzhang.practice.dao.network;

import android.content.ContentValues;
import android.content.Context;
import com.example.xidongzhang.practice.dao.DaoException;
import com.example.xidongzhang.practice.dao.DataManager;

import java.util.List;

/**
 *
 * Save data into file, and should read data from it.
 *
 * Created by xidongzhang on 2017/3/27.
 */
public abstract class NetDataManager<T> implements DataManager {

    protected Context mContext;

    public NetDataManager(Context context) {
        mContext = context;
    }

    public abstract boolean checkValidKey(String key);

    @Override
    public long addSingleContent(Object entity) throws DaoException {
        return 0;
    }

    @Override
    public int addBulkContent(List list) {
        return 0;
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
    public List getContentList(String selection, String[] selectionArgs, String sortOrder) throws DaoException {
        return null;
    }

    @Override
    public ContentValues parse(Object entity) {
        return null;
    }
}
