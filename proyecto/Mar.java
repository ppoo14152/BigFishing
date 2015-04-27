import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Mar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mar extends ScrollWorld
{

    /**
     * Constructor for objects of class Mar.
     * 
     */
    public Mar()
    {
        super(800, 600, 1, 800, 1200);
        addObject(new Cielo(0, 255, 255), 400, 200);
        addObject(new Ola("OlaAtras.png", 2), 0, 460);
        addObject(new Ola("OlaL.png", 1), 0, 490);
        cambiaColorAgua(1);
        addCameraFollower(new Insecto(), 0, 0);
    }
}
