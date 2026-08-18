package CollectionsClassesUteis.Exercicios.Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static void main() {
        calculator();
    }

    private static void calculator(){
        while (true){
            System.out.println("=====Calculadora=====");
            System.out.print("1. Soma\n2. Subtração\n3. Sair\n\nEscolha uma opção: ");
            int option = Integer.parseInt(scanner.nextLine());

            if (option < 1 || option > 3){
                continue;
            }

            if (option == 3){
                break;
            }

            var selectedOption = OperationEnum.values()[option - 1];

            System.out.print("Insira os números separados por (', '): ");
            var numberInput = scanner.nextLine();
            var numbers = Arrays.stream(numberInput.split(",\\s*"))
                    .mapToLong(Long::parseLong)
                    .toArray();

            var result = selectedOption.getOperationCallback().exec(numbers);

            var operation = numberInput.replaceAll(",\\s*", " " + selectedOption.getSymbol() + " ");

            System.out.printf("%s = %d\n\n", operation, result);
        }
    }
}
