// TESTS
// = Habrá que comprobar que no se puede introducir 0 ni menores ni mayores que 20
// = Si se introduce 4 deberá quedar: 1
// =                                  22
// =                                  333
// =                                  4444

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ? Programa Java el cual pida un número entero N entre 0 y 20, tras eso se imprimiran todos los valores desde 1 hasta n. Cada número se imprimira en una nueva línea y tantas veces diga su valor
        // ^ Creamos la variable para n
        byte n = 0;

        // ^ Creamos la variable incremento y veces
        byte incremento = 1, veces = 1;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        while (n < 1 || n > 20) { // * n no puede ser 0 o menos ni mayor que 20
            System.out.print("Introduce n: ");
            n = read.nextByte(); // ! Pedimos n al usuario
        } // * Repetiremos el bucle hasta que n sea mayor que 0 y menor que 20

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Mediante un bucle while imprimiremos los caracteres
        while (veces <= n){
            // ! Mediante un bucle for imprimiremos los caracteres tantas veces el número
            for (; incremento <= veces; incremento++){ // * Incrementaremos el incremento hasta que sea igual a veces
                System.out.print(veces); // * Imprimimos veces ya que es el que contiene el número de la fila
            } System.out.println(); // * Cambiamos de Línea
            incremento = 1; // * Reiniciamos el incremento
            veces++; // * Incrementamos el número de veces a imprimir
        }
    }
}
