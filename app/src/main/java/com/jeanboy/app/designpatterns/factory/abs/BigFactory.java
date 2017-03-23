package com.jeanboy.app.designpatterns.factory.abs;

import com.jeanboy.app.designpatterns.factory.BigHotStrip;
import com.jeanboy.app.designpatterns.factory.HotStrip;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class BigFactory implements Provider {

    @Override
    public HotStrip produce() {
        return new BigHotStrip();
    }
}
