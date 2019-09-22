package com.jeanboy.app.designpatterns.old.adapter.sd;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class Computer {

    public void showData(USBInterface usb) {
        System.out.println(usb.readData());
    }
}
