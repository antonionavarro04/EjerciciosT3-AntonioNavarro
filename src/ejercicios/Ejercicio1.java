// TESTS
// = Habrá que comprobar metiendo datos que se encuentren dentro de rango, ej: hh; -90: mm; 153 ss; -1 ii; -90
// = La hora resultante deberá corresponderse con la hora introducida y el incremento

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa Java que pide una hora en hh:mm:ss y un incremento en segundos y muestra la hora resultante
        // ^ Creamos las variables para las horas, minutos y segundos, asi como el incremento
        long horas = -1, minutos = -1, segundos = -1; // ? Las variables las iniciaremos a -1 para uqe el bucle se ejecute al menos una vez
        long incremento = -1; // * Es final porque no se va a modificar una vez se le asigne un valor

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos la hora, minutos y segundos al usuario
        while (horas < 0 || horas > 23) {
            System.out.print("Introduce la hora: ");
            horas = read.nextLong();
        } // * Si la hora es menor que 0 o mayor que 23, se volverá a pedir

        while (minutos < 0 || minutos > 59) {
            System.out.print("Introduce los minutos: ");
            minutos = read.nextLong();
        } // * Si los minutos son menores que 0 o mayores que 59, se volverá a pedir

        while (segundos < 0 || segundos > 59) {
            System.out.print("Introduce los segundos: ");
            segundos = read.nextLong();
        } // * Si los segundos son menores que 0 o mayores que 59, se volverá a pedir

        while (incremento < 0) {
            System.out.print("Introduce en cuantos segundos quieres incrementar la hora: ");
            incremento = read.nextLong();
        } // * Si el incremento es menor que 0, se volverá a pedir

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------------------------------\n");

        // ! Sumamos el incremento a los segundos
        segundos += incremento;

        // ? Lo he hecho mediante whiles porque creo que de esta manera esta mas optimizado, ya que de esta forma no hace tantas comprobaciones dentro del While
        while (segundos > 59){ // ! Mediante un bucle while, comprobamos si los segundos son mayores a 59
            segundos -= 60; // * De ser cierto restaremos 60 a los segundos
            minutos++; // * Y sumaremos 1 a los minutos
        }

        while (minutos > 59){ // ! Mediante un bucle while, comprobamos si los minutos son mayores a 59
            minutos -= 60; // * De ser cierto restaremos 60 a los minutos
            horas++; // * Y sumaremos 1 a las horas
        }

        while (horas > 23){ // ! Mediante un bucle while, comprobamos si las horas son mayores a 23
            horas -= 24; // * De ser cierto restaremos 24 a las horas
        }

        // ! Mostramos la hora resultante al usuario
        System.out.println("La hora resultante es: " + (horas < 10 ? "0" + horas : horas) + ":" + (minutos < 10 ? "0" + minutos : minutos) + ":" + (segundos < 10 ? "0" + segundos : segundos)); // * Los ternarios sirven para que si la hora es 1:4:9 quede como 01:04:09

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
