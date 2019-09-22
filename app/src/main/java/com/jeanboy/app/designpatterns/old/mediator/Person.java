package com.jeanboy.app.designpatterns.old.mediator;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void lease() {
        System.out.println(getName() + ":我想租房！");
    }
}
