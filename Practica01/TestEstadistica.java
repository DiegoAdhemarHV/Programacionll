package Ejer4;
import java.util.Scanner;
public class TestEstadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            datos[i] = sc.nextDouble();
        }
        Estadistica est = new Estadistica(datos);
        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviación estándar es " + est.desviacion());
    }
}