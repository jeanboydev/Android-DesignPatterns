package com.jeanboy.app.designpatterns.test.factory.function;

import com.jeanboy.app.designpatterns.test.factory.FunctionFactory;
import com.jeanboy.app.designpatterns.test.factory.simple.Product;
import com.jeanboy.app.designpatterns.test.factory.simple.Product1;

public class Product1Factory implements FunctionFactory {
    @Override
    public Product create() {
        return new Product1();
    }
}
