package EstruturasControleJava.Exercicios;

import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;

        System.out.println("\n--Calculadora Par ou Impar--\n");

        do
        {
            if (n1 >= n2)
                System.out.println("\nO segundo valor nao pode ser maior e nem igual que o primeiro valor!\n");
            System.out.print("Insira um número inteiro: ");
            n1 = scanner.nextInt();
            System.out.print("Insira um número inteiro maior que o anterior: ");
            n2 = scanner.nextInt();
        } while (n1 >= n2);

        System.out.print("Escolha par ou impar (Digite 'par' para escolher números pares para o intervalo ): ");
        var par = scanner.next().equalsIgnoreCase("par");
        System.out.println();

        if (par)
        {
            while(n1 < n2)
            {
                if (n1 % 2 == 0)
                {
                    System.out.printf("%d\n", n1);
                }
                n1++;
            }
        } else
        {
            while(n1 < n2)
            {
                if (n1 % 2 != 0)
                {
                    System.out.printf("%d\n", n1);
                }
                n1++;
            }
        }

    }
}
