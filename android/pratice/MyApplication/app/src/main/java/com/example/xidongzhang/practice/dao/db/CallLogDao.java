package com.example.xidongzhang.practice.dao.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.xidongzhang.practice.dao.entity.CallLog;

import java.util.List;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class CallLogDao extends DBManager<CallLog> {

    SQLiteDatabase mDb;
    public CallLogDao(Context context) {
        super(context);
        mDb = DBHelper.getInstance(context).getWritableDatabase();
    }

    @Override
    protected long insertSingleContentIntoDb(ContentValues contentValue) {
        return mDb.insert(CallLog.TABLE_NAME, null, contentValue);
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
}
