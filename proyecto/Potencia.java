import greenfoot.*;
import java.awt.Color;

/**
 * Barra de potencia
 * 
 * @version 1
 */
public class Potencia extends StatBar
{
    /**
     * Crea la barra de Potencia
     * @param maximo cantidad máxima de potencia
     * @param actual nivel actual de potencia
     */
    public Potencia(int maximo, int actual){
        super(new Color(255, 255, 0), 250, 20, Style.SMOOTH, maximo, actual);
        setSpeed(8);
    }
    
    /**
     * Actualiza la barra
     */
    public void act(){
        super.act();
    }
    
    /**
     * Modifica el color de la barra 
     */
    public void updateColor()
    {
        if (getValue() <= getMax()/4)
        {
            setColor(Color.yellow);
        }
    }
}
