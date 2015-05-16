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
    private Actor anzuelo;
    /**
     * Act - do whatever the PezAmarillo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezAzul(){
        super(1+Greenfoot.getRandomNumber(4),5,3,4, 5+Greenfoot.getRandomNumber(4));
        direccion = true;
        img = new GreenfootImage("pez2.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-650,img.getHeight()-350);
        this.setImage(img);
    }
    
    public void act(){
        super.act();
        if(getGlobalX() > 900){
            direccion = false;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
        if(getGlobalX() < -110){
            direccion = true;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
    }
} 
