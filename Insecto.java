import greenfoot.*;

/**
 * An demo class which is meant to be a camera follower.
 * It moves to face your mouse cursor, and it can move
 * back and forward.
 * 
 * @author Sven van Nigtevecht
 * @version 1.0
 */
public class Insecto extends ScrollActor
{
    /** The number of cells we move forward and backword */
    private static final int MOVE_AMOUNT = 5;
    private int p = 0;
    /**
     * Move to face the mouse,
     * and listen to the up and down keys.
     */
    public void act()
    {
        getWorld().setCameraDirection(270);
  
        if (Greenfoot.isKeyDown("down")) {
            // move the camera backwards:
            
            if(this.getGlobalY() == 900)
            {   
                p++;
                getWorld().cambiaFondo(p);
            }
            else
                getWorld().moveCamera(-MOVE_AMOUNT);
        }
        if (Greenfoot.isKeyDown("up")) {
            // move the camera forwards:
            if(this.getGlobalY() == 900 && p != 0)
            {
                 p--;
                getWorld().cambiaFondo(p);
            }
            else
                getWorld().moveCamera(MOVE_AMOUNT);
        }
        if (Greenfoot.isKeyDown("left")&&(getX()>0)) {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("right")&&(getX()<800)) {
            setLocation(getX() + 3, getY());
        }
        
     }
}