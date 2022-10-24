import java.util.Scanner;

public class PI {
    public static void main (String [] args) {
        double radio, area, longitud;
        Scanner find = new Scanner(System.in);
        System.out.println("Escribe el radio de la circumferencia");
        radio=find.nextDouble();
        System.out.println("La radio es: " +radio);
        area= Math.PI*Math.pow(radio,2);
        longitud= Math.PI*radio*2;
        System.out.println("Desde esta radio, concluimos que el area es: " +area+ " y la longitud: " +longitud);
    }
}
