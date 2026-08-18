package PraticaLogicaFundamentosJava;

import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        // Lê os dois valores inteiros da entrada (saldo e valor da transação)
        int saldo = scanner.nextInt();
        int valorTransacao = scanner.nextInt();

        // TODO: Verifique se o saldo é suficiente e imprima a mensagem apropriada
        if (saldo >= valorTransacao)
            System.out.println("Transacao aprovada");
        else
            System.out.println("Saldo insuficiente");

        scanner.close();
    }
}
