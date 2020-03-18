package contal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckpointJPanle extends JPanel {

    public CheckpointJPanle() {
        setBackground(new Color(143,188,143));
        setLayout(null);
        JButton a = new JButton("返回");
        a.setBounds(100,100,255,255);
        add(a);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StartGame.getJFrame().getGp().setVisible(true);
                GameJPanle.getCp().setVisible(false);
            }
        });
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }
}
