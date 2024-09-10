
package AlgoritmosOrdenacao;

import java.util.Random;

//Mesma logica do quickSort padrão,
//porém trocando os operadores <= >= e < > para ordenar de forma decrescente.
// classe auxiliar para criar as listas de numeros decrescentes (com ou sem repetição)
public class QuickSortDecrescente {

    public static void quickSort(int[] lista) {
        quickSort(lista, 0, lista.length - 1);
    }

    private static void quickSort(int[] lista, int menor, int maior) {
        if (menor >= maior) {
            return;
        }

        int posicaoPivo = new Random().nextInt(maior - menor) + menor;
        int pivo = lista[posicaoPivo];
        troca(lista, posicaoPivo, maior);

        int ponteiroEsq = separar(lista, menor, maior, pivo);

        quickSort(lista, menor, ponteiroEsq - 1);
        quickSort(lista, ponteiroEsq + 1, maior);
    }

    private static int separar(int[] lista, int menor, int maior, int pivo) {

        int ponteiroEsq = menor;
        int ponteiroDir = maior - 1;

        while (ponteiroEsq < ponteiroDir) {
            //trocado para >=
            while (lista[ponteiroEsq] >= pivo && ponteiroEsq < ponteiroDir) {
                ponteiroEsq++;
            }
            //trocado para <=
            while (lista[ponteiroDir] <= pivo && ponteiroEsq < ponteiroDir) {
                ponteiroDir--;
            }
            troca(lista, ponteiroEsq, ponteiroDir);
        }

        //trocado para <
        if (lista[ponteiroEsq] < lista[maior]) {
            troca(lista, ponteiroEsq, maior);
        } else {
            ponteiroEsq = maior;
        }
        return ponteiroEsq;
    }

    private static void troca(int[] lista, int index1, int index2) {
        int aux = lista[index1];
        lista[index1] = lista[index2];
        lista[index2] = aux;
    }
}
