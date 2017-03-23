package com.jeanboy.app.designpatterns.observer;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("执行更新！");
        notifyObservers();
    }
}
