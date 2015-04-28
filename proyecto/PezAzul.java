import greenfoot.*;

/**
 * Write a description of class PezAzul7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezAzul extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    /**
     * Act - do whatever the PezAmarillo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezAzul(){
        super(1+Greenfoot.getRandomNumber(4),5,3,4);
        direccion = true;
        img = new GreenfootImage("pez2.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-650,img.getHeight()-350);
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
