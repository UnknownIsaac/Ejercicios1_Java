import java.util.Scanner;

public class Grados {
        public static void main (String [] args) {
            double centigrados, farenheit;

            Scanner scan = new Scanner(System.in);
            System.out.println("Escribe un número");
                    centigrados=scan.nextDouble();
            System.out.println("Ahora mismo los grados centigrados de Palma de Mallorca son de " +centigrados+ "ºC");
            farenheit= (centigrados*9/5)+32;
            System.out.println("Traducido a farenheit son " +farenheit+ "ºF");
        }
}
