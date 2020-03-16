package com.company;

import java.awt.image.BufferedImage;

public class Receycle {
    BufferedImage image;
    int x,y;
    int w,h;

    public Receycle() {
        image = Data.getImage("/image/recycle.png");
        x = 220;y = 310;
        w = 110;h = 150;
    }
}
