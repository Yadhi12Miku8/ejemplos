import java.util.Scanner;

public class Cejemplo1 {
    
    public static void main(String[] args) {
        int num, suma;
        num = numeroTerminos();
        System.out.println("---------REPORTE----------");
        mostrarSerie(num);
        suma = calcularSumarSerie(num);
        imprimir(suma);
        System.out.println("--------------------------");
    }
    
    private static int numeroTerminos(){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Numero de terminos [n]:");
        n = teclado.nextInt();
        return n;
    }
    
    private static void mostrarSerie(int n){
        int i = 1;
        while (i <= n){
            System.out.print(i); // Imprime el número sin espacio al final
            if (i != n) {
                System.out.print("-"); // Imprime el guión solo si no es el último número
            }
            i++;
        }
        System.out.println(); // Agrega una nueva línea al final
    }
    
    private static int calcularSumarSerie(int n){
        int i = 1, suma = 0;
        while (i <= 4){
            suma += i;
            i++;
        }
        return suma; 
    }
    
    private static void imprimir(int suma){
        System.out.println("La suma es: " + suma);
    }
}

