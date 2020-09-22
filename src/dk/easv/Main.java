package dk.easv;

public class Main implements runnable{

    private boolean running = false;

    public void run(){
        while(running){
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
