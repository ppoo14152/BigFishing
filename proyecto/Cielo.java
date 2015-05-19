import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Esta clase crea el fondo de los niveles y simula el paso del día y la noche en el juego.
 *  
 * @version 1
 */
public class Cielo extends ScrollActor
{
    private int r, g, b;
    private int c;
    private int v;
    private boolean dia;
    private GreenfootImage sky = new GreenfootImage(800,400);
    private SimpleTimer timer = new SimpleTimer();
   
     /**
     * Crea un objeto Cielo y lo dibuja segun los colores de la paleta RGB
     * @param r Red
     * @param g Green
     * @param b Blue
     * 
     */
    public Cielo(int red, int green, int blue)
    {
        r = red;
        g = green;
        b = blue;
        c = 0;
        v = 0;
        dia = true;
        sky.setColor(new Color(r, g, b));
        sky.fillRect(0, 0, 800, 400);
        setImage(sky);
        timer.mark();
    }
    
    /**
     * Cambia el color del cielo, segun el tiempo, utiliza la clase SimpleTimer
     */
    public void act()
    {
        if(timer.millisElapsed()>1020)
        {
            if(c < g && dia == true)
            {
                incCont(1);
                if (c % 5 == 0)
                {
                    incCont(0);
                }
            }
            else
            {
                dia = false;
                decCont(1);
                if (c % 5 == 0)
                {
                    decCont(0);
                }
                if(c == 0)
                {
                    dia = true;
                }
            }
            cambiaColor(c ,v);
            timer.mark();
        }
    }
    
     /**
     * Cambia el color del cielo, modificando los valores RGB
     * @param tiempo Contador que resta al valor Green del modelo de color RGB
     * @param v Contador que resta al valor Blue del modelo de color RGB
     */
    private void cambiaColor(int tiempo, int v)
    {
        sky.setColor(new Color(r,g - tiempo,b - v));
        sky.fillRect(0,0,800,600);
        setImage(sky);
    }
    
     /**
     * Incrementa el valor de los contadores
     * @param valor Determina cual de los dos contadores se va a incrementar
     */
    private void incCont(int valor)
    {
        if(valor == 1)
        {
            c++;
        }
        else
        {
            v++;
        }
    }
    
     /**
     * Decrementa el valor de los contadores
     * @param valor Determina cual de los dos contadores se va a decrementar
     */
    private void decCont(int valor)
    {
        if(valor == 1)
        {
            c--;
        }
        else
        {
            v--;
        }
    }
    
     /**
     * Determina si es día o noche
     * @return dia
     */
    public boolean getDia()
    {
        return dia;
    }
}
