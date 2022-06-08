import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Return here.
 * 
 * @author Zhang
 * @version June 7
 */
public class HMReturn extends Actor
{
    /**
     * Act - do whatever the Return wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HMTitleScreen());
        }
    }
    
    public HMReturn()
    {
        GreenfootImage img = new GreenfootImage("return.png");
        img.scale(img.getWidth()/7, img.getHeight()/7);
        setImage(img);
    }
}
