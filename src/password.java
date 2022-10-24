import java.sql.SQLOutput;
import java.util.Scanner;

public class password {

    public static void main(String[] args) {
        String password = "holacaracola9";
        String intentos;
        boolean acertado = false;
        int contador;
        Scanner find = new Scanner(System.in);
        System.out.println("Intenta adivinar la contraseña con 3 intentos");
        for (contador = 0; ((contador < 3) && (!acertado)); contador++) {
            System.out.println("Introduce una contraseña:");
            intentos = find.nextLine();
            if (intentos.equals(password)) {
                acertado = true;
                System.out.println("Has acertado");
            }else System.out.println("Sigue intentadolo");
        }
    }
}