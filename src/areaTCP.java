import java.util.Scanner;

public class areaTCP {
    public static void main(String[] args) {
        int menu;
        double base, altura, resultado, apotema;
        Scanner find = new Scanner(System.in);
        System.out.println("Introduzca 1 si desea calcular el area del triangulo, 2 para el cuadrado y 3 para el pentagono");
        menu=find.nextInt();
        if (menu==1) {
            System.out.println("Pasaremos a calcular el area del triangulo, por favor, introduzca la base y la altura");
            base = find.nextDouble();
            altura = find.nextDouble();
            System.out.println("Calculando...");
            resultado = base * altura / 2;
            System.out.println("El area del triangulo equivale a " + resultado);
        }
        else if (menu==2) {
            System.out.println("Pasaremos a calcular el area del cuadrado, por favor, introduzca la base");
            base= find.nextDouble();
            System.out.println("Calculando...");
            resultado= base * base;
            System.out.println("El area del cuadrado equivale a " +resultado);
        }
        else {
            System.out.println("Pasaremos a calcular el area del pentagono, por favor, introduzca la base y al apotema");
            base=find.nextDouble();
            apotema= find.nextDouble();
            System.out.println("Calculando...");
            resultado=base*5*apotema/2;
            System.out.println("El area del pentagono equivale a " +resultado);
        }
    }
}
