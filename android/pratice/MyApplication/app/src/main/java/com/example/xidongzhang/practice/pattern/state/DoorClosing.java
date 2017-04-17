package com.example.xidongzhang.practice.pattern.state;

/**
 * Created by xidongzhang on 2017/4/13.
 */
public class DoorClosing extends DoorState {

    public DoorClosing(Door door) {
        super(door);
    }

    @Override
    public void complete() {
        door.setState(door.CLOSED);
    }

    @Override
    public void timeout() {
        door.setState(door.OPEN);
    }

    @Override
    public void touch() {
    }
}
