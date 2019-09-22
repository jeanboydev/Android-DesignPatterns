package com.jeanboy.app.designpatterns.test.factory;

import com.jeanboy.app.designpatterns.test.factory.simple.Product1;
import com.jeanboy.app.designpatterns.test.factory.simple.Product2;

public interface AbstactFactory {

    Product1 createProduct1();

    Product2 createProduct3();
}
