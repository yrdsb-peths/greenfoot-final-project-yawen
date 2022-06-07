import greenfoot.*;
public class Kangaroo extends Actor
{
    private int counter = 0;
    private int jumpCounter = 0;
    private int minCounter = 0;
    private boolean isOnGround = true;
    private boolean leftFoot = true;
    private boolean pressingJump = false;
    private boolean start = true;
    private boolean pressed;
    private boolean down;
    static public boolean alive = true;
    private int jumpSpeed;
    public void act() 
    {
        if(start)
        {
            alive=true;
            start=false;
        }
        if (pressed && (Greenfoot.mouseDragEnded(null) || Greenfoot.mouseClicked(null))){pressed = false;}
        if (!pressed && Greenfoot.mousePressed(null)) {pressed= true;}
        if(alive||Greenfoot.isKeyDown("a")&&Greenfoot.isKeyDown("s"))
        {
            if(isOnGround)
            {
                counter++;
                jumpCounter=0;
                minCounter=0;
                if(counter>=3)
                {
                    counter=0;
                    if(leftFoot)
                    {
                        leftFoot=false;
                    }
                    else
                    {
                        leftFoot=true;
                    }
                }
                if(jumpButton()&&!pressingJump)
                {
                    setImage("images/kangaroo.png");
                    setLocation(120, 600);
                    move(5);
                    jumpSpeed = 5;
                    isOnGround=false;
                    pressingJump = true;
                }
                else
                {
                    if(!jumpButton())
                    {
                        pressingJump=false;
                    }
                    if(leftFoot)
                    {
                        setImage("images/kangaroo.png");
                    }
                    else
                    {
                        setImage("images/kangaroo.png");
                    }
                }
                }
           
            else
            {
                minCounter++;
                if((pressingJump&&jumpButton()&&jumpCounter<=12)||minCounter<8)
                {
                    jumpCounter++;
                    move(20);
                }
                else
                {
                    jumpCounter = 20;
                    jumpSpeed--;
                    move(jumpSpeed);
                    if(getY()>=600)
                    {
                        setLocation(120,600);
                        isOnGround=true;
                    }
                }
            }
            if(getOneIntersectingObject(Tree.class)!=null&&!Greenfoot.isKeyDown("a"))
            {
                // getWorld().addObject(new Reset(), 120, 600);
                alive = false;
            }
            else
            {
                alive=true;
            }
        }
        else
        {
            // getWorld().addObject(new Reset(), 0, 0);
        }
        if(!alive)
        {
            if(down)
            {
                setImage("images/kangaroo.png");
            }
            else
            {
                setImage("images/kangaroo.png");
            }
        }
    }
    public Kangaroo()
    {
        setImage("images/kangaroo.png");
        setLocation(120,600);
        setRotation(270);
    }
    private boolean jumpButton()
    {
        if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space")||Greenfoot.mousePressed(null))
        {
            return true;
        }
        if(pressed) {
            return true;
        } else {
            return false;
        }
    }
}