import greenfoot.*;

public class Tree extends Actor
{
    private boolean start = true;

    public void act()
    {
        if(Kangaroo.alive)
        {
            if(start)
            {
                start = false;
                setLocation(0, 0);
                if(Greenfoot.getRandomNumber(35)==0)
                {
                    setLocation(580, 271);
                }
            }
            move(-6);
            
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
    }
}