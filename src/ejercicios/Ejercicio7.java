package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ? Programa Java el cual imprima una piramide de n filas, los numeros deberan ser consecutivos empezando por 1, luego 121, 12321, 1234321, etc.
        // ^ Creamos la variable para filas
        final long FILAS;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero entero positivo: ");
        FILAS = read.nextInt();

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Imprimimos la piramide
        for (int primeraMitad = 1; primeraMitad <= FILAS; primeraMitad++) {
            for (int segundaMitad = 1; segundaMitad <= primeraMitad; segundaMitad++) {
                System.out.print(segundaMitad);
            }
            for (int segundaMitad = primeraMitad - 1; segundaMitad >= 1; segundaMitad--) {
                System.out.print(segundaMitad);
            }
            System.out.println(); // * Salto de Línea
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarros
    }
}
