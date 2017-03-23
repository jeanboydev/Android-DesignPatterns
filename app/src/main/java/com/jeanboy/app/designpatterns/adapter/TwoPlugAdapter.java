package com.jeanboy.app.designpatterns.adapter;

/**
 * Created by jeanboy on 2017/3/17.
 */

class TwoPlugAdapter implements ThreePlugInterface {

    GBTwoPlug gbTwoPlug;

    public TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
        this.gbTwoPlug = gbTwoPlug;
    }

    @Override
    public void powerWithThree() {
        gbTwoPlug.powerWithTwo();
    }
}