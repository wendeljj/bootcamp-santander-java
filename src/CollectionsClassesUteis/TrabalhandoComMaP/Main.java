package CollectionsClassesUteis.TrabalhandoComMaP;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new TreeMap<>();

        System.out.print("Insira a quantidade de elementos que voce quer adicionar: ");

        int loopQuantity = Integer.parseInt(scanner.nextLine());

        while (loopQuantity > 0){
            System.out.print("Insira a chave e o dado da informação separado por (,): ");

            String input = scanner.nextLine();
            String[] parts = input.split(",\\s*");
            String key = parts[0];
            String value = parts[1];

            map.put(key, value);

            System.out.println(map);

            loopQuantity --;
        }

    }
}
