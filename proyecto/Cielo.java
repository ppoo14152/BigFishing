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
    private int r, g, b;
    private int c;
    private GreenfootImage sky = new GreenfootImage(800,400);
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the Cielo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cielo(int red, int green, int blue)
    {
        r = red;
        g = green;
        b = blue;
        c = 0;
        sky.setColor(new Color(r, g, b));
        sky.fillRect(0, 0, 800, 400);
        setImage(sky);
        timer.mark();
    }
    
    public void act()
    {
        if(timer.millisElapsed()>500)
        {
            incCont();
            cambiaColor(c);
            timer.mark();
        }
    }
    
    private void cambiaColor(int tiempo)
    {
        sky.setColor(new Color(r,g-tiempo,b));
        sky.fillRect(0,0,800,600);
        setImage(sky);
    }
    
    private void incCont()
    {
        c++;
    }
}
