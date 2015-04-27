import greenfoot.*;

/**
 * Write a description of class Ola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ola extends ScrollActor
{
    private GreenfootImage background1;
    private int velocidad;
    
    /**
     * Act - do whatever the Ola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ola(String img, int v){
        velocidad = v;
        background1 = new GreenfootImage(img);
        background1.setTransparency(255);
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
