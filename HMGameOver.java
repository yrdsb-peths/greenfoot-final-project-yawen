import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Horse Marathon Game Over.
 * 
 * @author Zhang
 * @version June 7
 */
public class HMGameOver extends World
{
    Label titleLabel = new Label("Game Over", 50);
    Label timeLabel = new Label("You jumped: " + HorseWorld.getScore() + " m.", 35);
    
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public HMGameOver()
    {    
        super(600, 330, 1);
        
        // "Game Over".
        addObject(titleLabel, getWidth()/2, 100);
        // Survived time.
        addObject(timeLabel, getWidth()/2, 200);
        
        // Return arrow.
        HMReturn back = new HMReturn();
        addObject(back, 560, 297);
    }
}
