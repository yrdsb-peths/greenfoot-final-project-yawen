import greenfoot.*;

public class HorseWorld extends World
{
    // private int worldSpeed = 45;
    public static int score = 0;
    public static Label scoreLabel;
    public static Label liveLabel;
    
    public void act()
    {
        if(true)
        {
            addObject(new Tree(), 580, 300);
        }
    }
    
    public HorseWorld()
    {
        super(600, 330, 1);
        addObject(new Kangaroo(), 86, 271);
        
        scoreLabel = new Label(0, 25);
        addObject(scoreLabel, 530, 30);
        
        liveLabel = new Label("Live: " + Kangaroo.getLive(), 25);
        addObject(liveLabel, 50, 50);
        
        increaseScore();
        
        // Greenfoot.setSpeed(worldSpeed);
        //setPaintOrder(Tree.class, Kangaroo.class, MyWorld.class);
    }
    
    public static void increaseScore()
    {
        score += 1;
        scoreLabel.setValue("In-air: " + score);
    }
    
    public static int getScore()
    {
        return score;
    }
    
    public static void decreaseLive(int x)
    {
        liveLabel.setValue("Live: " + Kangaroo.getLive());
    }
}