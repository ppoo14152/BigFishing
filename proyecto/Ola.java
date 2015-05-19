import greenfoot.*;

/**
 * Esta clase anima el movimiento de las olas a través del mundo
 * 
 * @version 2
 */
public class Ola extends ScrollActor
{
    private GreenfootImage background1;
    private int velocidad;
    
    /**
     * Crea una Ola apartir de una imagen y le da una velocidad inicial
     * @param img Nombre de la imagen
     * @param v velocidad de la ola
     */
    public Ola(String img, int v){
        velocidad = v;
        background1 = new GreenfootImage(img);
        background1.setTransparency(255);
        this.setImage(background1);
   
    }
    
     /**
     * Muve la ola.
     */
    public void act() 
    {
       move(velocidad);
       if(this.isAtEdge()){
            this.setLocation(0, this.getY());
       }
    }    
    
    /**
     * Cambia la imagen de la clase
     * @param img Nombre de la imagen
     */
    public void setImagen(String img){
        background1 = new GreenfootImage(img);
        background1.setTransparency(255);
        this.setImage(background1);
        
    }
    
    /**
     * Cambia la velocidad de la ola
     * @param v Velocidad
     */
    public void setVelocidad(int v){
        velocidad = v;
    }
}
