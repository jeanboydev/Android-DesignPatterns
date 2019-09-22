package com.jeanboy.app.designpatterns.old.chain;

/**
 * Created by jeanboy on 2017/3/22.
 */

public abstract class Person {

    private Order order;

    private Person superior;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Person getSuperior() {
        return superior;
    }

    public void setSuperior(Person superior) {
        this.superior = superior;
    }

    public abstract void handle();
}
