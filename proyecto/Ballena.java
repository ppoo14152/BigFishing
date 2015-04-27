import greenfoot.*;

/**
 * Write a description of class Ballena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ballena extends Pez
{
    private boolean animacion; 
    private GreenfootImage img;
    /**
     * Act - do whatever the Ballena wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ballena(){
        animacion = false;
        img = new GreenfootImage("BallenaMinimalistap.png");
        this.setImage(img);
    }
    public void act() 
    {
     move(1); 
    }
    
}
