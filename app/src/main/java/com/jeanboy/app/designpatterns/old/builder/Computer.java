package com.jeanboy.app.designpatterns.old.builder;

/**
 * Created by jeanboy on 2016/12/19.
 */

public abstract class Computer {

    protected int cpuCore = 1;
    protected int ramSize = 0;
    protected String osName = "Dos";


    public abstract void setCpuCore(int cpuCore);

    public abstract void setRamSize(int ramSize);

    public abstract void setOsName(String osName);
}
