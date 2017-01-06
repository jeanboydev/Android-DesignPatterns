package com.jeanboy.app.designpatterns.builder;

/**
 * Created by jeanboy on 2016/12/19.
 */

public class AppleComputer extends Computer {

    @Override
    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    @Override
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public void setOsName(String osName) {
        this.osName = osName;
    }
}
