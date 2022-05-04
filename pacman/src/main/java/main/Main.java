package main;

/**
 * Main class, which is what will be ran
 */
public class Main {
    /**
     * main method that will instantiate and start our game panel
     */

    public static void main(String[] args){
        GamePanel gamePanel = new GamePanel();
        gamePanel.startThread();
    }
}
