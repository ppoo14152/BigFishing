import greenfoot.*;

/**
 * Esta clase crea ballenas
 * 
 * @version 1
 */
public class Ballena extends Pez
{
    /**
     * Act - do whatever the Ballena wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    
     /**
     * Crea una ballena en una zona del mundo
     */
    public Ballena(){
        super(1, 9, 8, 3,10+Greenfoot.getRandomNumber(10));
        img = new GreenfootImage("BallenaMinimalistap.png");
        img.scale(img.getWidth()+100, img.getHeight()+100);
        this.setImage(img);
    }
    
        /**
     * Mueve a la ballena
     */
    public void act(){
        super.act();
        if(getGlobalX() > 2500){
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
