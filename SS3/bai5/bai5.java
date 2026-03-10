package SS3.bai5;

import java.util.*;

record User(String username, String email, String status) {}

public class bai5 {

    public static void main(String[] args) {

        List<User> users = List.of(
                new User("alexander", "alex@gmail.com", "ACTIVE"),
                new User("bob", "bob@gmail.com", "ACTIVE"),
                new User("charlotte", "char@gmail.com", "ACTIVE"),
                new User("Benjamin", "ben@gmail.com", "INACTIVE"),
                new User("tom", "tom@gmail.com", "ACTIVE")
        );
        users.stream()
                .sorted((u1, u2) ->
                        Integer.compare(
                                u2.username().length(),
                                u1.username().length()
                        ))
                .limit(3)
                .forEach(user -> System.out.println(user.username()));
    }
}
