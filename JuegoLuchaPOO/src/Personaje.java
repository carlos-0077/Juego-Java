import java.util.Random;

// clase padre abstracta, contiene datos en comun de los personajes
public abstract class Personaje {

    private String nombre;
    private int puntosDeVida;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    public void atacar(Personaje oponente) {
        int dano = generarDano();
        oponente.recibirDano(dano);

        System.out.println(nombre + " ataca a " + oponente.getNombre()
                + " causando " + dano + " puntos de daño.");
    }

    // daño segun personaje, mago o barbaro 
    public abstract int generarDano();

    protected int danoAleatorio(int minimo, int maximo) {
        Random rand = new Random();
        return rand.nextInt((maximo - minimo) + 1) + minimo;
    }

    public void recibirDano(int dano) {
        puntosDeVida -= dano;

        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}