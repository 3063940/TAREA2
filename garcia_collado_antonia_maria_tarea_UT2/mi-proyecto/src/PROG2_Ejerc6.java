/**
 * Diseña un programa Java que cree un tipo enumerado para las siguientes razas de perro:
 *  Mastín, Terrier, Bulldog, Pekines, Caniche y Galgo.
 *
 *  El programa debe realizar las siguientes operaciones:
 * Crea una variable denominada var1 del tipo enumerador. Asígnale un valor.
 * Crea una variable denominada var2 del tipo enumerador. Asígnale un valor.
 * Muestra por pantalla el valor obtenido de comparar ambas variables.
 *
 * Investiga sobre la posibilidad averiguar la posición que ocupa un determinado valor en el enumerado
 * así como mostrar la cantidad de valores que contiene. Si lo consigues, muestra la posición de las
 * dos variables en el tipo enumerado.
 *
 * Recuerda que no es necesario declarar un enumerado como "public"
 */
public class PROG2_Ejerc6 {
    public static void main(String[] args) {
    RAZAS var1 = RAZAS.BULLDOG;
    RAZAS var2 = RAZAS.MASTIN;

    System.out.println(var1 == var2);

    int posicionVar1 = 0;
    int posicionVar2 = 0;
    for (int i = 0; i < RAZAS.values().length; i++) {
        if (var1 == RAZAS.values() [i]) { posicionVar1 = i; }
        if (var2 == RAZAS.values() [i]) { posicionVar2 = i; }
    }

    System.out.println ("La posición de var1 es " + posicionVar1 + " y la posición de var2 es " + posicionVar2);
    }

    public enum RAZAS {
        MASTIN,
        TERRIER,
        BULLDOG,
        PEKINES,
        CANICHE,
        GALGO
        }
}
