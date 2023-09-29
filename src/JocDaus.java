import java.util.Random;

public class JocDaus {
        static int partidas = 0;
        static int victorias = 0;

        public static int getPartidas() {return partidas;}

        public static int getVictorias() {return victorias;}

        public static void main() {

            Random random = new Random();

            Daus d1 = new Daus(random.nextInt(6) + 1);
            Daus d2 = new Daus(random.nextInt(6) + 1);
            Daus d3 = new Daus(random.nextInt(6) + 1);

            partidas++;

            System.out.println();
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);

            System.out.println();

            if(d1.equals(d2) && d2.equals(d3)) {

                    victorias++;
                    System.out.println("Has Ganado");

            }

            System.out.println();
    }
}
