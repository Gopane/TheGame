package contal;

import Utils.Music;
import javafx.scene.media.AudioClip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GameJFrame extends JFrame {

    GameJPanle gp;
    private Image icon = new ImageIcon("src/image/material/cat2.png").getImage();
    public GameJFrame() {

        //Music.playMusic();
        setTitle("垃圾分类游戏");
        setIconImage(icon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,500);
        setLocationRelativeTo(null);
        gp = new GameJPanle();
        add(gp.getJButton());
        add(gp.getJButtonre());
        add(gp);

        setVisible(true);

    }

    public GameJPanle getGp() {
        return gp;
    }
    //添加背景音乐

}
