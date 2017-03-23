package com.jeanboy.app.designpatterns.observer;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("Observer2 收到通知！");
    }
}
