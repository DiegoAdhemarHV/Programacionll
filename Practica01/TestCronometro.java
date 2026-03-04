public class TestCronometro {
    public static void main(String[] args) {

        int n = 100000;
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int)(Math.random() * 100000);
        }
        Cronometro c = new Cronometro();
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            int aux = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = aux;
        }
        c.detener();
        System.out.println("Tiempo en milisegundos: " + c.lapsoDeTiempo());
    }
}