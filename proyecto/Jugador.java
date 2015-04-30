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
    private Actor pez;
    private int nPeces;
    private int energia;
    private int vida;
    public Jugador(String n)
    {
        nPeces = 0;
        ju = new GreenfootImage(n);
        this.setImage(ju);
        aux = false;
        energia = 100;
        vida = 100;
    }
    
    
    public void act() 
    {
        pez = this.getOneIntersectingObject(Pez.class);
        if(pez != null){
            getWorld().removeObject(pez);
            nPeces++;
        }
        if(Greenfoot.isKeyDown("s")&&(getX()>0))
        {
            aux = true;
        }
        if(Greenfoot.isKeyDown("w")&&(getX()>0))
        {
            aux = false;
        }
        if (Greenfoot.isKeyDown("a")&& getX()>98 && aux == false) {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("d")&& getX()<800 && aux == false) {
            setLocation(getX() + 3, getY());
        }
        
     }
}    
