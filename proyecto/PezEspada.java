import greenfoot.*;

/**
 * Esta clase crea peces espada
 * 
 * @version 1
 */
public class PezEspada extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    
    /**
     * Crea un pez espada en una zona del mundo
     */
    public PezEspada(){
        super(1+Greenfoot.getRandomNumber(8),10,10,20, 5+Greenfoot.getRandomNumber(15));
        direccion = true;
        img = new GreenfootImage("Pez5.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-50,img.getHeight()-30);
        this.setImage(img);
    }
    
    /**
     * Mueve al pez
     */
    public void act() 
    {
        super.act();
        if(getGlobalX() > 3500){
            direccion = false;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
        if(getGlobalX() < -2500){
            direccion = true;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
    }    
}
