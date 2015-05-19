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
    private boolean aux, bajaV;
    private Actor pez,anzuelo, bar;
    private int nPeces;
    private int EnergiaMax;
    private int energia;
    private int vida;
    private int dinero;
    private int gas;
    private UserInfo punt;
    //private List<ScrollActor> l;
    public Jugador(String n)
    {
        bajaV = false;
        nPeces = 0;
        dinero = 20;
        ju = new GreenfootImage(n);
        this.setImage(ju);
        aux = false;
        energia = EnergiaMax = 10;
        vida = 50;
        gas = 50;
    }
    
    
    public void act() {
       // System.out.println(aux);
        pez = this.getOneIntersectingObject(Pez.class);
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        if(pez != null){
            dinero+=((Pez)pez).valor();
            if(((Pez)pez).getAgresivo()>10){
                bajaV = true;
            }
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
        if (Greenfoot.isKeyDown("a")&& getX()>98 && aux == false && gas > 1) {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("d")&& getX()<800 && aux == false && gas > 1) {
            setLocation(getX() + 3, getY());
        }
     }
     
     public boolean getBajaV(){
         return bajaV;
     }
     
     public void setBajaV(boolean v){
         bajaV = v;
     }    
     
     public boolean getBajoAgua(){
         return aux;
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
