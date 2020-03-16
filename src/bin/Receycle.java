package bin;

import Data.Data;

import java.awt.image.BufferedImage;

public class Receycle {
    private BufferedImage image;
    private int x,y;
    private int w,h;

    public Receycle() {
        image = Data.getImage("/Image/bins/recycle.png");
        x = 220;y = 310;
        w = 110;h = 150;
    }

    public BufferedImage getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}
