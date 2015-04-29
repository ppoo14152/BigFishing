import greenfoot.*;

/**
 * Write a description of class Luna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Luna extends Actor
{
    GreenfootImage img;
    /**
     * Act - do whatever the Luna wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Luna(){
        img = new GreenfootImage("Luna.png");
        this.setImage(img);
    } 
}
