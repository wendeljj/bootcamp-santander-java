package FundamentosLinguagemProgramacaoJava.Exercicios;

import java.util.Scanner;
public class Ex2
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.println("\n--Calculadora de área de quadrado--\n");

        System.out.print("Insira um valor em cm para o lado do quadrado: ");
        double sideSquare = scanner.nextDouble();
        double areaSquare = sideSquare * sideSquare;

        System.out.printf("A área do quadrado é %.2fcm", areaSquare);
    }
}
