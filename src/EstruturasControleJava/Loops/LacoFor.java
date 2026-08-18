package EstruturasControleJava.Loops;

import java.util.Scanner;

public class LacoFor
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        /*
        for(int i = 0; i < 100; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("O número é par e foi pulado");
                continue;
            }

            System.out.println(i);

        }
         */

        /*
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
        */

        for (var arg : args)
        {
            System.out.println(arg);
        }
    }
}
