package dk.gfx;

import dk.easv.Main;
import dk.input.KeyController;

import javax.swing.*;
import java.awt.*;

public class Frame extends JPanel  {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    private JFrame frame;

    private Main main;
    private KeyController kc;

    public void Exit(){
        this.frame.dispose();
    }

    public Frame(Main main, KeyController kc){
        this.main = main;
        this.kc = kc;

        addKeyListener(kc);
        setFocusable(true);

        frame = new JFrame("Title");
        frame.setSize(new Dimension(Frame.WIDTH,Frame.HEIGHT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(this);
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
    }

}