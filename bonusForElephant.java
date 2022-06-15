import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Add speed to Pokemon when intersect.
 * 
 * @author Zhang
 * @version May 27
 */
public class bonusForElephant extends Actor
{
    // GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] award = new GreenfootImage[4];
    
    // Direction the elephant is facing.
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created.
     */
    public bonusForElephant()
    {
        for(int i = 0; i < award.length; i++)
        {
            award[i] = new GreenfootImage("images/xiaozhi/award" + i + ".png");
            award[i].scale(30, 30);
        }
        
        animationTimer.mark();
        
        // Initial elephant image.
        setImage(award[0]);
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
    }
    
    /**
     * Act method.
     */
    public void act()
    {
        // Animate the elephant.
        animateElephant();
    }
}
