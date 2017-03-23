package com.jeanboy.app.designpatterns.flyweight;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class Target {

    private String name;

    public Target(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Target{" +
                "name='" + name + '\'' +
                '}';
    }
}
