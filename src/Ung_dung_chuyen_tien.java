import java.util.Scanner;
public class Ung_dung_chuyen_tien {
    public static void main(String[] args) {
       double usd;
        Scanner sr=new Scanner(System.in);
        System.out.print("Nhập số tiền USD: "+"$");
        usd= sr.nextDouble();
        double chuyendoi = usd*23000;
        System.out.println("Giá trị tiền VNĐ: "+chuyendoi+" VNĐ");
    }
}
