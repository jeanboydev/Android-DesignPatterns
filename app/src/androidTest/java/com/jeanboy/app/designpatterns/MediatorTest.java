package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.old.mediator.Landlord;
import com.jeanboy.app.designpatterns.old.mediator.Mediator;
import com.jeanboy.app.designpatterns.old.mediator.Person;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class MediatorTest {

    @Test
    public void testMediator() {
        Person person = new Person("张三");
        Landlord landlord = new Landlord("李四");

        Mediator mediator = new Mediator();
        mediator.handle(person, landlord);

    }
}