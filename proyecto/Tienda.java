import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tienda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tienda extends Actor
{
    private Banner fondo;
    private boolean touch;
    private Boton gas;
    private Boton anz;
    private Boton can;
    private Boton com;
    private Boton lancha;
    public Tienda(/*String icono*/)
    {
        touch = false;
        //setImage(icono);
        fondo = new Banner("Inv.png");
        gas = new Boton("gas.png", "gas.png", false);
        anz = new Boton("botonAnzuelo.png", "botonAnzuelo.png", false);
        can = new Boton("botonCana.png", "botonCana.png", false);
        com = new Boton("botonProv.png", "botonProv.png", false);
        lancha = new Boton("bote.png", "bote.png", false);
        
    }
    
    public void muestra()
    {
        System.out.println("Aqui");
        touch = true;
        getWorld().addObject(fondo, 400, 300);
        getWorld().addObject(gas,300,180);
        getWorld().addObject(anz,390,180);
        getWorld().addObject(can,480,180);
        getWorld().addObject(com,300,270);
        getWorld().addObject(lancha,390,270);
    }
    
    public void remove()
    {
        System.out.println(touch);
        if(touch == true)
        {
            System.out.println("Aqui 2");
            getWorld().removeObject(fondo);
            getWorld().removeObject(gas);
            getWorld().removeObject(anz);
            getWorld().removeObject(can);
            getWorld().removeObject(com);
            getWorld().removeObject(lancha);
            touch = false;
        }
    }
    
    public void act() 
    {
        /*
        if(Greenfoot.mouseClicked(this)){
            touch = true;
        }
        else{
            touch = false;
        }*/
    }
    
}
