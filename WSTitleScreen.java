import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Wombat Shoot Title Screen.
 * 
 * @author Zhang
 * @version June 2
 */
public class WSTitleScreen extends World
{
    Label titleLabel = new Label("Shooter Wombat", 50);
    Label spaceLabel = new Label("Press <space> to Start", 25);
    Label instrucLabel = new Label("Use asdw & space", 25);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public WSTitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1); 
        
        // Title Screen Game Description.
        titleLabel.setLineColor(Color.WHITE);
        titleLabel.setFillColor(Color.WHITE);
        addObject(titleLabel, getWidth()/2, 150);
        spaceLabel.setLineColor(Color.WHITE);
        spaceLabel.setFillColor(Color.WHITE);
        addObject(spaceLabel, getWidth()/2, 200);
        instrucLabel.setLineColor(Color.WHITE);
        instrucLabel.setFillColor(Color.WHITE);
        addObject(instrucLabel, getWidth()/2, 250);
        
        prepare();
    }
    
    /**
     * The main world act loop.
     * That is: create the game world.
     */
    public void act()
    {
        // Start the game if user presses the space bar.
        if(Greenfoot.isKeyDown("space")) {
            WombatWorld gameWorld = new WombatWorld();
            gameWorld.setLife(3);
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bear bear = new Bear();
        addObject(bear, 114, 247);
        
        WSDescription description = new WSDescription();
        addObject(description, 560, 290);
        
        Home home = new Home();
        addObject(home, 35, 35);
    }
}