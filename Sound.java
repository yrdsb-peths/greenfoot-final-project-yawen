import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Control the background music. (start)
 * 
 * @author Zhang
 * @version June 9
 */
public class Sound extends Actor
{
    /**
     * When clicked, play background music.
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
