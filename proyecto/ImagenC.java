import greenfoot.*;

/**
 * Write a description of class ImagenC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImagenC extends ScrollActor
{
    private GreenfootImage img;
    /**
     * Act - do whatever the ImagenC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ImagenC(String imga){
        img = new GreenfootImage(imga);
        this.setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }
    
}
