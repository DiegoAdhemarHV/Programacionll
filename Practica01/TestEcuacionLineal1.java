package Ejer3;
import java.util.Scanner;
public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a, b, c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        EcuacionLineal1 ecuacion = new EcuacionLineal1(a, b, c);
        double discriminante = ecuacion.getDiscriminante();
        if (discriminante > 0) {
            System.out.println("La ecuación tiene dos raíces " 
                    + ecuacion.getRaiz1() + " y " + ecuacion.getRaiz2());
        }
        else if (discriminante == 0) {
            System.out.println("La ecuación tiene una raíz " 
                    + ecuacion.getRaiz1());
        }
        else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}