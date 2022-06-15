import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pokemon Tag Game World.
 * 
 * @author Zhang
 * @version May 20
 */
public class PokemonWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    Label appleSpeedLabel;
    Label elephantSpeedLabel;
    Label timeLabel;
    public static SimpleTimer gameTime = new SimpleTimer();
    
    /**
    * Constructor for objects of class MyWorld.
    * 
    */
    public PokemonWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        gameTime.mark();
        
        // Create a score label.
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 65, 40);
    
        // Create an apple speed label.
        appleSpeedLabel = new Label(0, 25);
        addObject(appleSpeedLabel, 450, 40);
        
        // Create an elephant speed label.
        elephantSpeedLabel = new Label(0, 25);
        addObject(elephantSpeedLabel, 450, 80);
        
        // Create a chaser survived time label.
        timeLabel = new Label(0, 20);
        addObject(timeLabel, 130, 300);
        
        // Spawn Elephant.
        Elephant e = new Elephant();
        addObject(e, 300, 350);
        
        // Spawn Apple.
        Apple a = new Apple();
        addObject(a, Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(300));
    }
    
    /**
     * Spawn new runner to the Game World.
     */
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(580);
        int y = Greenfoot.getRandomNumber(300);
        Greenfoot.delay(40);
        Elephant elephant = new Elephant();
        addObject(elephant, x, y);
    }
    
    /**
     * Increase Score and check score status.
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        // 6 --> spawn speed+
        if(score % 6 == 0) {
            bonusForElephant xiaozhi = new bonusForElephant();
            addObject(xiaozhi, Greenfoot.getRandomNumber(580), Greenfoot.getRandomNumber(320));
        }
        // 1 --> print survived time
        if(score % 1 == 0) {
            timeLabel.setValue("Survived " + gameTime.millisElapsed()/1000 + " seconds.");
        }
        // 32 --> game over
        if(score == 32) {
            PTGameOver gameOverWorld = new PTGameOver();
            Greenfoot.setWorld(gameOverWorld);
        }
        // 4 --> spawn bomb
        if(score % 4 == 0) {
            Bomb bomb = new Bomb();
            addObject(bomb, Greenfoot.getRandomNumber(580), 0);
        }
    }
    
    /**
     * Increase Chaser speed.
     */
    public void increaseAppleSpeed()
    {
        appleSpeedLabel.setValue("Chaser Speed: " + Apple.getSpd());
    }
    
    /**
     * Increase Runner speed.
     */
    public void increaseElephantSpeed()
    {
        elephantSpeedLabel.setValue("Runner Speed: " + Elephant.getSpd());
    }
    
    /**
     * Get current Runner survived time.
     */
    public static int getGameTime()
    {
        return gameTime.millisElapsed()/1000;
    }
}
