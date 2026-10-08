package algoritmia.strings;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        var palabra = "manuel";
        var palabra2 = "manule";
        System.out.println(isAnagram(palabra, palabra2));
    }

    // Dadas dos cadenas, devuelve true si son anagramas entre sí (mismos caracteres, misma cantidad de cada uno).
    public static boolean isAnagram(String palabra, String palabra2) {
        if (palabra.length() != palabra2.length()) {
            return false;
        }

        HashMap<Character, Integer> conteo = new HashMap<>();
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            conteo.put(letra, conteo.getOrDefault(letra, 0) + 1);
        }

        for (int i = 0; i < palabra2.length(); i++) {
            char letra = palabra2.charAt(i);
            if (!conteo.containsKey(letra)) {
                return false;
            }
            conteo.put(letra, conteo.get(letra) - 1);
        }

        for (int valor : conteo.values()) {
            if (valor != 0) {
                return false;
            }
        }
        return true;
    }
}