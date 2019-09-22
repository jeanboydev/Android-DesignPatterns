package com.jeanboy.app.designpatterns.old.builder;

/**
 * Created by jeanboy on 2016/12/19.
 */

public class ApplePCBuilder extends Builder {

    private Computer computer = new AppleComputer();


    @Override
    public void buildCPU(int core) {
        computer.setCpuCore(core);
    }

    @Override
    public void buildRAM(int gb) {
        computer.setRamSize(gb);
    }

    @Override
    public void buildOs(String os) {
        computer.setOsName(os);
    }

    @Override
    public Computer create() {
        return computer;
    }
}
