package com.example.xidongzhang.practice.dao.sharePreference;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import com.example.xidongzhang.practice.dao.DaoException;
import com.example.xidongzhang.practice.dao.entity.AccountInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class AccountInfoDao extends SharePreferenceManager<AccountInfo> {

    private static final String FILE_NAME = "AccountInfoPreference";

    private static final List<String> KEYS_LIST = new ArrayList<>();

    static {
        KEYS_LIST.add(AccountInfo.UID);
        KEYS_LIST.add(AccountInfo.NAME);
        KEYS_LIST.add(AccountInfo.PHONENUMBER);
    }

    public AccountInfoDao(Context context) {
        super(context);
    }

    @Override
    public boolean checkValidKey(String key) {
        return KEYS_LIST.contains(key);
    }

    @Override
    public AccountInfo getContent(ContentValues contentValue) throws DaoException {
        AccountInfo info = new AccountInfo();
        Set<String> keySet = contentValue.keySet();
        Iterator<String> keys = keySet.iterator();

        while (keys.hasNext()) {
            String key = keys.next();
            if (checkValidKey(key)) {
                String value = contentValue.getAsString(key);
                if (key.equals(AccountInfo.UID)) {
                    info.setUid(value);
                } else if (key.equals(AccountInfo.NAME)) {
                    info.setName(value);
                } else if (key.equals(AccountInfo.PHONENUMBER)) {
                    info.setPhoneNumber(value);
                }
            } else {
                throw new DaoException("The key: "+key+ " is not supported.");
            }
        }

        return info;
    }

    @Override
    public List<AccountInfo> getContentList(ContentValues contentValue) {

        return null;
    }

    @Override
    protected SharedPreferences getSharePreference() {
        return mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }
}
