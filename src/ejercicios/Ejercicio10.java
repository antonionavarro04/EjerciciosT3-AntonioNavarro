package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio10 {
    public static void main(String[] args) {
        // ? Programa Java que nos diga si un número introducido por teclado es capicúa o no
        // ^ Creamos la variable para n y el contador
        long n = 0;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero entero positivo: ");
        n = read.nextLong();
    }
}
