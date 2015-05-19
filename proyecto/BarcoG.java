import greenfoot.*;

/**
 * Barco del menu principal
 * 
 * @version 1
 */
public class BarcoG extends ScrollActor
{
    private GreenfootImage barco;
     private SimpleTimer tiempo;
    
    /**
     * Constructor de BarcoG
     */
    public BarcoG(){
        barco = new GreenfootImage("barcos/barcoMinimalistag.png");
        this.setImage(barco);
        tiempo = new SimpleTimer();
        tiempo.mark();
        
    }
    
        /**
     * Mueve el barco por el mundo.
     */
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
