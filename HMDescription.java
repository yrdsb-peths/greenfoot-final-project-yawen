import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Description here.
 * 
 * @author Zhang
 * @version June 7
 */
public class HMDescription extends Actor
{
    /**
     * Act - do whatever the Description wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HMGameDes());
        }
    }
    
    public HMDescription()
    {
        GreenfootImage img = new GreenfootImage("book.png");
        img.scale(img.getWidth()/7, img.getHeight()/7);
        setImage(img);
    }
}