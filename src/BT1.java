import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ");
        String chuoi = sc.nextLine();
        System.out.println(chuoi.isEmpty());
        if(chuoi.isEmpty()){
            System.out.println("chuỗi rỗng");
        }else {
            System.out.println("chuỗi không rỗng");
        }
    }
}
