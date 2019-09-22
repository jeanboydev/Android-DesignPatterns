package com.jeanboy.app.designpatterns.test.factory;

import com.jeanboy.app.designpatterns.test.factory.abs.Test1Factory;
import com.jeanboy.app.designpatterns.test.factory.function.Product1Factory;
import com.jeanboy.app.designpatterns.test.factory.simple.Product;
import com.jeanboy.app.designpatterns.test.factory.simple.Product1;

public class Test {

    public static void main(String[] args) {
        Product product = SimpleFactory.create(0);

        FunctionFactory factory = new Product1Factory();
        Product product1 = factory.create();

        AbstactFactory abstactFactory = new Test1Factory();
        Product1 product11 = abstactFactory.createProduct1();
    }
}
