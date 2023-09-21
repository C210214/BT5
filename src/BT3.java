import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ:");
        StringBuffer chuoi = new StringBuffer(sc.nextLine());
        System.out.println(chuoi.reverse());
    }
}
