package algoritmia.arrays;

import java.util.*;

public class practices_oct_8_2026
{
  public static void main(String[] args) {
    //things for use
    int [] listOfNumbers = {10,10,22,11,12,13,14,15,16,11,12,13,14,15,16,16};
    int [] ListOfNumbers2 =  {11,12,13,14,15,16};
    String [] listOfWords = {"manuel", "Ceron", "Fernandez", "Efrita","Fernandez", "denis", "Claudis", "Paola", "Andrea", "manuel", "Claudis", "Amor", "bae"};
    int num = 23;
    String word = "manuele";
    String word2 = "emanuel";
    String animal = "la letra x sera la primera letra que no se repite, supongo que todas las de mas lo haran por eso apareceran parce pero esta letra es muy especial y poco usando asi que muy egura mente todoas las otras letras se repitan pero esta no lo hara";


    //executions
    detectReapets(listOfNumbers);
    countChartsOnString(animal);
    takeRepeatsBeteewLists(listOfNumbers, ListOfNumbers2);
    FirstCharcarterDontReatOfString(animal);
    findTwoIndexesThatSumTarjetOnTheList(listOfNumbers, num);
    isAnagrama(word, word2);
    agoupWordFortheisFirstChar(listOfWords);
    conuntTimeTheSameNumber(listOfNumbers);
    takeWordThatDontAreRepeated(listOfWords);

  }
    // 1. Dado un array de enteros nums, devuelve true si algún valor aparece al menos dos veces, y false si todos son distintos. (patrón: Set / frecuencia)
       public static boolean detectReapets(int [] list) {
         HashSet<Integer> set = new HashSet<>();
         for (int i : list) {
           if (!set.add(i)) {
             System.out.println(true);
             return true;
           }
         }
         System.out.println(false);
         return false;
       }


    // 2. Dado un String s, cuenta cuántas veces aparece cada carácter y devuelve el HashMap. (patrón: frecuencia con getOrDefault)
       public static void countChartsOnString(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       for  (int i = 0; i < s.length(); i++) {
         if (map.containsKey(s.charAt(i))) {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
         }
         else {
            map.put(s.charAt(i), 1);
         }
       }
       System.out.println(map);
       }

    // 3. Dados dos arrays de enteros, devuelve un array con los números que aparecen en ambos (intersección), sin repetidos. (patrón: Set + contains)
       public static void takeRepeatsBeteewLists(int [] list, int [] list2) {
       HashSet<Integer> set =  new HashSet<>();
       ArrayList<Integer> numers = new ArrayList<>();
       for (int i : list) {
         set.add(i);
       }
       for (int i = 0 ; i < list2.length ; i++) {
         if (set.contains(list2[i])) {
           numers.add(list2[i]);
         }
       }
       System.out.println(numers);
       }


    // 4. Dado un String s, devuelve el primer carácter que NO se repite. Si todos se repiten, devuelve '_'. (patrón: frecuencia + segundo recorrido)
       public static void FirstCharcarterDontReatOfString(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
           if (map.containsKey(s.charAt(i))) {
               map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
           }
           else {
               map.put(s.charAt(i), 1);
           }
       }

       for (int i = 0; i < s.length(); i++) {
           if (map.get(s.charAt(i)) == 1) {
               System.out.print(s.charAt(i));
               break;
           }
       }
       }

    // 5. Dado un array de enteros y un target, devuelve los índices de los dos números que suman target. (patrón: HashMap complemento — repasa el Two Sum)
       public static void findTwoIndexesThatSumTarjetOnTheList(int [] list , int tarjet) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < list.length; i++) {
           map.put(list[i], i );

           }
       System.out.println( map);
       System.out.println(Arrays.toString(list));
        for  (int i = 0 ; i < list.length ; i++) {
            int complement = tarjet - list[i];
            if (map.containsKey(complement)) {
                System.out.println(map.get(complement));
                System.out.println(i);
                break;
            }
        }
       }

    // 6. Dados dos Strings s y t, devuelve true si son anagramas. (patrón: frecuencia + equals, o letras ordenadas — repaso)
       public static void isAnagrama(String a, String b) {
       HashMap<Character, Integer> map = new HashMap<>();
       HashMap<Character, Integer> map2 = new HashMap<>();
       for (int i = 0; i < a.length(); i++) {
           if (map.containsKey(a.charAt(i))) {
               map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
           } else {
               map.put(a.charAt(i), 1);
           }

       }
           for (int j = 0; j < b.length(); j++) {
               if (map2.containsKey(b.charAt(j))) {
                   map2.put(b.charAt(j), map2.get(b.charAt(j)) + 1);
               } else  {
                   map2.put(b.charAt(j), 1);
               }
           }
       System.out.println(map);
       System.out.println(map2);
       System.out.println(map.equals(map2));
       }

    // 7. Dado un array de Strings, agrupa las palabras por su primera letra en un HashMap<Character, List<String>>. (patrón: agrupar por huella)
      public static void agoupWordFortheisFirstChar(String[] s) {
        HashMap<Character, List <String>> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if(!map.containsKey(s[i].charAt(0))){
                map.put(s[i].charAt(0), new ArrayList<>(List.of(s[i])));
            }

        }
        System.out.println(map);
      }


    // 8. Dado un array de enteros, devuelve un HashMap donde la clave sea cada número y el valor cuántas veces aparece. (patrón: frecuencia con enteros)
      public static void conuntTimeTheSameNumber(int[] s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if(!map.containsKey(s[i])){
                map.put(s[i], 1 );
            } else  {
                map.put(s[i], map.get(s[i]) + 1);
            }
        }
        System.out.println(map);
      }


    // 9. Dado un array de Strings con palabras repetidas, devuelve una List<String> con las que aparecen exactamente una vez. (patrón: frecuencia + filtrar por valor 1)
    public static void takeWordThatDontAreRepeated(String[] s) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (!map.containsKey(s[i])){
                map.put(s[i], 1 );
            } else{
                map.put(s[i], map.get(s[i]) + 1);
        }}
            System.out.println(map);
        for (int j = 0; j < s.length; j++) {
            if (map.get(s[j]) == 1) {
                list.add(s[j]);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));

    }


    // 10. Dado un array de enteros, agrupa los números en un HashMap<String, List<Integer>> con dos claves: "pares" e "impares". (patrón: agrupar por categoría)
}
