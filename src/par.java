import java.util.Scanner;

public class par {
    public static void main(String[] args) {
        double dato;
        Scanner find = new Scanner(System.in);
        System.out.println("Escriba un número");
        dato = find.nextDouble();
        if (dato%2 == 0) {
            System.out.println("Este número es par");
        }
        else {
            System.out.println("Este número es impar");
        }
    }
}
