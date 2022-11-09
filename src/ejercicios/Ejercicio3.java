package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa que pida un numero al usuario y dibuje un triangulo en funcion de la altura introducida
        // ^ Creamos las variables para la altura y el caracter
        long altura;
        char caracter = '*';

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos la altura al usuario
        System.out.print("Introduce la altura del triangulo: ");
        altura = read.nextLong();

        // ? Salto de Línea Triple
        System.out.println("\n" + "---------------------------------------" + "\n");

        // ! Mediante un bucle for, dibujamos el triangulo
        for (int i = 0; i < altura; i++){
            for (long blank = (altura - 1); blank > i; blank-=2){
                System.out.print(" ");
            }

            for (int c = 0; c < i + 1; c++){
                System.out.print(caracter);
            }
            System.out.println(); // * Cambiamos de linea
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
