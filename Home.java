import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author Zhang
 * @version June 9
 */
public class Home extends Actor
{
    /**
     * Act - do whatever the Home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage img = new GreenfootImage("Home v2.png");
        img.scale(55, 45);
        setImage(img);
        
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new FirstWorld());
            //FirstWorld.stop();
        }
    }
}
