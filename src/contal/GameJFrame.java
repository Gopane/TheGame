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

        gp = new GameJPanle();
        //Music.playMusic();
        setTitle("垃圾分类游戏");
        setIconImage(icon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,500);
        setLocationRelativeTo(null);
        add(gp);
        setVisible(true);

    }

    public GameJPanle getGp() {
        return gp;
    }
}
