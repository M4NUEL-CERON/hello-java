package basic.c05_structures_done;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] numerosArray = new int[5];
        numerosArray[0] = 1;
        numerosArray[2] = 2;
        numerosArray[3] = 3;
        numerosArray[4] = 4;
        System.out.println(numerosArray.length);
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        int[] numeros = new int[3];
        numeros[0] = 1;
        System.out.println(numeros[0]);

        numeros[0] = 2;
        System.out.println(numeros[0]);

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // 3. Crea un ArrayList vacío.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);


        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        list.add(123123123);
        list.add(1892389234);
        list.add(9234901);
        list.add(18932489);

        list.remove(1);
        list.remove(0);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println("------------------------------------------------------------------------------------------------------------------");


        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> set = new HashSet<String>();
        set.add("Brais");
        set.add("Moure");
        set.add("mouredev");
        System.out.println(set);
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        set.add("Brais");
        set.add("Manuel");
        System.out.println(set);
        System.out.println("------------------------------------------------------------------------------------------------------------------");


        // 7. Elimina uno de los elementos del HashSet.
        System.out.println(set.isEmpty());
        System.out.println(set.remove("Brais"));
        System.out.println(set);

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Brais", 300473769);
        map.put("Manuel", 300473769);
        map.put("mouredev", 300473769);

        System.out.println(map);
        // 9. Modifica uno de los contactos y elimina otro.
        System.out.println(map.values());
        System.out.println(map.containsKey("Brais"));
        System.out.println(map.containsKey("Manuel"));
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        int[] numeros2 = new int[4];
        numeros2[0] = 1892138192;
        numeros2[1] = 1;
        numeros2[2] = 1;
        numeros2[3] = 1;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(numeros2[0]);
        System.out.println(list2);

        HashSet<Integer> set2 = new HashSet<>();
        set2.addAll(list2);
        System.out.println(set2);

        HashMap<Integer, Integer> map2 = new HashMap<>();

        System.out.println(map2);
    }

}
