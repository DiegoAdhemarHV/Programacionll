package Ejer4;
import java.util.Scanner;
public class EstadisticaModular {
    public static double promedio(double[] datos) {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        double prom = suma / datos.length;
        return prom;
    }
    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + Math.pow(datos[i] - prom, 2);
        }
        double des = Math.sqrt(suma / (datos.length - 1));
        return des;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            datos[i] = sc.nextDouble();
        }
        System.out.println("El promedio es " + promedio(datos));
        System.out.println("La desviación estándar es " + desviacion(datos));
    }
}