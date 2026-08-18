package FundamentosLinguagemProgramacaoJava.Exercicios;

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.println("\n--Calculadora de diferença entre idade de duas pessoas--\n");

        System.out.print("Insira o nome da 1a pessoa: ");
        String name1 = scanner.nextLine();
        System.out.print("Insira a idade da 1a pessoa: ");
        int age1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Insira o nome da 2a pessoa: ");
        String name2 = scanner.nextLine();
        System.out.print("Insira a idade da 2a pessoa: ");
        int age2 = Integer.parseInt(scanner.nextLine());

        int olderAge = Math.max(age1, age2);
        int youngerAge = Math.min(age1, age2);

        System.out.printf("A diferença de idade entre %s e %s é de %d anos!", name1, name2, olderAge - youngerAge);
    }
}
