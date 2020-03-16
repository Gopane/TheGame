package com.company;

import java.awt.image.BufferedImage;

public class Harmful {
    BufferedImage image;
    int x,y;
    int w,h;

    public Harmful() {
        image = Data.getImage("/image/harmful.png");
        x = 670;y = 310;
        w = 110;h = 150;
    }

}
