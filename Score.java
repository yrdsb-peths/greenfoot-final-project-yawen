import greenfoot.*;
public class Score extends Actor
{
    public int score = 0;
    static public int showScore = 0;
    private int lastScore;
    static public int highScore = 0;
    public void act() 
    {
        if(Kangaroo.alive)
        {
            score++;
            showScore = score;
            if(showScore<0)
            {
                showScore = 0;
                setImage(new GreenfootImage("High: " +highScore + "     "+ showScore, 24, Color.GRAY, Color.WHITE));
            }
            showScore = showScore/5;
            if(lastScore!=showScore)
            {
                print(showScore+"");
                setImage(new GreenfootImage("High: " +highScore + "     "+ showScore, 24, Color.GRAY, Color.WHITE));
            }
            lastScore = showScore;
        }
    }
    public void print(String pText)
    {
        clear();
        getImage().drawImage(new GreenfootImage(pText, 20, Color.BLACK, new Color(1, 1, 1, 1)),10,10);
    }
    public void clear()
    {
        getImage().clear();
        setImage("images/Score.png");
    }
    static public void consolePrint(String message, String preMessage)
    {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(preMessage);
            System.out.println(message);
    }
    protected void addedToWorld(World world)
    {
        setLocation(475, 30);
        setImage("images/Score.png");
        setImage(new GreenfootImage("High: " +highScore + "     "+ "0", 24, Color.GRAY, Color.WHITE));
    }
}