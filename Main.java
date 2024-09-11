import java.io.*;
import java.util.*;

import ProcessaEntradaESaida.AuxiliarMain;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        do {
            System.out.print("Selecione C para continuar e S para sair: ");
            opcao = scanner.next();
            if (opcao.equalsIgnoreCase("C")) {
                AuxiliarMain.main(scanner);
            } else if (!opcao.equalsIgnoreCase("S")) {
                System.out.println("Opção inválida!");
            }
        } while (!opcao.equalsIgnoreCase("S"));
        System.out.println("Sessão encerrada!");

    }
}
