import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Esta clase controla el movimiento del barco y los atributos del jugador
 * 
 * @version 3
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
    
    /**
     * Crea un jugador con una imagen
     * @param n Nombre de la imagen
     */
    public Jugador(String n)
    {
        bajaV = false;
        nPeces = 25;
        dinero = 20;
        ju = new GreenfootImage(n);
        this.setImage(ju);
        aux = false;
        energia = EnergiaMax = 10;
        vida = 50;
        gas = 50;
    }
    
    /**
     * Muve al jugador por el mundo
     */
    public void act() {
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
     
     /**
      * Cantidad de peces inicial
      * @param p Número de peces
      */
     public void setPeces(int p){
         nPeces = p;
     }
     
     /**
      * Regresa bajaV
      * @return bajaV
      */
     public boolean getBajaV(){
         return bajaV;
     }
     
     /**
      * Cambia el valor de bajaV
      * @param v valor boleano
      */
     public void setBajaV(boolean v){
         bajaV = v;
     }    
     
     /**
      * Comprueba si el jugador esta bajo el agua
      * @return aux
      */
     public boolean getBajoAgua(){
         return aux;
     }    
     
     /**
      * Regresa la vida del jugador
      * @return vida
      */
     public int getVida(){
         return vida;
     }
     
     /**
      * Regresa la potencia del jugador
      * @return energia
      */
     public int getPotencia(){
         return energia;
     }
     
     /**
      * Cambia la vida del jugador
      * @param v vida
      */
     public void setVida(int v){
         vida = v;
     }
     
     /**
      * Cambia la gasolina del jugador
      * @param g gasolina
      */
     public void setGas(int g){
         gas = g;
     }
     
     /**
      * Cambia la potencia del jugador
      * @param p energia
      */
     public void setPotencia(int p){
         energia = p;
     }
     
     /**
      * Regresa la cantidad de dinero que tiene el jugador
      * @return dinero
      */
     public int getDinero(){
         return dinero;
     }
     
     /**
      * Regresa el número de peces
      * @return nPeces
      */
     public int getNPeces(){
         return nPeces;
     }
     
     /**
      * Regresa la cantidad de gasolina del jugador
      * @return gas
      */
     public int getGas()
     {
         return gas;
     }
     
     /**
      * Ressta dinero al jugador
      * @param cant cantidad
      */
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
