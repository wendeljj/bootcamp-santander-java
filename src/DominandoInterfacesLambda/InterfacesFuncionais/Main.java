package DominandoInterfacesLambda.InterfacesFuncionais;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main (String[] args){
        List<User> users = List.of(new User("Maria", 23),
                new User("João", 19), new User("Roberto", 32),
                new User("Ana Maria", 27));

        printStringValues(user -> String.valueOf(user.age()),users);

    }

    private static void printStringValues(Function<User, String> callback, List<User> users){
        users.forEach(user -> {
            System.out.println(callback.apply(user));
        });
    }

}
