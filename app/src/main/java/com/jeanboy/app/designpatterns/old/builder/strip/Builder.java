package com.jeanboy.app.designpatterns.old.builder.strip;

/**
 * Created by jeanboy on 2017/3/20.
 */

public interface Builder {


    void buildType(HotStrip type);

    void buildTaste(Taste taste);

    TasteHotStrip create();
}
