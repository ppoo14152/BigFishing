import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Dinero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextoP extends Actor
{
    private GreenfootImage img;
    private int cont;
    private int tam;
    private String simbol;
    /**
     * Act - do whatever the Dinero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TextoP(String s){
        simbol = s;
        cont = 0;
        tam = 48;
        img = new GreenfootImage(simbol+cont, tam, new Color(78,78,78),new Color(255,255,255,0));
        this.setImage(img);
    }

    public TextoP(String s, int tamanio)
    {
        simbol = s;
        cont = -1;
        tam = tamanio;
        img = new GreenfootImage(simbol, tam, new Color(78,78,78),new Color(255,255,255,0));
        this.setImage(img);
    }

    public void act() 
    {
        if(cont != -1){
            if(cont>99){
                tam = 42;
            }
            if(cont>999){
                tam = 36;
            }
        
        img = new GreenfootImage(simbol+cont, tam, new Color(78,78,78),new Color(255,255,255,0));
        this.setImage(img);
    }
    else
    {
        img = new GreenfootImage(simbol, tam, new Color(78,78,78),new Color(255,255,255,0));
        this.setImage(img);
    }
    }  

    public void actualiza(int c){
        cont=c;
    }
    
    public void setTexto(String t)
    {
        simbol = t;
    }
}
