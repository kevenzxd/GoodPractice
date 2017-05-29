package com.example.xidongzhang.practice.dao.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.example.xidongzhang.practice.dao.DaoException;
import com.example.xidongzhang.practice.dao.ParseEntity;
import com.example.xidongzhang.practice.dao.entity.CallLog;

import java.util.List;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class CallLogDao extends DBManager<CallLog> {

    SQLiteDatabase mDb;

    ParseEntity mEntity;
    public CallLogDao(Context context) {
        super(context);
        mDb = DBHelper.getInstance(context).getWritableDatabase();
    }

    @Override
    protected long insertSingleContentIntoDb(CallLog entity) {

        ContentValues cv = par2(() -> entity, entity);

        new Thread(() -> {
            Log.w("", "");
        }).start();
        return 0;
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
    protected CallLog getContentByKey(ContentValues contentValue) {
        return null;
    }

    @Override
    protected List<CallLog> getContentListByKey(ContentValues contentValue) {
        return null;
    }

    public void par2(ParseEntity<CallLog> entity, CallLog log) {
        mEntity = entity;
    }

    @Override
    public ContentValues parse(Object entity) {
        return null;
    }
}
