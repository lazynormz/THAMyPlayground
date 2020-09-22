package dk.gfx;

import dk.easv.Main;

import javax.swing.*;
import java.awt.*;

public class Frame extends JPanel  {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    private JFrame frame;

    private Main main;

    public void Exit(){
        this.frame.dispose();
    }

    public Frame(Main main){
        this.main = main;
        frame = new JFrame("Title");
        frame.setSize(new Dimension(Frame.WIDTH,Frame.HEIGHT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(this);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
    }

}