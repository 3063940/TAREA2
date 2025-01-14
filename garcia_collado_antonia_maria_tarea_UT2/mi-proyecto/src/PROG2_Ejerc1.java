/**
 * Declara e inicializa una variable para almacenar cada uno de los siguientes valores.
 * Trata de utilizar el tipo de datos de mas se ajuste a los datos. Justifica tu elección.
 * 1. Valor máximo no modificable: 5000.
 * 2. Si el nuevo empleado tiene carnet de conducir o no.
 * 3. Un mes del año en formato numérido y como cadena.
 * 4. El nombre y apellidos de una persona.
 * 5. Sexo: con dos valores posibles 'V' o 'M'.
 * 6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
 * 7. Saldo de una cuenta bancaria.
 * 8. Distancia en kms desde la Tierra a Júpiter.
 */

public class PROG2_Ejerc1 {
    public static void main(String[] args) {

        //1. Valor máximo no modificable: 5000.

        final short VALOR = 5000; // he indicado un "final" porque así el valor nunca se va a modificar

        // 2. Si el nuevo empleado tiene carnet de conducir o no

        boolean tieneCarnet = true; // he utilizado un boolean porque así puedo indicar si es verdad o no

        //3. Un mes del año en formato numérido y como cadena.

        byte mesNumero = 7; // para indicar solo un número es mejor utilizar un byte y no malgastar espacio
        String mesCadena ="Julio"; // String me permite poner el texto que quiera.

        // 4. El nombre y apellidos de una persona.

        String nombreApellidos = "Maria Garcia Collado"; // Igual que en el ejercicio anterior, me permite poner el exto que quiera

        // 5. Sexo: con dos valores posibles 'V' o 'M'.

        char genero = 'M'; // utilizo char porque es solo un caracter.

        // 6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.

        long milisegundos = 1732665600000l; // es un número demasiado grande como para usar int.

        // 7. Saldo de una cuenta bancaria.

        double saldo = 1000.0; // utilizo double porque es más preciso que float.

        // 8. Distancia en kms desde la Tierra a Júpiter.

        long distancia = 6280000000l; // utilizo long porque el numero es largo y es necesario
    }
}
