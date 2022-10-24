import java.io.IOException;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws IOException {
        int aritmetico;
        float numero1,numero2,resultado;
        System.out.println("Introduzca 1 para Sumar, 2 para Restar, 3 para Multiplicar o 4 para Dividir:");
        Scanner find = new Scanner(System.in);
        aritmetico=find.nextInt();
        switch (aritmetico) {
            case 1 -> {
                System.out.println("Ha elegido Sumar, ahora introduzca dos valores");
                System.out.println("Introduce el primer valor:");
                numero1= find.nextFloat();
                System.out.println("Introduzca el segundo valor");
                numero2= find.nextFloat();
                resultado=numero1+numero2;
                System.out.println("La suma equivale a " +resultado);
            }
            case 2 -> {
                System.out.println("Ha elegido Restar, ahora introduzca dos valores:");
                System.out.println("Introduce el primer valor:");
                numero1= find.nextFloat();
                System.out.println("Introduzca el segundo valor");
                numero2= find.nextFloat();
                resultado=numero1-numero2;
                System.out.println("La resta equivale a " +resultado);
            }
            case 3 -> {
                System.out.println("Ha elegido Multiplicar, ahora introduzca dos valores:");
                System.out.println("Introduce el primer valor:");
                numero1= find.nextFloat();
                System.out.println("Introduzca el segundo valor");
                numero2= find.nextFloat();
                resultado=numero1*numero2;
                System.out.println("La Multiplicacion equivale a " +resultado);
            }
            case 4 -> {
                System.out.println("Ha elegido Dividir, ahora introduzca dos valores:");
                System.out.println("Introduce el primer valor:");
                numero1= find.nextFloat();
                System.out.println("Introduzca el segundo valor");
                numero2= find.nextFloat();
                resultado=numero1/numero2;
                System.out.println("La Division equivale a " +resultado);
                break;
            }
            default -> System.out.println("El número introducido no cae dentro del rango 1 - 4");
        }
        }
    }
