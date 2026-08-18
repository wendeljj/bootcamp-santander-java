package CollectionsClassesUteis.Exercicios.Ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);

        var countItems = Integer.parseInt(scanner.nextLine());
        StringBuilder json = new StringBuilder();
        StringBuilder xml = new StringBuilder();
        StringBuilder yaml = new StringBuilder();
        while (countItems > 0){
            var input = scanner.nextLine();
            String[] exit = input.split(";");
            var field = exit[0];
            var value = exit[1];
            var type = exit[2];

            var typesEnum = Arrays.stream(TypesEnum.values())
                    .filter(n -> n.getType().equalsIgnoreCase(type))
                    .findFirst();

             var valueJsonFormatted = typesEnum.get().
                     getJsonFormatter().
                     formatter(value);

             if (countItems == 1) {
                 json.append(String.format("  \"%s\": %s\n", field, valueJsonFormatted));
             } else {
                 json.append(String.format("  \"%s\": %s,\n", field, valueJsonFormatted));
             }
            xml.append(String.format("  <%s>%s</%s>\n", field, value, field));
            yaml.append(String.format("%s: %s\n", field, value));
            --countItems;
        }
        System.out.printf("{\n%s}", json);
        System.out.println("\n");
        System.out.printf("<dados>\n%s</dados>", xml);
        System.out.println("\n");
        System.out.printf("%s", yaml);
    }
}
