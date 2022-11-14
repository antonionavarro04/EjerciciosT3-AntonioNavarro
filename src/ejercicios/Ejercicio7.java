// TESTS
// = Habrá que comprobar que no se puede introducir numeros negativos
// = Si se introduce 4 deberá quedar: 1
// =                                  121
// =                                  12321
// =                                  1234321

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ? Programa Java el cual imprima una piramide de n filas, los numeros deberan ser consecutivos empezando por 1, luego 121, 12321, 1234321, etc.
        // ^ Creamos la variable para filas
        long filasTotales = 0;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        while (filasTotales < 1) { // * filasTotales no puede ser negativo
            System.out.print("Introduce el número de filas: ");
            filasTotales = read.nextLong(); // ! Pedimos filasTotales al usuario
        } // * Repetiremos el bucle hasta que filasTotales sea mayor que 0

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Imprimimos la piramide
        for (int filaActual = 1; filaActual <= filasTotales; filaActual++) {
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
