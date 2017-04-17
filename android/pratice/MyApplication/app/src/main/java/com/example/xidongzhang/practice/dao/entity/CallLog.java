package com.example.xidongzhang.practice.dao.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by xidongzhang on 2017/3/27.
 */
public class CallLog implements Parcelable {

    public static final String TABLE_NAME = "call_log";

    public static final String ID = "id";
    public static final String CALL_OUT_NUMBER = "outNumber";
    public static final String CALL_IN_NUMBER = "inNumber";
    public static final String TYPE = "type";
    public static final String CALL_TIME = "callTime";

    long id;
    String callOutNumber;
    String callInNumber;
    int type;
    long callTime;

    public static final Parcelable.Creator<CallLog> CREATOR = new Parcelable.Creator<CallLog>() {

        public CallLog createFromParcel(Parcel in) {
            return new CallLog(in);
        }

        public CallLog[] newArray(int size) {
            return new CallLog[size];
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

    private CallLog(Parcel in) {
        id = in.readLong();
        callOutNumber = in.readString();
        callInNumber = in.readString();
        type = in.readInt();
        callTime = in.readLong();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCallOutNumber() {
        return callOutNumber;
    }

    public void setCallOutNumber(String callOutNumber) {
        this.callOutNumber = callOutNumber;
    }

    public String getCallInNumber() {
        return callInNumber;
    }

    public void setCallInNumber(String callInNumber) {
        this.callInNumber = callInNumber;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getCallTime() {
        return callTime;
    }

    public void setCallTime(long callTime) {
        this.callTime = callTime;
    }
}
