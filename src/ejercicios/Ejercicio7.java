package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ? Programa Java el cual imprima una piramide de n filas, los numeros deberan ser consecutivos empezando por 1, luego 121, 12321, 1234321, etc.
        // ^ Creamos la variable para filas
        final long FILAS_TOTALES;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero entero positivo: ");
        FILAS_TOTALES = read.nextInt();

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Imprimimos la piramide
        for (int filaActual = 1; filaActual <= FILAS_TOTALES; filaActual++) {
            for (int numFila = 1; numFila <= filaActual; numFila++) {
                System.out.print(numFila);
            }
            for (int numFila = filaActual - 1; numFila >= 1; numFila--) {
                System.out.print(numFila);
            }
            System.out.println(); // * Salto de Línea
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarros
    }
}
