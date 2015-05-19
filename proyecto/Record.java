import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Guarda la información del usuario, para mostrar los puntajes mas altos
 * 
 * @version 1
 */
public class Record extends Actor
{
    private UserInfo p;
    private Jugador ju;
    
     /**
     * Constructor de la clase Record
     * @j Jugador al que se le guardara el puntaje
     */
    public Record(Jugador j)
    {
        ju = j;
    }
    
     /**
     * Descarga del servidor la información del jugador
     */
    public void obtenInfo()
    {
    if (UserInfo.isStorageAvailable()) {
            if (UserInfo.getMyInfo() != null) {
                p = UserInfo.getMyInfo();
            }
        }
    }
    
     /**
     * Obtiene la información del jugador y la guarda
     */
    public void fin()
    {
        this.obtenInfo();
        this.guarda(ju.getDinero());
    }
    
    /**
     * Guarda el puntaje del jugador en el servidor si supera el puntaje máximo
     * @param punt puntaje
     */
    public void guarda(int punt)
    {
        if (UserInfo.isStorageAvailable()) {
            if (p != null) {
                if (punt > p.getScore()) {
                    p.setScore(punt);
                    p.store();
                }
            }
        }
    }    
}
