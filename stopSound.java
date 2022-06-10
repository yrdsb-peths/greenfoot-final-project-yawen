import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stopSound here.
 * 
 * @author Zhang
 * @version June 9
 */
public class stopSound extends Actor
{
    /**
     * Act - do whatever the stopSound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
