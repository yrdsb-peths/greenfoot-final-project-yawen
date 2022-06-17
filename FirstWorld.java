import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The menu of this game, choose game in this world.
 * Control background Music.
 * 
 * @author Zhang
 * @version June 7
 */
public class FirstWorld extends World
{
    public static GreenfootSound backgroundMusic = new GreenfootSound("background music v2.mp3");
    Label playThis = new Label("to play this", 20);
    
    /**
     * Constructor for objects of class FirstWorld.
     * 
     */
    public FirstWorld()
    {    
        super(600, 330, 1);
        backgroundMusic.playLoop();
        
        Label welcomeLabel = new Label("Choose a game.", 40);
        addObject(welcomeLabel, 300, 100);
        
        Apple apple = new Apple();
        addObject(apple, 150, 220);
        
        Bear bear = new Bear();
        addObject(bear, 300, 220);
        
        Kangaroo kangaroo = new Kangaroo();
        addObject(kangaroo, 450, 220);
        
        Sound sound = new Sound();
        addObject(sound, 40, 290);
        
        stopSound stopsound = new stopSound();
        addObject(stopsound, 100, 290);
        
        Label game1 = new Label("Press 1", 25);
        addObject(game1, 160, 170);
        
        Label game2 = new Label("Press 2", 25);
        addObject(game2, 300, 170);
        
        Label game3 = new Label("Press 3", 25);
        addObject(game3, 450, 170);
        
        Label playThis1 = new Label("to play this", 20);
        addObject(playThis1, 160, 260);
        
        Label playThis2 = new Label("to play this", 20);
        addObject(playThis2, 300, 260);
        
        Label playThis3 = new Label("to play this", 20);
        addObject(playThis3, 450, 260);
    }
    
    // Detect 1, 2, 3.
    // 1 = Pokemon, 2 = Wombat, 3 = Horse.
    public void act()
    {
        if(Greenfoot.isKeyDown("1") || Greenfoot.mouseClicked(Apple.class)) {
            PTTitleScreen titleScreen = new PTTitleScreen();
            Greenfoot.setWorld(titleScreen);
        }
        if(Greenfoot.isKeyDown("2") || Greenfoot.mouseClicked(Bear.class)) {
            WSTitleScreen titleScreen = new WSTitleScreen();
            Greenfoot.setWorld(titleScreen);
        }
        if(Greenfoot.isKeyDown("3") || Greenfoot.mouseClicked(Kangaroo.class)) {
            HMTitleScreen titleScreen = new HMTitleScreen();
            Greenfoot.setWorld(titleScreen);
        }
    }
    
    // Stop background Music.
    public static void stop()
    {
        backgroundMusic.stop();
    }
    
    // Start background Music.
    public static void music()
    {
        backgroundMusic.playLoop();
    }
}
