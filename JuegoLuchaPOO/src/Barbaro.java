// Barbaro hereda de Personaje.
public class Barbaro extends Personaje {

    public Barbaro(String nombre) {
        super(nombre);
    }

    @Override
    public int generarDano() {
        return danoAleatorio(10, 30);
    }
}