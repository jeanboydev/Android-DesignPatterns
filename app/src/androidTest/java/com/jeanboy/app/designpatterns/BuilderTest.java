package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.builder.strip.BigHotStrip;
import com.jeanboy.app.designpatterns.builder.strip.Builder;
import com.jeanboy.app.designpatterns.builder.strip.Director;
import com.jeanboy.app.designpatterns.builder.strip.HotStrip;
import com.jeanboy.app.designpatterns.builder.strip.SweetHotStrip;
import com.jeanboy.app.designpatterns.builder.strip.Taste;
import com.jeanboy.app.designpatterns.builder.strip.TasteHotStrip;
import com.jeanboy.app.designpatterns.builder.strip.TasteHotStripBuilder;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class BuilderTest {

    @Test
    public void testTasteHotStrip() {
        Builder builder = new TasteHotStripBuilder();
        Director director = new Director(builder);

        HotStrip hotStrip = new BigHotStrip();
//        hotStrip = new KissHotStrip();
        Taste taste = new SweetHotStrip();
//        taste = new SaltyHotStrip();

        director.construct(hotStrip, taste);//可传入任何类型，味道
        TasteHotStrip tasteHotStrip = builder.create();

        System.out.println(tasteHotStrip.toString());
    }
}
