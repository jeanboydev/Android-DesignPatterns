package com.jeanboy.app.designpatterns.facade.computer;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class CPU {

    public void startup(){
        System.out.println("cpu startup!");
    }

    public void shutdown(){
        System.out.println("cpu shutdown!");
    }
}
