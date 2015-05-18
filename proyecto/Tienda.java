import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tienda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tienda extends Actor
{
    private Gas bGas;
    private Potencia bPot;
    private Vida bVid;
    private Banner fondo;
    private boolean touch;
    private int banAnz, banCom;
    private Boton gas;
    private Boton anz;
    //private Boton can;
    private Boton com;
    private Boton lancha;
    private Jugador player;
    private Anzuelo an;
    private TextoP titulo;
    private TextoP Gas;
    private TextoP tAnzuelo;
    private TextoP tCana;
    private TextoP tProv;
    private TextoP tex1;
    private TextoP tex2;
    private Boton An1;
    private Boton An2;
    private Boton An3;
    private Boton An4;
    private Boton An5;
    private Boton An6;
    private Boton v1, v2;
    private Boton e1, e2;
    public Tienda(Jugador p, Anzuelo a, Gas g, Potencia pp, Vida v)
    {
        bVid = v;
        bPot = pp;
        bGas = g;
        touch = false;
        banAnz = 0;
        banCom = 0;
        fondo = new Banner("Inv.png");
        gas = new Boton("gas.png", "gas.png", false);
        anz = new Boton("botonAnzuelo.png", "botonAnzuelo.png", false);
        com = new Boton("botonProv.png", "botonProv.png", false);
        lancha = new Boton("bote.png", "bote.png", false);
        player = p;
        an = a;
        Gas = new TextoP("Gas: $15", 30);
        tAnzuelo = new TextoP("Anzuelos",30);
        tCana = new TextoP("Alimentos",30);
        tProv = new TextoP("Barcos",30);
        titulo = new TextoP("Tienda",40);
        tex1 = new TextoP("",30);
        tex2 = new TextoP("",30);
        An1 = new Boton ("bAnzuelo1.png", "bAnzuelo1.png", false);
        An2 = new Boton ("bAnzuelo2.png", "bAnzuelo2.png", false);
        An3 = new Boton ("bAnzuelo3.png", "bAnzuelo3.png", false);
        An4 = new Boton ("bAnzuelo4.png", "bAnzuelo4.png", false);
        An5 = new Boton ("bAnzuelo5.png", "bAnzuelo5.png", false);
        An6 = new Boton ("bAnzuelo6.png", "bAnzuelo6.png", false);
        v1 = new Boton ("bVida.png", "bVida.png", false);
        v2 = new Boton ("bVida.png", "bVida.png", false);
        e1 = new Boton ("bEnergia.png", "bEnergia.png", false);
        e2 = new Boton ("bEnergia.png", "bEnergia.png", false);

    }

    public void muestra()
    {
        touch = true;
        getWorld().addObject(titulo,400,40);
        getWorld().addObject(fondo, 400, 300);
        getWorld().addObject(gas,300,180);
        getWorld().addObject(Gas,290, 230);
        getWorld().addObject(anz,400,180);
        getWorld().addObject(tAnzuelo,400,230);
        getWorld().addObject(tCana,500,230);
        getWorld().addObject(com,500,180);
        getWorld().addObject(tProv,300,350);
        getWorld().addObject(lancha,300,300);
        getWorld().addObject(tex1,400,350);
        getWorld().addObject(tex2,500,350);
        titulo.setTexto("Tienda");
        Gas.setTexto("Gas: $15");
        tAnzuelo.setTexto("Anzuelos");
        tCana.setTexto("Alimentos");
        tProv.setTexto("Barcos");
        tex1.setTexto("");
        tex2.setTexto("");

    }

    public void muestraAnz()
    {
        getWorld().addObject(fondo, 400, 300);
        getWorld().addObject(An1,300,180);
        getWorld().addObject(An2,400,180);
        getWorld().addObject(An3,500,180);
        getWorld().addObject(An4,300,300);
        getWorld().addObject(An5,400,300);
        getWorld().addObject(An6,500,300);
        banAnz = 1;
    }

    public void remove()
    {
        if(banAnz == 1)
        {
            removeAnz();
        }
        
        if(banCom ==1)
        {
            removeCom();
        }
        
            if(touch == true)
            {
                getWorld().removeObject(fondo);
                getWorld().removeObject(gas);
                getWorld().removeObject(anz);
                getWorld().removeObject(com);
                getWorld().removeObject(lancha);
                getWorld().removeObject(Gas);
                getWorld().removeObject(tAnzuelo);
                getWorld().removeObject(tCana);
                getWorld().removeObject(tProv);
                getWorld().removeObject(tex1);
                getWorld().removeObject(tex2);
                titulo.setTexto("");
                touch = false;
            }
    }

    public void removeAnz()
    {
        //getWorld().removeObject(fondo);
        getWorld().removeObject(An1);
        getWorld().removeObject(An2);
        getWorld().removeObject(An3);
        getWorld().removeObject(An4);
        getWorld().removeObject(An5);
        getWorld().removeObject(An6);
        banAnz = 0;
    }
    
    public void muestraCom()
    {
        getWorld().addObject(fondo, 400, 300);
        getWorld().addObject(v1,300,180);
        getWorld().addObject(v2,400,180);
        getWorld().addObject(e1,500,180);
        getWorld().addObject(e2,300,300);
        banCom = 1;
    }
    
    public void removeCom()
    {
        getWorld().removeObject(v1);
        getWorld().removeObject(v2);
        getWorld().removeObject(e1);
        getWorld().removeObject(e2);
        banCom = 0;
    }

    public void act() 
    {
        if(gas.getTouch())
        {
            if(player.getDinero() > 10)
            {
                //player.aumentaGas(50);
                bGas.add(50);
            }
        }

        if(anz.getTouch())
        {
            //getWorld().removeObject(fondo);
            muestraAnz();
            titulo.setTexto("Anzuelos");
            Gas.setTexto("Gratis");
            tAnzuelo.setTexto("20");
            tCana.setTexto("30");
            tProv.setTexto("40");
            tex1.setTexto("50");
            tex2.setTexto("60");
        }
        
        if(An1.getTouch())
        {
            an.setAnzuelo("anzuelo1.png");
        }
        
        if(An2.getTouch())
        {
            if(player.getDinero() > 20)
            {
                player.restaDinero(20);
                an.setAnzuelo("anzuelo2.png");
                bPot.setMax(30);
            }
        }
        
        if(An3.getTouch())
        {
            if(player.getDinero() > 30)
            {
                player.restaDinero(30);
                an.setAnzuelo("anzuelo3.png");
                bPot.setMax(90);
            }
        }
        
        if(An4.getTouch())
        {
            if(player.getDinero() > 40)
            {
                player.restaDinero(40);
                an.setAnzuelo("anzuelo4.png");
                bPot.setMax(150);
            }
        }
        
        if(An5.getTouch())
        {
            if(player.getDinero() > 50)
            {
                player.restaDinero(50);
                an.setAnzuelo("anzuelo5.png");
                bPot.setMax(210);
            }
        }
        
        if(An6.getTouch())
        {
            if(player.getDinero() > 60)
            {
                player.restaDinero(60);
                an.setAnzuelo("anzuelo6.png");
                bPot.setMax(270);
            }
        }
        
        if(com.getTouch())
        {
            //getWorld().removeObject(fondo);
            muestraCom();
            titulo.setTexto("Comida");
            Gas.setTexto("+50: $40");
            tAnzuelo.setTexto("+25: $20");
            tCana.setTexto("+50: $30");
            tProv.setTexto("+25: $10");
            tex1.setTexto("");
            tex2.setTexto("");
        }
        
        if(v1.getTouch())
        {
            if(player.getDinero() > 40)
            {
                player.restaDinero(40);
                player.aumentaVida(50);
            }
        }
        
        if(v2.getTouch())
        {
            if(player.getDinero() > 20)
            {
                player.restaDinero(20);
                player.aumentaVida(25);
            }
        }
        
        if(e1.getTouch())
        {
            if(player.getDinero() > 30)
            {
                player.restaDinero(30);
                player.aumentaEnergia(50);
            }
        }
        
        if(e1.getTouch())
        {
            if(player.getDinero() > 10)
            {
                player.restaDinero(10);
                player.aumentaEnergia(25);
            }
        }
    }
}
