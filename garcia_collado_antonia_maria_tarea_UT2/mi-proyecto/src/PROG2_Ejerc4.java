import java.util.Scanner;

/**
 * Diseña un programa Java que dada la edad de una persona,
 * muestre un mensaje indicando si es mayor de edad.
 * NO se puede utilizar el operador condicional if.
 */
public class PROG2_Ejerc4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in); // el scanner lo he tenido que importar para poder pedir la edad
        System.out.println("¿Cuál es tu edad? "); // se pregunta la edad

        byte edad = scanner.nextByte(); // aquí se guarda la edad, que he usado byte porque es la unidad mas pequeña

        String conclusion = (edad >= 18) ? "¡Eres mayor de edad!" : "No eres mayor de edad"; // al no poder usar if he utilizado una expresión ternaria
        System.out.println (conclusion); // esto dará el resultado, si es menor que 18 será menor y si es mayor mayor

        scanner.close(); //esto cierra el scanner, sobre todo para que no se ocupen espacios que no se tienen que ocupar

    }
}
