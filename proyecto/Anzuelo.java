import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class anzuelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anzuelo extends ScrollActor
{    /** The number of cells we move forward and backword */
    private static final int MOVE_AMOUNT = 5;
    private static final int MOVE_REGRESO = 15;
    private int restaurar;
    private int profundidad;
    private boolean activo;
    private boolean activoBarco;
    private int p = 0;
    private GreenfootImage an;
    private boolean baja;
    private int limit;
    private int move;
    private int posOriginalX, posOriginalY;
    private boolean existePez, regresa;
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Move to face the mouse,
     * and listen to the up and down keys.
     */
    public Anzuelo(String name)
    {
        activoBarco = true;
        activo = true;
        restaurar = 1;
        profundidad = 0;
        baja = false;
        limit =0;
        regresa = false;
        existePez = false;
        an = new GreenfootImage(name);
        this.setImage(an);
        move = 3;
    }
    
    public int globalX()
    {
        return this.getGlobalX();
    }
    
    public int globalY()
    {
        return this.getGlobalY();
    }
    
    public int PosX(){
        return posOriginalX;
    }
    
    public int PosT(){
        return posOriginalY;
    }
    
    public void act(){
            getWorld().setCameraDirection(270);
            movimientoAnzuelo();
            regresaBarco();
            //System.out.println(p);
            System.out.println(profundidad);
     }
     
    private void movimientoAnzuelo(){
         if(Greenfoot.isKeyDown("w") && baja == true){
             regresa = true;
             baja = false;
        }
        
        if(Greenfoot.isKeyDown("s") && baja == false)
        {
                baja = true;
                posOriginalX =this.getGlobalX();
                posOriginalY =this.getGlobalY();
                getWorld().moveCamera(-100);
                limit = this.getX()-30;
        }
        
        if (Greenfoot.isKeyDown("a") && (isAtEdge() == false) && activoBarco == true) {
            if(baja == false)
            {
                setLocation(getX() - 3, getY());
            }
            
            if (baja && this.getX() > limit)
            {
                setLocation(getX() - 3, getY());
            }
        }
        
        if (Greenfoot.isKeyDown("d") && (getX()<696) && activoBarco == true) 
        {
            if(baja == false)
            {
                setLocation(getX() + 3, getY());
            }
            
            if (baja && this.getX() < (limit+60))
            {
                setLocation(getX() + 3, getY());
            }
        }
        
        if (Greenfoot.isKeyDown("s") && p<148 && baja == true && activo == true) {
            profundidad++;
            if(this.getGlobalY() > 900)
            {   
                p++;
                getWorld().cambiaFondo(p);
            }
            getWorld().moveCamera(-MOVE_AMOUNT);
        }
    }
    
    private void regresaBarco(){
        if(regresa){
            if(this.getGlobalY() > 900 && p != 0){
                p-=3;
                if(p < 0){
                    p = 0;
                }
                getWorld().cambiaFondo(p);
            }
            getWorld().moveCamera(MOVE_REGRESO); 
            if(regresa && this.getGlobalY() == 390){
                regresa = false;
                profundidad = 0;
            }
        }
    }
    
    public boolean existePez(){
        return existePez;
    }    
    
    public void noHayPez(){
        existePez = false;
    }
    
    public void hayPez(){
        existePez = true;
    }
    
    public void setAnzuelo(String name)
    {
        an = new GreenfootImage(name);
        this.setImage(an);
    }
    
    public int getProfundidad(){
        return profundidad;
    }
    
    public int getRes(){
        return restaurar;
    }
    
    public boolean getActivo(){
        return activo;
    }
    
    public void setActivo(boolean po){
        activo = po;
    }
    
    public void setActivoBarco(boolean ac){
        activoBarco = ac;
    }
}
