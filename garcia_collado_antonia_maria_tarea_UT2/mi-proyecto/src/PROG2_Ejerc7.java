/**
 * Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x),
 * suponiendo que los coeficientes de la ecuación son C1 y C2 se inicializan en el método main:
 * C1x + C2 = 0
 *
 * Cuando sea posible, mostrar el resultado con 4 decimales...
 *
 * pista: Cuando trabajamos con ecuaciones, a veces nos encontramos en situaciones donde
 * todos los valores de la variable podrían funcionar, o donde ninguno lo hace.
 * ¿Qué crees que significaría cada uno de estos casos para una ecuación de primer grado?
 */
public class PROG2_Ejerc7 {
    public static void main(String[] args) {

        int C1 = 12;
        int C2 = 26;

        double x = (double) -C2 / C1; // con el casteo nos aseguramos de tener los decimales.

        System.out.printf("X es igual a %.4f%n", + x);

    }
}
