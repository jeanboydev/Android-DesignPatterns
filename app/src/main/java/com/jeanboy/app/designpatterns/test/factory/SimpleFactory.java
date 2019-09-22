package com.jeanboy.app.designpatterns.test.factory;

import com.jeanboy.app.designpatterns.test.factory.simple.Product;
import com.jeanboy.app.designpatterns.test.factory.simple.Product1;
import com.jeanboy.app.designpatterns.test.factory.simple.Product2;

public class SimpleFactory {

    public static Product create(int type) {
        switch (type) {
            case 1:
                return new Product1();
            case 2:
                return new Product2();
            default:
                return null;
        }
    }

}
