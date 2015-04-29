import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends ScrollActor
{
    private GreenfootImage ju;
    private boolean aux;
    public Jugador(String n)
    {
        ju = new GreenfootImage(n);
        this.setImage(ju);
        aux = false;
    }
    
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")&&(getX()>0))
        {
            aux = true;
        }
        if (Greenfoot.isKeyDown("a")&&(getX()>0) && aux == false) {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("d")&&(getX()<800) && aux == false) {
            setLocation(getX() + 3, getY());
        }
        
     }
}    
