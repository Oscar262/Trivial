# Trivial

## Problema 0

Extraemos el codigo duplicado a un unico metodo "nuevaPosicioJugador", el que ahora llamamos desde ambos sitios.

Creamos un test que compruebe la posicion del jugador "moverCasilla"

## Problema 1

Modificamos la clase "GameLauncher" y agregamos el metodo "es jugable" con un if antes de empezar el juego, y si hay menos de dos jugadores salta un aviso y el juego no se ejecuta.

Creamos dos test, uno "esJugableTrueTest" que comprueba si el metodo permite jugar, y otro "esJugableFalseTest" que demuestra que si solo hay un jugador el metodo devuelve "false".
