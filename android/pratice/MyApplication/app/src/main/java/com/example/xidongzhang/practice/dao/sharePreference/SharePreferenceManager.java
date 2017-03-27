package com.example.xidongzhang.practice.dao.sharePreference;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.example.xidongzhang.practice.dao.DaoException;
import com.example.xidongzhang.practice.dao.DataManager;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public abstract class SharePreferenceManager<T> implements DataManager {

    protected Context mContext;
    protected SharedPreferences mSharedPreferences;

    public SharePreferenceManager(Context context) {
        mContext = context;
        mSharedPreferences = getSharePreference();
    }

    protected SharedPreferences getSharePreference() {
        return PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    @Override
    public long addSingleContent(ContentValues contentValue) throws DaoException {

        SharedPreferences.Editor editor = mSharedPreferences.edit();
        Set<String> keySet = contentValue.keySet();
        Iterator<String> keys = keySet.iterator();

        int count = 0;
        while (keys.hasNext()) {
            String key = keys.next();
            if (checkValidKey(key)) {

                String value = contentValue.getAsString(key);
                editor.putString(key, value);
                count++;
            } else {
                throw new DaoException("The key: "+key+ " is not supported.");
            }
        }

        editor.apply();

        return count;
    }

    public abstract boolean checkValidKey(String key);

    @Override
    public int removeContent(ContentValues contentValue) {
        return 0;
    }

    @Override
    public int updateContent(String key, ContentValues contentValue) {
        return 0;
    }

    @Override
    public int addBulkContent(List list) {
        return 0;
    }
}
