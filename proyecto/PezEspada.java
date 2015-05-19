import greenfoot.*;

/**
 * Write a description of class PezEspada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezEspada extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    /**
     * Act - do whatever the PezEspada wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public PezEspada(){
        super(1+Greenfoot.getRandomNumber(8),10,10,11, 5+Greenfoot.getRandomNumber(15));
        direccion = true;
        img = new GreenfootImage("Pez5.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-50,img.getHeight()-30);
        this.setImage(img);
    }
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
