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
    private int auxA, auxB, nivel;
    private Vida barV;
    private Potencia barP;
    private Gas barG;
    private Jugador p1 = new Jugador("barcos/barcoMinimalistag.png");
    private Anzuelo anz = new Anzuelo("anzuelo1.png");
    //private Cuerda crda;
    private Boton mochila;
    private Boton inventario;
    private List<Pez> peces = new ArrayList<Pez>();
    private boolean refres, pinta;
    private SimpleTimer tiempo;
    private SimpleTimer tiempoAnz;
    private TextoP dinero;
    private TextoP npeces;
    private Nivel level;
    private Tienda ti;
    private Ayuda ay;
    private Record r;
    private ScoreBoard sb;

    /**
     * Constructor for objects of class Rio.
     * 
     */
    public Rio()
    {
        super(800, 600, 1, 800, 2000);
        pinta = true;
        nivel = 1;
        auxA = auxB = 0;
        dinero = new TextoP("$");
        npeces = new TextoP("P");
        sb = new ScoreBoard(500,400);
        ti = new Tienda(p1, anz, barG, barP, barV);
        ay = new Ayuda();
        r = new Record(p1);
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
        //crda = new Cuerda(anz.PosX(),anz.PosT());
        ti = new Tienda(p1, anz, barG, barP, barV);
        tiempo.mark();
        tiempoAnz.mark();
    }
    
    private void iniciaPecesAmarillos(){
        int numTem = 4+Greenfoot.getRandomNumber(10);
        for(int i=0; i<numTem; i++){
            addObject(new PezAmarillo(), Greenfoot.getRandomNumber(750), 500+Greenfoot.getRandomNumber(550));
        }
    }
    
    private void iniciaPecesRojos(){
        int numTem = 3+Greenfoot.getRandomNumber(3);
        for(int i=0; i<numTem; i++){
            addObject(new PezRojo(), Greenfoot.getRandomNumber(650), 700+Greenfoot.getRandomNumber(350));
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
        //crda.setPos(anz.PosX(), anz.PosT(), anz.globalX(), anz.globalY());
        
        if(inventario.getTouch())
        {
            if(p1.getDinero() > 10)
            {
                p1.restaDinero(10);
                addObject(ti,400,300);
                ti.muestra();
            }
        }
        
        if(mochila.getTouch())
        {
            addObject(ay, 400, 300);
        }
        
        if(Greenfoot.isKeyDown("escape"))
        {
            ti.remove();
            removeObject(ti);
            removeObject(ay);
        }
        
        selectorNivel();
        
        dinero.actualiza(p1.getDinero());
        npeces.actualiza(p1.getNPeces());
        
        actBar();
    }
    
    private void actBar(){
        
        p1.setVida(barV.getValue());
        p1.setPotencia(barP.getValue());
        p1.setGas(barG.getValue());
        
        if(p1.getBajaV() == true){
            barV.add(-10);
            p1.setBajaV(false);
        }
            
        if(anz.getProfundidad()!=0){
            barP.setSpeed(8);
            barP.add(-1);
            if(barP.getValue() < 2){
                anz.setActivo(false);
            }
        }
        else{
            //if(tiempoAnz.millisElapsed()>10){
                anz.setActivo(true);
                barP.setSpeed(40);
                barP.add(anz.getRes());
                tiempoAnz.mark();
            //}//
        }
        
        if ((Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d")) && p1.getBajoAgua() != true){
            if((auxA%25) == 0){
                barG.add(-1);
                auxA=0;
            }
            auxA++;
        }
        
        if(p1.getGas() < 2){
            anz.setActivoBarco(false);
        }
        else{
            anz.setActivoBarco(true);
        }
        
        if(p1.getGas() < 1){
            if((auxB%30) == 0){
                barV.add(-1);
                auxB=0;
            }
            auxB++;
        }
        
        if(barV.getValue() == 0)
        {
            int A = 1;
            r.fin();
            //addObject(sb,400, 300);
            do{
                A++;
            }while(A%150 != 0);
            Greenfoot.setWorld(new MainMenu());
        }
    }
    
    private void selectorNivel(){
        
        if(nivel == 1 && p1.getNPeces() > 29 ){
            pinta = true;
            refres = true;
            removeObject(level);
            nivel = 2;
            p1.setPeces(0);
        }
        
        if(tiempo.millisElapsed()>110000){
            refres = true;
            tiempo.mark();
        }
        
        switch(nivel){
            case 1:
                if(pinta == true){
                    level = new Nivel("Nivel1.png");
                    addObject(level, 400, 60);
                    pinta = false;
                }
                
                if(refres){
                    peces = this.getObjects(Pez.class);
                    this.removeObjects(peces);
                    iniciaPecesAmarillos();
                    iniciaPecesAzules();
                    iniciaPecesMorados();
                    iniciaPecesRojos();
                    refres = false;
                }
            break;
            case 2:
                if(pinta == true){
                    level = new Nivel("Nivel2.png");
                    addObject(level, 400, 60);
                    pinta = false;
                }
                
                if(refres){
                    peces = this.getObjects(Pez.class);
                    this.removeObjects(peces);
                    iniciaPecesAzules();
                    iniciaPecesMorados();
                    iniciaPecesRojos();
                    refres = false;
                }
        }  
    }
}
