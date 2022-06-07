import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameDes here.
 * 
 * @author Zhang
 * @version June 2
 */
public class WSGameDes extends World
{
    Label descriptionLabel0 = new Label("Shooter Wombat", 50);
    Label descriptionLabel1 = new Label("Wombat is the shooter, kill all bugs !", 20);
    Label descriptionLabel2 = new Label("awsd to move, space to shoot", 20);
    Label descriptionLabel3 = new Label("1 score is gained when Wombat killed the bug", 20);
    Label descriptionLabel4 = new Label("Game will ends after bug hits the base 3 times", 20);
    Label descriptionLabel5 = new Label("Good luck !", 20);
    
    /**
     * Constructor for objects of class GameDes.
     * 
     */
    public WSGameDes()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        addObject(descriptionLabel0, 300, 70);
        addObject(descriptionLabel1, 300, 150);
        addObject(descriptionLabel2, 300, 180);
        addObject(descriptionLabel3, 300, 210);
        addObject(descriptionLabel4, 300, 240);
        addObject(descriptionLabel5, 300, 270);
        
        WSReturn back = new WSReturn();
        addObject(back, 560, 297);
    }
}