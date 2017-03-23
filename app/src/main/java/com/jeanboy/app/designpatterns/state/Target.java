package com.jeanboy.app.designpatterns.state;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Target {

    private State state;

    public Target() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
