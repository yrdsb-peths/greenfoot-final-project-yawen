import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Zhang
 * @version June 7
 */
public class HMTitleScreen extends World
{
    Label titleLabel = new Label("Horse Marathon", 50);
    Label spaceLabel = new Label("Press <space> to Start", 25);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public HMTitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1); 
        
        addObject(titleLabel, getWidth()/2, 150);
        addObject(spaceLabel, getWidth()/2, 200);
        prepare();
    }
    
    /**
     * The main world act loop.
     */
    public void act()
    {
        // Start the game if user presses the space bar.
        if(Greenfoot.isKeyDown("space")) {
            HorseWorld gameWorld = new HorseWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kangaroo horse = new Kangaroo();
        addObject(horse, 102, 245);
        
        HMDescription description = new HMDescription();
        addObject(description, 560, 290);
    }
}