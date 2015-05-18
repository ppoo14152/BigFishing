import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class potencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potencia extends StatBar
{
    /**
     * Act - do whatever the potencia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Potencia(int maximo, int actual){
        super(new Color(255, 255, 0), 250, 20, Style.SMOOTH, maximo, actual);
        setSpeed(8);
    }
    public void act(){
        super.act();
    }
    
    public void updateColor()
    {
        if (getValue() <= getMax()/4)
        {
            setColor(Color.yellow);
        }
    }
}
