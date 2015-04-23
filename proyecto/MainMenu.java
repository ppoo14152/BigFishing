import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends ScrollWorld
{
    private GreenfootImage fondo;

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {
        super(800, 600, 1, 800, 600);
        fondo = new GreenfootImage(800,600);
        fondo.setColor(new Color(33,161,254));
        fondo.fill();
        this.setBackground(fondo);
        addObject(new Ola("OlaAtras.png", 2), 0, 500);
        addObject(new Barco(), 650,350);
        addObject(new Ola("OlaL.png", 1), 0, 510);
        
        
    }
}
