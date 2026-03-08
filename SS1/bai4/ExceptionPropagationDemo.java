package SS1.bai4;

import java.io.IOException;

public class ExceptionPropagationDemo {

    public static void saveToFile() throws IOException {
        System.out.println("Saving user data to file...");

        throw new IOException("Lỗi ghi file: Không thể truy cập ổ đĩa!");
    }
    public static void processUserData() throws IOException {
        System.out.println("Processing user data...");

        saveToFile();
    }

    public static void main(String[] args) {

        try {
            processUserData();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi lưu dữ liệu người dùng.");
            System.out.println("Chi tiết lỗi: " + e.getMessage());
        }
        System.out.println("Chương trình vẫn tiếp tục chạy.");
    }
}
