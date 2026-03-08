package SS1.bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args ){
        Scanner sc =new Scanner(System.in);
        try{
           System.out.print("Nhap so nguoi \t ");
           int n=sc.nextInt();
           System.out.print("So luong nhom ");
           int m=sc.nextInt();
           int s=n/m;
           System.out.printf("%d moi nhom !!!",s);
        }catch( ArithmeticException e){
        System.out.print("Khong the chia cho 0\n");
        }finally{
         System.out.print("Don rac ");
        }



    }
}
