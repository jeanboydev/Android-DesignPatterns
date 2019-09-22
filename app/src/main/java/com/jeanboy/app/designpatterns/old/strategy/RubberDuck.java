package com.jeanboy.app.designpatterns.old.strategy;

/**
 * Created by jeanboy on 2017/3/17.
 */

public class RubberDuck extends Duck {

    public RubberDuck() {
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("橡胶鸭");
    }
}
