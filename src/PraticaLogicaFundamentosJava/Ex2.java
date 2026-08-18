package PraticaLogicaFundamentosJava;

import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada e separa em nome e tipo de conta
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        if (tipoConta.equalsIgnoreCase("corrente") || tipoConta.equalsIgnoreCase("poupanca"))
            System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.\n", nome, tipoConta);
        else if (tipoConta.equalsIgnoreCase("investimento"))
            System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.\n", nome, tipoConta);
        else
            System.out.println("Tipo de conta invalido.");

        scanner.close();

    }
}
