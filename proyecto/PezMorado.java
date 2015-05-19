import greenfoot.*;

/**
 * Esta clase crea peces morados
 * 
 * @version 1
 */
public class PezMorado extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    
    /**
     * Crea un pez morado en una zona del mundo
     */
    public PezMorado(){
        super(2,5,3,4,7+Greenfoot.getRandomNumber(7));
        direccion = true;
        img = new GreenfootImage("pez3.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-670,img.getHeight()-470);
        this.setImage(img);
    }
    
     /**
     * Mueve al pez
     */
    public void act(){
        super.act();
        if(getGlobalX() > 1200){
            direccion = false;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
        if(getGlobalX() < -250){
            direccion = true;
            super.setDireccion(direccion);
            img.mirrorHorizontally();
        }
    }    
}
