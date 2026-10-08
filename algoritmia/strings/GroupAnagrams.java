package algoritmia.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
}