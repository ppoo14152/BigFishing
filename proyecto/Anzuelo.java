import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Esta clase se encarga del moviemiento del anzuelo en el mundo y la profundidad a la que deciende.
 * 
 * 
 * @version 2
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
     * Crea un anzuelo con una imagen
     * @param name Nombre de la imagen
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
   
      /**
     * Obtinen la ubicación global del anzuelo en el ScrollWorld
     * @return globalX Coordenada X
     */
    public int globalX()
    {
        return this.getGlobalX();
    }
    
    /**
     * Obtinen la ubicación global del anzuelo en el ScrollWorld
     * @return globalY Coordenada Y 
     */
    public int globalY()
    {
        return this.getGlobalY();
    }
    
    /**
     * Regresa la posición original del anzuelo en el mundo
     * @return posOriginalX Coordenada X
     */
    public int PosX(){
        return posOriginalX;
    }
   
     /**
     * Regresa la posición original del anzuelo en el mundo
     * @return posOriginalY Coordenada Y
     */
    public int PosT(){
        return posOriginalY;
    }
    
       /**
     * Inicia el movimiento del anzuelo
     */ 
    public void act(){
            getWorld().setCameraDirection(270);
            movimientoAnzuelo();
            regresaBarco();
            //System.out.println(p);
            //System.out.println(profundidad);
     }
     
      /**
      * Define las teclas con las que se movera el anzuelo
      */
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
    
        /**
     * Regresa el anzuelo a su posición original
     */
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
    
    /**
     * Indica si existe un pez en el anzuelo
     * @return existePez
     */
    public boolean existePez(){
        return existePez;
    }    
   
     /**
     * Regresa el atributo existePez a false
     */
    public void noHayPez(){
        existePez = false;
    }
    
        /**
     * Cambia el atributo existePez a true
     */
    public void hayPez(){
        existePez = true;
    }
    
        /**
     * Cambia la imagen del anzuelo
     * @param name Nombre de la imagen
     */
    public void setAnzuelo(String name)
    {
        an = new GreenfootImage(name);
        this.setImage(an);
    }
    
        /**
     * Obtiene el valor del atributo profundidad
     * @return profundidad
     */
    public int getProfundidad(){
        return profundidad;
    }
    
     /**
     * Regresa el valor del atributo restaurar
     * @return restaurar
     */
    public int getRes(){
        return restaurar;
    }
    
    /**
     * Regresa el valor del atributo activo
     * @return activo
     */
    public boolean getActivo(){
        return activo;
    }
    
        /**
     * Cambia el valor del atributo activo
     * @param po Valor boleano
     */
    public void setActivo(boolean po){
        activo = po;
    }
    
        /**
     * Cambia el valor de activaBArco. Activa barco bloque el movimiento del actor Anzuelo
     * @param ac Valor Boleano
     */
    public void setActivoBarco(boolean ac){
        activoBarco = ac;
    }
}
