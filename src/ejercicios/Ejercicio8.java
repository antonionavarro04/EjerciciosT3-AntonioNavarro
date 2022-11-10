package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ? Programa Java el cual lea solo los numeros mayores a el anterior introducido, la introduciión de números finaliza con un 0
        // ^ Creamos la variable para n
        long n, nMayor = 0;

        // ^ Creamos el contador y el contador de fallos
        int contador = 0, fallos = 0;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero inicial: ");
        n = read.nextLong();

        
        nMayor = n;

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Mediante un bucle while, pedimos los numeros al usuario
        while (n != 0){
            // ! Pedimos el numero al usuario
            System.out.print("Introduce un numero mayor que " + n + ": ");
            n = read.nextLong();

            if (n > nMayor) nMayor = n; // * Si el numero es mayor que el anterior, lo guardamos en nMayor

            // ! Incrementamos el contador
            contador++;

            // ! Si el numero es menor que el anterior, incrementamos el contador de fallos
            if (n < nMayor && n != 0){ 
                System.out.println("El numero introducido es menor que el anterior"); // * Imprimimos un mensaje de error
                fallos++; // * Incrementamos el contador de fallos
                nMayor = 0; // * Reiniciamos nMayor
            }

            // ? Salto de Línea Triple
            System.out.println("");
        }

        // ? Salto de Línea Doble
        System.out.println("---------------------------------------\n");

        // ! Imprimimos el contador y los fallos
        System.out.println("Has introducido " + contador + " numeros");
        System.out.println("El numero de fallos es: " + fallos);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
