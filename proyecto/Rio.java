import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rio extends ScrollWorld
{

    /**
     * Constructor for objects of class Rio.
     * 
     */
    public Rio()
    {
        super(800, 600, 1, 800, 1200);
        addObject(new Cielo(0, 255, 255), 400, 200);
        addObject(new Ola("OlaRioA.png", 2), 0, 460);
        addObject(new Ola("OlaRio.png", 1), 0, 490);
        cambiaColorAgua(0);
        addCameraFollower(new Insecto(), 0, 0);
    }
    
}
