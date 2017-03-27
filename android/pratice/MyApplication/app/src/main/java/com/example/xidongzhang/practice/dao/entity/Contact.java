package com.example.xidongzhang.practice.dao.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.provider.Telephony;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class Contact implements Parcelable{

    public static final Uri BASE_URI = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;

    long id;
    String callOutNumber;
    String callInNumber;
    int type;
    long callTime;

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {

        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        public Contact[] newArray(int size) {
            return new Contact[size];
        }

    };

    @Override
    public int describeContents() {
        return 4;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(callOutNumber);
        dest.writeString(callInNumber);
        dest.writeInt(type);
        dest.writeLong(callTime);
    }

    private Contact(Parcel in) {
        id = in.readLong();
        callOutNumber = in.readString();
        callInNumber = in.readString();
        type = in.readInt();
        callTime = in.readLong();
    }
}
