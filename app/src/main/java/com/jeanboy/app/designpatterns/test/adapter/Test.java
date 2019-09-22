package com.jeanboy.app.designpatterns.test.adapter;

public class Test {

    public static void main(String[] args) {
        Target1 target1 = new Adapter();
        target1.request();

        Target2 target2 = new Adapter();
        target1.request();
    }
}
