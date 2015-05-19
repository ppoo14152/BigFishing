import greenfoot.*;

/**
 * Esta clase crea peces globo
 * 
 * @version 1
 */
public class PezGlobo extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;

    /**
     * Crea un pez globo en una zona del mundo
     */
    public PezGlobo(){
        super(1+Greenfoot.getRandomNumber(10),10,10,11, 8+Greenfoot.getRandomNumber(15));
        direccion = true;
        img = new GreenfootImage("Pez6.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-35,img.getHeight()-35);
        this.setImage(img);
    }
    
    /**
     * Mueve al pez
     */
    public void act() 
    {
        super.act();
        if(getGlobalX() > 650){
            direccion = false;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
        if(getGlobalX() < -650){
            direccion = true;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
    }    
}
