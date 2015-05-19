import greenfoot.*;

/**
 * Clase que controla los barcos que aparecen en el menu del juego
 *
 * @version 1
 */
public class Barco extends ScrollActor
{
    private GreenfootImage barco;
    private int grados;
    private boolean direccion, mov;
    private SimpleTimer tiempo;
     
    /**
     * Constructor de Barco
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
    
    /**
     * Se inicializa al presionar Act o Play. Mueve al barco
     */
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
    
    /**
     * Modifica los grados de la imagen
     */
    private void movientoBarco(){
        this.setRotation(grados);
    }
    
    /**
     * Cambia la dirección de la imagen
     */
    private void modificaDireccion(){
        if(direccion)
            grados++;
        else 
            grados--;
    }
    
    /**
     * Establece un limite para la dirección de la figura basandose en los grados
     */
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
    
    /**
     * Cuando el barco llega al fin del mundo, el método lo invierte horizontalmente.
     */
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
