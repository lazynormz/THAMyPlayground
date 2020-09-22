package dk.easv;

import dk.gfx.Frame;
import dk.input.KeyController;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Main implements Runnable {

    private Frame frame;
    private boolean running = false;

    KeyController kc;

    public void run(){
        while(running) {
            //running = false; // Stops infinite loop, incase you try to run it at this state

            this.frame.repaint();
        }

        this.frame.Exit();
    }

    public void stop(){
        this.frame.Exit();
        running = false;
    }

    public void start(){
        kc = new KeyController(this);
        frame = new Frame(this, kc);

        running = true; // Starts the app

        addKeyListener(kc);

        this.run();
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
