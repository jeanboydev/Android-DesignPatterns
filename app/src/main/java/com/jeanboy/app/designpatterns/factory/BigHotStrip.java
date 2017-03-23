package com.jeanboy.app.designpatterns.factory;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class BigHotStrip implements HotStrip {

    @Override
    public void info() {
        System.out.println("这是大面筋！");
    }
}
