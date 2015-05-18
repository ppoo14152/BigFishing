import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Gas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gas extends StatBar
{
    /**
     * Act - do whatever the Gas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public Gas(int maximo, int actual){
        super(new Color(75, 75, 75), 250, 20, Style.SMOOTH, maximo, actual);
        setSpeed(5);
    }
   public void act(){
        super.act();
   }
}
