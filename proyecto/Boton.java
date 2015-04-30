import greenfoot.*;

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    private GreenfootImage iA, iB;
    private boolean bandera, touch;
    private World wc;
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boton(String A, String B,boolean scale){
        iA = new GreenfootImage(A);
        iB = new GreenfootImage(B);
        if(scale){
            iA.scale(iA.getWidth()-150,iA.getHeight()-35);
            iB.scale(iB.getWidth()-150,iB.getHeight()-35);
        }
        wc = getWorld();
        bandera = false;
        touch = false;
        this.setImage(iB);
    }
    
    public boolean getTouch(){
        return touch;
    }
    
    public void  setTouch(){
        touch = false;
        
    }
    
    public void act() 
    {
        cambiaBoton();
        if(Greenfoot.mouseClicked(this)){
            touch = true;
        }
        else{
            touch = false;
        }
    }    
    
        private void cambiaBoton(){
        if(Greenfoot.mouseMoved(this)){
            this.setImage(iA);
        }
        else{
            if(Greenfoot.mouseMoved(wc)){
             this.setImage(iB);
            }
        }
    }
}
