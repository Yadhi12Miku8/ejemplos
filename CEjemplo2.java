
import java.util.Scanner;

public class CEjemplo2 {

    public static void main(String[] args) {
        int num, suma;
        num = numeroTerminos();
        System.out.println("---------REPORTE----------");
        mostrarSerie(num);
        suma = calcularSumarSerie(num);
        imprimir(suma);
        System.out.println("--------------------------");
    }

    private static int numeroTerminos() {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un Numero de termino [n]:");
        n = teclado.nextInt();
        return n;
    }

    private static void mostrarSerie(int n) {
        int i = 3;
        while (i <= n * 7) {
            System.out.print(i + ","); // Imprime el número sin espacio al final
            i += 7;
        }
        System.out.println(); // Agrega una nueva línea al final
    }

    private static int calcularSumarSerie(int n) {
        int i = 3, suma = 0;
        while (i <= n * 7) {
            suma += i;
            i += 7;
        }
        return suma;
    }

    private static void imprimir(int suma) {
        System.out.println("La suma es: " + suma);
    }
}
