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
    private boolean direccion, anclado;
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
        anclado = false;
    }
    
    public void act(){
        if(direccion){
            move(velocidad);
        }else{
            move(-velocidad);
        }
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        if(anzuelo != null){
            if(!((Anzuelo)anzuelo).existePez()||anclado){
                this.setGlobalLocation(((Anzuelo)anzuelo).globalX(), ((Anzuelo)anzuelo).globalY()+40);
                anclado = true;
                if(this.getRotation() == 0){
                    img = this.getImage();
                    if(!direccion){
                        img.mirrorHorizontally();
                        this.setImage(img);
                    }
                    this.setRotation(-90);
                }
                ((Anzuelo)anzuelo).hayPez();
            }
        }
        else{
            this.setRotation(0);
        }
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
    }
    
    public int valor(){
        return valorC;
    }
    
    public void setDireccion(boolean dir){
        direccion =  dir;
    }
    
    public int getAgresivo(){
        return agresividad;
    }
}
