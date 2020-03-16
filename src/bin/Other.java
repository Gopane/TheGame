package bin;

import Data.Data;

import java.awt.image.BufferedImage;

public class Other {
    private BufferedImage image;
    private int x,y;
    private int w,h;

    public Other() {
        image = Data.getImage("/Image/bins/other.png");
        x = 520;y = 310;
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
