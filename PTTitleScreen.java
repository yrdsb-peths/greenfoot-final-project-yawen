import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pokmeon Tag Title Screen.
 * 
 * @author Zhang
 * @version May 26
 */
public class PTTitleScreen extends World
{
    Label titleLabel = new Label("Pokemon Tag", 50);
    Label spaceLabel = new Label("Press <space> to Start", 25);
    Label instrucLabel = new Label("Use asdw & jkli", 25);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public PTTitleScreen()
    {    
        super(600, 330, 1); 
        
        // Title Screen Game Description.
        addObject(titleLabel, getWidth()/2, 150);
        addObject(spaceLabel, getWidth()/2, 200);
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
