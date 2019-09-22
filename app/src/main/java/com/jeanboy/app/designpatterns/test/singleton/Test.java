package com.jeanboy.app.designpatterns.test.singleton;

public class Test {

    public static void main(String[] args) {
        MySingleton instance1 = MySingleton.getInstance();

        MySingleton2 instance = MySingleton2.INSTANCE;
    }
}
