import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class o2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class o2 extends Ola
{
    /**
     * Act - do whatever the o2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        move(2);
        if(this.isAtEdge())
            this.setGlobalLocation( 0, 420);
        
    }
}
