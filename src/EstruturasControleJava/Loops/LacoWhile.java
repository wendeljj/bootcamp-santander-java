package EstruturasControleJava.Loops;

import java.util.Scanner;

public class LacoWhile
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        String name = "";

        /*
        while (!name.equalsIgnoreCase("exit"))
        {
            System.out.print("Insira um nome para prosseguir ou exit para encerrar: ");
            name = scanner.nextLine();
            System.out.println(name);
        }
         */

        /*
        while (true)
        {
            System.out.print("Insira um nome para prosseguir ou exit para encerrar: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit"))
                break;
            System.out.println(name);
        }
        */

        do
        {
            System.out.print("Insira um nome para prosseguir ou exit para encerrar: ");
            name = scanner.nextLine();
            System.out.println(name);
        } while (!name.equalsIgnoreCase("exit"));
    }
}
