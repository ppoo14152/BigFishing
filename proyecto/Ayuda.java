import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ayuda del juego
 *  
 * @version 1
 */
public class Ayuda extends Actor
{
    private GreenfootImage texto;
    
    /**
     * Constructor de Ayuda, añade una imagen al Actor
     */
    public Ayuda()
    {
        texto = new GreenfootImage("ayuda.png");
        setImage(texto);
    }   
}
