package com.company;
//////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Random;
//////////////////////////////////////////////////////////////////////////

//Sim//

public class BeerProducer extends Thread {

    //////////////////////////////////////////////////////////////////////////
    /*Constructor*/

    public BeerProducer (BeerHouse cerveceria) {

        this.cerveceria = cerveceria;
    }

    //////////////////////////////////////////////////////////////////////////
    /*Attr*/

    private BeerHouse cerveceria;
    protected ArrayList<String> birras = new ArrayList<>();

    //////////////////////////////////////////////////////////////////////////
    /*Methods*/

    public void cargarBirra() {

        this.birras.add("IPA");
        this.birras.add("Pale Ale");
        this.birras.add("Honey");
        this.birras.add("Barley Wine");
        this.birras.add("Irish Red");
    }

    @Override
    public void run() {

        Random aleatorio = new Random(System.currentTimeMillis());



        while(this.cerveceria.stockBirras.size()<100) { //Mientras mi Stock no sobrepase 100 Unidades, produzco.

            String birra = this.birras.get(aleatorio.nextInt(birras.size())); //Selecciono una birra aleatoria entre el tamanio de mi lista.

            aleatorio.setSeed(System.currentTimeMillis()); //Refresco la Semilla.

            this.cerveceria.meter(birra); //Agrego la Birra.
        }


    }



    //////////////////////////////////////////////////////////////////////////
}