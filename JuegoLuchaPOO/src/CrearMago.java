// crear mago.
public class CrearMago extends CrearPersonaje {

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Mago(nombre);
    }
}