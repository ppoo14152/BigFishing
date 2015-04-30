import greenfoot.*;

/**
 * Write a description of class Pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Pez extends ScrollActor
{
    private GreenfootImage img;
    private Actor anzuelo;
    private int velocidad;
    private int resistencia;
    private int fuerza;
    private int agresividad;
    private boolean direccion;
    private int valorC;
    /**
     * Act - do whatever the Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pez(int v, int r, int f, int a, int c){
        valorC = c;
        direccion = true;
        velocidad = v;
        resistencia = r;
        fuerza = f;
        agresividad = a;
    }
    public void act(){
        if(getGlobalX() >  1200){
            direccion = false;
        }
        if(getGlobalX() < -120){
            direccion = true;
        }
        if(direccion){
            move(velocidad);
        }else{
            move(-velocidad);
        }
    }
    
    public int valor(){
        return valorC;
    }
}
