import java.io.IOException;

public class comparadorminusculas {
    public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.println("Introduce el primer caracter");
        car1=(char)System.in.read();
        System.in.read();
        System.out.println("Introduce el segundo caracter");
        car2=(char)System.in.read();
        if (Character.isLowerCase(car1)){
        System.out.println("Primer caracter minúscula");
        if (Character.isLowerCase(car2)){
            System.out.println("Segundo caracter minúscula");
        }else System.out.println("El segundo caracter es mayúscula");
        }else System.out.println("El primer caracter es mayúscula");
    }
}
