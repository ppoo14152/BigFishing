import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends StatBar
{
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Vida(int maximo, int actual){
        super(new Color(0, 255, 45), 250, 20, Style.SMOOTH, maximo, actual);
        setSpeed(5);
    }
    public void act() 
    {
        super.act();
    }
    
    public void updateColor()
    {
        if (getValue() <= getMax()/4)
        {
            setColor(Color.red);
        }
        else if (getValue() < getMax()/2)
        {
            setColor(Color.yellow);
        }
        else
        {
            setColor(Color.green);
        }
    }
}
