package EstruturasControleJava.Exercicios;

import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);
        System.out.println("\n---Tabuada---\n");
        System.out.print("Insira um valor para calcular sua tabuada de 1 a 10: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d - %d x %d = %d\n", i, number, i, number * i );
        }
    }
}
