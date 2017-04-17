package com.example.xidongzhang.practice.dao.file;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.xidongzhang.practice.dao.DaoException;
import com.example.xidongzhang.practice.dao.entity.AccountInfo;
import com.example.xidongzhang.practice.dao.sharePreference.PrefDataManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class AccountFileInfoDao extends FileDataManager<AccountInfo> {

    private static final String FILE_NAME = "account_info";

    private static final List<String> KEYS_LIST = new ArrayList<>();

    static {
        KEYS_LIST.add(AccountInfo.UID);
        KEYS_LIST.add(AccountInfo.NAME);
        KEYS_LIST.add(AccountInfo.PHONENUMBER);
    }

    public AccountFileInfoDao(Context context) {
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
    protected File getDataFile() {
        return new File(PATH_FOLDER + "/"+FILE_NAME);
    }
}
