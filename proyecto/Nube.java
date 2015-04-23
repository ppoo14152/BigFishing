import greenfoot.*;

/**
 * Write a description of class Nube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nube extends ScrollActor
{
    private GreenfootImage img;
    
    /**
     * Act - do whatever the Nube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Nube(String n){
        img =new GreenfootImage(n);
        this.setImage(n);
    }
    
    public void act() 
    {
        move(-1);
        // Add your action code here.
    }    
}
