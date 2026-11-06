// mago hereda de personaje
public class Mago extends Personaje {

    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public int generarDano() {
        return danoAleatorio(15, 25);
    }
}