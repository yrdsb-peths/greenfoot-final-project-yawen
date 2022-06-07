import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author Zhang
 * @version June 1
 */
public class Bear extends Actor
{
    public static int speed = 3;
     
    // GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] shoot = new GreenfootImage[4];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created.
     */
    public Bear()
    {
        for(int i = 0; i < shoot.length; i++)
        {
            shoot[i] = new GreenfootImage("images/Wombat/shoot" + i + ".png");
            shoot[i].scale(400, 70);
        }
        
        animationTimer.mark();
        
        // Initial elephant image.
        setImage(shoot[0]);
    }
    
    /**
     * Animate the Bear
     */
    int imageIndex = 1;
    public void animateBear()
    {
        if(animationTimer.millisElapsed() < 100) {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")) {
            setImage(shoot[imageIndex]);
            imageIndex = (imageIndex + 1) % shoot.length;
        } else {
            setImage(shoot[imageIndex]);
            imageIndex = (imageIndex + 1) % shoot.length;
        }
    }
    
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(WombatWorld.shootTime.millisElapsed() > 250 && (Greenfoot.isKeyDown("space")))
        {
            getWorld().addObject(new Bullet(), getX(), getY());
            // animateBear();
            WombatWorld.shootTime.mark();
        }
        
        // moving around.
        move();
        
        animateBear();
    }
    
    public void move()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 5);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 5);
        }
    }
}
