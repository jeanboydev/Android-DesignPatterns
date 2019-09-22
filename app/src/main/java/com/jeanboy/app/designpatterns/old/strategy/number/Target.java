package com.jeanboy.app.designpatterns.old.strategy.number;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Target {

    private Strategy strategy;

    public Target(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
