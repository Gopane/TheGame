package contal;

import Manage.UserQu_imp;
import bin.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartGame extends JPanel  implements ActionListener{
    private JFrame jf;
    private JButton start,exit,keep;
    private JLabel jl,jl2;
    private JTextField jt;
    private Image icon = new ImageIcon("src/Image/material/cat2.png").getImage();
    private Image back =new ImageIcon("src/Image/material/bc2.png").getImage();

    public StartGame() {
        this.setSize(640,480);
        setBackground(new Color(143,188,143));
        jf = new JFrame("Garbage classification");

        jl = new JLabel("");
        jl.setFont(new Font("微软雅黑",Font.BOLD,40));
        jl.setBounds(30,30,640,200);

        jl2 = new JLabel("Name:");
        jl2.setFont(new Font("微软雅黑",Font.BOLD,40));
        jl2.setBounds(150,120,200,100);

        jt = new JTextField();
        jt.setFont(new Font("微软雅黑",Font.BOLD,18));
        jt.setBounds(290, 160, 200, 30);

        start = new JButton("Start");
        start.setFont(new Font("微软雅黑",Font.BOLD,24));
        start.setForeground(Color.black);//白边框
        start.setContentAreaFilled(false);//消除背景
        start.setFocusPainted(false);//消除选择
        start.setBounds(255,250,130,30);

        keep = new JButton("Keep");
        keep.setFont(new Font("微软雅黑",Font.BOLD,24));
        keep.setForeground(Color.black);//白边框
        keep.setContentAreaFilled(false);//消除背景
        keep.setFocusPainted(false);//消除选择
        keep.setBounds(255,300,130,30);

        exit = new JButton("Exit");
        exit.setFont(new Font("微软雅黑", Font.BOLD, 24));
        exit.setForeground(Color.black);
        exit.setContentAreaFilled(false);//消除背景
        exit.setFocusPainted(false);//消除选择
        exit.setBounds(255, 350, 130, 30);

        jf.setSize(640, 450);
        jf.setIconImage(icon);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jf.add(jl2);
        jf.add(jl);
        jf.add(jt);
        jf.add(start);
        jf.add(keep);
        jf.add(exit);

        start.addActionListener(this);
        exit.addActionListener(this);
        jf.add(this);
        jf.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(back,150,-35,320,480,this);

        jl.repaint();
        jl2.repaint();
        start.repaint();
        keep.repaint();
        exit.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start) {
            UserQu_imp u = new UserQu_imp();
            User user = new User(jt.getText());
            System.out.println(u.ischar(user.getName()));
            jf.dispose();
            //建立游戏窗口
            GameJFrame st = null;
            try {
                st = new GameJFrame();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource()== keep){

        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }



    public static void main(String[] args) {
        new StartGame();
    }

}
