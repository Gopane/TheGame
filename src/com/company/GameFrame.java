package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameFrame extends JPanel  implements ActionListener{
    private JFrame jf;
    private JButton start;
    private JButton exit;
    private JLabel jl;
    private Image icon = new ImageIcon("src/image/cat2.png").getImage();

    public GameFrame() {
        this.setSize(640,480);
        setBackground(new Color(143,188,143));
        jf = new JFrame("Garbage classification");

        jl = new JLabel("Garbage classification Game");
        jl.setFont(new Font("微软雅黑",Font.BOLD,40));
        jl.setBounds(30,30,640,200);


        start = new JButton("Start");
        start.setFont(new Font("微软雅黑",Font.BOLD,24));
        start.setForeground(Color.white);//白边框
        start.setContentAreaFilled(false);//消除背景
        start.setFocusPainted(false);//消除选择
        start.setBounds(255,300,130,30);

        exit = new JButton("Exit");
        exit.setFont(new Font("微软雅黑", Font.BOLD, 24));
        exit.setForeground(Color.white);
        exit.setContentAreaFilled(false);//消除背景
        exit.setFocusPainted(false);//消除选择
        exit.setBounds(255, 350, 130, 30);

        jf.setSize(640, 450);
        jf.setIconImage(icon);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(jl);
        jf.add(start);
        jf.add(exit);

        start.addActionListener(this);
        exit.addActionListener(this);
        jf.add(this);
        jf.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start) {
            jf.dispose();
            //建立游戏窗口
            StartGame st = null;
            try {
                st = new StartGame();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}
