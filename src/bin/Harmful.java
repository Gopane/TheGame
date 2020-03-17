package bin;

import Utils.Data;

import java.awt.image.BufferedImage;

public class Harmful {
    private BufferedImage image;
    private int x,y;
    private int w,h;

    public Harmful() {
        image = Data.getImage("/Image/bins/harmful.png");
        x = 670;y = 310;
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
