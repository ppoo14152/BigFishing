import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends ScrollWorld
{
    private GreenfootImage fondo;
    private Boton jugar;
    private Boton cred;
    private ImagenC ballenaA;
    private ImagenC ballenaB;
    private SimpleTimer tiempo;


    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {
        super(800, 600, 1, 800, 1200);
        ballenaA = new ImagenC("creditos/b1.png",250);
        ballenaB = new ImagenC("creditos/b2.png",750);
        jugar = new Boton("botones/JugarB.png","botones/JugarA.png");
        cred = new Boton("botones/CreditosB.png","botones/CreditosA.png");
        fondo = new GreenfootImage(800,600);
        fondo.setColor(new Color(33,161,254));
        fondo.fill();
        this.setBackground(fondo);
        addObject(new Nube("nubes/nube1dia.png",1),0, 35);
        addObject(new Nube("nubes/nube1dia.png",2),0, 100);
        addObject(new Ola("Olas/ola4p.png", 1), 0, 430);
        addObject(new BarcoG(),900, 350);
        addObject(new Ola("Olas/ola2p.png", 2), 0, 440);
        addObject(new Barco(), 0,395);
        addObject(ballenaA, 0, 400);
        addObject(ballenaB, 0, 400);
        addObject(new Ola("Olas/ola1h.png", 3), 0, 450);
        addObject(jugar, 300   ,300);
        addObject(cred, 300, 370);
        tiempo = new SimpleTimer();
        
        
    }
    
    public void act(){
        if(jugar.getTouch()){
        }
        if(cred.getTouch()){
            tiempo.mark();
            this.removeObject(cred);
            this.removeObject(jugar);
            ballenaA.setActivaMov();
            ballenaB.setActivaMov();
        }
    }
        
}
