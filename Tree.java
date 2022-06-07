import greenfoot.*;
public class Tree extends Actor
{
    private boolean start = true;
  
    private boolean topWing = true;
   
    private int counter = 0;
    public void act()
    {
        if(Kangaroo.alive||Greenfoot.isKeyDown("a")&&Greenfoot.isKeyDown("ctrl"))
        {
            counter++;
            if(start)
            {
                start = false;
                setLocation(140, 600);
                
                if(Greenfoot.getRandomNumber(5)==0)
                {
                    setImage("images/tree3.png");
                }
                else if(Greenfoot.getRandomNumber(4)==0)
                {
                    setImage("images/tree3.png");
                    setLocation(170, 589);
                }
                else if(Greenfoot.getRandomNumber(2)==0)
                {
                    setImage("images/tree3.png");
                }
                else if(Greenfoot.getRandomNumber(1)==0)
                {
                    setImage("images/tree3.png");
                }
                else
                {
                    setImage("images/tree3.png");
                }
            }
            move(-6-MyWorld.difficulty);
           
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
        else
        {
            // getWorld().addObject(new Reset(), 0,0);
        }
    }
}