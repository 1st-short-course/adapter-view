package com.example.rathana.adapterdemo;

public class Fruit {

    String title;
    int thumb;

    public Fruit(String title, int thumb) {
        this.title = title;
        this.thumb = thumb;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
