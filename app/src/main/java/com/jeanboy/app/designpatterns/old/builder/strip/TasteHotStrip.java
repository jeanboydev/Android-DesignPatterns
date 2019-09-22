package com.jeanboy.app.designpatterns.old.builder.strip;

/**
 * Created by jeanboy on 2017/3/20.
 */

public class TasteHotStrip {

    private HotStrip type;
    private Taste taste;//味道

    public HotStrip getType() {
        return type;
    }

    public void setType(HotStrip type) {
        this.type = type;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "TasteHotStrip{" +
                "getType=" + type.getType() +
                ", taste=" + taste.getTaste() +
                '}';
    }
}