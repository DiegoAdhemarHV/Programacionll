package Ejer3;
public class EcuacionLineal1 {
    private double a;
    private double b;
    private double c;
    public EcuacionLineal1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante() {
        double d;
        d = (b * b) - (4 * a * c);
        return d;
    }
    public double getRaiz1() {
        double r1;
        r1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        return r1;
    }
    public double getRaiz2() {
        double r2;
        r2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        return r2;
    }
}