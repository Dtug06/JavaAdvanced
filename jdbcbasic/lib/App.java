package jdbcbasic.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tranfer_system_manager";
        String user = "root";
        String password = "doanhtuan70@";

        try {
            // 1. Kết nối DB
            Connection conn = DriverManager.getConnection(url, user, password);

            // 2. Tạo statement
            Statement stmt = conn.createStatement();

            // 3. Câu lệnh SELECT
            String query = "SELECT * FROM shippers";

            // 4. Thực thi query
            ResultSet rs = stmt.executeQuery(query);

            // 5. Duyệt dữ liệu
            System.out.println("===== DANH SÁCH SHIPPERS =====");

            while (rs.next()) {
                String id = rs.getString("shipper_id");
                String name = rs.getString("full_name");
                String phone = rs.getString("phone");
                String license = rs.getString("license_type");
                double rating = rs.getDouble("rating");

                System.out.println(
                        id + " | " +
                                name + " | " +
                                phone + " | " +
                                license + " | " +
                                rating
                );
            }

            // 6. Đóng kết nối
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}