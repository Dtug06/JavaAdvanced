package SS3.bai2;

import java.util.ArrayList;
import java.util.List;

record User(String username, String email, String status) {}
public class bai2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("alice", "alice@gmail.com", "ACTIVE"));
        users.add(new User("bob", "bob@yahoo.com", "INACTIVE"));
        users.add(new User("charlie", "charlie@gmail.com", "ACTIVE"));

        users.stream()
                .filter(user -> user.email().endsWith("gmail.com"))
                .map(user -> user.username())
                .forEach(System.out::println);
    }
}
