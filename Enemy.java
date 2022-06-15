import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author Zhang
 * @version June 2
 */
public class Enemy extends Actor
{
    public static int speed = 3;
     
    // GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] run = new GreenfootImage[4];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created.
     */
    public Enemy()
    {
        for(int i = 0; i < run.length; i++)
        {
            run[i] = new GreenfootImage("images/Octupus/run" + i + ".png");
            run[i].scale(40, 40);
        }
        
        animationTimer.mark();
        
        // Initial elephant image.
        setImage(run[0]);
    }
    
    /**
     * Animate the Octupus
     */
    int imageIndex = 1;
    public void animateOctupus()
    {
        if(animationTimer.millisElapsed() < 100) {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")) {
            setImage(run[imageIndex]);
            imageIndex = (imageIndex + 1) % run.length;
        } else {
            setImage(run[imageIndex]);
            imageIndex = (imageIndex + 1) % run.length;
        }
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX() - 5, getY());
        
        if(getX() <= 70)
        {
            WombatWorld world = (WombatWorld) getWorld();
            world.decreaseLife();
            world.removeObject(this);
        }
        
        animateOctupus();
    }
}
