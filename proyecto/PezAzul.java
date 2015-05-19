import greenfoot.*;

/**
 * Esta clase crea peces azules
 * 
 * @version 1
 */
public class PezAzul extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    
    /**
     * Crea un pez azul en una zona del mundo
     */
    public PezAzul(){
        super(1+Greenfoot.getRandomNumber(4),5,3,4, 5+Greenfoot.getRandomNumber(4));
        direccion = true;
        img = new GreenfootImage("pez2.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-650,img.getHeight()-350);
        this.setImage(img);
    }
    
    /**
     * Mueve al pez
     */
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
