import greenfoot.*;

/**
 * Write a description of class PezAmarillo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezAmarillo extends Pez
{

    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    /**
     * Act - do whatever the PezAmarillo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezAmarillo(){
        super(1+Greenfoot.getRandomNumber(3),2,2,2,1+Greenfoot.getRandomNumber(3));
        anclado = false;
        direccion = true;
        img = new GreenfootImage("Pez1.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-600,img.getHeight()-250);
        this.setImage(img);
    }
    
    public void act(){
        super.act();
        if(getGlobalX() > 800){
            direccion = false;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
        if(getGlobalX() < -75){
            direccion = true;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
    }
}