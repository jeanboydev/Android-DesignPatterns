package com.jeanboy.app.designpatterns.strategy;

/**
 * Created by jeanboy on 2017/3/17.
 */

public class FlyWithWing implements FlyingStrategy {

    @Override
    public void performFly() {
        System.out.println("使用翅膀飞行");
    }
}
