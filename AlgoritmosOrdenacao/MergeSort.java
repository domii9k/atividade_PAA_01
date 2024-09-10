package AlgoritmosOrdenacao;

public class MergeSort {

    public static void mergeSort(int[] lista) {
        int tamanhoLista = lista.length; // inicializando com o tamanho do array

        // após separar todos os elementos do array, podemos concluir que cada um já
        // está oridenado por si só. entao retornamos
        if (tamanhoLista < 2) {
            return;
        }

        // caso contrario, continuamos dividindo o array em dois
        int meio = tamanhoLista / 2;
        int[] esq = new int[meio]; // parte esquerda do array
        int[] dir = new int[tamanhoLista - meio]; // parte direita do array

        // agora preenchemos os dois arrays com a metade de cada lado do array original
        for (int i = 0; i < meio; i++) {
            esq[i] = lista[i];
        }
        for (int i = meio; i < tamanhoLista; i++) {
            dir[i - meio] = lista[i];
        }

        // para separar todos os elementos completamente,
        // chamados o metodo de forma recursiva
        // ate que o numero de elementos em cada sublista seja = 1
        mergeSort(esq);
        mergeSort(dir);

        // reorganizando todo o array novamente
        merge(lista, esq, dir);

    }

    // aqui será percorrido todos os subarrays e compara-los
    private static void merge(int[] lista, int[] esq, int[] dir) {
        int tamanhoEsq = esq.length;
        int tamanhoDir = dir.length;

        int i = 0, j = 0, k = 0;

        while (i < tamanhoEsq && j < tamanhoDir) {
            // se o elemento da esquerda for menor ou igual ao elemento da direita
            if (esq[i] <= dir[j]) {
                lista[k] = esq[i]; // colocamos o elemento da esquerda no novo array reorganizado
                i++;
            } else {
                lista[k] = dir[j]; // senao, fazemos o contrario
                j++;
            }
            k++;
        }

        // aqui é alinhado o restante dos elementos que nao foram organizados
        while (i < tamanhoEsq) {
            lista[k] = esq[i];
            i++;
            k++;
        }
        while (j < tamanhoDir) {
            lista[k] = dir[j];
            j++;
            k++;
        }
    }
}