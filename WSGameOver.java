import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Wombat Shoot Game Over.
 * 
 * @author Zhang
 * @version June 1
 */
public class WSGameOver extends World
{
    Label titleLabel = new Label("Game Over", 50);
    Label finalScoreLabel = new Label("Wombat killed: " + WombatWorld.getScore() + " bugs.", 35);
    
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public WSGameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        // "Game Over".
        titleLabel.setLineColor(Color.WHITE);
        titleLabel.setFillColor(Color.WHITE);
        addObject(titleLabel, getWidth()/2, 100);
        
        // Shot bug number.
        finalScoreLabel.setLineColor(Color.WHITE);
        finalScoreLabel.setFillColor(Color.WHITE);
        addObject(finalScoreLabel, getWidth()/2, 200);
        
        // Return arrow.
        WSReturn back = new WSReturn();
        addObject(back, 560, 297);
    }
}
