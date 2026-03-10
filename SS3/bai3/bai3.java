package SS3.bai3;

import java.util.*;

record User(String username, String email, String status) {}

class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User("alice", "alice@gmail.com", "ACTIVE"));
        users.add(new User("bob", "bob@yahoo.com", "INACTIVE"));
        users.add(new User("charlie", "charlie@gmail.com", "ACTIVE"));
    }

    public Optional<User> findUserByUsername(String username) {

        return users.stream()
                .filter(user -> user.username().equals(username))
                .findFirst();
    }
}

public class bai3 {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        Optional<User> user = repo.findUserByUsername("alice");

        if (user.isPresent()) {
            System.out.println("Welcome " + user.get().username());
        } else {
            System.out.println("Guest login");
        }
    }
}
