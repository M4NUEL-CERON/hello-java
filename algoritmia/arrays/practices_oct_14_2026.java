package algoritmia.arrays;

import java.util.HashMap;

public class practices_oct_14_2026 {
    public static void main(String[] args) {
        // things
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Manuel", 21);
        // executions
        SaidIfValueIsZero(map);
    }
    // 1. getOrDefault — Crea un método que reciba un HashMap<String, Integer> ya lleno y una
    //    clave. Imprime el valor de esa clave, pero si la clave NO existe, imprime 0.
    //    Practica SOLO el getOrDefault, sin bucles ni nada más.
    public static void SaidIfValueIsZero(HashMap<String, Integer> map) {
        var value = map.getOrDefault( "Manuel", 0);
        if (value == 0) {
            System.out.println(0);
        } else  {
            System.out.println(value);
        }
    };


// 2. Map de frecuencias — Crea un método que reciba un int[] y devuelva un
//    HashMap<Integer, Integer> con cuántas veces aparece cada número. (usa getOrDefault + put)

// 3. entrySet() en un bucle — Crea un método que reciba un HashMap<Integer, Integer> y
//    recorra sus entradas con un for-each sobre entrySet(), imprimiendo cada fila tal cual
//    (System.out.println(fila)). Observa el formato clave=valor.

// 4. getKey() y getValue() — Igual que el anterior, pero ahora dentro del bucle imprime por
//    separado "numero: X - frecuencia: Y" usando fila.getKey() y fila.getValue().

// 5. entrySet() a una lista — Crea un método que reciba un HashMap<Integer, Integer>, meta
//    sus entradas en un List<Map.Entry<Integer, Integer>> y lo imprima. (solo convertir, sin ordenar)

// 6. sort con lambda (de menor a mayor) — Crea un método que reciba una List<Integer> con
//    números desordenados y la ordene de MENOR a mayor con lista.sort((a, b) -> a - b). Imprímela.

// 7. sort con lambda (de mayor a menor) — Lo mismo que el 6, pero ordénala de MAYOR a menor.
//    (pista: cambia el orden de la resta en la lambda). Compara ambos resultados.

// 8. sort de Map.Entry por valor — Crea un método que reciba un HashMap<Integer, Integer>,
//    pase sus entradas a una lista y la ordene por frecuencia de mayor a menor usando
//    lista.sort((a, b) -> b.getValue() - a.getValue()). Imprime la lista ordenada.

// 9. Tomar los primeros K — Crea un método que reciba una List<Integer> YA ordenada y un int k,
//    y devuelva un int[] con solo los primeros k elementos. (practica el for de i=0 hasta k)

// 10. Juntar todo — Crea un método que reciba un int[] y un int k, y devuelva los k números
//     más frecuentes. Aquí combinas todo: frecuencias (ej 2) + lista (ej 5) + sort (ej 8) +
//     primeros k (ej 9). Es el ejercicio completo armado con las piezas que ya practicaste.
}
