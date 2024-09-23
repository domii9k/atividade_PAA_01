package ProcessaEntradaESaida;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import AlgoritmosOrdenacao.BubbleSort;
import AlgoritmosOrdenacao.HeapSort;
import AlgoritmosOrdenacao.InsertionSort;
import AlgoritmosOrdenacao.MergeSort;
import AlgoritmosOrdenacao.QuickSort;
import AlgoritmosOrdenacao.SelectionSort;

public class AuxiliarMain {

    public static void main(Scanner scanner) throws IOException {

        int[] vetor;

        System.out.print("Informe a quantidade de números a ser ordenada: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        vetor = new int[quantidade];

        System.out.print("Informe o nome do arquivo de entrada (sem extensão): ");
        String arquivoEntrada = scanner.nextLine();
        
        EscreveNumeros.menu();
        EscreveNumeros.switchMenu(vetor);
        EscreveNumeros.escreve(arquivoEntrada, vetor);

        System.out.print("Informe o nome do arquivo de saída: ");
        String arquivoSaida = scanner.nextLine();

        // Lê os números do arquivo de entrada
        int[] numeros = EscreveNumeros.lerArquivo(arquivoEntrada, quantidade);

        int[] vetorOrdenado = switchSort(scanner, numeros);

        // Escreve o resultado no arquivo de saída
        EscreveNumeros.escreve(arquivoSaida, vetorOrdenado);
    }

    //metodo para escolher o algoritmo de ordenação
    private static int[] switchSort(Scanner sc, int[] numeros) {

        int[] copiaNumeros = null;
        long tempoTotal = 0;
        menuSort();
        int escolha = sc.nextInt();

        // Repete o processo de ordenação 3 vezes
        for (int i = 0; i < 3; i++) {

            // toda vez que começar uma nova iteração
            // o copiaNumeros vai copiar novamente a lista original, para evitar que nas
            // proximas iterações o vetor ja esteja ordenado
            copiaNumeros = Arrays.copyOf(numeros, numeros.length);

            System.out.println("Realizando teste " + (i + 1) + "...");

            long tempoInicial = System.currentTimeMillis();

            switch (escolha) {
                case 1:
                    BubbleSort.bubbleSort(copiaNumeros);
                    break;
                case 2:
                    InsertionSort.insertionSort(copiaNumeros);
                    break;
                case 3:
                    SelectionSort.selectionSort(copiaNumeros);
                    break;
                case 4:
                    MergeSort.mergeSort(copiaNumeros);
                    break;
                case 5:
                    HeapSort.sort(copiaNumeros);
                    break;
                case 6:
                    QuickSort.quickSort(numeros);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            long tempoFinal = System.currentTimeMillis();
            long tempoExecucao = tempoFinal - tempoInicial;

            System.out.println("Teste " + (i + 1) + " concluído! Tempo: " + tempoExecucao + " ms.");
            tempoTotal += tempoExecucao; // Acumula o tempo de execução
        }

        // Calcula a média do tempo de execução
        long tempoMedio = tempoTotal / 3;
        System.out.println("Tempo médio de execução total: " + tempoMedio + " ms");

        return copiaNumeros;
    }

    //menu de ordenações
    private static void menuSort() {
        System.out.println("ESCOLHA O TIPO DE SORT QUE DESEJA CRIAR: ");
        System.out.println("[1] BUBBLE SORT\n" +
                "[2] INSERTION SORT\n" +
                "[3] SELECTION SORT\n" +
                "[4] MERGE SORT\n" +
                "[5] HEAP SORT\n" +
                "[6] QUICK SORT");
    }

}
