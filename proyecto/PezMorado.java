import greenfoot.*;

/**
 * Write a description of class PezMorado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezMorado extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    /**
     * Act - do whatever the PezAmarillo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezMorado(){
        super(1+Greenfoot.getRandomNumber(4),5,3,4);
        direccion = true;
        img = new GreenfootImage("pez3.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-600,img.getHeight()-450);
        this.setImage(img);
    }
    
    public void act(){
        super.act();
        if(getGlobalX() > 1000){
            img.mirrorHorizontally();
        }
        if(getGlobalX() < -100){
            img.mirrorHorizontally();
        }
    }    
}
