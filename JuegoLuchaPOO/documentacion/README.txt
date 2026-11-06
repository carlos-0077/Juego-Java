JUEGO DE LUCHA - JAVA

Estructura:
- src/: contiene las clases Java del proyecto.
- Personaje: clase padre abstracta.
- Barbaro y Mago: clases que heredan de Personaje.
- CrearPersonaje: clase abstracta del patron Factory Method.
- CrearBarbaro y CrearMago: crean cada tipo de personaje.
- JuegoLucha: contiene el metodo main y controla el combate.

REQUISITOS
----------
Tener instalado el JDK de Java.

FUNCIONAMIENTO
---------------
Cada jugador escribe su nombre y selecciona Barbaro o Mago.
Ambos comienzan con 100 puntos de vida.
- Barbaro causa entre 10 y 30 puntos de daño.
- Mago causa entre 15 y 25 puntos de daño.
Los ataques se realizan por turnos hasta que uno de los personajes
se queda sin puntos de vida.