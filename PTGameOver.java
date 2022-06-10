import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pokemon Tag Game Over.
 * 
 * @author Zhang
 * @version May 30
 */
public class PTGameOver extends World
{
    Label titleLabel = new Label("Game Over", 50);
    Label timeLabel = new Label("Chaser survived: " + PokemonWorld.getGameTime() + " seconds.", 35);
    public static Label isBomb = new Label(0, 30);
    
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public PTGameOver()
    {    
        super(600, 330, 1);
        
        // "Game Over".
        addObject(titleLabel, getWidth()/2, 100);
        
        // Return arrow.
        PTReturn back = new PTReturn();
        addObject(back, 560, 297);
        
        // Chaser survived time.
        addObject(timeLabel, getWidth()/2, 200);
        
        // Does actor touch the bomb check.
        addObject(isBomb, getWidth()/2, 250);
    }
}
