package dk.easv;

import dk.gfx.Frame;

public class Main implements Runnable {

    private Frame frame;
    private boolean running = false;

    public void run(){
        while(running){
            frame = new Frame(this);
            running = false; // Stops infinite loop, incase you try to run it at this state
        }
    }

    public void start(){

        running = true; // Starts the app
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
