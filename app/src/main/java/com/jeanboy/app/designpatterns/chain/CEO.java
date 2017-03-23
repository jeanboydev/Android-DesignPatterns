package com.jeanboy.app.designpatterns.chain;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class CEO extends Person {

    private final static double MAX_AMOUNT = 100;

    @Override
    public void handle() {
        if (getOrder().getAmount() > MAX_AMOUNT) {
            System.out.println("CEO 不批准！订单：" + getOrder().toString());
        } else {
            System.out.println("CEO 批准！订单：" + getOrder().toString());
        }
    }
}
