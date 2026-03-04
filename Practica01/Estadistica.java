package Ejer4;
public class Estadistica {
    private double[] datos;
    public Estadistica(double[] datos) {
        this.datos = datos;
    }
    public double promedio() {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        double prom = suma / datos.length;
        return prom;
    }
    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + Math.pow(datos[i] - prom, 2);
        }
        double des = Math.sqrt(suma / (datos.length - 1));
        return des;
    }
}