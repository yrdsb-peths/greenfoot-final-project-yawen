import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Zhang
 * @version May 26
 */
public class PTTitleScreen extends World
{
    Label titleLabel = new Label("Pokemon Tag", 50);
    Label spaceLabel = new Label("Press <space> to Start", 25);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public PTTitleScreen()
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
            PokemonWorld gameWorld = new PokemonWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant, 460, 110);
        
        Apple apple = new Apple();
        addObject(apple, 100, 200);
        
        PTDescription description = new PTDescription();
        addObject(description, 560, 290);
        
        Home home = new Home();
        addObject(home, 35, 35);
    }
}
