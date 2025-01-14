import java.util.Scanner;

/**
 * Diseña un programa Java que dados el número de alumnos matriculados en Programación,
 * número de alumnos matriculados en Entornos de Desarrollo y número de alumnos matriculados
 * en Base de datos. El programa deberá mostrar el % de alumnos matriculado en cada uno de
 * los tres módulos. Se supone que un alumno sólo puede estar matrículado en un módulo.
 * Trata de mostrar un solo decimal en los porcentajes.
 */
public class PROG2_Ejerc8 {
    public static void main(String[] args) {

        int Programacion = 40;
        int EEDD = 30;
        int BBDD = 34;

        // para poder hacer el porcentaje tenemos que saber el total:

        int total = Programacion + EEDD + BBDD;

        double porcentajeProgramacion = (double) Programacion / total * 100;
        double porcentajeEEDD = (double) EEDD / total * 100;
        double porcentajeBBDD = (double) BBDD / total * 100;

        System.out.printf("Porcentaje de alumnos en Programación: %.1f%%\n", porcentajeProgramacion);
        System.out.printf("Porcentaje de alumnos en Entornos de Desarrollo: %.1f%%\n", porcentajeEEDD);
        System.out.printf("Porcentaje de alumnos en Base de Datos: %.1f%%\n", porcentajeBBDD);
    }
}
