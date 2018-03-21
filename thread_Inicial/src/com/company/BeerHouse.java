package com.company;
//////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.List;
//////////////////////////////////////////////////////////////////////////

//Sim//

public class BeerHouse {

    //////////////////////////////////////////////////////////////////////////
    /*Constructor*/

    public BeerHouse () {

        this.stockBirras = new ArrayList();
    }

    //////////////////////////////////////////////////////////////////////////
    /*Attr*/

    public List<String> stockBirras;

    //////////////////////////////////////////////////////////////////////////
    /*Methods*/

    public synchronized void meter (String birra) {

        while(stockBirras.size()>100){ //Mientras el Stock sea Mayor a 100, el thread esperara.

            try
            {
                wait();
            }
            catch (InterruptedException e)
            {}
        }

        stockBirras.add(birra); //Cuando el Stock halla bajado a menos de 100, se agregara la nueva birra en espera.

        System.out.println("Se agrego la Birra "+ birra);//El print va dentro del metodo sincronizado.
    }

    public synchronized void sacar () {

        String rtn = null;

        if(!this.stockBirras.isEmpty()) { //Si no esta vacio el Stock, saco.

            rtn = this.stockBirras.remove(this.stockBirras.size() -1);

            System.out.println("El consumidor a consumido la birra : "+rtn); //El print va dentro del metodo sincronizado.

            notifyAll(); //Notifico a todos que ya esta disponible el recurso compartido.
        }
    }

}