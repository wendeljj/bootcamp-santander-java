package CollectionsClassesUteis.TrabalhandoComSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main() {
        Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId)) {
        };
        users.add(new User(1, "Leonardo"));
        users.add(new User(2, "Adalberto"));
        users.add(new User(3, "Luis"));

        users.forEach(System.out::println);
    }
}
