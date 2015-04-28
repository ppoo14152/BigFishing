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
    public Jugador(String n)
    {
        ju = new GreenfootImage(n);
        this.setImage(ju);
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("a")&&(getX()>0)) {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("d")&&(getX()<800)) {
            setLocation(getX() + 3, getY());
        }
        
     }
}    
