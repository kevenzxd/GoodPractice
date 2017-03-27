package com.example.xidongzhang.practice.dao.db;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
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
    protected long insertSingleContentIntoDb(ContentValues contentValue) {
        Uri result = mContentResolver.insert(Contact.BASE_URI, contentValue);
        if (result == null) {
            return 0;
        } else {
            return Long.parseLong(result.getLastPathSegment());
        }
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
}
