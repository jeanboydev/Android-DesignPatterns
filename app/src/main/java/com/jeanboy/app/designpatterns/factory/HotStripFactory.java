package com.jeanboy.app.designpatterns.factory;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class HotStripFactory {

    public HotStrip produce(String type) {
        if ("kiss".equals(type)) {
            return new KissHotStrip();
        } else if ("big".equals(type)) {
            return new BigHotStrip();
        }
        return null;
    }
}
