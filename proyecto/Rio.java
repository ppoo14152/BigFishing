import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rio extends ScrollWorld
{
    Jugador p1 = new Jugador("barcos/barcoMinimalistag.png");
    Anzuelo anz = new Anzuelo("anzuelo1.png");
    Boton mochila;
    Boton inventario;
    /**
     * Constructor for objects of class Rio.
     * 
     */
    public Rio()
    {
        super(800, 600, 1, 800, 2000);
        mochila = new Boton("mochila.png","mochila.png",false);
        inventario = new Boton("Inventario.png", "Inventario.png", false);
        addObject(new Ballena(),0,1000);
        addObject(new Ballena(),0,1600);
        addObject(new Cielo(0, 255, 255), 400, 200);
        addObject(new Nube("nubes/nube1dia.png",1),10, 35);
        addObject(new Nube("nubes/nube1dia.png",2),25, 50);
        addObject(new Nube("nubes/nube1dia.png",2),78, 100);
        addObject(mochila,750,85);
        addObject(inventario,750, 170);
        addObject(new Ola("Olas/olaRioA.png", 2), 0, 370);
        addObject(p1,300 ,300);
        addCameraFollower(anz, -200, 90);
        addObject(new Ola("Olas/olaRioF.png", 1), 0, 400);
        addObject(new FondoMarino(),400,1900);
        addObject(new Ballena(),0,1000);
        addObject(new Ballena(),0,1600);
        addObject(new Ballena(),0,1800);
        addObject(new Ballena(),0,1900);
        cambiaColorAgua(0);
        addCameraFollower(anz, 0, 0);
        iniciaPecesAmarillos();
        iniciaPecesAzules();
    }
    
    private void iniciaPecesAmarillos(){
        int numTem = 3+Greenfoot.getRandomNumber(10);
        for(int i=0; i<numTem; i++){
            addObject(new PezAmarillo(), Greenfoot.getRandomNumber(750), 550+Greenfoot.getRandomNumber(450));
        }
    }
    
    private void iniciaPecesAzules(){
        int numTem = 2+Greenfoot.getRandomNumber(4);
        for(int i=0; i<numTem; i++){
            addObject(new PezAzul(), Greenfoot.getRandomNumber(650), 800+Greenfoot.getRandomNumber(450));
        }
    }
    
}
