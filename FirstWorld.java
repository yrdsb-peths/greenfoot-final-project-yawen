import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstWorld extends World
{
    public static GreenfootSound backgroundMusic = new GreenfootSound("background music v2.mp3");
    
    /**
     * Constructor for objects of class FirstWorld.
     * 
     */
    public FirstWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        backgroundMusic.playLoop();
        
        Label welcomeLabel = new Label("Choose a game", 40);
        addObject(welcomeLabel, 300, 100);
        
        Apple apple = new Apple();
        addObject(apple, 100, 200);
        
        Bear bear = new Bear();
        addObject(bear, 250, 200);
        
        Kangaroo kangaroo = new Kangaroo();
        addObject(kangaroo, 400, 200);
        
        Sound sound = new Sound();
        addObject(sound, 40, 290);
        
        stopSound stopsound = new stopSound();
        addObject(stopsound, 100, 290);
        
        Label game1 = new Label("1", 25);
        addObject(game1, 115, 150);
        
        Label game2 = new Label("2", 25);
        addObject(game2, 255, 150);
        
        Label game3 = new Label("3", 25);
        addObject(game3, 400, 150);
    }
    
    public void act()
    {
        /*MouseInfo mouse =  Greenfoot.getMouseInfo();
        if(mouse!=null) {
            if(mouse.getX() == 40 && mouse.getY() == 290) {
                backgroundMusic.stop();
                addObject(new stopSound(), 40, 290);
            }
        }
        if(mouse!=null) {
            if(mouse.getX() == 60 && mouse.getY() == 290) {
                backgroundMusic.playLoop();
                addObject(new Sound(), 40, 290);
            }
        }*/
        
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
    
    public static void stop()
    {
        backgroundMusic.stop();
    }
    
    public static void music()
    {
        backgroundMusic.playLoop();
    }
}
