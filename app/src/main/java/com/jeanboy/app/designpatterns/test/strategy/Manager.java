package com.jeanboy.app.designpatterns.test.strategy;

public class Manager {

    private NetworkStrategy strategy;

    public Manager(NetworkStrategy strategy) {
        this.strategy = strategy;
    }

    public void request() {
        strategy.request();
    }
}
