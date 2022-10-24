import java.io.IOException;
import java.util.Scanner;

public class festivoOlaboral {
    public static void main(String[] args) throws IOException {
        int dia;
        System.out.println("Escribe en número digito del 1 - 7 para indicar en que dia de la semana te encuentras");
        Scanner find = new Scanner(System.in);
        dia=find.nextInt();
        switch (dia) {
            case 1 -> System.out.println("Lunes es día laboral");
            case 2 -> System.out.println("Martes es dia laboral");
            case 3 -> System.out.println("Miercoles es dia laboral");
            case 4 -> System.out.println("Jueves es dia laboral");
            case 5 -> System.out.println("Viernes es dia laboral");
            case 6 -> System.out.println("Sabado es dia festivo");
            case 7 -> System.out.println("Domingo es dia festivo");
        }
    }
}
