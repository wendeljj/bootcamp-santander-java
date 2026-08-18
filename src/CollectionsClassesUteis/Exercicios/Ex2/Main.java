package CollectionsClassesUteis.Exercicios.Ex2;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);

    static void main() {
        System.out.println("Insira um número de tel/cel: ");
        var input = scanner.nextLine();
        var number = input.replaceAll("\\D", "");

        var numberEnum = Arrays.stream(NumberEnum.values())
                .filter(n -> n.getLength() == number.length())
                .findFirst();

        if (numberEnum.isEmpty()){
            System.out.println("O valor inserido não é válido.");
            return;
        }

        var formatted = numberEnum.get()
                .getNumFormatter().
                formatter(number);

        System.out.println(formatted);
    }
}
