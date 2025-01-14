import java.util.Scanner;

/**
 * Diseña un programa Java que dado un número de segundos,
 * muestre en pantalla cuántos minutos, horas y días contiene.
 */
public class PROG2_Ejerc5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in); // el scanner lo he tenido que importar para poder pedir los segundos que se quieren transformar
        System.out.println("Indica los segundos "); // se preguntan los segundos

        int segundos = scanner.nextInt(); // aquí se guarda el número que nos han dado

        int minutos = segundos / 60;

        int horas = minutos / 60;

        int dias = horas / 24;

        System.out.println(segundos + " son " + minutos + " minutos, " + horas + " horas y " + dias + " dias.");

        scanner.close();
    }
}
