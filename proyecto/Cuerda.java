import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Cuerda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuerda extends ScrollActor
{
    private GreenfootImage cuerda;
    private int posIx, posIy, posFx, posFy;
    /**
     * Act - do whatever the Cuerda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cuerda(int x, int y){
        posIx = posFx = x;
        posIy = posFy = y;
        cuerda = new GreenfootImage(800,600);
        cuerda.setColor(new Color(25,25,25));
        cuerda.drawLine(0, 0, 25, 100);
        this.setImage(cuerda);
    }
        
    public void act() 
    {
        cuerda.drawLine(posIx, posIy, posFx, posFy);
        this.setImage(cuerda);
        cuerda.clear();
       
    }
    
    public void setPos(int x, int y,int xx, int yy){
        posIx = x;
        posIy = y;
        posFx = xx;
        posFy = yy;
    }
}
