package EstruturasControleJava.Exercicios;

import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.println("\n---Calculadora de IMC---\n");

        System.out.print("Insira sua altura em metros: ");
        double height = scanner.nextDouble();

        System.out.print("Insira seu peso em quilos: ");
        double weight = scanner.nextDouble();

        double imc = weight / (height * height);


         if (imc <= 18.5)
         {
             System.out.println("\nAbaixo do peso");
         }
         else if (imc >= 18.6 && imc <= 24.9)
         {
             System.out.println("\nPeso ideal");
         }
         else if (imc >= 25 && imc <= 29.9)
         {
             System.out.println("\nLevemente acima do peso");
         }
         else if (imc >= 30 && imc <= 34.9)
         {
             System.out.println("\nObesidade grau I");
         }
         else if (imc >= 35.0 && imc <= 39.9)
         {
             System.out.println("\nObesidade Grau II (Severa)");
         }
         else
         {
             System.out.println("\nObesidade III (Mórbida)");
         }
    }
}
