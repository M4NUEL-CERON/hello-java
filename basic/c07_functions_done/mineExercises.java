package basic.c07_functions_done;


import java.util.*;
import java.util.stream.Stream;

public class mineExercises {
    public static void main(String[] args) {
       /*
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
        sendEmail("manuelceron@gmail.com");
        returnArrayIntPart(arrayNumber);
        getStringToReturnHashMap("aaaaaaaA");


        int[] arrayNumber = {1, 2, 1, 4, 1, 1, 7};
        int[] arrayNumber2 = {1, 2, 3, 1, 1, 6, 7};
        twoArraysOfInt(arrayNumber,  arrayNumber2);

        ArrayList<String> arrayNumber3 = new ArrayList<>();
        arrayNumber3.add("manuel");
        arrayNumber3.add("woman");
        arrayNumber3.add("manuel");
        arrayNumber3.add("woman");
        arrayNumber3.add("ceron");
        arrayNumber3.add("manuel1");
        arrayNumber3.add("manuel1");
        arrayNumber3.add("manuel1");
        arrayNumber3.add("manuel1");

        returnValuesUniq(arrayNumber3);

        returnValuesIntegerUniq(arrayNumber);

        */

        int [] manuel = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 89, 9, 9};
        hasDuplicate(manuel);

        var palatra = "manuel";
        var pablra = "manule";

        isPalindrome(palatra,  pablra);


        returnWordBiggestOfSentence("manuel 1914 que mas parce como has estado queremos sabe cual es la palabra mas larga");
        int [] numerosLista = {1, 12, 12, 12, 12,31,23 , 23,232,3 , 23, 23, 1, 2,3 , 4, 5, 6, 7, 7, 8, 89, 9, 9, 0, 0};
        int tajer = 24;
        findIndexSmallersEqualsTarget(numerosLista,tajer);
        System.out.println(numerosLista[11] + numerosLista[12]);

        String[] listaAnagramas = {"roma", "amor", "ramo", "mora", "omar", "caso", "asco", "saco", "cosa", "frase", "fresa", "poder", "pedro", "perro", "perro", "gato", "toga"};
        getGropusAnagrams(listaAnagramas);
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
     // funcion de enviar un email y otro de enviar muchos email con la funcion dentro de si
     public static void sendEmail(String email) {
        System.out.println("enviar el email al siguiente ususario: " + email);
    }

     public static void sendEmailToUsers(ArrayList<String> emails)  {
        for (String email : emails){
            sendEmail(email);
        }
     }

    // 1. Crea una función que reciba un array de enteros y retorne un nuevo array solo con los números pares, en el mismo orden.
    public static void  returnArrayIntPart(int [] array){
        var newArray = new int[array.length];
        for (int i :  array) {
            if (i % 2 == 0){
                newArray[i] = i;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 2. Crea una función que reciba un String y retorne un HashMap donde cada letra sea la clave y su valor sea cuántas veces aparece esa letra. Ejemplo: "casa" -> {c=1, a=2, s=1}.
    public static void getStringToReturnHashMap(String word){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i  = 0 ; i < word.length(); i++) {
            if (!hashMap.containsKey(word.charAt(i))) {
                hashMap.put(word.charAt(i), 1 );
            } else {
                char letra = word.charAt(i);
               var clave = hashMap.get(letra);
                hashMap.put(letra, clave + 1);
        }
        }
        System.out.println(hashMap);
    }

    // 3. Crea una función que reciba dos arrays de enteros y retorne un HashSet con los números que aparecen en AMBOS arrays (la intersección).
    public static void twoArraysOfInt(int [] arrayA, int [] arrayB){
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int i = 0 ; i < arrayA.length ; i++) {
            hashSet.add(arrayA[i]);
        }
        for (int i = 0 ; i < arrayB.length ; i++) {
            var esta = hashSet.contains(arrayB[i]);
            if (esta) {
                hashSet2.add(arrayB[i]);
            } else {
                hashSet.add(arrayB[i]);
                System.out.println();
            }
        }
        System.out.println(hashSet2);
    }

    // 4. Crea una función que reciba un ArrayList de Strings y retorne solo los elementos que NO están repetidos (los que aparecen una sola vez).
    public static ArrayList<String> returnValuesUniq(ArrayList<String> arrayList){
        var newArrayList = new ArrayList<String>();
        for  (int i = 0 ; i < arrayList.size(); i++) {
            if(arrayList.indexOf(arrayList.get(i)) == arrayList.lastIndexOf(arrayList.get(i))){
                newArrayList.add(arrayList.get(i));
            }
        }
        System.out.println(newArrayList);
        return newArrayList;
    }

    // 5. Crea una función que reciba un array de enteros y retorne true si tiene algún número duplicado, false si todos son únicos. (Pista: un Set te lo pone fácil).
    public static HashSet<Integer> returnValuesIntegerUniq(int[] arrayInteger){
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer i : arrayInteger) {
            hashSet.add(i);
        }
        if (hashSet.size() == arrayInteger.length) {
           System.out.println(false);
        } else{
            System.out.println(true);
        }
        System.out.println(hashSet);
        System.out.println(Arrays.toString(arrayInteger));
        return hashSet;
    }

