import greenfoot.*;
import java.awt.Color;
/**
 * Barra de vida
 *  
 * @version 1
 */
public class Vida extends StatBar
{
     /**
     * Crea la barra de vida
     * @param maximo cantidad máxima de vida
     * @param actual nivel actual de vida
     */
    public Vida(int maximo, int actual){
        super(new Color(0, 255, 45), 250, 20, Style.SMOOTH, maximo, actual);
        setSpeed(5);
    }
    
    /**
     * Actualiza la barra
     */
    public void act() 
    {
        super.act();
    }
   
    /**
     * Modifica el color de la barra
     */
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
