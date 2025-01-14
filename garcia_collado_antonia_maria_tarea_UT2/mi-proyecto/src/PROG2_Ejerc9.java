import java.util.Scanner;

/**
 * Aunque aparentemente los años bisiestos son aquellos que son múltiplos de 4,
 * no es del todo preciso, ya que años como 1900 y como 2100 no fueron, ni serán,
 * bisiestos respectivamente. Existe una explicación física que tiene que ver con
 * que el año del calendario no coincide exactamente, en duración, con el año solar.
 * Así, un cálculo más exacto indica que la duración real de un año es de 365,2425 días.
 * Para corregir este desfase, se utiliza el criterio de que se considerará año bisiesto
 * aquel que sea divisible por 4 pero no por 100 salvo que sea divisible por 400.
 * Por esto 1900 no es bisiesto, 1904 sí y 2000 también.
 *
 * Diseña un programa Java que dado un año indique si es bisiesto o no.
 */
public class PROG2_Ejerc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca el año para saber si es bisiesto ");

        int year = scanner.nextInt(); // aquí se guarda el año que se ha pedido con anterioridad.

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // que sea divisible por 4 pero no (!=0) por 100 salvo que (||) sea divisible por 400.
        System.out.println(year + " sí es un año bisiesto");
        }
        else {
            System.out.println(year + " no es un año bisiesto");

        }
        scanner.close();
    }

}
