import greenfoot.*;

/**
 * Crea un pez largo
 * @version 1
 */
public class PezLargo extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
   
    /**
     * Crea un pez largo en una zona del mundo
     */
    public PezLargo(){
        super(1+Greenfoot.getRandomNumber(4),5,3,13, 10+Greenfoot.getRandomNumber(4));
        direccion = true;
        img = new GreenfootImage("Pez7.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-10,img.getHeight()-10);
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
