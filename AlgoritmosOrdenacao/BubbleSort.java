package AlgoritmosOrdenacao;

/* 
 * Complexidade Pior Caso: O(n²)
 * Complexidade Caso Médio: O(n²)
 * Complexidade Melhor Caso: O(n) - lista ja ordenada
 * 
 */
public class BubbleSort {

    /* int[] v = {2,9,6,7,4,1,40}; */

    public static void bubbleSort(int v[]) {
        boolean troca = true;
        int temp;

        while (troca) {
            troca = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    troca = true;
                }
            }
        }
    }
}