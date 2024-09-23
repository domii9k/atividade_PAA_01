package AlgoritmosOrdenacao;

public class SelectionSort {

    public static void selectionSort(int v[]) {

        for (int i = 0; i < v.length - 1; i++) { // laço que percorre o array e encontra o menor valor (posição 0)
            int min = i; // a variavel min recebe a posição da valor encontrado no array

            // inicia um novo laço a partir do segundo elemento do vetor até o ultimo
            // elemento
            for (int j = min + 1; j < v.length; j++) {
                if (v[j] < v[min]) { // se a proxima posição (min+1) for menor que a posição da variavel min (v[min])
                    min = j; // min passa a guardar a posição desta variavel, que passa a ser o novo menor
                             // valor do array
                }
            }
            if (min != i) { // saindo do segundo laço de vericação
                            // se a posição do menor valor for menor que v[i]
                int temp = v[i]; // o valor de v[i] é guardado em temp
                v[i] = v[min]; // para que v[min] passe a tomar a posição de v[i]
                v[min] = temp; // por fim, a posição guardada em temp (v[i]) passa tomar a posição anterior de
                               // v[min]
            }
        }

    }

}
