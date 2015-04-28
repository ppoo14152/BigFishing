import greenfoot.*;

/**
 * Write a description of class BarcoG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarcoG extends ScrollActor
{
    private GreenfootImage barco;
     private SimpleTimer tiempo;
    
    /**
     * Act - do whatever the BarcoG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BarcoG(){
        barco = new GreenfootImage("barcos/barcoMinimalistag.png");
        this.setImage(barco);
        tiempo = new SimpleTimer();
        tiempo.mark();
        
    }
    public void act() 
    {
        if(tiempo.millisElapsed() > 15){
            this.setGlobalLocation(this.getX()-1,this.getY());
            tiempo.mark();
        }
        if(this.getGlobalX()==(-150)){
            this.setGlobalLocation(1100, this.getY());
        }   
    }
}
