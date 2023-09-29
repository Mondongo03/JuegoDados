import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        JocDaus juego = new JocDaus();

        int accion;
    do {
        System.out.println("A que quieres jugar?");
        System.out.println("1-Triple dado");
        System.out.println("2-Piedra papel tijera");
        System.out.println("3-Pares y nones");
        System.out.println("4-Salir");

        accion = input.nextInt();

        if (accion == 1) {
            juego.main();
        } else if (accion == 2) {
            System.out.println("Juego en construcción");
        } else if (accion == 3) {
            System.out.println("Juego en construcción");
        }
    }while (accion != 4);

        System.out.println("Partidas jugadas "+juego.getPartidas());
        System.out.println("Partidas ganadas "+juego.getVictorias());

    }
}