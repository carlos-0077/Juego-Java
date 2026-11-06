import java.util.Scanner;

public class JuegoLucha {

    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    // creacion de personajes.
    private static CrearPersonaje seleccionarCreador(
            Scanner scanner, int numero) {

        while (true) {
            System.out.print("Selecciona el personaje del jugador "
                    + numero + " (Barbaro - Mago): ");

            String tipo = scanner.nextLine().trim();

            if (tipo.equalsIgnoreCase("Barbaro")) {
                return new CrearBarbaro ();
            } else if (tipo.equalsIgnoreCase("Mago")) {
                return new CrearMago();
            } else {
                System.out.println("Tipo de personaje no valido... ");
                System.out.println("Intenta de nuevo."); 
            }
        }
    }

    public void iniciarPelea() {
        System.out.println("La pelea comienza entre "
                + jugador1.getNombre() + " y "
                + jugador2.getNombre());     

        System.out.println(""); 

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);

            // el segundo personaje solo ataca si sigue vivo.
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println("Jugador: " + jugador1.getNombre()
                    + " ha ganado la pelea.");
        System.out.println(""); 

        } else {
            System.out.println("Jugador: " + jugador2.getNombre()
                    + " ha ganado la pelea.");
        System.out.println("");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno del jugador " + atacante.getNombre()
                + ". Puntos de vida del jugador " + defensor.getNombre()
                + ": " + defensor.getPuntosDeVida());

        System.out.println(""); 

        atacante.atacar(defensor);

        System.out.println(defensor.getNombre()
                + " ahora tiene " + defensor.getPuntosDeVida()
                + " puntos de vida.");
        System.out.println(""); 
    }

    // metodo main para iniciar el juego
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        System.out.println(""); 

        CrearPersonaje creador1 = seleccionarCreador(scanner, 1);
        CrearPersonaje creador2 = seleccionarCreador(scanner, 2);

        System.out.println(""); 

        // factory method crea los personajes seleccionados.
        Personaje jugador1 = creador1.crearPersonaje(nombre1);
        Personaje jugador2 = creador2.crearPersonaje(nombre2);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();

        scanner.close();
    }
}