import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Control the background music. (stop)
 * 
 * @author Zhang
 * @version June 9
 */
public class stopSound extends Actor
{
    /**
     * When clicked, stop background music.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            FirstWorld.stop();
        }
    }
    
    public stopSound()
    {
        GreenfootImage img = new GreenfootImage("VolumeNo v2.png");
        img.scale(img.getWidth()/5, img.getHeight()/5);
        setImage(img);
    }
}
