package com.jeanboy.app.designpatterns.old.decorator;

import com.jeanboy.app.designpatterns.old.bridge.HotStrip;

/**
 * Created by jeanboy on 2017/3/21.
 */

public abstract class Bridge implements Packer{

    private HotStrip hotStrip;

    public HotStrip getHotStrip() {
        return hotStrip;
    }

    public void setHotStrip(HotStrip hotStrip) {
        this.hotStrip = hotStrip;
    }

}
