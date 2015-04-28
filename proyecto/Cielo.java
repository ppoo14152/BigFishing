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
    private int v;
    private boolean dia;
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
        v = 0;
        dia = true;
        sky.setColor(new Color(r, g, b));
        sky.fillRect(0, 0, 800, 400);
        setImage(sky);
        timer.mark();
    }
    
    public void act()
    {
        if(timer.millisElapsed()>1020)
        {
            if(c < g && dia == true)
            {
                incCont(1);
                if (c % 5 == 0)
                {
                    incCont(0);
                }
            }
            else
            {
                dia = false;
                decCont(1);
                if (c % 5 == 0)
                {
                    decCont(0);
                }
                if(c == 0)
                {
                    dia = true;
                }
            }
            cambiaColor(c ,v);
            //System.out.println("g: " + c + " b: " + v);
            timer.mark();
        }
    }
    
    private void cambiaColor(int tiempo, int v)
    {
        sky.setColor(new Color(r,g - tiempo,b - v));
        sky.fillRect(0,0,800,600);
        setImage(sky);
    }
    
    private void incCont(int valor)
    {
        if(valor == 1)
        {
            c++;
        }
        else
        {
            v++;
        }
    }
    
    private void decCont(int valor)
    {
        if(valor == 1)
        {
            c--;
        }
        else
        {
            v--;
        }
    }
    
    public boolean getDia()
    {
        return dia;
    }
}
