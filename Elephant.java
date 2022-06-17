import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Pokemon I don't know the name.
 * 
 * @author Zhang
 * @version May 25
 */
public class Elephant extends Actor
{   
    public static int size = 45;
    public static int speed = 3;
    
    // GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[6];
    GreenfootImage[] idleLeft = new GreenfootImage[6];
    
    // Direction the elephant is facing.
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created.
     */
    public Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/pokemon/idle" + i + ".png");
            idleRight[i].scale(size, size);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/pokemon/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(size, size);
        }
        
        animationTimer.mark();
        
        // Initial elephant image.
        setImage(idleRight[0]);
    }
    
    /**
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 100) {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")) {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        } else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    /**
     * Tells the runner to move when 'jkli'.
     * Check touch status (Chaser, Satoshi, Bomb).
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("j")) {
            move(-speed);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("l")) {
            move(speed);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("k")) {
            setLocation(getX(), getY() + speed);
        }
        if(Greenfoot.isKeyDown("i")) {
            setLocation(getX(), getY() - speed);
        }
        
        // Eat xiaozhi.
        getSpeed();
        
        // Game Over when touches the bomb.
        getBomb();
        
        // Animate the elephant.
        animateElephant();
    }
    
    /**
     * Check if runner touches Satoshi.
     */
    public void getSpeed()
    {
        // check if elephant - pokemon is touching xiaozhi
        if(isTouching(bonusForElephant.class)) {
            removeTouching(bonusForElephant.class);
            PokemonWorld world = (PokemonWorld) getWorld();
            speed += 3;
            world.increaseElephantSpeed();
        }
    }
    
    /**
     * Check if runner touches the bomb.
     */
    public void getBomb()
    {
        if(isTouching(Bomb.class)) {
            PTGameOver gameOverWorld = new PTGameOver();
            Greenfoot.setWorld(gameOverWorld);
            PTGameOver.isBomb.setValue("The runner touches the bomb.");
        }
    }
    
    /**
     * Get current runner speed.
     */
    public static int getSpd()
    {
       return speed;
    }
}
