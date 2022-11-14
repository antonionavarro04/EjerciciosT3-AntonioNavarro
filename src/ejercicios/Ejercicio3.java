// TESTS
// = Habrá que comprobar que no se pueden introducir números negativos
// = Si altura = 4 el triangulo deberá ser:    *
// =                                          * *
// =                                         * * *
// =                                        * * * *

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa que pida un numero al usuario y dibuje un triangulo en funcion de la altura introducida
        // ^ Creamos las variables para la altura y el caracter
        short altura = -1; // * Es short porque a partir de 1000 de altura no se puede imprimir bien por la consola yy 0 porque se va a comprabar que sea mayor que 0
        final char CHAR = '*'; // * Es final porque no se va a modificar una vez se le asigne un valor

        // ^ Creamos una variable para el retraso
        final short RETRASO; // ? Funcionalidad extra

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        while (altura < 1) { // * Debe ser mayor que 0 por lo que lo mínimo que puede introducir es 1
            System.out.print("Introduce la altura del triángulo: ");
            altura = read.nextShort(); // ! Pedimos la altura al usuario
        } // * Si la altura es menor que 0, se volverá a pedir

        // ! Pedimos el retraso al usuario
        System.out.print("Introduce el delay (ms) ([0] para desactivarlo, [10] recomendado): ");
        RETRASO = read.nextShort(); // ? Extra que he agregado

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Mediante un bucle for, dibujamos el triangulo
        for (short i = 0; i < altura; i++){
            // ! Calcularemos cuantos caracteres blancos hacen falta para centrar la fila
            for (int blank = (altura - 1); blank > i; blank--){
                System.out.print(" "); // * Imprimimos el espacio en blanco

                try { // ? Extra que le he agregado
                    Thread.sleep(RETRASO);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // ! Dibujamos la fila, mientras que c sea menor que la cantidad de caracteres que se tienen que imprimir por linea
            for (short c = 0; c < i + 1; c++){
                System.out.print(CHAR); // * Imprimimos el caracter
                System.out.print(" "); // * Imprimimos el espacio en blanco

                try { // ? Extra que le he agregado
                    Thread.sleep(RETRASO);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); // * Cambiamos de linea
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
