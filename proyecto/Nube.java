import greenfoot.*;

/**
 * Esta clase crea nubes que se mueven por el mundo
 * 
 * @version 1
 */
public class Nube extends ScrollActor
{
    private GreenfootImage img;
    private int vel;
   
    /**
     * Crea una nube apartir de una imagen
     * @param n Nombre de la imagen
     * @param v velocidad de la nube
     */
    public Nube(String n, int v){
        vel = v;
        img =new GreenfootImage(n);
        this.setImage(n);
    }
    
     /**
     * Mueve la nube.
     */
    public void act() 
    {
        move(vel);
        if(this.getGlobalX()>1200){
            this.setGlobalLocation(-250, 50+Greenfoot.getRandomNumber(200));
        }
    }
    
    /**
     * Cambia la velocidad de  la nube
     * @param v Velocidad
     */
    public void setVel(int v)
    {
        vel = v;
    }
    
    /**
     * Cambia la imagen de la nube
     * @param m Imagen de la nube
     */
    
    public void setImagen(String m){
        img = new GreenfootImage(m);
        this.setImage(m);
    }
}
