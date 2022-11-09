package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa que pida un numero al usuario y dibuje un triangulo en funcion de la altura introducida
        // ^ Creamos las variables para la altura y el caracter
        long altura;
        final char caracter = '*';

        // ^ Creamos una variable para el retraso
        final int retraso; // ? Funcionalidad extra

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos la altura al usuario
        System.out.print("Introduce la altura del triangulo: ");
        altura = read.nextLong();

        // ! Pedimos el retraso al usuario
        System.out.print("Introduce el delay (ms) ([0] para desactivarlo, [10] recomendado): ");
        retraso = read.nextInt(); // ? Extra que he agregado

        // ! Multiplicamos la altura x 2
        altura *= 2; // * Esto lo hago para que el triangulo se dibuje a la altura que correctamente

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Mediante un bucle for, dibujamos el triangulo
        for (int i = 0; i < altura; i+=2){
            // ! Calcularemos cuantos caracteres blancos hacen falta para centrar la fila
            for (long blank = (altura - 1); blank > i; blank-=2){
                System.out.print(" "); // * Imprimimos el espacio en blanco

                // ? Extra que le he agregado
                try {
                    Thread.sleep(retraso);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // ! Dibujamos la fila, mientras que c sea menor que la cantidad de caracteres que se tienen que imprimir por linea
            for (int c = 0; c < i + 1; c++){
                System.out.print(caracter); // * Imprimimos el caracter

                // ? Extra que le he agregado
                try {
                    Thread.sleep(retraso);
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
