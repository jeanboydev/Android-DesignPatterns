package com.jeanboy.app.designpatterns.test.builder;

public interface Builder {

    Builder step1(String param);

    Builder step2(String param);

    Builder step3(String param);

    Product build();
}
