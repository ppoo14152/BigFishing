import greenfoot.*;
import java.awt.Color;

/**
 * Menu inicial del juego, desde esta clase se inician los records y el juego 
 * 
 * @version 1
 */
public class MainMenu extends ScrollWorld
{
    private GreenfootSound mfondo;
    private GreenfootImage fondo;
    private Boton jugar;
    private Boton cred;
    private Boton record;
    private ImagenC ballenaA;
    private ImagenC ballenaB;
    private SimpleTimer tiempo;
    private boolean botones, existen;
    private ScoreBoard sb;

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {
        super(800, 600, 1, 800, 1200);
        botones = true;
        existen = false;
        sb =  new ScoreBoard(500,400);
        ballenaA = new ImagenC("creditos/b1.png",250);
        ballenaB = new ImagenC("creditos/b2.png",750);
        jugar = new Boton("botones/JugarB.png","botones/JugarA.png",true);
        cred = new Boton("botones/CreditosB.png","botones/CreditosA.png",true);
        record = new Boton("botones/RecordsB.png","botones/RecordsA.png",true);
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
        addObject(ballenaA, 0, 390);
        addObject(ballenaB, 0, 390);
        addObject(new Ola("Olas/ola1h.png", 3), 0, 450);
        tiempo = new SimpleTimer();
        
        
    }
    
    /**
     * Inicia el movimiento y los eventos del menu
     */
    public void act(){
        if(jugar.getTouch()){
          
                Greenfoot.setWorld(new Escenario());
        }
        
        if(cred.getTouch()){
            botones = false;
            ballenaA.setActivaMov();
            ballenaB.setActivaMov();
            cred.setTouch();
            tiempo.mark();
        }
        
        if(record.getTouch()){
            this.addObject(sb, 400,300);
        }
        
        if(Greenfoot.isKeyDown("escape")){
            this.removeObject(sb);
        }
        
        if(tiempo.millisElapsed()>17500){
            botones = true;
        }
        muestraBotones();   
    }
    /**
     * Muestra los botones del juego
     */
    public void muestraBotones(){
        if(botones){
            if(!existen){
                this.addObject(jugar, 300, 300);
                this.addObject(cred, 300, 370);
                this.addObject(record, 300, 430);
                existen = true;
            }
        }else{
                this.removeObject(cred);
                this.removeObject(jugar);
                this.removeObject(record);
                existen = false;
        }
    }    
       
 }
        
