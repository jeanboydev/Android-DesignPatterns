package com.jeanboy.app.designpatterns.old.factory.abs;

import com.jeanboy.app.designpatterns.old.factory.BigHotStrip;
import com.jeanboy.app.designpatterns.old.factory.HotStrip;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class BigFactory implements Provider {

    @Override
    public HotStrip produce() {
        return new BigHotStrip();
    }
}
