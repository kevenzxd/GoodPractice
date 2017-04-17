package com.example.xidongzhang.practice.dao;

import android.content.ContentValues;

/**
 * Created by xidongzhang on 2017/3/29.
 */
public interface ParseEntity<T> {
    public ContentValues parse(T entity);
}
