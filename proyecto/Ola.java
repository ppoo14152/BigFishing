import greenfoot.*;

/**
 * Write a description of class Ola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ola extends ScrollActor
{
    private GreenfootImage background;
    private int CoorY, velocidad;
    /**
     * Act - do whatever the Ola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ola(String img, int y, int v){
        CoorY = y;
        velocidad = v;
        background = new GreenfootImage(img);
        this.setImage(background);
   
    }
    public void act() 
    {
       move(velocidad);
       if(this.isAtEdge())
            this.setGlobalLocation( 0, CoorY);
    }    
}
