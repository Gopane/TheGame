package contal;

import Data.Data;
import bin.Foodwaste;
import bin.Harmful;
import bin.Other;
import bin.Receycle;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameJPanle extends JPanel {

    BufferedImage background;
    Receycle rec ;
    Foodwaste fd;
    Other other;
    Harmful har;
    BufferedImage cloud1;
    BufferedImage cat3;

    int a;

    public GameJPanle(){
        setBackground(new Color(143,188,143));
        //获取路径
        background = Data.getImage("/Image/material/bac.jpg");
        rec = new Receycle();
        fd = new Foodwaste();
        other = new Other();
        har = new Harmful();
        cloud1 = Data.getImage("/Image/material/clod1.png");
        cat3 = Data.getImage("/Image/material/cat3.png");
        a = 300;
        movecloud();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画循环垃圾箱,坐标，宽高
        g.drawImage(background,0,0,1200,500,null);
        g.drawImage(rec.getImage(),rec.getX(),rec.getY(),rec.getW(),rec.getH(),null);
        g.drawImage(fd.getImage(),fd.getX(),fd.getY(),fd.getW(),fd.getH(),null);
        g.drawImage(other.getImage(),other.getX(),other.getY(),other.getW(),other.getH(),null);
        g.drawImage(har.getImage(),har.getX(),har.getY(),har.getW(),har.getH(),null);
        g.drawImage(cloud1,a,20,200,200,null);
        g.drawImage(cat3,800,370,100,100,null);

    }


    public void movecloud(){
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    a = a - 2;
                    repaint();
                    if(a==-200){
                        a = 1000;
                    }
                    try {
                        Thread.sleep(120);
                        repaint();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
