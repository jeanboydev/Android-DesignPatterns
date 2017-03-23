package com.jeanboy.app.designpatterns.chain;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class Employee extends Person {

    private final static double MAX_AMOUNT = 5;

    @Override
    public void handle() {
        if (getOrder().getAmount() > MAX_AMOUNT) {
            getSuperior().setOrder(getOrder());
            getSuperior().handle();
        } else {
            System.out.println("Employee 批准！金额：" + getOrder().toString());
        }
    }
}
