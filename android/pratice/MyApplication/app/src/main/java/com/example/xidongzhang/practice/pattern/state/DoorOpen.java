package com.example.xidongzhang.practice.pattern.state;

/**
 * Created by xidongzhang on 2017/4/13.
 */
public class DoorOpen extends DoorState {

    public DoorOpen(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.CLOSING);
    }
}
