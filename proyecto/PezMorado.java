import greenfoot.*;

/**
 * Write a description of class PezMorado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezMorado extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    /**
     * Act - do whatever the PezAmarillo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezMorado(){
        super(2,5,3,4,7+Greenfoot.getRandomNumber(7));
        direccion = true;
        img = new GreenfootImage("pez3.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-670,img.getHeight()-470);
        this.setImage(img);
    }
    
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
