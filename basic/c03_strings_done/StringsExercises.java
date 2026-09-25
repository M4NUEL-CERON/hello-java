package basic.c03_strings_done;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        System.out.println("primer texto" + "y le concateno seguido este otro");

        // 2. Muestra la longitud de una cadena de texto.
        var nombre = "Manueltiene25caracteres";
        System.out.println(nombre.length());
        // 3. Muestra el primer y último carácter de un string.
        var example = "a y b";
        System.out.println(example.charAt(0));
        System.out.println(example.charAt(example.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        String name1 = " manuel ceron ";
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(name1.contains("ceron"));

        // 6. Formatea un string con un entero.
        // no me interesa mucho esto

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(name1.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(name1.replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.

        System.out.println(name1.equals(" manuel ceron "));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(name1.length() == (nombre.length()));
    }
}
