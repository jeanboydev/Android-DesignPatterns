package com.jeanboy.app.designpatterns.old.chain;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class Manager extends Person {

    private final static double MAX_AMOUNT = 50;

    @Override
    public void handle() {
        if (getOrder().getAmount() > MAX_AMOUNT) {
            getSuperior().setOrder(getOrder());
            getSuperior().handle();
        } else {
            System.out.println("Manager 批准！金额：" + getOrder().toString());
        }
    }
}
