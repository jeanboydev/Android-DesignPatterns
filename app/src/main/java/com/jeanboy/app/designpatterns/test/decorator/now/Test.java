package com.jeanboy.app.designpatterns.test.decorator.now;

public class Test {

    public static void main(String[] args) {
        Father father = new Father();
        Decorator decorator = new Child(father);
        decorator.haha();
    }
}
