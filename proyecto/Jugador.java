import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends ScrollActor
{
    private GreenfootImage ju;
    private boolean aux;
    private Actor pez,anzuelo;
    private int nPeces;
    private int energia;
    private int vida;
    private int dinero;
    private int gas;
    //private List<ScrollActor> l;
    public Jugador(String n)
    {
        nPeces = 0;
        dinero = 0;
        ju = new GreenfootImage(n);
        this.setImage(ju);
        aux = false;
        energia = 10;
        vida = 50;
        gas = 50;
    }
    
    
    public void act() {
        pez = this.getOneIntersectingObject(Pez.class);
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        if(pez != null){
            dinero+=((Pez)pez).valor();
            //l.add((ScrollActor)pez);
            getWorld().removeObject(pez);
            nPeces++;
            if(anzuelo != null){
                ((Anzuelo)anzuelo).noHayPez();
            }
        }
        if(Greenfoot.isKeyDown("s")&&(getX()>0))
        {
            aux = true;
        }
        if(Greenfoot.isKeyDown("w")&&(getX()>0))
        {
            aux = false;
        }
        if (Greenfoot.isKeyDown("a")&& getX()>98 && aux == false) {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("d")&& getX()<800 && aux == false) {
            setLocation(getX() + 3, getY());
        }
     }
     
     public int getVida(){
         return vida;
     }
     
     public int getPotencia(){
         return energia;
     }
     
     public void setVida(int v){
         vida = v;
     }
     
     public void setGas(int g){
         gas = g;
     }
     
     public void setPotencia(int p){
         energia = p;
     }
     
     public int getDinero(){
         return dinero;
     }
     
     public int getNPeces(){
         return nPeces;
     }
     
     public int getGas()
     {
         return gas;
     }
     
     public void restaDinero(int cant)
     {
         dinero -=cant;
     }
     
     public void aumentaGas(int cant)
     {        
         gas = gas + cant;
         if(gas > 100)
         {
            gas = 100;
         }
     }
     
     public void aumentaVida(int cant)
     {
         vida += cant;
         if(vida > 100)
         {
             vida = 100;
         }
     }
     
     public void aumentaEnergia(int cant)
     {
         energia += cant;
         if(energia > 100)
         {
             energia = 100;
         }
     }
}    
