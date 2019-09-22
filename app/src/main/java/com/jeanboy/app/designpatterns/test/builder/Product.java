package com.jeanboy.app.designpatterns.test.builder;

public abstract class Product {

    private String step1Value;
    private String step2Value;
    private String step3Value;

    abstract void step1(String param);

    abstract void step2(String param);

    abstract void step3(String param);
}
