import greenfoot.*;

/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barco extends ScrollActor
{
    private GreenfootImage barco;
    private int grados;
    private boolean direccion, mov;
    private SimpleTimer tiempo;
    /**
     * Act - do whatever the Barco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Barco() 
    {
        direccion = true;
        mov = true;
        grados = 0;
        barco = new GreenfootImage("barcos/barquitoMinimalista.png");
        barco.scale(100,200);
        barco.mirrorHorizontally();
        this.setImage(barco);
        tiempo = new SimpleTimer();
        tiempo.mark();
        this.setLocation(-120, 395);
    }
    
    public void act(){
        if(mov){
            this.setGlobalLocation(this.getGlobalX()+1,this.getY());
        }
        else{
            this.setGlobalLocation(this.getGlobalX()-1,this.getY());
        }
        if (tiempo.millisElapsed() > 30){
            modificaGrados();
            modificaDireccion();
            tiempo.mark();
        }
        movientoBarco();
        invierteBarco();
               
    }
    
    private void movientoBarco(){
        this.setRotation(grados);
    }
    private void modificaDireccion(){
        if(direccion)
            grados++;
        else 
            grados--;
    }
    private void modificaGrados(){
        if(grados == 17){
            direccion = false;
        }
        else{
            if(grados == -13){
                direccion = true;
            }
        }      
    }
    private void invierteBarco(){
        if(this.getGlobalX()>940){
            barco.mirrorHorizontally();
            this.setImage(barco);
            mov = false;
        }
        if(this.getGlobalX()<-220){
            barco.mirrorHorizontally();
            this.setImage(barco);
            mov = true;
        }
    }
        
}
