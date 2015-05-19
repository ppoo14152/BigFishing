import greenfoot.*;

/**
 * Esta clase crea peces amarillos
 * 
 * @version 1
 */
public class PezAmarillo extends Pez
{

    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    /**
     * Crea un pez amarillo en una zona del mundo
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
    
    /**
     * Mueve al pez
     */
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