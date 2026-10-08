package algoritmia.arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] numerosLista = {1, 12, 12, 12, 12, 31, 23, 23, 232, 3, 23, 23, 1, 2, 3, 4, 5, 6, 7, 7, 8, 89, 9, 9, 0, 0};
        int tajer = 24;
        findIndexSmallersEqualsTarget(numerosLista, tajer);
    }

    // Dado un array y un número objetivo, encuentra los índices de dos elementos cuya suma sea igual al objetivo.
    public static void findIndexSmallersEqualsTarget(int[] lista, int numero) {
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
}