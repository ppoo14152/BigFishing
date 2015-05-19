import greenfoot.*;
import java.awt.Color;

/**
 * Convierte una cadena a imagen y la muestra en el mundo.
 * 
 * @author Jesús Alejandro 
 * @version 1.2
 */
public class TextoP extends Actor
{
    private GreenfootImage img;
    private int cont;
    private int tam;
    private String simbol;
    /**
     * Constructor de la clase TextoP.
     * @param s Texto que se va a introducir
     */
    public TextoP(String s){
        simbol = s;
        cont = 0;
        tam = 48;
        img = new GreenfootImage(simbol+cont, tam, new Color(78,78,78),new Color(255,255,255,0));
        this.setImage(img);
    }

    /**
     * Constructor de la clase TextoP
     * @param s Texto que se va a introducir
     * @param tamanio Tamaño de la fuente
     */
    public TextoP(String s, int tamanio)
    {
        simbol = s;
        cont = -1;
        tam = tamanio;
        img = new GreenfootImage(simbol, tam, new Color(78,78,78),new Color(255,255,255,0));
        this.setImage(img);
    }

    /**
     * The act method is called by the greenfoot framework to give actors a chance to perform some action.
     */
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

    /**
     * Contador, se utiliza para mostrar numeros
     * @param c número
     */
    public void actualiza(int c){
        cont=c;
    }
    
    /**
     * Cambia el texto que se muestra
     * @param t Cadena de texto nueva
     */
    public void setTexto(String t)
    {
        simbol = t;
    }
}
