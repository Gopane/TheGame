package contal;

import javax.swing.*;
import java.awt.*;

public class GameJFrame extends JFrame {

    private Image icon = new ImageIcon("src/image/material/cat2.png").getImage();
    public GameJFrame() {
        setTitle("垃圾分类游戏");
        setIconImage(icon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,500);
        setLocationRelativeTo(null);

        GameJPanle gp = new GameJPanle();
        add(gp);
        setVisible(true);

    }

}
