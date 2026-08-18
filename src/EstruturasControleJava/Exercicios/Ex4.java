package EstruturasControleJava.Exercicios;

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.println("\n-----\n");

        System.out.print("Insira um primeiro termo: ");
        int n1 = scanner.nextInt();
        int nLoop = 0;
        boolean verify = true;

        while (verify)
        {
            System.out.print("Insira um termo maior que o primeiro: ");
            nLoop = scanner.nextInt();
            if (nLoop < n1)
                continue;
            if (nLoop % n1 == 0)
                verify = false;
        }

        System.out.printf("\n%d %% %d = 0\n\nFim do Programa\n", nLoop, n1);
    }
}
