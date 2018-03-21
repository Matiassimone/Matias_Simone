//////////////////////////////////////////////////////////////////
*TP1* THREADS.

	-	¿Cuantos consumidores se necesitan para que el stock llegue a 0?

	Un solo consumidor es capas de llevar el Stock a 0.


	-	¿Bloques synchronized porque deben serlos?

	Los bloques Synchronized se utilizan para cuando varios Threads consumen de un mismo recurso, estos entren de uno a la vez
	para asi no generar errores de datos en el programa.


	-	Explica el recurso compartido:

	El recurso compartido es el bloque de codigo al cual ingresaran los Threads, el cual ademas debe ser Synchronized para
	que estos ingresen uno a la vez.


	-	Explica las 3 formas de instanciar Thread:

	(1): Haciendo un New a la clase Thread, instanciando directamente la clase Thread.

	(2): Haciendo un New a una clase que extienda Thread, heredando la clase Thread.

	(3): Implementando la clase Runnable.

//////////////////////////////////////////////////////////////////