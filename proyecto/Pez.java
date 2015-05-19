import greenfoot.*;

/**
 * Son los enemigos del jugador, se mueven por el escenario.
 * 
 * @version 3
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
     * Crea un pez
     * @param v velocidad
     * @param r resistencia
     * @param f fuerza
     * @param a agresividad
     * @param c valorC
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
    
    /**
     * Mueve al pez
     */
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
    
    /**
     * Regresa el valorC
     * @return valorC
     */
    public int valor(){
        return valorC;
    }
    
    /**
     * Cambia la dirección del pez
     * @param dir direccion
     */
    public void setDireccion(boolean dir){
        direccion =  dir;
    }
    
    /**
     * Regresa agresividad
     * @return agresividad
     */
    public int getAgresivo(){
        return agresividad;
    }
}
