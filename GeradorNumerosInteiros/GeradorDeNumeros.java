package GeradorNumerosInteiros;

import AlgoritmosOrdenacao.QuickSort;
import AlgoritmosOrdenacao.QuickSortDecrescente;

public class GeradorDeNumeros {

    public static void crescenteComRepeticao(int[] vetor, int tamanhoVetor) {
        auxiliaGeracaoComRepeticao(vetor, tamanhoVetor);
        QuickSort.quickSort(vetor); //usando o quicksort para ordenar a lista em crescente
    }

    public static void crescenteSemRepeticao(int[] vetor, int tamanhoVetor) {
        auxiliaGeracaoSemRepeticao(vetor, tamanhoVetor);
        QuickSort.quickSort(vetor); //usando o quicksort para ordenar a lista em crescente
    }

    public static void decrescenteComRepeticao(int[] vetor, int tamanhoVetor) {
        auxiliaGeracaoComRepeticao(vetor, tamanhoVetor);
        QuickSortDecrescente.quickSort(vetor); //usando o quicksort para ordenar a lista em decrescente
    }

    public static void decrescenteSemRepeticao(int[] vetor, int tamanhoVetor) {
        auxiliaGeracaoSemRepeticao(vetor, tamanhoVetor);
        QuickSortDecrescente.quickSort(vetor); //usando o quicksort para ordenar a lista em decrescente
    }

    public static void aleatorioComRepeticao(int[] vetor, int tamanhoVetor) {
        auxiliaGeracaoComRepeticao(vetor, tamanhoVetor);
    }

    public static void aleatorioSemRepeticao(int[] vetor, int tamanhoVetor) {
        auxiliaGeracaoSemRepeticao(vetor, tamanhoVetor);
    }

    // metodos auxiliares
    private static void auxiliaGeracaoSemRepeticao(int[] vetor, int tamanhoVetor) {
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = i;
        }
        int i = tamanhoVetor, j, temp;
        // embaralhando os números usando o algoritmo de Fisher-Yates
        while (--i > 0) {
            j = (int) Math.floor(Math.random() * (i + 1));
            temp = vetor[j];
            vetor[j] = vetor[i];
            vetor[i] = temp;
        }
    }

    private static void auxiliaGeracaoComRepeticao(int[] vetor, int tamanhoVetor) {
        for (int i = 0; i < tamanhoVetor; i++) {
           vetor[i] = (int) Math.floor(Math.random()*tamanhoVetor);
        }
    }

}
