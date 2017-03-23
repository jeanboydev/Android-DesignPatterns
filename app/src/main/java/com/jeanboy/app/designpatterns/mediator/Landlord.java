package com.jeanboy.app.designpatterns.mediator;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Landlord {

    private String name;

    public Landlord(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hire() {
        System.out.println(getName() + ":我想把房子租出去！");
    }

}
