import java.io.IOException;
import java.util.Scanner;

public class mayus {
    public static void main(String[] args) throws IOException {
        char caracter;
        System.out.println("Esciba un caracter");
        caracter=(char)System.in.read();
        if (Character.isUpperCase(caracter))
        System.out.println("El caracter es mayúscula");
        else System.out.println("El caracter es minúscula");
    }
}
