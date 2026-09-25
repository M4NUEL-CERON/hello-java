package basic.c01_beginner_done;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Manuel";
        System.out.println (name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 21;
        System.out.println (edad);

        // 3. Crea una variable double con tu altura en metros.
        Double estatura = 1.87;
        System.out.println (estatura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        Boolean likeToPrograming = true;
        System.out.println ("te gusta programar?");
        System.out.println(likeToPrograming);

        // 5. Declara una constante con tu email.
        final String EMAIL = "juanmanuelceronfernandez123@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char firstInitialName = 'M';
        System.out.println(firstInitialName);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String locate = "cuenca ecuador";
        locate = "timbio colombia";
        System.out.println(locate);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 1;
        int b = 2;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("que tipo de dato es la varible" + " locate" + " ?");
        System.out.println(locate.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        var name_var = "Manuel Ceron";
        System.out.println(name_var);
    }

}
