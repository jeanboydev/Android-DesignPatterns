package com.jeanboy.app.designpatterns.old.strategy;

/**
 * Created by jeanboy on 2017/3/17.
 */

public class FlyNoWay implements FlyingStrategy {
    @Override
    public void performFly() {

        System.out.println("不会飞行");
    }
}
