import greenfoot.*;

/**
 * Write a description of class Ballena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ballena extends Pez
{
    /**
     * Act - do whatever the Ballena wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    public Ballena(){
        super(1, 9, 8, 3,10+Greenfoot.getRandomNumber(10));
        img = new GreenfootImage("BallenaMinimalistap.png");
        img.scale(img.getWidth()+100, img.getHeight()+100);
        this.setImage(img);
    }
    public void act(){
        move(-2); 
    }
    
}
