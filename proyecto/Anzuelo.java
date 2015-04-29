import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class anzuelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anzuelo extends ScrollActor
{    /** The number of cells we move forward and backword */
    private static final int MOVE_AMOUNT = 5;
    private int p = 0;
    private GreenfootImage an;
    private boolean baja;
    private int limit;
    private int move;
    private int posOriginalX, posOriginalY;
    private boolean exitePez;
    /**
     * Move to face the mouse,
     * and listen to the up and down keys.
     */
    public Anzuelo(String name)
    {
        baja = false;
        limit =0;
        //existePez = false;
        an = new GreenfootImage(name);
        this.setImage(an);
        move = 3;
    }
    
    public int globalX(){
        return this.getGlobalX();
    }
    
    public int globalY(){
        return this.getGlobalY();
    }
    
    public void act()
    {
        getWorld().setCameraDirection(270);
        
        /*if(Greenfoot.isKeyDown("space"))
        {
            if(baja == false)
            {
                System.out.println("Aqui");
                baja = true;
                posOriginalX =this.getGlobalX();
                posOriginalY =this.getGlobalY();
                getWorld().moveCamera(-100);
                limit = this.getX()-30;
           }
            if(this.getGlobalY() != posOriginalY)
            {
            while(this.getGlobalY() != posOriginalY)
            {
                if(this.getGlobalY() > 900 && p != 0)
                {
                    p--;
                    getWorld().cambiaFondo(p);
                }
                getWorld().moveCamera(MOVE_AMOUNT);
                baja = false;
            }
            }
        }*/
        
        if(Greenfoot.isKeyDown("space") && baja == true)
        {
            if(this.getGlobalY() != posOriginalY)
            {
                while(this.getGlobalY() != posOriginalY)
                {
                    if(this.getGlobalY() > 900 && p != 0)
                    {
                        p--;
                        getWorld().cambiaFondo(p);
                    }
                getWorld().moveCamera(MOVE_AMOUNT);
                baja = false;
            }
            }
        }
        
        if(Greenfoot.isKeyDown("space") && baja == false)
        {
            baja = true;
            posOriginalX =this.getGlobalX();
            posOriginalY =this.getGlobalY();
                getWorld().moveCamera(-100);
                limit = this.getX()-30;
 
        }
        
        if (Greenfoot.isKeyDown("a") && (getX()>0)) {
            if(baja == false)
            {
                setLocation(getX() - 3, getY());
            }
            
            if (baja && this.getX() > limit)
            {
                setLocation(getX() - 3, getY());
            }
        }
        
        if (Greenfoot.isKeyDown("d") && (getX()<800)) 
        {
            if(baja == false)
            {
                setLocation(getX() + 3, getY());
            }
            
            if (baja && this.getX() < (limit+60))
            {
                setLocation(getX() + 3, getY());
            }
        }
        
        if (Greenfoot.isKeyDown("s") && p<148 && baja == true) {
            
            if(this.getGlobalY() > 900)
            {   
                p++;
                getWorld().cambiaFondo(p);
            }
            getWorld().moveCamera(-MOVE_AMOUNT);
        }
        
        /*if (Greenfoot.isKeyDown("w")) 
        {    
            while(this.getGlobalY() != posOriginal)
            {
                if(this.getGlobalY() > 900 && p != 0)
                {
                    p--;
                    getWorld().cambiaFondo(p);
                }
                getWorld().moveCamera(MOVE_AMOUNT);
            }
        }*/
        
        /*if (Greenfoot.isKeyDown("left")&&(getX()>0)) {
            setLocation(getX() - 3, getY());
        }
        
        if (Greenfoot.isKeyDown("right")&&(getX()<800)) {
            setLocation(getX() + 3, getY());
        }*/
        
     }
}
