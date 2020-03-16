package com.company;

import java.awt.image.BufferedImage;

public class Other {
    BufferedImage image;
    int x,y;
    int w,h;

    public Other() {
        image = Data.getImage("/image/other.png");
        x = 520;y = 310;
        w = 110;h = 150;
    }
}
