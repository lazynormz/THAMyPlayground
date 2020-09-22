package dk.gfx;

import dk.easv.Main;

import javax.swing.*;
import java.awt.*;

public class Frame extends JPanel  {

    private JFrame frame;

    private Main main;

    public void Exit(){
        this.frame.dispose();
    }

    public Frame(Main main){
        this.main = main;
        frame = new JFrame("Title");
        frame.setSize(new Dimension(600,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}