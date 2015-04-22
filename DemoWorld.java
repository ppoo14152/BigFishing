import greenfoot.*;

public class DemoWorld extends ScrollWorld
{
    /**
     * Constructor de la clase DemoWorld.
     */
    public DemoWorld()
    {
        super(800, 600, 1, 800, 1200);
        addObject(new Cielo(), 400, 150);
        addObject(new Ola("OlaAtras.png", 420, 2), 0, 420);
        addObject(new Ola("OlaL.png", 450,1), 0, 450);
        
        addCameraFollower(new Insecto(), 500, 0);
        
    }
}
