package com.jeanboy.app.designpatterns.chain;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class Leader extends Person {

    private final static double MAX_AMOUNT = 10;

    @Override
    public void handle() {
        if (getOrder().getAmount() > MAX_AMOUNT) {
            getSuperior().setOrder(getOrder());
            getSuperior().handle();
        } else {
            System.out.println("Leader 批准！订单：" + getOrder().toString());
        }
    }
}
