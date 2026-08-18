package EstruturasControleJava.Condicional;

import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.print("Insira um número de 1 a 7: ");
        int option = scanner.nextInt();

        /*
        switch (option)
        {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Entrada inválida!");
        }
        */

        /*
        switch (option)
        {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Entrada inválida!");
        }
        */

        var response = switch (option)
        {
            case 1, 7 ->
            {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana!", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Entrada inválida!";

        };

        System.out.print(response);
    }
}
