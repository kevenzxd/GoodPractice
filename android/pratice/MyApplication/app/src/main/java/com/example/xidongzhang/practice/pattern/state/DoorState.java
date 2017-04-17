package com.example.xidongzhang.practice.pattern.state;

/**
 * Created by xidongzhang on 2017/4/13.
 */
public abstract class DoorState {

    protected Door door;

    public abstract void touch();

    public void complete() {
    }

    public void timeout() {
    }

    public String status() {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf('.') + 1);
    }

    public DoorState(Door door) {
        this.door = door;
    }
}
