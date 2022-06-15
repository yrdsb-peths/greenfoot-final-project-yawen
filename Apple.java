import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Pikachu.
 * 
 * @author Zhang
 * @version May 25
 */
public class Apple extends Actor
{
    public static int size = 70;
    public static int speed = 3;
    
    // GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] runRight = new GreenfootImage[4];
    GreenfootImage[] runLeft = new GreenfootImage[4];
    
    // Direction the elephant is facing.
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created.
     */
    public Apple()
    {
        for(int i = 0; i < runRight.length; i++)
        {
            runRight[i] = new GreenfootImage("images/pikachu/run" + i + ".png");
            runRight[i].scale(size, size);
        }
        
        for(int i = 0; i < runLeft.length; i++)
        {
            runLeft[i] = new GreenfootImage("images/pikachu/run" + i + ".png");
            runLeft[i].mirrorHorizontally();
            runLeft[i].scale(size, size);
        }
        
        animationTimer.mark();
        
        // Initial elephant image.
        setImage(runRight[0]);
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
            setImage(runRight[imageIndex]);
            imageIndex = (imageIndex + 1) % runRight.length;
        } else {
            setImage(runLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % runLeft.length;
        }
    }
    
    /**
     * Tells the chaser to move when 'asdw'.
     * Check touch status (Runner, Satoshi, Bomb).
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")) {
            move(-speed);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("d")) {
            move(speed);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed);
        }
        if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed);
        }
        
        // Eat elephant - pokemon
        eat();
        
        // Eat xiaozhi.
        getSpeed();
        
        //Game Over when touches the bomb.
        getBomb();
        
        // Animate the elephant.
        animateElephant();
    }
    
    /**
     * Check if chaser touches runner.
     */
    public void eat()
    {
        // check if apple is touching elephant
        if(isTouching(Elephant.class)) {
            removeTouching(Elephant.class);
            PokemonWorld world = (PokemonWorld) getWorld();
            world.spawnApple();
            world.increaseScore();
        }
    }

    /**
     * Check if chaser touches Satoshi.
     */
    public void getSpeed()
    {
        // check if elephant - pokemon is touching xiaozhi
        if(isTouching(bonusForElephant.class)) {
            removeTouching(bonusForElephant.class);
            PokemonWorld world = (PokemonWorld) getWorld();
            speed += 3;
            world.increaseAppleSpeed();
        }
    }
    
    /**
     * Check if chaser touches the bomb.
     */
    public void getBomb()
    {
        if(isTouching(Bomb.class)) {
            PTGameOver gameOverWorld = new PTGameOver();
            Greenfoot.setWorld(gameOverWorld);
            PTGameOver.isBomb.setValue("The chaser touches the bomb.");
        }
    }
    
    /**
     * Get current chaser speed.
     */
    public static int getSpd()
    {
        return speed;
    }
}
