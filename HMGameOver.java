import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author Zhang
 * @version June 7
 */
public class HMGameOver extends World
{
    Label titleLabel = new Label("Game Over", 50);
    Label timeLabel = new Label("You ran: " + HorseWorld.getScore() + " m.", 35);
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public HMGameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        addObject(titleLabel, getWidth()/2, 100);
        
        HMReturn back = new HMReturn();
        addObject(back, 560, 297);
        
        addObject(timeLabel, getWidth()/2, 200);
    }
}