    // 6. Crea una función que reciba una frase (String con varias palabras separadas por espacios) y retorne la palabra más larga.
    public static void returnWordBiggestOfSentence(String oracion ){
        var LasSpaceIndex = 0 ;
        var palabraMasLarga = "";
        var palabraActual = "";

        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == ' ') {
                palabraMasLarga = oracion.substring(LasSpaceIndex + 1, i);
                palabraActual = oracion.substring(LasSpaceIndex, i);
//                System.out.println(palabraMasLarga);
//                System.out.println(palabraActual);
                LasSpaceIndex = i;

                if (palabraMasLarga.length() > palabraActual.length()) {
                    palabraActual = palabraMasLarga;
                }
            }
            }

//        System.out.println("ESTA ES LA PALABRA MAS LARGA PARCE:" + palabraActual);

        }


    // 7. Crea una función que reciba un HashMap<String, Integer> (nombres y edades) y retorne el nombre de la persona más joven.

    // 8. Crea una función que reciba un array de enteros y retorne un HashMap con dos claves: "pares" y "impares", donde cada valor sea cuántos hay de cada tipo.

    // 9. Crea una función que reciba un String y retorne true si es un palíndromo (se lee igual al derecho y al revés, ignorando espacios). Ejemplo: "anita lava la tina" -> true.

    // 10. Crea una función que reciba una lista de números (ArrayList<Integer>) y retorne una nueva lista con los mismos números pero sin duplicados y ordenados de menor a mayor.
    // Dado un array de enteros nums, devuelve truesi algún valor aparece más de una vez en el array, de lo contrario devuelve false.

        public static boolean hasDuplicate(int[] nums) {
         HashSet<Integer> hashSet = new HashSet<>();
         for ( int i : nums) {
             if (!hashSet.add(i)) {
                 return true;
             }
         } return  false;

        }
    // Dadas dos cadenas s y t, devuelve true si las dos cadenas son anagramas entre sí, de lo contrario devuelve false. Dos cadenas de caracteres son anagramas si contienen los mismos caracteres, apareciendo cada carácter el mismo número de veces, independientemente del orden.
    public static boolean isPalindrome(String palabra, String palabra2) {
        if (!(palabra.length() == palabra2.length())) {
            return false;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < palabra.length(); i++) {
            hashMap.put(palabra.charAt(i), +1);
        }
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for  (int i = 0; i < palabra2.length(); i++) {
            hashMap2.put(palabra.charAt(i), +1);
        }
        System.out.println(hashMap);
        System.out.println(hashMap2);
        System.out.println(hashMap.equals(hashMap2));
        return hashMap.equals(hashMap2);
    }


    public static void findIndexSmallersEqualsTarget (int [] lista, int numero ){
        var numero1 = 0;
        var numero2 = 0;
        for (int i = 0; i < lista.length; i++) {
         for (int j = i + 1; j < lista.length; j++) {
             if (lista[i] + lista[j] == numero) {
                 numero1 = i;
                 numero2 = j;
                 break;
             }
         }
        }
        System.out.println(numero1);
        System.out.println(numero2);
        }
      // Dado un array de cadenas strs, agrupa todos los anagramas en sublistas. Puedes devolver el resultado en cualquier orden .
      //Un anagrama es una cadena de caracteres que contiene exactamente los mismos caracteres que otra cadena, pero el orden de los caracteres puede ser diferente.
      //Input: strs = ["act","pots","tops","cat","stop","hat"]
      //Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

      public static List<List<String>> getGropusAnagrams(String[] list) {
          HashMap<String, List<String>> hashMap = new HashMap<>();
          for (String palabra : list) {
              char[] caracteres = palabra.toCharArray();
              Arrays.sort(caracteres);
              String ordenado = new String(caracteres);

              hashMap.putIfAbsent(ordenado, new ArrayList<>());
              hashMap.get(ordenado).add(palabra);
          }

          var resultado = new ArrayList<List<String>>(hashMap.values());
          System.out.println(resultado);
          return resultado;
      }
 }





