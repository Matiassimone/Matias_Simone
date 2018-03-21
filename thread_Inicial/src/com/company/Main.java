package com.company;
//////////////////////////////////////////////////////////////////////////

//Sim//

public class Main {

    public static void main(String[] args) {


        BeerHouse cerveceria = new BeerHouse();


        BeerProducer productor= new BeerProducer(cerveceria);
        productor.cargarBirra();


        /* Un solo consumidor el Stock puede llegar a 0*/

        //BeerConsumer consumidorA=new BeerConsumer(cerveceria);
        //BeerConsumer consumidorB=new BeerConsumer(cerveceria);
        BeerConsumer consumidorC=new BeerConsumer(cerveceria);

        productor.start();

        //consumidorA.start();
        //consumidorB.start();
        consumidorC.start();

    }
}
