import greenfoot.*;

/**
 * Esta clase crea peces rojos
 * 
 * @version 1
 */
public class PezRojo extends Pez
{
    private GreenfootImage img;
    private boolean direccion;
    
    /**
     * Crea un pez rojo en una zona del mundo
     */
    public PezRojo(){
        super(1+Greenfoot.getRandomNumber(4),5,3,15, 0);
        direccion = true;
        img = new GreenfootImage("Pez4.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-210,img.getHeight()-120);
        this.setImage(img);
    }
   
     /**
     * Mueve al pez
     */
    public void act() 
    {
        super.act();
        if(getGlobalX() > 950){
            direccion = false;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
        if(getGlobalX() < -950){
            direccion = true;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
    }    
}
