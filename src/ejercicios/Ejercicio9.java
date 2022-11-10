package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio9 {
    public static void main(String[] args) {
        // ? Programa Java que nos diga cuantos digitos tiene un numero entero positivo introducido por teclado
        // ^ Creamos la variable para n y el contador
        long n;

        // ^ Creamos el contador
        byte contador = 0;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero: ");
        n = read.nextLong();

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        while (n > 0){ // ! Mediante un bucle while, dividimos el numero entre 10 hasta que n sea > 0
            n /= 10; // * Dividimos el numero entre 10
            contador++; // * Incrementamos el contador
        }

        // ! Imprimimos el contador
        System.out.println("El numero tiene " + contador + " digitos");

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }    
}
