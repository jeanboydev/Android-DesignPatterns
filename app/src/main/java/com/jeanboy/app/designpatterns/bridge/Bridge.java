package com.jeanboy.app.designpatterns.bridge;

/**
 * Created by jeanboy on 2017/3/21.
 */

public abstract class Bridge {

    private HotStrip hotStrip;

    public HotStrip getHotStrip() {
        return hotStrip;
    }

    public void setHotStrip(HotStrip hotStrip) {
        this.hotStrip = hotStrip;
    }

    public abstract void pack();

}
