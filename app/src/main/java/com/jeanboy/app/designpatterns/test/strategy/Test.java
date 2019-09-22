package com.jeanboy.app.designpatterns.test.strategy;

public class Test {

    public static void main(String[] args) {
        Manager manager = new Manager(new Strategy1());
        manager.request();
    }
}
