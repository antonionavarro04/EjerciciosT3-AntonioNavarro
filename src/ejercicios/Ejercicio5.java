package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa que dado a y b, calcule el MCM de a y b
        // ^ Creamos las variables para a y b
        final long a, b;

        // ^ Creamos una variable multiplicador y 2 para los resultados de a y b así como 2 para los multiplicadores de a y b
        final long multiplicador;
        long multiplicadorA, multiplicadorB, resultadoA = -1, resultadoB = -2;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a y b al usuario
        System.out.print("Introduce a: ");
        a = read.nextLong(); // * Para a
        System.out.print("Introduce b: ");
        b = read.nextLong(); // * Para b

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");
        
        // ! Mediante un operador ternario asignamos el valor de multiplicador
        multiplicador = (a > b) ? a : b; // * Si a es mayor que b, multiplicador es a, si no, multiplicador es b

        // ! Igualamos mA y mB a multiplicador
        multiplicadorA = multiplicador; // * Para a
        multiplicadorB = multiplicador; // * Para b

        // ! Mediante un bucle While vamos comprobando si el resultado de a o b por el multiplicador son iguales
        while (resultadoA != resultadoB){
            // ! Calculamos los resultados de x por el multiplicador          
            resultadoA = a * multiplicadorA; // * Calculamos el resultado de a por el multiplicador
            resultadoB = b * multiplicadorB; // * Calculamos el resultado de b por el multiplicador
            
            // ! Mediante un if incereamos el multiplicador del que haya dado un resultado menor
            if (resultadoA < resultadoB){ // * Para a
                multiplicadorA++;
            } else { // * Para b
                multiplicadorB++;
            }
        }

        // ! Imprimimos el MCM
        System.out.println("El mínimo comun múltiplo de " + a + " y " + b + " es: " + resultadoA);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}