import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Rio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rio extends ScrollWorld
{
    private Vida barV;
    private Potencia barP;
    private Gas barG;
    private Jugador p1 = new Jugador("barcos/barcoMinimalistag.png");
    private Anzuelo anz = new Anzuelo("anzuelo1.png");
    private Cuerda crda;
    private Boton mochila;
    private Boton inventario;
    private List<Pez> peces = new ArrayList<Pez>();
    private boolean refres;
    private SimpleTimer tiempo;
    private SimpleTimer tiempoAnz;
    private TextoP dinero;
    private TextoP npeces;
    //private Banner ban;
    private Tienda ti;

    /**
     * Constructor for objects of class Rio.
     * 
     */
    public Rio()
    {
        super(800, 600, 1, 800, 2000);
        dinero = new TextoP("$");
        npeces = new TextoP("P");
        //ban = new Banner("Inv.png");
        ti = new Tienda(p1, anz);
        barV = new Vida(p1.getVida(),p1.getVida());
        barP = new Potencia(p1.getPotencia(),p1.getPotencia());
        barG = new Gas(p1.getGas(),p1.getGas());
        refres = true;
        mochila = new Boton("mochila.png","mochila.png",false);
        inventario = new Boton("Inventario.png", "Inventario.png", false);
        addObject(new Ballena(),0,1000);
        addObject(new Ballena(),0,1600);
        addObject(new Cielo(0, 255, 255), 400, 200);
        addObject(new Nube("nubes/nube1dia.png",1),10, 35);
        addObject(new Nube("nubes/nube1dia.png",2),25, 50);
        addObject(new Nube("nubes/nube1dia.png",2),78, 100);
        addObject(new Ola("Olas/olaRioA.png", 2), 0, 370);
        addObject(p1,300 ,300);
        addCameraFollower(anz, -200, 90);
        addObject(new Ola("Olas/olaRioF.png", 1), 0, 400);
        addObject(new FondoMarino(),400,1900);
        addObject(new Ballena(),0,1000);
        addObject(new Ballena(),0,1600);
        addObject(new Ballena(),0,1800);
        addObject(new Ballena(),0,1900);
        cambiaColorAgua(0);
        addCameraFollower(anz, 0, 0);
        addObject(mochila,750,85);
        addObject(inventario,750, 170);
        addObject(dinero, 750, 250);
        addObject(npeces,750, 310);
        addObject(barV, 130, 20);
        addObject(barP, 130, 40);
        addObject(barG, 130, 60);
        tiempo = new SimpleTimer();
        tiempoAnz = new SimpleTimer();
        crda = new Cuerda(anz.PosX(),anz.PosT());
        tiempo.mark();
        tiempoAnz.mark();
    }
    
    private void iniciaPecesAmarillos(){
        int numTem = 4+Greenfoot.getRandomNumber(10);
        for(int i=0; i<numTem; i++){
            addObject(new PezAmarillo(), Greenfoot.getRandomNumber(750), 500+Greenfoot.getRandomNumber(550));
        }
    }
    
    private void iniciaPecesAzules(){
        int numTem = 3+Greenfoot.getRandomNumber(5);
        for(int i=0; i<numTem; i++){
            addObject(new PezAzul(), Greenfoot.getRandomNumber(650), 800+Greenfoot.getRandomNumber(450));
        }
    }
    
    private void iniciaPecesMorados(){
         int numTem = 3+Greenfoot.getRandomNumber(3);
            for(int i=0; i<numTem; i++){
            addObject(new PezMorado(), Greenfoot.getRandomNumber(650), 1200+Greenfoot.getRandomNumber(450));
        }
    }
    public void act(){
        crda.setPos(anz.PosX(), anz.PosT(), anz.globalX(), anz.globalY());
<<<<<<< HEAD
=======
        /*if(mochila.getTouch())
        {
        }*/
>>>>>>> d45fb3610a4730f6d5a6f8ed1bb5831411ed5357
        /*if(mochila.getTouch())
        {
        }*/
        
        if(inventario.getTouch())
        {
            if(p1.getDinero() > 20)
            {
                p1.restaDinero(20);
                addObject(ti,400,300);
                ti.muestra();
            }
        }
  
        
        if(Greenfoot.isKeyDown("escape"))
        {
            ti.remove();
            removeObject(ti);
            //repaint();
        }
        
        if(tiempo.millisElapsed()>120000){
            refres = true;
            tiempo.mark();
        }
        if(refres){
            peces = this.getObjects(Pez.class);
            this.removeObjects(peces);
            iniciaPecesAmarillos();
            iniciaPecesAzules();
            iniciaPecesMorados();
            refres = false;
        }
        dinero.actualiza(p1.getDinero());
        npeces.actualiza(p1.getNPeces());
        
        actBar();
    }
    
    public void actBar(){
        p1.setVida(barV.getValue());
        p1.setPotencia(barP.getValue());
        p1.setGas(barG.getValue());
        
        if(anz.getProfundidad()!=0){
            barP.add(-((int)(barP.getValue()*2)));
            if(barP.getValue() < 2){
                anz.setActivo(false);
            }
        }
        else{
            if(tiempoAnz.millisElapsed()>200){
                anz.setActivo(true);
                barP.add(anz.getRes());
                tiempoAnz.mark();
            }
        }
    }
}
