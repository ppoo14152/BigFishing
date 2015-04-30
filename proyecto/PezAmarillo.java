import greenfoot.*;

/**
 * Write a description of class PezAmarillo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezAmarillo extends Pez
{

    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    /**
     * Act - do whatever the PezAmarillo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezAmarillo(){
        super(1+Greenfoot.getRandomNumber(3),2,2,2,1+Greenfoot.getRandomNumber(3));
        anclado = false;
        direccion = true;
        img = new GreenfootImage("Pez1.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-600,img.getHeight()-250);
        this.setImage(img);
    }
    
    public void act(){
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        if(anzuelo != null){
            if(!((Anzuelo)anzuelo).existePez()||anclado){
                this.setGlobalLocation(((Anzuelo)anzuelo).globalX(), ((Anzuelo)anzuelo).globalY()+50);
                anclado = true;
                if(this.getRotation() == 0){
                    img = this.getImage();
                    if(!direccion){
                        img.mirrorHorizontally();
                        this.setImage(img);
                    }
                    this.setRotation(-90);
                }
                ((Anzuelo)anzuelo).hayPez();
            }
        }
        else{
            this.setRotation(0);
            super.act();
            if(getGlobalX() > 900){
                direccion = false;
                img.mirrorHorizontally();
            }
            if(getGlobalX() < -110){
                direccion = true;
                img.mirrorHorizontally();
            }
        }
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
    }
}