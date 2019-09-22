package com.jeanboy.app.designpatterns.old.strategy;

/**
 * Created by jeanboy on 2017/3/17.
 */

public abstract class Duck {

    public void quack() {
        System.out.println("嘎嘎叫");
    }

    public abstract void display();

    private FlyingStrategy flyingStragety;

    public void setFlyingStragety(FlyingStrategy flyingStrategy) {
        this.flyingStragety = flyingStrategy;
    }

    public void fly(){
        flyingStragety.performFly();
    }
}
