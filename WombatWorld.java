import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Wombat Shoot Game World.
 * 
 * @author Zhang
 * @version May 30
 */
public class WombatWorld extends World
{
    public static SimpleTimer shootTime = new SimpleTimer();
    public static int score = 0;
    Label scoreLabel;
    Label lifeLabel;
    public static int life = 3;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public WombatWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        lifeLabel = new Label("Life: 3", 25);
        addObject(lifeLabel, 67,270);
        
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 65, 40);
        
        // add bear to the world.
        addObject(new Bear(), 200, 200);
        shootTime.mark();
        
        // add base to the world.
        addObject(new Base(), 70, 200);
        
        // spawn enemy after 100 millis seconds.    
        spawnEnemy();
    }
    
    /**
     * Spawn an enemy to the Game World.
     */
    public void spawnEnemy()
    {
        Enemy enemy = new Enemy();
        int x = 600;
        int y = Greenfoot.getRandomNumber(570);
        addObject(enemy, x, y);
    }
    
    /**
     * Increase Score.
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Decrease Live.
     */
    public void decreaseLife()
    {
        if(life <= 1)
        {
            WSGameOver gameOverWorld = new WSGameOver();
            Greenfoot.setWorld(gameOverWorld);
        }
        life--;
        lifeLabel.setValue("Life: " + life);
        spawnEnemy();
    }
    
    /**
     * Set how many lives are left for the Base.
     */
    public void setLife(int x)
    {
        life = x;
    }
    
    /**
     * Get current score.
     */
    public static int getScore()
    {
        return score;
    }
}
