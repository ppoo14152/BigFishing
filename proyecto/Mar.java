import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Mar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mar extends ScrollWorld
{
    Boton mochila;
    Boton inventario;

    /**
     * Constructor for objects of class Mar.
     * 
     */
    public Mar()
    {
        super(800, 600, 1, 800, 2000);
        mochila = new Boton("mochila.png","mochila.png",false);
        inventario = new Boton("Inventario.png", "Inventario.png", false);
        addObject(new Cielo(0, 255, 255), 400, 200);
        addObject(new Nube("nubes/nube1dia.png",1),10, 35);
        addObject(new Nube("nubes/nube1dia.png",2),25, 50);
        addObject(new Nube("nubes/nube1dia.png",2),78, 100);
        addObject(mochila,750,85);
        addObject(inventario,750, 170);
        addObject(new Ola("Olas/ola4p.png", 2), 0, 370);
        addObject(new Ola("Olas/olaMar.png", 1), 0, 400);
        addObject(new FondoMarino(),400,1900);
        cambiaColorAgua(1);
        //addCameraFollower(new Insecto(), 0, 0);
    }
}
