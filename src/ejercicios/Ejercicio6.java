package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ? Programa Java el cual pida un número entero N entre 0 y 20, tras eso se imprimiran todos los valores desde 1 hasta n. Cada número se imprimira en una nueva línea y tantas veces diga su valor
        // ^ Creamos la variable para n
        final byte N;

        // ^ Creamos la variable incremento y veces
        byte incremento = 1, veces = 1;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a el usuario el número
        System.out.print("Introduce un número entre 0 y 20: ");
        N = read.nextByte();

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Mediante un bucle while imprimiremos los caracteres
        while (veces <= N){
            // ! Mediante un bucle for imprimiremos los caracteres tantas veces el número
            for (; incremento <= veces; incremento++){ // * Incrementaremos el incremento hasta que sea igual a veces
                System.out.print(veces); // * Imprimimos veces ya que es el que contiene el número de la fila
            }
            System.out.println(); // * Cambiamos de Línea
            incremento = 1; // * Reiniciamos el incremento
            veces++; // * Incrementamos el número de veces a imprimir
        }
    }
}
