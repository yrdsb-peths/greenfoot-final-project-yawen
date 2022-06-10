import greenfoot.*;

public class Kangaroo extends Actor
{
    private int jumpCounter = 0; // jump height.
    private int jumpSpeed; // time kangaroo stays in the sky.
    public static boolean isOnGround = true;
    
    private boolean start = true;
    static public boolean alive = true;
    public static int live = 3;
    
    GreenfootImage[] jump = new GreenfootImage[6];
    
    SimpleTimer dodgeTime = new SimpleTimer();
    SimpleTimer animationTimer = new SimpleTimer();
    public void act()
    {
        animateHorse();
        getImage().setTransparency(255);
        
        if(start)
        {
            live = 3;
            alive=true;
            start=false;
        }
        
        if(alive)
        {
            if(isOnGround)
            {
                jumpCounter = 5;
                if(jumpButton())
                {
                    setLocation(86, 271);
                    jumpSpeed = 5;
                    isOnGround = false;
                }
            }
            else
            {
                if((jumpButton() && jumpCounter <= 12))
                {
                    jumpCounter++;
                    move(20);
                }
                else
                {
                    jumpCounter = 20;
                    jumpSpeed--;
                    move(jumpSpeed);
                    if(getY() >= 257)
                    {
                        setLocation(86, 271);
                        isOnGround = true;
                    }
                }
            }
            if(isTouching(Tree.class))
            {
                // System.out.println(live);
                if(!dodgeButton() && live == 0) {
                    alive = false;
                    HMGameOver gameOverWorld = new HMGameOver();
                    Greenfoot.setWorld(gameOverWorld);
                } else if(dodgeButton()) {
                    alive = true;
                } else {
                    live = live - 1;
                    HorseWorld world = (HorseWorld) getWorld();
                    HorseWorld.decreaseLive(live);
                    removeTouching(Tree.class);
                }
            }
        }
    }
    
    public Kangaroo()
    {
        setRotation(270);
        for(int i = 0; i < jump.length; i++)
        {
            jump[i] = new GreenfootImage("images/Horse/jump" + i + ".png");
            jump[i].scale(60, 80);
            
            animationTimer.mark();
            
            setImage(jump[0]);
        }
    }
    
    int imageIndex = 0;
    public void animateHorse()
    {
        if(animationTimer.millisElapsed() < 100) {
            return;
        }
        animationTimer.mark();
        setImage(jump[imageIndex]);
        imageIndex = (imageIndex + 1) % jump.length;
    }
    
    private boolean jumpButton()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            HorseWorld world = (HorseWorld) getWorld();
            world.increaseScore();
            return true;
        }
        return false;
    }
    
    private boolean dodgeButton()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            dodgeTime.mark();
            getImage().setTransparency(50);
            if(dodgeTime.millisElapsed() == 3000) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public static int getLive()
    {
        return live;
    }
}