package com.jeanboy.app.designpatterns.test.builder;

public class Test {

    public static void main(String[] args) {
        Builder builder = new Product1Builder();
        Product product = builder
                .step1("a")
                .step2("b")
                .step3("c")
                .build();
    }
}
