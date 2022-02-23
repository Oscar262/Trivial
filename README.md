# Trivial

## Problema 0

Extraemos el codigo duplicado a un unico metodo "nuevaPosicioJugador", el que ahora llamamos desde ambos sitios.

Creamos un test que compruebe la posicion del jugador "moverCasilla"

## Problema 1

Modificamos la clase "GameLauncher" y agregamos el metodo "es jugable" con un if antes de empezar el juego, y si hay menos de dos jugadores salta un aviso y el juego no se ejecuta.

Creamos dos test, uno "esJugableTrueTest" que comprueba si el metodo permite jugar, y otro "esJugableFalseTest" que demuestra que si solo hay un jugador el metodo devuelve "false".

## Problema 2

Modificamos el tamaño de las arrays declaradas en la clase "Game" y poniendo un numero más (en este caso 7), para conseguir que permita introducir seis jugadores , porque las posiciones del array empiezan por 0, por lo tanto si queremos que pueda haber hasta seis el tamaño debe ser un número más de los que realmente quieres introducir.También en la clase "Game" cambiemos el metodo es jugable y añadimos en el return que deve ser menor o igual a seis.

Creamos dos tests nuevos para comprobar que permite hasta seis, "esJugable6JugadoresTest", comprueba que metiendo seis jugadores "esJugable" devuelve "True", y en "esJugableMasDe6JugadoresFalse", comprobamos que se lanza la excepción "ArrayIndexOutOfBoundsException", por lo tanto el programa no continuara.

## Problema 3

Se añade en tirar dados "enCasillaCastigo[jugadorActual] = false;" de tal forma que si sales de la carcel se que guardado que sales de ella.

## Problema 4

Se cambia el nombre a la variable "noGanador", por "ganador".

## Problema 5

Se extraen en todos los métodos las líneas:
- jugadorActual++;
- if (jugadorActual == jugadores.size()) jugadorActual = 0;

## Problema 6

El método "fueRespuestaCorrecta" se le cambia el nombre por enLaCarcel, y se extran a un nuevo método "fueRespuestaCorrecta" las líneas:
- System.out.println("Respuesta correcta!!!!");
- monederos[jugadorActual]++;
- System.out.println(jugadores.get(jugadorActual) +" ahora tiene " + monederos[jugadorActual] + " monedas doradas.");

