package SS1.bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        try {
            Scanner sc  =new Scanner(System.in);
            System.out.print("Nhap năm sinh: ");
            String str=sc.nextLine();
            int number = Integer.parseInt(str.trim());
            System.out.printf("Nam vua nhap %d :",number);
        } catch (NumberFormatException e) {
            //Bắt trường hợp ghi chữ thay vì số
            System.out.println("Úi!!!Có vẽ sai ở đâu rồi");
        } finally {
            System.out.println("Tiến hành dọn rác");
        }

    }
}
