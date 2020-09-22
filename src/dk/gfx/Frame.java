package dk.gfx;

import dk.easv.Main;

import javax.swing.*;

public class Frame extends JPanel  {

    private JFrame frame;

    private Main main;

    public Frame(Main main){
        this.main = main;
        frame = new JFrame("Title");
    }

}