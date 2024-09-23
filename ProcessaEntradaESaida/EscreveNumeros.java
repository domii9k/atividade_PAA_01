package ProcessaEntradaESaida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import GeradorNumerosInteiros.GeradorDeNumeros;

public class EscreveNumeros {

  //metodo para escrever os numeros no arquivo solicitado
  public static void escreve(String arquivo, int[] vetor) throws IOException {
    //FileWriter é usado para criar um arquivo os numeros solicitados
    FileWriter arq = new FileWriter(arquivo + ".txt");
    PrintWriter gravarArq = new PrintWriter(arq);  //PrintWriter é usado para escrever no arquivo a lista de numeros gerados

    for (int i = 0; i < vetor.length; i++)
      gravarArq.print(vetor[i] + "\n"); // aqui printamos os numeros linha por linha
    arq.close();
    System.out.println("Arquivo criado com sucesso! Se encontra dentro da pasta raiz do projeto!");
  }

  //metodo para ler os numeros do arquivo solicitado
  public static int[] lerArquivo(String nomeArquivo, int quantidade) throws IOException {
    int[] numeros = new int[quantidade];
    BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo + ".txt")); // aqui lemos o arquivo e armazenamos em uma variavel
    String linha;  // aqui criamos uma variavel para armazenar a linha lida
    int i = 0;


    while ((linha = reader.readLine()) != null && i < quantidade) { // fazemos um loop ate que a linha seja nula ou atingir a quantidade de numeros
      numeros[i++] = Integer.parseInt(linha.trim()); // aqui convertemos a linha lida para um numero inteiro e armazenamos em nosso vetor
    }
    reader.close(); // aqui fechamos o arquivo para evitar problemas futuros
    return numeros;  // aqui retornamos o vetor com os numeros lidos

  }

  // menu para escolher a opcao do tipo de entrada
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

  //menu
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