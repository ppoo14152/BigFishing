import greenfoot.*;

/**
 * Write a description of class PezRojo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezRojo extends Pez
{
    private GreenfootImage img;
    private boolean direccion;

    /**
     * Act - do whatever the PezRojo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezRojo(){
        super(1+Greenfoot.getRandomNumber(4),5,3,15, 0);
        direccion = true;
        img = new GreenfootImage("Pez4.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-210,img.getHeight()-120);
        this.setImage(img);
    }
    
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
