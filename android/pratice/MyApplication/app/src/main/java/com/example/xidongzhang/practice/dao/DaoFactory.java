package com.example.xidongzhang.practice.dao;

import android.content.Context;
import android.util.Log;
import com.example.xidongzhang.practice.dao.db.CallLogDao;
import com.example.xidongzhang.practice.dao.db.ContactDao;
import com.example.xidongzhang.practice.dao.file.AccountFileInfoDao;
import com.example.xidongzhang.practice.dao.sharePreference.AccountInfoDao;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class DaoFactory<T> {
    private static final String TAG = "DaoFactory";
    private static DaoFactory sInstance = null;

    public static final int CALL_LOG = 0, CONTACT = 1, ACCOUNT = 2, ACCOUNT_FILE = 3;

    public static synchronized DaoFactory getInstance() {
        if (sInstance == null) {
            sInstance = new DaoFactory();
        }
        return sInstance;
    }

    public DataManager<T> getTargetDao(Context context, int target) {
        DataManager manager = null;
        switch (target) {
            case CALL_LOG:
                manager = new CallLogDao(context);
                break;
            case CONTACT:
                manager = new ContactDao(context);
                break;
            case ACCOUNT:
                manager = new AccountInfoDao(context);
                break;
            case ACCOUNT_FILE:
                manager = new AccountFileInfoDao(context);
                break;
            default:
                Log.w(TAG, "Try to get nonexistent DAO " + target);
        }
        return manager;
    }
}
