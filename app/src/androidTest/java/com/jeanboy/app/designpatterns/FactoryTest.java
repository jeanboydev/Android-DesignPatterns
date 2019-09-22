package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.old.factory.HotStrip;
import com.jeanboy.app.designpatterns.old.factory.HotStripFactory;
import com.jeanboy.app.designpatterns.old.factory.abs.BigFactory;
import com.jeanboy.app.designpatterns.old.factory.abs.Provider;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class FactoryTest {

    @Test
    public void testHotStrip() {
        HotStripFactory factory = new HotStripFactory();
        HotStrip hotStrip = factory.produce("kiss");
//        hotStrip = factory.produce("big");
        hotStrip.info();
    }

    @Test
    public void testAbstractHotStrip() {
        Provider provider = new BigFactory();
//         provider = new KissFactory();
        HotStrip hotStrip = provider.produce();
        hotStrip.info();
    }
}
