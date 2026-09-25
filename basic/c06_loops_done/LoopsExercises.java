package basic.c06_loops_done;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 0;
        while (index < 10){
            index ++;
            System.out.println(index);
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<Integer> listNumers = new ArrayList<>();
        listNumers.add(1127123712);
        listNumers.add(2138123781);
        listNumers.add(1127381273);

        System.out.println(listNumers.size());

        int j = 0;
        var size = listNumers.size();

        do {
            System.out.println(listNumers.get(j));
           j++;}
        while (j < size);

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        int sumador = 5;
        for (int inde = 0; inde <= 50; inde = (5 + inde) ){
            System.out.println("los multiplos del 5 son: " + inde) ;
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int [] numerosLargos = new  int [5];
        numerosLargos[0] = 1;
        numerosLargos[1] = 2;
        numerosLargos[2] = 3;
        numerosLargos[3] = 4;
        numerosLargos[4] = 5;
        int total = 0;
        for  (int i = 0 ; i < numerosLargos.length; i++){
            total = total + numerosLargos[i];
        }
        System.out.println(total);


        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] Valores = new String[5];
        Valores[0] = "Brais";
        Valores[1] = "Moure";
        Valores[2] = "mouredev";
        Valores[3] = "moure";
        Valores[4] = "moure";


        for ( String valor : Valores){
            System.out.println(valor);
        }
        System.out.println(Arrays.toString(Valores));

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Brais", 1);
        map.put("Moure", 2);
        map.put("mouredev", 3);
        map.put("moure", 4);
        map.put("moure", 5);

        for (Map.Entry<String, Integer> entrada : map.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }

        for (Map.Entry<String, Integer> entrada : map .entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int i = 10; i >= 1 ; i--){
             System.out.println(i);
        }
        System.out.println("--------------------------------------");
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int i = 0; i <= 20 ; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int [] negativoNumero = new int[20];
        negativoNumero[0] = 1;
        negativoNumero[1] = 2;
        negativoNumero[2] = 3;
        negativoNumero[3] = 4;
        negativoNumero[4] = -5;
        negativoNumero[5] = 6;
        negativoNumero[6] = 7;
        negativoNumero[7] = 8;

        System.out.println(Arrays.toString(negativoNumero));
        for (Integer valor : negativoNumero){
            if( valor < 0){
                break;
            }
            System.out.println(valor);

        }
        System.out.println("-------------------------------");

        // 10. Crea un programa que calcule el factorial de un número dado.
        int factorial = 5;
        int sumando = 1;
        for (int  i = 1 ; i <= factorial; i++){
            sumando = sumando *  i;
        }
        System.out.println(sumando);
    }
}
