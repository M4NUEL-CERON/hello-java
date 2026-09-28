package basic.c07_functions_done;


import java.util.Arrays;

public class mineExercises {
    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7};
        String[] arrayStrings = {"manuel", "CERON"};
        aditionAllToNumber(10);
        turnString("manuel");
        returnBigestNumberOfArray(arrayNumber);
        StringLength("esta palabtra tiene 33 caracteres");
        numberIsPrimo(7);
        returnArrayParts(arrayNumber);
        compareString("leunam", "Manuel");
        tableMultiple(100);
    }
    // 1. Crea una función que reciba dos números enteros y retorne el mayor de los dos.
    public static void returnBigest(int a, int b) {
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    // 2. Crea una función que reciba un número y retorne true si es par, false si es impar.
    public static void getIfIsPart(int a){
            if (a % 2 == 0){
                System.out.println("es una numero par " +  a);
            } else {
                System.out.println("no es una numero par " +  a);
            }
        }

    // 3. Crea una función que reciba un número entero y retorne la suma de todos los números del 1 hasta ese número.
    public static void aditionAllToNumber(int s){
        var total = 0;
        for (int i = 0; i <= s; i++) {
            total += i;
        }
        System.out.println(total);
    }

    // 4. Crea una función que reciba una palabra (String) y la retorne al revés. Ejemplo: "hola" -> "aloh".
    public static void turnString(String word){
        String resultado = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            resultado += word.charAt(i);
        }
        System.out.println(resultado);
        System.out.println(resultado.charAt(1));
    }

    // 5. Crea una función que reciba un array de enteros y retorne el número más grande del array.
    public static void returnBigestNumberOfArray(int[] a) {
        var bigest = 0;
        for (int b : a) {
            if (b >= bigest) {
                bigest = b;
            }
        }
        System.out.println("el numero mas grande es el " + bigest);
    }

    // 6. Crea una función que reciba una palabra (String) y cuente cuántas vocales tiene.
    public static void StringLength(String a){
        System.out.println(a.length());
        }

    // 7. Crea una función que reciba un número entero y retorne true si es primo, false si no. (Un primo solo es divisible entre 1 y él mismo).
    public static void numberIsPrimo(int a ){
        var total = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 ) {
                total++;
            }
        }
        if(total == 2){
            System.out.println("el numero " + a + " se puede mutilplicar " + total + " veces por tanto es primo");

        } else {
            System.out.println("el numero se " + a + " puede mutilplicar " + total + " veces por tanto no es primo");
        }
    }

     // 8. Crea una función que reciba un array de enteros y retorne cuántos números pares hay.
     public static void returnArrayParts(int [] array){
        int [] contenedor = new int[array.length];
        var contadorDePares = 0;
        for (int s : array) {
          if (s % 2 == 0){
              contenedor[s] = s;
              contadorDePares++;
        }
        }
        System.out.println(Arrays.toString(contenedor));
        System.out.println(contadorDePares);
     }


      // 9. Crea una función que reciba dos palabras (String) y retorne true si son la misma palabra escrita al revés (una es el reverso de la otra).
    public static void compareString(String a, String b){
        a  = a.toLowerCase();
        b  = b.toLowerCase();
        var newB = "";
        for (int i = b.length() -1 ; i >= 0; i--) {
            newB = newB + b.charAt(i);

        }

        if  (a.equals(b)){
            System.out.println(a + " y " + b + " son las mismas palabras");
            System.out.println(newB);
        } else if(newB.equals(a)){
            System.out.println(a + " y " + newB + " son las mismas palabras");
        } else {
            System.out.println(newB + " y " + a + " no son las mismas palabras");
        }
    }
     // 10. Crea una función que reciba un número entero y muestre su tabla de multiplicar del 1 al 10.
     public static void tableMultiple(int a){
        System.out.println("TABLA DE MULTIPLICAR DEL NUMERO: " + a );
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + i*a);
        }
     }

    }

