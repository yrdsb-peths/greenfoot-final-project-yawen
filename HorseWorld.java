import greenfoot.*;

/**
 * Horse Marathon Game World.
 * 
 * @author Zhang
 * @version June 7
 */
public class HorseWorld extends World
{
    public static int score = 0;
    public static Label scoreLabel;
    public static Label liveLabel;
    
    /**
     * The act method, add tree to the world.
     */
    public void act()
    {
        if(true)
        {
            addObject(new Tree(), 580, 300);
        }
    }
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public HorseWorld()
    {
        super(600, 330, 1);
        addObject(new Kangaroo(), 86, 271);
        
        scoreLabel = new Label(0, 25);
        addObject(scoreLabel, 530, 30);
        
        liveLabel = new Label("Live: " + Kangaroo.getLive(), 25);
        addObject(liveLabel, 50, 50);
        
        increaseScore();
    }
    
    /**
     * Increase score when jumping.
     */
    public static void increaseScore()
    {
        score += 1;
        scoreLabel.setValue("In-air: " + score);
    }
    
    /**
     * Get current score.
     */
    public static int getScore()
    {
        return score;
    }
    
    /**
     * Set how many lives are left for the Kangaroo.
     */
    public static void decreaseLive(int x)
    {
        liveLabel.setValue("Live: " + Kangaroo.getLive());
    }
}