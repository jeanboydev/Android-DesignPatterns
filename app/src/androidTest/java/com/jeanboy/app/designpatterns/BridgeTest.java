package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.bridge.BigHotStrip;
import com.jeanboy.app.designpatterns.bridge.Bridge;
import com.jeanboy.app.designpatterns.bridge.HotStrip;
import com.jeanboy.app.designpatterns.bridge.KissHotStrip;
import com.jeanboy.app.designpatterns.bridge.PackageBridge;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class BridgeTest {

    @Test
    public void testBridge() {

        Bridge bridge = new PackageBridge();

        HotStrip hotStrip1 = new KissHotStrip();
        bridge.setHotStrip(hotStrip1);
        bridge.pack();

        HotStrip hotStrip2 = new BigHotStrip();
        bridge.setHotStrip(hotStrip2);
        bridge.pack();
    }
}