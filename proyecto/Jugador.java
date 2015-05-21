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
    private int nPezAmarillo, nPezAzul, nPezVioleta, nPezRojo, nPezGlobo, nPezSerpiente, nPezVagabundo, nTiburon;
    private UserInfo punt;
    
    /**
     * Crea un jugador con una imagen
     * @param n Nombre de la imagen
     */
    public Jugador(String n)
    {
        bajaV = false;
        nPeces = 0;
        nPezAmarillo = nPezAzul = nPezVioleta = nPezRojo = nPezGlobo = nPezSerpiente = nPezVagabundo = nTiburon = 0;
        dinero = 25;
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
            aumentaContadores();
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
     
     /**
      * Metodo para reinicial los contadores de peces capturados por el jugador en el nivel presente
      */
     
     public void resetNpeces(){
         nPezAmarillo = nPezAzul = nPezVioleta = nPezRojo = nPezGlobo = nPezSerpiente = nPezVagabundo = nTiburon = 0;
     }
     
     /**
      * Metodo para obtener el numero de peces capturados en el nivel
      * 0 - Pez Amarillo
      * 1 - Pez Azul
      * 2 - Pez Violeta
      * 3 - Pez Rojo
      * 4 - Pez Globo
      * 5 - Pez Serpiente
      * 6 - Pez Vagabundo
      * 7 - Pez Tiburon
      * @param n indica cual es el valor del pez que va a retornar
      */
     
     public int getNPez(int n){
         switch(n){
             case 0:
                return nPezAmarillo;
             case 1:
                return nPezAzul;
             case 2:
                return nPezVioleta;
             case 3:
                return nPezRojo;
             case 4:
                return nPezGlobo;
             case 5:
                return nPezSerpiente;
             case 6:
                return nPezVagabundo;
             case 7:
                return nTiburon;
             default:
                return 0;
         }
     }
     
     private void aumentaContadores(){
        if(((Pez)pez).getAgresivo()==1){
            nPezAmarillo++;
        }
        if(((Pez)pez).getAgresivo()==2){
            nPezAzul++;
        }
        if(((Pez)pez).getAgresivo()==4){
            nPezVioleta++;
        }
        if(((Pez)pez).getAgresivo()==15){
            nPezRojo++;
        }
        if(((Pez)pez).getAgresivo()==11){
            nPezGlobo++;
        }
        if(((Pez)pez).getAgresivo()==13){
            nPezSerpiente++;
        }
        if(((Pez)pez).getAgresivo()==16){
            nPezVagabundo++;
        }
        if(((Pez)pez).getAgresivo()==10){
            nTiburon++;
        }
    }
}    
