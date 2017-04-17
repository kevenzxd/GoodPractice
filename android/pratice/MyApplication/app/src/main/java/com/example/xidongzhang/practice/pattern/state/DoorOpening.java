package com.example.xidongzhang.practice.pattern.state;

/**
 * Created by xidongzhang on 2017/4/13.
 */
public class DoorOpening extends DoorState {

    public DoorOpening(Door door) {
        super(door);
    }

    @Override
    public void touch() {

    }

    @Override
    public void timeout() {
        door.setState(door.CLOSING);
    }

    public void complete() {
        door.setState(door.OPEN);
    }
}
