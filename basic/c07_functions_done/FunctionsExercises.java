package basic.c07_functions_done;

/*
Clase 55 - Ejercicios: Funciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=19521
*/

import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {
       Integer[] array ={1, 2, 3, 4,5, 6, 7};
       String[] arrayExample = {"manuel", "CERON"};

        Mensaje();
        sayHi("Manuel");
        twoNumbers(15, 20);
        calculate(10, 6);
        checkIfIsPart(18);
        checkAge(17);
        getLongitude("manueofiejeifemidmeidemdie");
        aberaje(array);
        numerFactorial(5);
        ShowArrays(arrayExample);

    }
    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

    public static void Mensaje() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
        return;
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void sayHi(String name) {
        System.out.println("UN SALUDO PARA: " + name);

    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static void twoNumbers(int a, int b) {
        System.out.println("la resta entre el numero a: " + a + " menos el numero b: " + b + " da el resultado de: " + (a - b));
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static void calculate(int a, int b) {
        double raizCuadrada = a * b;
        raizCuadrada = Math.sqrt(raizCuadrada);
        System.out.println("La raiz es: " + raizCuadrada);
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static void checkIfIsPart(int a) {
        if (a % 2 == 0) {
            System.out.println("El numero: " + a + " es par");

        } else {
            System.out.println("El numero: " + a + " no es par");
        }
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static void checkAge(int a) {
        if (a >= 18) {
            System.out.println("El usuario es mayor de edad, tiene: " + a);

        } else {
            System.out.println("El usuario NO es mayor de edad, solo tiene: " + a);
        }
    }
        // 7. Implementa una función que reciba una cadena y retorne su longitud.


    public static void getLongitude(String a) {
        System.out.println(a.length());
    }

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static void aberaje(Integer[] a) {
        var numeroElementos = a.length;
        System.out.println(numeroElementos);
        var total = 0;
        for (int i = 0; i < numeroElementos; i++) {
            total += a[i];
        }
        System.out.println("La media es: " + total/numeroElementos);
    }

        // 9. Escribe un método que reciba un número y retorna su factorial.
    public static void numerFactorial(int a) {
        var factorial = 1;
        for (int i  = 1 ; i <= a;  i++) {
            factorial = factorial * i;
        }
        System.out.println("el factorial del numero: "+a + " es: "+ factorial);
    }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static void ShowArrays(String[] array) {
        System.out.println(Arrays.toString(array));
    }
    }
