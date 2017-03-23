package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.facade.computer.Computer;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class FacadeTest {

    @Test
    public void testFacade() {

        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}