import greenfoot.*;

/**
 * Write a description of class PezMorado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PezMorado extends Pez
{
    private GreenfootImage img;
    private boolean direccion, anclado;
    private Actor anzuelo;
    /**
     * Act - do whatever the PezAmarillo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PezMorado(){
        super(2,5,3,4,7+Greenfoot.getRandomNumber(7));
        direccion = true;
        img = new GreenfootImage("pez3.png");
        img.mirrorHorizontally();
        img.scale(img.getWidth()-670,img.getHeight()-470);
        this.setImage(img);
    }
    
    public void act(){
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        anzuelo = this.getOneIntersectingObject(Anzuelo.class);
        if(anzuelo != null){
            if(!((Anzuelo)anzuelo).existePez()||anclado){
                this.setGlobalLocation(((Anzuelo)anzuelo).globalX(), ((Anzuelo)anzuelo).globalY()+20);
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
