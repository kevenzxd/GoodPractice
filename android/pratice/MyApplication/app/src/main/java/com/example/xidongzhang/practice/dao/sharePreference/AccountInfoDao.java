package com.example.xidongzhang.practice.dao.sharePreference;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.xidongzhang.practice.dao.DaoException;
import com.example.xidongzhang.practice.dao.entity.AccountInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class AccountInfoDao extends PrefDataManager<AccountInfo> {

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
    public AccountInfo getContent(String key, Object value) throws DaoException {
        AccountInfo info = new AccountInfo();

        return info;
    }

    @Override
    protected SharedPreferences getSharePreference() {
        return mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }
}
