package com.example.xidongzhang.practice.dao;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class DaoException extends Exception {

    final static String perfix = "Exception happens in DaoFactory: ";

    public DaoException(String message) {
        super(perfix + message);
    }

}
