package com.jeanboy.app.designpatterns.old.observer;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("Observer1 收到通知！");
    }
}
