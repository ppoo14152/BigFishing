import greenfoot.*;

/**
 * Write a description of class ImagenC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImagenC extends ScrollActor
{
    private GreenfootImage img;
    private boolean init, mov;
    private int gX;
    private int aux, auy;
    /**
     * Act - do whatever the ImagenC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ImagenC(String imga, int x){
        gX = x;
        mov = false;
        init = true;
        img = new GreenfootImage(imga);
        this.setImage(img);
    }
    public void act() 
    {
        if(init){
            aux = getX();
            auy = getY();
            this.setGlobalLocation(aux-gX,auy);
            init = false;
        }
        if(mov){
            this.setGlobalLocation(this.getGlobalX()+2, this.getY());
        }
        if(this.getGlobalX()>1250){
            mov = false;
            this.setGlobalLocation(0-gX,this.getY());
        }
    }
    
    public void setActivaMov(){
        mov = true;
    }
    
    public boolean getReinicio(){
        return mov;
    }
}
