import java.io.*;
import java.util.*;

import AlgoritmosOrdenacao.*;
import ProcessaEntradaESaida.EscreveNumeros;
//testando
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        do {
            System.out.print("Selecione C para continuar e S para sair: ");
            opcao = scanner.next();
            if (opcao.equalsIgnoreCase("C")) {
                main(scanner);
            } else if (!opcao.equalsIgnoreCase("S")) {
                System.out.println("Opção inválida!");
            }
        } while (!opcao.equalsIgnoreCase("S"));
        System.out.println("Sessão encerrada!");

    }

    private static void switchSort(Scanner sc, int[] numeros) {

        long tempoTotal = 0;
        menuSort();
        int escolha = sc.nextInt();

        // Repete o processo de ordenação 3 vezes
        for (int i = 0; i < 3; i++) {
            long tempoInicial = System.currentTimeMillis();

            switch (escolha) {
                case 1:
                    BubbleSort.bubbleSort(numeros);
                    break;
                case 2:
                    InsertionSort.insertionSort(numeros);
                    break;
                case 3:
                    SelectionSort.selectionSort(numeros);
                    break;
                case 4:
                    MergeSort.mergeSort(numeros);
                    break;
                case 5:
                    HeapSort.sort(numeros);
                    break;
                case 6:
                    QuickSort.quickSort(numeros);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }

            long tempoFinal = System.currentTimeMillis();
            tempoTotal += (tempoFinal - tempoInicial); // Acumula o tempo de execução
        }

        // Calcula a média do tempo de execução
        long tempoMedio = tempoTotal / 3;
        System.out.println("Tempo médio de execução: " + tempoMedio + " ms");

    }

    private static void menuSort() {
        System.out.println("ESCOLHA O TIPO DE SORT QUE DESEJA CRIAR: ");
        System.out.println("[1] BUBBLE SORT\n" +
                "[2] INSERTION SORT\n" +
                "[3] SELECTION SORT\n" +
                "[4] MERGE SORT\n" +
                "[5] HEAP SORT\n" +
                "[6] QUICK SORT");
    }

    private static void main(Scanner scanner) throws IOException {
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
        int[] numeros = EscreveNumeros.lerArquivo((arquivoEntrada), quantidade);

        switchSort(scanner, numeros);

        // Escreve o resultado no arquivo de saída
        EscreveNumeros.escreve(arquivoSaida, numeros);
    }
}
