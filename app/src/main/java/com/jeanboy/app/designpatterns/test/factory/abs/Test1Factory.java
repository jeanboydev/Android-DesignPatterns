package com.jeanboy.app.designpatterns.test.factory.abs;

import com.jeanboy.app.designpatterns.test.factory.AbstactFactory;
import com.jeanboy.app.designpatterns.test.factory.simple.Product1;
import com.jeanboy.app.designpatterns.test.factory.simple.Product2;

public class Test1Factory implements AbstactFactory {

    @Override
    public Product1 createProduct1() {
        return new Product1();
    }

    @Override
    public Product2 createProduct3() {
        return new Product2();
    }
}
