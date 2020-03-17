package contal;

import Utils.Data;
import bin.Foodwaste;
import bin.Harmful;
import bin.Other;
import bin.Receycle;
import javafx.scene.input.KeyEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class GameJPanle extends JPanel implements ActionListener {

    BufferedImage background;
    Receycle rec ;
    Foodwaste fd;
    Other other;
    Harmful har;
    BufferedImage cloud1;
    BufferedImage cat3;
    BufferedImage click,boom1,boom2;
    private JButton battle,return1;
    int a;
    CheckpointJPanle cp;

    public GameJPanle(){
        setBackground(new Color(143,188,143));
        //获取路径
        setIamge();
        rec = new Receycle();
        fd = new Foodwaste();
        other = new Other();
        har = new Harmful();
        a = 300;
        movecloud();
        setJButton();
        battle.addActionListener(this);
        return1.addActionListener(this);
    }

    //初始化图片
    public void setIamge(){
        background = Data.getImage("/Image/material/bac.jpg");
        cloud1 = Data.getImage("/Image/material/clod1.png");
        cat3 = Data.getImage("/Image/material/cat3.png");
        click = Data.getImage("/Image/material/click.png");
        boom1 = Data.getImage("/Image/material/boom1.png");
        boom2 = Data.getImage("/Image/material/boom2.png");
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
        g.drawImage(boom1,270,100,150,150,null);
        g.drawImage(boom2,570,100,150,150,null);
        g.setColor(Color.BLACK);
        g.setFont(new Font("微软雅黑",Font.BOLD,24));

        g.drawString("自练",325,180);
        g.drawString("对战",625,180);
        battle.repaint();
        return1.repaint();
        repaint();

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

    //添加组件，可以写成一个类
    public JButton getJButton(){
        return battle;
    }

    //添加组件，可以写成一个类
    public JButton getJButtonre(){
        return return1;
    }

    //设置面板的按钮
    public void setJButton(){

                battle = new JButton();
                ImageIcon im = new ImageIcon("src/Image/material/click.png");
                battle.setContentAreaFilled(false);//消除背景
                //battle.setFocusPainted(false);//消除选择
                battle.setBorderPainted(false);//消除边框
                battle.setBounds(300,250,100,40);
                Image it = im.getImage().getScaledInstance(battle.getWidth() + 70, battle.getHeight() + 140, im.getImage().SCALE_DEFAULT);
                im =new ImageIcon(it);
                battle.setIcon(im);

                return1=new JButton();
                ImageIcon im1 = new ImageIcon("src/Image/material/return.png");
                return1.setContentAreaFilled(false);//消除背景
                return1.setFocusPainted(false);//消除选择
                return1.setBorderPainted(false);//消除边框
                return1.setBounds(900,370,100,100);
                Image it1 = im1.getImage().getScaledInstance(return1.getWidth(), return1.getHeight(), im1.getImage().SCALE_DEFAULT);
                im1 =new ImageIcon(it1);
                return1.setIcon(im1);

    }

   //监听器。监听按钮
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==return1){
            System.out.println("asd");
            StartGame.getJFrame().dispose();
            StartGame st = null;
            st = new StartGame();
            System.out.println("返回到菜单栏");
        }
        if(e.getSource()==battle){
            StartGame.getJFrame().remove(StartGame.getJFrame().getGp().getJButtonre());
            StartGame.getJFrame().remove(StartGame.getJFrame().getGp().getJButton());
            StartGame.getJFrame().remove(StartGame.getJFrame().getGp());

            StartGame.getJFrame().getGp().repaint();
            StartGame.getJFrame().getGp().getJButtonre().repaint();
            StartGame.getJFrame().getGp().getJButton().repaint();
            StartGame.getJFrame().setSize(1001,500);
            cp = new CheckpointJPanle();
            StartGame.getJFrame().add(cp);
        }
    }
}
