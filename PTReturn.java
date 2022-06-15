import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Return botton in Pokemon Tag.
 * 
 * @author Zhang
 * @version May 30
 */
public class PTReturn extends Actor
{
    /**
     * Act - do whatever the Return wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new PTTitleScreen());
        }
    }
    
    public PTReturn()
    {
        GreenfootImage img = new GreenfootImage("return.png");
        img.scale(img.getWidth()/7, img.getHeight()/7);
        setImage(img);
    }
}
