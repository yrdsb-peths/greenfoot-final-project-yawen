import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sound here.
 * 
 * @author Zhang
 * @version June 9
 */
public class Sound extends Actor
{
    /**
     * Act - do whatever the Sound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            FirstWorld.music();
        }
    }
    
    public Sound()
    {
        GreenfootImage img = new GreenfootImage("Volume v2.png");
        img.scale(img.getWidth()/5, img.getHeight()/5);
        setImage(img);
    }
}
