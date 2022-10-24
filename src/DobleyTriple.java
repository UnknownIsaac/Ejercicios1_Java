import java.util.Scanner;

public class DobleyTriple {
    public static void main (String [] args) {
        int numero;
        Scanner find = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        numero=find.nextInt();
        System.out.println("El número " +numero*2+ " es " +numero+ " duplicado");
        System.out.println("El número " +numero*3+ " es " +numero+ " trgyiplicado");
        numero=numero*2;
    }
}
