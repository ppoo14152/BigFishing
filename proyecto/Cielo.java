import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Cielo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cielo extends ScrollActor
{
     private GreenfootImage sky = new GreenfootImage(800,400);
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the Cielo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cielo(int r, int g, int b)
    {
        sky.setColor(new Color(r, g, b));
        sky.fillRect(0, 0, 800, 400);
        setImage(sky);
        timer.mark();
    }
    
    private void cambiaColor(int tiempo)
    {
        sky.setColor(new Color(0,148-tiempo,255));
        sky.fillRect(0,0,800,600);
        setImage(sky);
    }  
}
