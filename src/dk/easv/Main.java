package dk.easv;

import dk.gfx.Frame;

public class Main implements Runnable {

    private Frame frame;
    private boolean running = false;

    public void run(){
        int x = 0;
        while(x < 10000000) {
            running = false; // Stops infinite loop, incase you try to run it at this state

            this.frame.repaint();
            x++;
        }
        this.frame.Exit();
    }

    public void start(){
        frame = new Frame(this);
        running = true; // Starts the app

        this.run();
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
