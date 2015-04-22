import greenfoot.*;

/**
 * Write a description of class Ola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ola extends ScrollActor
{
    private GreenfootImage background1, background2;
    private int velocidad;
    
    /**
     * Act - do whatever the Ola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ola(String img, int v){
        velocidad = v;
        background2 = new GreenfootImage(img);
        background1 = new GreenfootImage(img);
        this.setImage(background1);
   
    }
    public void act() 
    {
       move(velocidad);
       if(this.isAtEdge()){
            this.setLocation(0, this.getY());
       }
    }    
}
