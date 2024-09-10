package ProcessaEntradaESaida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import GeradorNumerosInteiros.GeradorDeNumeros;

public class EscreveNumeros {

  public static void escreve(String arquivo, int[] vetor) throws IOException {
    FileWriter arq = new FileWriter(arquivo + ".txt");
    PrintWriter gravarArq = new PrintWriter(arq);
    for (int i = 0; i < vetor.length; i++)
      gravarArq.print(vetor[i] + "\n");
    arq.close();
    System.out.println("Arquivo criado com sucesso! Se encontra dentro da pasta raiz do projeto!");
  }

  public static int[] lerArquivo(String nomeArquivo, int quantidade) throws IOException {
    int[] numeros = new int[quantidade];
    BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo + ".txt"));
    String linha;
    int i = 0;

    while ((linha = reader.readLine()) != null && i < quantidade) {
      numeros[i++] = Integer.parseInt(linha.trim());
    }
    reader.close();
    return numeros;
  }

  @SuppressWarnings("resource")
  public static void switchMenu(int[] vetor) {

    Scanner sc = new Scanner(System.in);
    int escolha = sc.nextInt();
    sc.nextLine();

    switch (escolha) {
      case 1:
        GeradorDeNumeros.crescenteSemRepeticao(vetor, vetor.length);
        break;
      case 2:
        GeradorDeNumeros.crescenteComRepeticao(vetor, vetor.length);
        break;
      case 3:
        GeradorDeNumeros.decrescenteSemRepeticao(vetor, vetor.length);
        break;
      case 4:
        GeradorDeNumeros.decrescenteComRepeticao(vetor, vetor.length);
        break;
      case 5:
        GeradorDeNumeros.aleatorioSemRepeticao(vetor, vetor.length);
        break;
      case 6:
        GeradorDeNumeros.aleatorioComRepeticao(vetor, vetor.length);
        break;
      default:
        System.out.println("Opção inválida!");
        return;
    }

  }

  public static void menu() {
    System.out.println("ESCOLHA O TIPO DE LISTA QUE DESEJA CRIAR: ");
    System.out.println("[1] CRESCENTE SEM REPETIÇÃO\n" +
        "[2] CRESCENTE COM REPETIÇÃO\n" +
        "[3] DECRESCENTE SEM REPETIÇÃO\n" +
        "[4] DECRESCENTE COM REPETIÇÃO\n" +
        "[5] ALEATORIO SEM REPETIÇÃO\n" +
        "[6] ALEATORIO COM REPETIÇÃO");
  }

}