package com.jeanboy.app.designpatterns.decorator;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class Decorator implements Packer {

    private Packer packer;

    public Decorator(Packer packer) {
        this.packer = packer;
    }

    @Override
    public void pack() {
        packer.pack();
        System.out.println("周年纪念装!");
    }
}
