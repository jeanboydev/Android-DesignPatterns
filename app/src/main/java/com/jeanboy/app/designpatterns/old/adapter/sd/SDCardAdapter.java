package com.jeanboy.app.designpatterns.old.adapter.sd;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class SDCardAdapter implements USBInterface {

    private SDCard card;

    public SDCardAdapter(SDCard card) {
        this.card = card;
    }

    @Override
    public String readData() {
        return card.getData();
    }
}
