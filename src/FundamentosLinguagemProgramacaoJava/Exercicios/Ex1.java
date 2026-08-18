package FundamentosLinguagemProgramacaoJava.Exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.println("\n--Sistema saudaçao básica--\n");

        System.out.print("Insira o seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Insira o ano do seu nascimento: ");
        int dateBirth = scanner.nextInt();
        int age = OffsetDateTime.now().getYear() - dateBirth;

        System.out.printf("\nOlá %s você tem %d anos\n", name, age);
    }
}
