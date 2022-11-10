package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa Java que pide una hora en hh:mm:ss y un incremento en segundos y muestra la hora resultante
        // ^ Creamos las variables para las horas, minutos y segundos, asi como el incremento
        long horas, minutos, segundos;
        final long INCREMENTO; // * Es final porque no se va a modificar una vez se le asigne un valor

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos las horas, minutos y segundos al usuario
        System.out.print("Introduce las horas (hh): ");
        horas = read.nextLong(); // * Para las horas
        System.out.print("Introduce los minutos (mm): ");
        minutos = read.nextLong(); // * Para los minutos
        System.out.print("Introduce los segundos (ss): ");
        segundos = read.nextLong(); // * Para los segundos

        // ! Pedimos el incremento al usuario
        System.out.print("Introduce en cuantos segundos quieres incrementar la hora: ");
        INCREMENTO = read.nextLong(); // * Para el incremento

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------------------------------\n");

        // ! Sumamos el incremento a los segundos
        segundos += INCREMENTO;

        while (segundos > 59){ // ! Mediante un bucle while, comprobamos si los segundos son mayores a 59
            segundos -= 60; // * De ser cierto restaremos 60 a los segundos
            minutos++; // * Y sumaremos 1 a los minutos
        }

        while (minutos > 59){ // ! Mediante un bucle while, comprobamos si los minutos son mayores a 59
            minutos -= 60; // * De ser cierto restaremos 60 a los minutos
            horas++; // * Y sumaremos 1 a las horas
        }

        // ! Mostramos la hora resultante al usuario
        System.out.println("La hora resultante es: " + (horas < 10 ? "0" + horas : horas) + ":" + (minutos < 10 ? "0" + minutos : minutos) + ":" + (segundos < 10 ? "0" + segundos : segundos)); // * Los ternarios sirven para que si la hora es 1:4:9 quede como 01:04:09

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
