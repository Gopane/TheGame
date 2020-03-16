package com.company;

import java.awt.image.BufferedImage;

public class Foodwaste {
    BufferedImage image;
    int x,y;
    int w,h;

    public Foodwaste() {
        image = Data.getImage("/image/foot_waste.png");
        x = 370;y = 310;
        w = 110;h = 150;
    }
}
