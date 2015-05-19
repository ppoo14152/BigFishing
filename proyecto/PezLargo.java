import greenfoot.*;

/**
 * Write a description of class PezLargo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezLargo extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    /**
     * Act - do whatever the PezLargo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezLargo(){
        super(1+Greenfoot.getRandomNumber(4),5,3,13, 10+Greenfoot.getRandomNumber(4));
        direccion = true;
        img = new GreenfootImage("Pez7.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-10,img.getHeight()-10);
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
