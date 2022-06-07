import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + 5, getY());
        
        eat();
        
        if(getX() > 598)
        {
            getWorld().removeObject(this);
        }
        
    }
    
    public Bullet()
    {
        GreenfootImage img = new GreenfootImage("red-draught.png");
        img.scale(img.getWidth()/2, img.getHeight()/2);
        setImage(img);
    }
    
    public void eat()
    {
        if(isTouching(Enemy.class)) {
            removeTouching(Enemy.class);
            WombatWorld world = (WombatWorld) getWorld();
            world.spawnEnemy();
            world.increaseScore();
        }
    }
}