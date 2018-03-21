package com.company;
//////////////////////////////////////////////////////////////////////////

//Sim//


public class BeerConsumer extends Thread {


    //////////////////////////////////////////////////////////////////////////
    /*Constructor*/

    public BeerConsumer (BeerHouse cerveceria) {

        this.cerveceria = cerveceria;
    }

    //////////////////////////////////////////////////////////////////////////
    /*Attr*/

    private BeerHouse cerveceria;


    //////////////////////////////////////////////////////////////////////////
    /*Methods*/

    @Override
    public void run() {

        while(!this.cerveceria.stockBirras.isEmpty()) { //Mientras halla birras.

            try
            {
            BeerConsumer.sleep(200); //Duermo el consumidor 200 milisegundos, para darle tiempo al productor.
            this.cerveceria.sacar();
            }
            catch (InterruptedException e)
            {}

        }

        System.out.println("Un consumidor se ah quedado sin Birra");
    }


}