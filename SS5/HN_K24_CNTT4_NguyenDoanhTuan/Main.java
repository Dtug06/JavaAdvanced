
package SS5.HN_K24_CNTT4_NguyenDoanhTuan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        int choice;

        do {
            System.out.println("========= PRODUCT MANAGEMENT SYSTEM =========");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật số lượng theo ID");
            System.out.println("4. Xóa sản phẩm đã hết hàng");
            System.out.println("5. Thoát chương trình");
            System.out.println("=============================================");
            System.out.print("Mời bạn chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("==> Thêm sản phẩm mới");
                    System.out.print("Nhập ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = sc.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập loại sản phẩm: ");
                    String category = sc.nextLine();

                    Product p = new Product(id, name, price, quantity, category);
                    products.add(p);
                    System.out.println("Thêm sản phẩm thành công!");
                    break;

                case 2:
                    System.out.println("==> Danh sách sản phẩm:");
                    if (products.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {
                        for (Product prod : products) {
                            System.out.println("ID: " + prod.getId() +
                                    " | Tên: " + prod.getName() +
                                    " | Giá: " + prod.getPrice() +
                                    " | SL: " + prod.getQuantity() +
                                    " | Loại: " + prod.getCategory());
                        }
                    }
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Xóa sản phẩm đã hết hàng");
                    products.removeIf(prod -> prod.getQuantity() == 0);
                    System.out.println("Đã xóa các sản phẩm hết hàng!");
                    break;

                case 5:
                    System.out.println(" Thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        } while (choice != 5);
    }
}
