package CollectionsClassesUteis.APIStream.Aula1;


import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        /*

        var value1 = Stream.generate(() -> new Random().nextInt())
        .limit(5)
        .toArray(Integer[]::new);

        for (var v : value1){
            System.out.println(v);
        }

        System.out.println("=======================");

        var value2 = IntStream.generate(() -> new Random().nextInt())
        .limit(5)
        .toArray();

        for (var v : value2){
            System.out.println(v);
        }

        */

        /*
        var value = Stream.of("Maria", "João", "Luana", "Leandro", "André", "Leonardo")
                .parallel()
                .filter(n -> n.endsWith("o"))
                .findFirst();

        System.out.println(value);
         */

        var value2 = Stream.of("Claudio", "Ana", "Renan", "João")
                .reduce("", (a, b) -> a  + b + "; ");

        System.out.println(value2);
    }
}
