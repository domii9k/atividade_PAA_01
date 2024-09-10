package algoritmos_ordenacao;
public class HeapSort {

    public static void sort(int[] vetor) {
        int n = vetor.length;

        //reordenando o heap (vizualização em arvore)
        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, n, i);
        }

        //ordenando o vetor trocando o ultimo elemento (max) com o primeiro elemento
        for (int i = n - 1; i > 0; i--) {
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            aplicarHeap(vetor, i, 0); //aplicando heap
        }
    }

    private static void aplicarHeap(int[] vetor, int n, int i) {
        int raiz = i; // raiz do heap dada como maior elemento do vetor
        int esq = 2 * i + 1; // logica para saber qual é o filho esquerdo das raizes (pais) do heap
        int dir = 2 * i + 2; // logica para saber qual é o filho direito das raizes (pais) do heap

        if (esq < n && vetor[esq] > vetor[raiz]) {
            raiz = esq;
        }
        if (dir < n && vetor[dir] > vetor[raiz]) {
            raiz = dir;
        }
        // se a raiz não for i
        if (raiz != i) {
            int temp = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = temp;

            aplicarHeap(vetor, n, raiz);
        }
    }
}
