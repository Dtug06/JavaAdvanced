package Session9.btth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductDatabase db = ProductDatabase.getInstance();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n---------------------- QUẢN LÝ SẢN PHẨM ----------------------");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Xem danh sách sản phẩm");
            System.out.println("3. Cập nhật thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại sản phẩm: ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = sc.nextDouble();
                    if (type == 1) {
                        System.out.print("Nhập trọng lượng (kg): ");
                        double weight = sc.nextDouble();
                        Product p = ProductFactory.createProduct(1, id, name, price, weight);
                        db.addProduct(p);
                    } else if (type == 2) {
                        System.out.print("Nhập dung lượng (MB): ");
                        double size = sc.nextDouble();
                        Product p = ProductFactory.createProduct(2, id, name, price, size);
                        db.addProduct(p);
                    } else {
                        System.out.println("Loại sản phẩm không hợp lệ!");
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm:");
                    db.displayAllProducts();
                    break;
                case 3:
                    break;

                case 4:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    String removeId = sc.nextLine();
                    db.removeProduct(removeId);
                    System.out.println("Đã xóa sản phẩm có ID: " + removeId);
                    break;

                case 5:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        }
    }
}

