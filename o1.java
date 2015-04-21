import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class o1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class o1 extends Ola
{
    /**
     * Act - do whatever the o1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        if(this.isAtEdge())
            this.setGlobalLocation( 0, 450);
        
    }
}
