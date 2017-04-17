package com.example.xidongzhang.practice.pattern.state;

/**
 * Created by xidongzhang on 2017/4/13.
 */
public class DoorTest {

    private static DoorTest sInstance = null;

    public static synchronized DoorTest getInstance() {
        if (sInstance == null) {
            sInstance = new DoorTest();
        }
        return sInstance;
    }

    public void test() {
        Door door = new Door();

        //1. 初始状态
        System.out.println(door.status());

        //2. 转移到Opening状态
        door.touch();
        System.out.println(door.status());

        //3. 转移到Open状态
        door.complete();
        System.out.println(door.status());

        //4. 转移到Closing状态
        door.timeout();
        System.out.println(door.status());

        //5. 回到Closed状态
        door.complete();
        System.out.println(door.status());
    }
}
