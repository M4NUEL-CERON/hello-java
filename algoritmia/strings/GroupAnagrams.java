package algoritmia.strings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] palabras = {"roma", "amor", "ramo", "mora", "omar", "caso", "asco", "saco", "cosa", "frase", "fresa", "poder", "pedro", "perro", "perro", "gato", "toga"};
        System.out.println(getGropusAnagrams(palabras));
    }

    // Dado un array de strings, agrupa los anagramas en sublistas. El orden del resultado no importa.
    public static List<List<String>> getGropusAnagrams(String[] list) {
        HashMap<String, List<String>> grupos = new HashMap<>();
        for (String palabra : list) {
            char[] caracteres = palabra.toCharArray();
            Arrays.sort(caracteres);
            String ordenado = new String(caracteres);

            grupos.putIfAbsent(ordenado, new ArrayList<>());
            grupos.get(ordenado).add(palabra);
        }

        return new ArrayList<>(grupos.values());
    }
    //Dado un array de enteros nums y un entero k, devuelve los k elementos más frecuentes dentro del array.
    public static void nuevosAnimados (int[] listNums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] nums = new int[k - 1];
        for (int i = 0; i < listNums.length; i++) {
            if (map.containsKey(listNums[i])) {
                map.put(listNums[i], map.get(listNums[i]) + 1);
            } else  {
                map.put(listNums[i], 1);
            }
        }
    }
}