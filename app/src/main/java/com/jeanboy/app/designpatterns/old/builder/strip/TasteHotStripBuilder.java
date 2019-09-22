package com.jeanboy.app.designpatterns.old.builder.strip;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class TasteHotStripBuilder implements Builder {

    private TasteHotStrip tasteHotStrip = new TasteHotStrip();

    @Override
    public void buildType(HotStrip type) {
        tasteHotStrip.setType(type);
    }

    @Override
    public void buildTaste(Taste taste) {
        tasteHotStrip.setTaste(taste);
    }

    @Override
    public TasteHotStrip create() {
        return tasteHotStrip;
    }
}
