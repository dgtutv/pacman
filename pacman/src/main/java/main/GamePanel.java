package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    /**
     * Constructs a new GamePanel which calls setupScreen(), setupGame() and startGame().
     * This method is the default constructor, and is used for creating game instances
     */
    public GamePanel(){
        setupScreen();
        setupGame();
        startGame();
    }

    /**
     * Sets up our JFrame window, title, size and background color.
     * Also, makes the window DoubleBuffered and Focusable.
     */
    private void setupScreen() {

    }

    /**
     * Initializes all of GamePanel's attributes and assigns them to newly constructed objects for gameplay.
     * Also, sets the default gameState to titleState.
     */
    private void setupGame() {

    }

    /**
     * Pack's the window and makes it visible in the middle of the player's screen.
     */
    private void startGame() {

    }

    /**
     * Initializes and starts the GameThread
     */
    public void startThread(){

    }

    /**
     * Stops the gameThread previosuly started
     */
    public void stopThread(){

    }

    /**
     * This is the main method that runs the game, it implements a game loop with delta-style ticks.
     * Game is set to run at 60 FPS, and each frame/tick calls the proceeding update and paint methods.
     */
    @Override
    public void run() {

    }

    /**
     * Updates attributes that should be modified while the game is running, this includes;
     *      player and enemy locations
     *      gui score updates
     *      checks for game over, and level changes
     * @throws InterruptedException
     */
    protected void update() throws InterruptedException{

    }

    /**
     * Draws all the attributes that should be modified while the game is running, this includes;
     *      gui changes
     *      spawning enemies
     *      level changes
     *      animation
     *      player location
     *      map changes
     * @param g is a Graphics variable from the JPanel
     */
    protected void paintComponent(Graphics g){

    }
}
