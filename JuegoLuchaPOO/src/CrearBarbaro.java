// crear barbaro.
public class CrearBarbaro extends CrearPersonaje {

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Barbaro(nombre);
    }
}