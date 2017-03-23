package com.jeanboy.app.designpatterns.state;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class StartState implements State {


    @Override
    public void doAction(Target target) {
        System.out.println("设置状态为start");
        target.setState(this);
    }

    @Override
    public String toString() {
        return "StartState";
    }
}
