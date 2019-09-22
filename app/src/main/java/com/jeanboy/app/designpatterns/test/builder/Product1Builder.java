package com.jeanboy.app.designpatterns.test.builder;

public class Product1Builder implements Builder {

    private Product product = new Product1();

    @Override
    public Builder step1(String param) {
        product.step1(param);
        return this;
    }

    @Override
    public Builder step2(String param) {
        product.step2(param);
        return this;
    }

    @Override
    public Builder step3(String param) {
        product.step3(param);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
