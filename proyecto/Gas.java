import greenfoot.*;
import java.awt.Color;
/**
 * Barra de gasolina del barco
 * 
 * @version 1
 */
public class Gas extends StatBar
{
   /**
    * Crea la barra de Gasolina
    * @param maximo cantidad máxima de gasolina
    * @param actual nivel actual de gasolina
    */
   public Gas(int maximo, int actual){
        super(new Color(75, 75, 75), 250, 20, Style.SMOOTH, maximo, actual);
        setSpeed(5);
    }
    
     /**
     * Actualiza la barra
     */
   public void act(){
        super.act();
   }
}
