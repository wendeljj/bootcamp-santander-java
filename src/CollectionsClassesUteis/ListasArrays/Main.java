package CollectionsClassesUteis.ListasArrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        String[] arrayString = {"Buu", "Aurax"};
        List<String> test = new ArrayList<>();
        test.add("a");
        test.add("2");
        test.add("ola");
        test.add(arrayString[0]);
        test.add(arrayString[1]);
        test.forEach(System.out::println);
    }
}
