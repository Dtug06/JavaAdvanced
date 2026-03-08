package SS1.bai6;

public class Main {

    public static void main(String[] args) {
        Use user = new Use();
        try {
            user.setName("Nam");
            user.setAge(-5);
            UserService.processUser(user);
            user.display();

        }
        catch (InvalidAgeException e) {

            Logger.logError("Lỗi nghiệp vụ khi thiết lập tuổi", e);

        }
        catch (java.io.IOException e) {

            Logger.logError("Lỗi hệ thống khi ghi file", e);

        }

        System.out.println("Chương trình vẫn tiếp tục chạy.");
    }
}
