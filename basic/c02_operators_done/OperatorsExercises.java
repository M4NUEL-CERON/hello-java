package basic.c02_operators_done;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 1;
        int b = 2;

        System.out.println("operaciones aritmeticas entre a y b:");
        System.out.println(a + b );
        System.out.println(a - b );
        System.out.println(a / b );
        System.out.println(a * b );
        System.out.println(a % b );

        // 2. Crea una variable para cada tipo de operación de asignación.
        a -= 1;
        System.out.println(a);
        System.out.println("la respuesta arriba deberia ser 0");
        a += 1;
        System.out.println(a);
        System.out.println("la respuesta arriba deberia ser 2");
        a /= 1;
        System.out.println(a);
        System.out.println("la respuesta arriba deberia ser 0.5");
        a *= 1;
        System.out.println(a);
        System.out.println("la respuesta arriba deberia ser 1");
        a %= 1;
        System.out.println(a);
        System.out.println("la respuesta arriba deberia ser 0");

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(a == 0);
        System.out.println(a == 0 );
        System.out.println(b == 2 );

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(b < 2 );
        System.out.println(b > 91 );
        System.out.println(b >= 91 );

        // 5. Utiliza el operador lógico and.
        System.out.println((b < 1) && (a < 11) );

        // 6. Utiliza el operador lógico or.
        System.out.println((b < 1) || (a < 11) );

        // 7. Combina ambos operadores lógicos.

        // 8. Añade alguna negación.
        System.out.println(!(b >= 1) && (a < 11) );


        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(++a);


        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(--b);
    }
}
