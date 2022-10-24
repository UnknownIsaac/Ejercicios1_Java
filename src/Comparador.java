import java.io.IOException;

public class Comparador {
    public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.println("Introduzca el primer caracter");
        car1=(char)System.in.read();
        System.in.read();
        System.out.println("Introduzca el segundo caracter");
        car2=(char)System.in.read();
        if (car1 == car2)
            System.out.println("Los caracteres son iguales");
        else System.out.println("Los caracteres son distintos");
    }
}
