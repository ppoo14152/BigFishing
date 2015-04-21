import greenfoot.*;

/**
 * A little demo world to show you how this works.
 * 
 * @author Sven van Nigtevecht
 */
public class DemoWorld extends ScrollWorld
{
    /**
     * Constructor for objects of class DemoWorld.
     */
    public DemoWorld()
    {
        super(800, 600, 1, 800, 1200);
        //addObject(new Cielo(), 400, 150);
        addObject(new Ola("OlaAtras.png", 420, 2), 0, 420);
        addObject(new Ola("OlaL.png", 450,1), 0, 450);
        
        addCameraFollower(new Insecto(), 500, 0);
        
    }
}
