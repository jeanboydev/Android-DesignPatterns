package com.jeanboy.app.designpatterns.old.decorator;


/**
 * Created by jeanboy on 2017/3/21.
 */

public class PackageBridge extends Bridge {

    @Override
    public void pack() {
        System.out.println("包装辣条：" + getHotStrip().getType());
    }
}
