package com.jeanboy.app.designpatterns.old.factory.abs;

import com.jeanboy.app.designpatterns.old.factory.HotStrip;
import com.jeanboy.app.designpatterns.old.factory.KissHotStrip;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class KissFactory implements Provider {

    @Override
    public HotStrip produce() {
        return new KissHotStrip();
    }
}
