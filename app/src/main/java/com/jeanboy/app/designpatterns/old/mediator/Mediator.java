package com.jeanboy.app.designpatterns.old.mediator;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Mediator {


    public void handle(Person person, Landlord landlord) {
        person.lease();
        landlord.hire();
        System.out.println("中介将" + landlord.getName() + "的房子租给了" + person.getName());
    }

}
