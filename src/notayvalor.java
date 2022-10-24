import java.sql.SQLOutput;
import java.util.Scanner;

public class notayvalor {
    public static void main(String[] args) {
        int numeros, suficiente=5, bien=6, notable_bajo=7, notable_alto=8, excelente=9, matricula_de_honor=10;
        Scanner find = new Scanner(System.in);
        System.out.println("Introduzca la nota que ha sacado:");
        numeros= find.nextInt();
        switch (numeros) {
            case 0,1,2,3,4 -> System.out.println("Has suspendido");
            case  5 -> System.out.println("Has sacado un " +suficiente+ " lo que equivale a un suficiente");
            case  6 -> System.out.println("Has sacado un " +bien+ " lo que equivale a un Bien");
            case  7 -> System.out.println("Has sacado un " +notable_bajo+ " lo que equivale a un Notable bajo");
            case  8 -> System.out.println("Has sacado un " +notable_alto+ " lo que equivale a un Notable alto");
            case  9 -> System.out.println("Has sacado un " +excelente+ " lo que equivale a un excelente");
            case 10 -> System.out.println("Has sacado un " +matricula_de_honor+ " lo que equivale a una medalla de honor");
            default -> {
                System.out.println("Introduce un valor valido del 0 al 10");
                numeros= find.nextInt();
            }
        }
    }
}
