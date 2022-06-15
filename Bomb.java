import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author Zhang
 * @version May 30
 */
public class Bomb extends Actor
{
    int speed = 1;
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);
    }
    
    public Bomb()
    {
        GreenfootImage img = new GreenfootImage("bomb.png");
        img.scale(img.getWidth()/9, img.getHeight()/9);
        setImage(img);
    }
}
