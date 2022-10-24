import javax.swing.*;
import java.util.Scanner;

public class pesetas {
    public static void main(String[] args) {
        int elige;
        double euros, pesetas;
        Scanner find = new Scanner(System.in);
        System.out.println("Si desea convertir la de EUR a PTS pulse 1 de lo contrario pulse 2");
        elige=find.nextInt();
        if (elige==1) {
            System.out.println("Procedemos a convertir de EUR a PTS, introduzca el número:");
            euros=find.nextDouble();
            pesetas=166.386*euros;
            System.out.println(pesetas);
        }
        else if (elige==2) {
            System.out.println("Procedemos a convertir de PTS a EUR, introduzca el número:");
            pesetas=find.nextDouble();
            euros=pesetas/166.386;
            System.out.println(euros);
        }
        else {
            System.out.println("El dígito introducido es incorrecto, intente de nuevo");
        }
    }
}
