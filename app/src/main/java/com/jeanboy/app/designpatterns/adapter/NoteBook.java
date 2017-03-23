package com.jeanboy.app.designpatterns.adapter;

/**
 * Created by jeanboy on 2017/3/17.
 */

public class NoteBook {

    private ThreePlugInterface threePlugInterface;

    public NoteBook(ThreePlugInterface threePlugInterface) {
        this.threePlugInterface = threePlugInterface;
    }

    public void charge(){
        threePlugInterface.powerWithThree();
    }

    public static void main(String[] args){
        GBTwoPlug gbTwoPlug=new GBTwoPlug();

        ThreePlugInterface threePlugInterface=new TwoPlugAdapter(gbTwoPlug);
        NoteBook noteBook=new NoteBook(threePlugInterface);
        noteBook.charge();
    }
}