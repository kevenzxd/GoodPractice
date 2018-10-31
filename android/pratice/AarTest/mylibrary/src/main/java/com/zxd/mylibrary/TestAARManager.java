package com.zxd.mylibrary;

import android.util.Log;

import com.google.gson.Gson;

public class TestAARManager {

    public static void printLog() {
        System.out.println("TestAARManager: ===> zzz printLog ");
        Log.v("TestAARManager ", "zzz println ");
        new Gson().toJson("zzzz ");
    }

}
