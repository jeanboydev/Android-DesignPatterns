package com.jeanboy.app.designpatterns.command;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Employee implements Receiver {

    @Override
    public void action(String desc) {
        System.out.println("Employee 执行命令:" + desc);
    }
}
