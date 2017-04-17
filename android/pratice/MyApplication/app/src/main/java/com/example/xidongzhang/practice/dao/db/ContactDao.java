package com.example.xidongzhang.practice.dao.db;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.example.xidongzhang.practice.dao.DaoException;
import com.example.xidongzhang.practice.dao.ParseEntity;
import com.example.xidongzhang.practice.dao.entity.Contact;

import java.util.List;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class ContactDao extends DBManager<Contact> {

    ContentResolver mContentResolver;

    public ContactDao(Context context) {
        super(context);
        mContentResolver = context.getContentResolver();
    }

    @Override
    protected int insertBulkContentIntoDb(List contentValues) {
        return 0;
    }

    @Override
    protected int removeContentByKey(ContentValues contentValue) {
        return 0;
    }

    @Override
    protected int updateContentByKey(String key, ContentValues contentValue) {
        return 0;
    }

    @Override
    protected Contact getContentByKey(ContentValues contentValue) {
        return null;
    }

    @Override
    protected List<Contact> getContentListByKey(ContentValues contentValue) {
        return null;
    }

    @Override
    public ContentValues parse(Object entity) {
        return null;
    }

    @Override
    public List getContentList(String selection, String[] selectionArgs, String sortOrder) throws DaoException {
        return null;
    }

    @Override
    protected long insertSingleContentIntoDb(Contact entity) {
        return 0;
    }

}