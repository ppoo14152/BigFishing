import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Record extends Actor
{
    private UserInfo p;
    private Jugador ju;
    public Record(Jugador j)
    {
        ju = j;
    }
    
    public void obtenInfo()
    {
    if (UserInfo.isStorageAvailable()) {
            if (UserInfo.getMyInfo() != null) {
                p = UserInfo.getMyInfo();
            }
        }
    }
    
    public void fin()
    {
        this.obtenInfo();
        this.guarda(ju.getDinero());
    }
    
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
    
    public void act() 
    {
        // Add your action code here.
    }    
}
