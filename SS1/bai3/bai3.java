package SS1.bai3;

public class bai3 {
    public static void main(String[] args) {

        User user = new User();

        try {
            user.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        user.setAge(25);
        System.out.println("Age: " + user.getAge());
    }
}
