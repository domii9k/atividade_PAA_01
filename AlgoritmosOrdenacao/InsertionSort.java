package AlgoritmosOrdenacao;

/* 
 * Complexidade Pior Caso: O(n²)
 * Complexidade Caso Médio: O(n²)
 * Complexidade Melhor Caso: O(n) - lista ja ordenada
 * 
 */
public class InsertionSort {

    public static void insertionSort(int v[]) {

        int temp;
        int j;

        for (int i = 1; i < v.length; i++) { // o primeiro laço começa no segundo elemento
            temp = v[i]; // a variavel temp assume o valor da segunda posição inicial do vetor
            for (j = i - 1; (j >= 0) && (v[j] > temp); j--) { // inicia novo laço com -1 posição do laço anterior
                                                              // e verifica se a posição do segundo laço é maior ou
                                                              // igual a zero e maior que o valor que ficou na variavel
                                                              // temp
                v[j + 1] = v[j]; // a posição seguinte à variavel do segundo laço recebe o valor da posição da
                                 // primeira variavel do segundo laço
            }
            v[j + 1] = temp; // apos, a variavel da posição seguinte (reinicia o loop no primeiro laço)
                             // recebe o valor que estava guardado em temp

        }

    }

}
