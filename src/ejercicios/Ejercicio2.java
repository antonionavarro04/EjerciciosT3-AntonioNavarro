package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ? Programa Java que pida un numero n y diga cuantos numeros primos hay entre 1 y n
        // ^ Creamos las variables para el numero y el contador, asi como otro numero que empezara siendo 2
        long contador = 0, numero2 = 2; // ? El numero 2 sirve para ir incrementando el numero que empieza en 2 y llegar hasta el numero n
        final long NUMERO; // * Es final porque no se va a modificar una vez se le asigne un valor

        // ^ Crearemos otra variable que sera el contador de primos
        long contadorPrimos = 0;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero: ");
        NUMERO = read.nextLong(); // * Para el numero

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Mediante un bucle for, comprobamos si el numero es primo
        while (numero2 < NUMERO) { // * Mientras el numero2 sea menor que el numero
            for (long i = 2; i < numero2; i++){ // * El bucle for empieza en 2 porque 1 es divisor de todos los numeros
                if (numero2 % i == 0){ // * Si el numero es divisible entre i, no es primo
                    contador++; // * Si el número no es primo, se suma 1 al contador
                    break; // * Si el número no es primo, se sale del bucle
                }
            }
            numero2++; // * Se suma 1 al numero2
        }

        // ! Invertimos los no primos por los primos
        contadorPrimos = (NUMERO - contador) - 2; // * Se le resta 2 porque 1 y el numero n no hay que incluirlos

        // ! Mostramos el resultado al usuario
        System.out.println("Entre 1 y " + NUMERO + " hay " + contadorPrimos + " numeros primos");

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
