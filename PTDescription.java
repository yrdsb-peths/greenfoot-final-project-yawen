import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Description Button in Pokemon Tag.
 * 
 * @author Zhang
 * @version May 30
 */
public class PTDescription extends Actor
{
    /**
     * Act - do whatever the Description wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new PTGameDes());
        }
    }
    
    public PTDescription()
    {
        GreenfootImage img = new GreenfootImage("book.png");
        img.scale(img.getWidth()/7, img.getHeight()/7);
        setImage(img);
    }
}
