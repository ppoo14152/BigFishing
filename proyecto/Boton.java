import greenfoot.*;

/**
 * Esta clase crea un botón el cual realiza acciones al ser presionado
 *  
 * @version 1.2
 */
public class Boton extends Actor
{
    private GreenfootImage iA, iB;
    private boolean bandera, touch;
    private World wc;
    /**
     * Crea un botón con dos estados
     * @param A Estado pasivo del botón
     * @param B Estado activo del botón
     * @param scale reduce el tamaño del botón.
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
    
     /**
     * Regresa el estado del botón
     * @return touch
     */
    public boolean getTouch(){
        return touch;
    }
    
    /**
     * Regresa el botón a su estado pasivo
     */
    public void  setTouch(){
        touch = false;
        
    }
    
    /**
     * Cambia el estado del botón
     */
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
    
     /**
     * Cambia la imagen del botón al ser presionado
     */
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
