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
    private boolean direccion;
    /**
     * Act - do whatever the Barco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Barco() 
    {
        direccion = true;
        grados = 0;
        barco = new GreenfootImage("barcos/barco.png");
        barco.scale(barco.getWidth()-120, barco.getHeight()-120);
        this.setImage(barco);
    }
    
    public void act(){
       
        modificaGrados();
        modificaDireccion();
        movientoBarco(); 
        
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
        if(grados == 13){
            direccion = false;
        }
        else{
            if(grados == -5){
                direccion = true;
            }
        }      
    }
}
