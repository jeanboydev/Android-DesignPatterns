package com.jeanboy.app.designpatterns.strategy.number;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
