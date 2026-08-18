package EstruturasControleJava.Condicional;

import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Insira a sua idade: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Você é emancipado? ");
        var isEmancipated = scanner.nextLine().equalsIgnoreCase("s");

        if (age >= 18)
        {
            System.out.printf("%s você tem %d anos e pode dirigir!", name, age);
        }
        else if (age >= 16 && isEmancipated)
        {
            System.out.printf("%s você tem %d anos, porém por ser emancipado você pode dirigir!",
                    name, age);
        }
        else
        {
            System.out.printf("%s você não pode dirigir!", name);
        }
    }
}
