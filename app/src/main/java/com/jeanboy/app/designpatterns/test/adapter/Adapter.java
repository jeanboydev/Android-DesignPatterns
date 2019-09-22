package com.jeanboy.app.designpatterns.test.adapter;

public class Adapter extends Target2 implements Target1 {
    @Override
    public void request() {
        haha();
    }
}
