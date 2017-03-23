package com.jeanboy.app.designpatterns.builder.strip;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class Director {

    private Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(HotStrip type, Taste taste) {
        builder.buildType(type);
        builder.buildTaste(taste);
    }
}