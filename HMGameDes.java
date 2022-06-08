import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameDes here.
 * 
 * @author Zhang
 * @version June 7
 */
public class HMGameDes extends World
{
    Label descriptionLabel0 = new Label("Horse Marathon", 50);
    Label descriptionLabel1 = new Label("Always avoid the tree !", 20);
    Label descriptionLabel2 = new Label("Space to jump, a to dodge.", 20);
    Label descriptionLabel3 = new Label("Each time you press a, you only have 3 seconds.", 20);
    Label descriptionLabel4 = new Label("Game will ends after you touched the tree !", 20);
    Label descriptionLabel5 = new Label("Have fun running marathon !", 20);
    
    /**
     * Constructor for objects of class GameDes.
     * 
     */
    public HMGameDes()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        addObject(descriptionLabel0, 300, 70);
        addObject(descriptionLabel1, 300, 150);
        addObject(descriptionLabel2, 300, 180);
        addObject(descriptionLabel3, 300, 210);
        addObject(descriptionLabel4, 300, 240);
        addObject(descriptionLabel5, 300, 270);
        
        HMReturn back = new HMReturn();
        addObject(back, 560, 297);
    }
}
