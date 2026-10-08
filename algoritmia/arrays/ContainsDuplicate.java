package algoritmia.arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 89, 9, 9};
        System.out.println(hasDuplicate(numeros));
    }

    // Dado un array de enteros nums, devuelve true si algún valor aparece más de una vez, false si todos son únicos.
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> vistos = new HashSet<>();
        for (int i : nums) {
            if (!vistos.add(i)) {
                return true;
            }
        }
        return false;
    }
}