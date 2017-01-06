package com.jeanboy.app.designpatterns.facade;

/**
 * Created by jeanboy on 2016/12/19.
 */

public class VoiceSystem {

    public void turnUp() {
        System.out.println("音量增大");
    }

    public void turnDown() {
        System.out.println("音量减小");
    }
}
