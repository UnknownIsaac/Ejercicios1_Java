import java.util.Scanner;

public class metroxsegundo {
    public static void main (String [] args) {
        double kilometrohora, metrosegundo;
        Scanner find = new Scanner(System.in);
        System.out.println("A cuantos km/h has estado conduciendo por la autopista?");
        kilometrohora=find.nextDouble();
        System.out.println("La velocidad a la que conducias era de " +kilometrohora+ " km/h");
        metrosegundo=kilometrohora*1000/3600;
        System.out.println("Al convertirlo a metros por segundo calculamos " +metrosegundo+ " m/s");
    }
}
