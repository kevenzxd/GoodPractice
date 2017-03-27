package com.example.xidongzhang.practice.dao.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class AccountInfo implements Parcelable {

    public static final String UID = "uid";
    public static final String NAME = "name";
    public static final String PHONENUMBER = "phoneNumber";

    String uid;
    String name;
    String phoneNumber;

    public static final Parcelable.Creator<AccountInfo> CREATOR = new Parcelable.Creator<AccountInfo>() {

        public AccountInfo createFromParcel(Parcel in) {
            return new AccountInfo(in);
        }

        public AccountInfo[] newArray(int size) {
            return new AccountInfo[size];
        }

    };

    @Override
    public int describeContents() {
        return 3;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uid);
        dest.writeString(name);
        dest.writeString(phoneNumber);
    }

    private AccountInfo(Parcel in) {
        uid = in.readString();
        name = in.readString();
        phoneNumber = in.readString();
    }

    public AccountInfo() { }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
