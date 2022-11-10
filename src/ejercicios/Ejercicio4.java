package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa Java el cual pida a y b al usuario y se realice el MCD de a y b
        // ^ Creamos las variables para a y b
        final long a, b;

        // ^ Creamos una variable para el divisor y 2 para los módulos de a y b
        long divisor, moduloA = -1, moduloB = -1;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a y b al usuario
        System.out.print("Introduce a: ");
        a = read.nextLong(); // * Para a
        System.out.print("Introduce b: ");
        b = read.nextLong(); // * Para b

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Operador ternario para sobrescribir el valor de divisor
        divisor = (a < b) ? a : b; // * Si a es mayor que b, divisor es a, si no, divisor es b

        // ! Mediante un bucle While vamos comprobando si a y b son divisibles entre el divisor
        while (moduloA != 0 || moduloB != 0){
            // ! Comprobamos si a y b son divisibles entre el divisor
            moduloA = a % divisor; // * Calculamos el modulo de a
            moduloB = b % divisor; // * Calculamos el modulo de b

            divisor--; // ! Decrementamos el divisor
        }

        // ! Imprimimos el MCD
        System.out.println("El máximo comun divisor de " + a + " y " + b + " es: " + (divisor + 1)); // * + 1 porque en While se decrementa el divisor

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
