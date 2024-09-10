
package algoritmos_ordenacao;
import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] lista) {
        quickSort(lista, 0, lista.length - 1);
    }

    /*
     * aqui, o método precisa de três parâmetros. como o array vai colocar
     * todos os elementos menores que o pivô à esquerda e todos os elementos maiores
     * que o pivô à direita, ele cria dois subarrays: esquerdo e direito. mais
     * tarde, precisaremos fazer o quicksort recursivamente em cada um desses
     * subarrays.
     */
    private static void quickSort(int[] lista, int menor, int maior) {
        // Se o método precisar ordenar um subarray com apenas um elemento, simplesmente
        // retornamos, pois não há mais nada para fazer
        if (menor >= maior) {
            return;
        }

        int posicaoPivo = new Random().nextInt(maior - menor) + menor;
        int pivo = lista[posicaoPivo]; // selecionando uma posição aleatoria como pivô
        troca(lista, posicaoPivo, maior); // trocamos a posicao do pivô para o final do array

        int ponteiroEsq = separar(lista, menor, maior, pivo);

        // quicksort dos subarrays recursivamente
        quickSort(lista, menor, ponteiroEsq - 1);
        quickSort(lista, ponteiroEsq + 1, maior);
    }

    /*
     * metodo para partir a lista entre os da esquerda (menor) e os da
     * direita(maior)
     */
    private static int separar(int[] lista, int menor, int maior, int pivo) {
        /*
         * ponteiros que vao varrer o array e apontar para o maior e menor elemento
         * dele, exceto o pivo
         */
        int ponteiroEsq = menor;
        int ponteiroDir = maior - 1;

        /*
         * no final, se ambos os ponteiros apontarem para o mesmo elemento,
         * é feito a troca desse elemento com o pivo.
         * o que indicará que o pivo esta, por fim, entre os subarrays da direita e da
         * esquerda
         */
        while (ponteiroEsq < ponteiroDir) {
            while (lista[ponteiroEsq] <= pivo && ponteiroEsq < ponteiroDir) {
                ponteiroEsq++;
            }
            while (lista[ponteiroDir] >= pivo && ponteiroEsq < ponteiroDir) {
                ponteiroDir--;
            }
            troca(lista, ponteiroEsq, ponteiroDir);
        }

        if (lista[ponteiroEsq] > lista[maior]) {
            troca(lista, ponteiroEsq, maior);
        } else {
            ponteiroEsq = maior;
        }
        return ponteiroEsq;
    }

    /*
     * metodo de troca da posição dos elementos
     */
    private static void troca(int[] lista, int index1, int index2) {
        int aux = lista[index1];
        lista[index1] = lista[index2];
        lista[index2] = aux;
    }
}

