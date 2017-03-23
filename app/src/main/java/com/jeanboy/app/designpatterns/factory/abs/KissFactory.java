package com.jeanboy.app.designpatterns.factory.abs;

import com.jeanboy.app.designpatterns.factory.HotStrip;
import com.jeanboy.app.designpatterns.factory.KissHotStrip;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class KissFactory implements Provider {

    @Override
    public HotStrip produce() {
        return new KissHotStrip();
    }
}
