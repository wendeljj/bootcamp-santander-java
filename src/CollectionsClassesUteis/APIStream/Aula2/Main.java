package CollectionsClassesUteis.APIStream.Aula2;

import CollectionsClassesUteis.APIStream.Aula2.domain.Contact;
import CollectionsClassesUteis.APIStream.Aula2.domain.User;

import java.util.*;
import java.util.stream.*;

import static CollectionsClassesUteis.APIStream.Aula2.domain.ContactType.EMAIL;
import static CollectionsClassesUteis.APIStream.Aula2.domain.ContactType.PHONE;
import static CollectionsClassesUteis.APIStream.Aula2.domain.Sex.FEMALE;
import static CollectionsClassesUteis.APIStream.Aula2.domain.Sex.MALE;

public class Main {
    static void main() {
        List<User> users = new ArrayList<>(generateUsers());

        /*
        users.sort(Comparator.comparing(User::age));

        users.forEach(System.out::println);
         */

        /*
        var values = users.stream()
                .filter(u -> u.contacts().stream().allMatch(c -> c.type() == EMAIL))
                .toList();

        values.forEach(System.out::println);

         */

        /*
        var values2 = users.stream()
                .flatMap(u -> u.contacts().stream())
//                .filter(c -> c.type().equals(EMAIL))
                .sorted(Comparator.comparing(Contact::description))
                .map(c -> String.format("{\n    'description': '%s'\n    'type': '%s'\n}", c.description(), c.type()))
                .toList();

        values2.forEach(System.out::println);

         */

        /*
        var values3 = users.stream()
                .flatMap(u -> u.contacts().stream())
                .limit(1)
                .toList();

        values3.forEach(System.out::println);

         */

        var values4 = users.stream()
//                .filter(u -> u.sex().equals(FEMALE))
                .collect(Collectors.toMap(User::name, user -> user));

        values4.forEach((key, value4) -> System.out.printf("key: %s | value: %s\n", key, value4));
    }

    private static List<User> generateUsers(){
        var contacts1 = List.of(
                new Contact("(11)91234-2918", PHONE),
                new Contact("joao@gmail.com", EMAIL)
        );

        var contacts2 = List.of(
                new Contact("(11)95434-7932", PHONE),
                new Contact("maria@gmail.com", EMAIL)
        );

        var contacts3 = List.of(
                new Contact("(11)99348-7438", PHONE)
        );

        var contacts4 = List.of(
                new Contact("adalberto@gmail.com", EMAIL),
                new Contact("adalberto@outlook.com", EMAIL)
        );

        var contacts5 = List.of(
                new Contact("(11)97456-4436", PHONE),
                new Contact("(11)2342-3421", PHONE)
        );

        var user1 = new User("João", 26, MALE, new ArrayList<>(contacts1));
        var user2 = new User("Maria", 28, FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Marcos", 41, MALE, new ArrayList<>(contacts3));
        var user4 = new User("Adalberto", 37, MALE, new ArrayList<>(contacts4));
        var user5 = new User("Andreia", 43, FEMALE, new ArrayList<>(contacts5));
        var user6 = new User("Marcia", 37, FEMALE, new ArrayList<>());

        return List.of(user1, user2, user3, user4, user5, user6);
    }

}
