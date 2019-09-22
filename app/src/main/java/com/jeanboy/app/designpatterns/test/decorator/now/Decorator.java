package com.jeanboy.app.designpatterns.test.decorator.now;

public class Decorator implements Haha {

    private Father father;

    public Decorator(Father father) {
        this.father = father;
    }

    @Override
    public void haha() {
        father.haha();
    }
}
