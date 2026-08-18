package DominandoInterfacesLambda.Exercicios.Ex2;

import DominandoInterfacesLambda.Exercicios.Ex2.Classes.Clothing;
import DominandoInterfacesLambda.Exercicios.Ex2.Classes.Culture;
import DominandoInterfacesLambda.Exercicios.Ex2.Classes.Feeding;
import DominandoInterfacesLambda.Exercicios.Ex2.Classes.Health;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            System.out.println("\n--Sistema de calculo de impostos sob produtos--\n");
            System.out.print("1. Alimentação\n2. Saúde e bem estar\n" +
                    "3. Vestuário\n4. Cultura\n" +
                    "5. Encerrar a aplicação\n\nEscolha uma opção: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 -> {
                    System.out.print("Insira o custo: ");
                    double custo = Double.parseDouble(scanner.nextLine());
                    System.out.printf("Valor em tributos: %.2f\n", new Feeding(custo).addTribute());
                }
                case 2 -> {
                    System.out.print("Insira o custo: ");
                    double custo = Double.parseDouble(scanner.nextLine());
                    System.out.printf("Valor em tributos: %.2f\n", new Health(custo).addTribute());
                }
                case 3 -> {
                    System.out.print("Insira o custo: ");
                    double custo = Double.parseDouble(scanner.nextLine());
                    System.out.printf("Valor em tributos: %.2f\n", new Clothing(custo).addTribute());
                }
                case 4 -> {
                    System.out.print("Insira o custo: ");
                    double custo = Double.parseDouble(scanner.nextLine());
                    System.out.printf("Valor em tributos: %.2f\n", new Culture(custo).addTribute());
                }
                case 5 -> {
                    System.out.println("Aplicação encerrada.");
                    isRunning = false;
                }
                default -> {
                    System.out.println("\nOpção inválida.");
                }
            }
        }
    }
}
