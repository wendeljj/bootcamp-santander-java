package FundamentosLinguagemProgramacaoJava.Exercicios;

import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.println("\n--Calculadora de área de retângulo--\n");

        System.out.print("Insira um valor em cm para a base do retângulo: ");
        double baseRectangle = scanner.nextDouble();
        System.out.print("Insira um valor em cm para a altura do retângulo: ");
        double heightRectangle = scanner.nextDouble();
        double areaRectangle = baseRectangle * heightRectangle;

        System.out.printf("\nÁrea do retângulo: %.2f\n", areaRectangle);
    }
}
