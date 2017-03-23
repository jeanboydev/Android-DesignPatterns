package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.adapter.sd.Computer;
import com.jeanboy.app.designpatterns.adapter.sd.SDCard;
import com.jeanboy.app.designpatterns.adapter.sd.SDCardAdapter;
import com.jeanboy.app.designpatterns.adapter.sd.USBInterface;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class AdapterTest {

    @Test
    public void testAdapter() {
        SDCard card = new SDCard();
        card.setData("SD Card 保存的数据！");

        USBInterface usb = new SDCardAdapter(card);

        Computer computer = new Computer();
        computer.showData(usb);
    }
}