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
     * Shoot bullets from the bear actor.
     * Kills enemy when intersect.
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
    
    /**
     * Check if bullet touches the enemy.
     */
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