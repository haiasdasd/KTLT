import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên n:");
        n = scanner.nextInt();

        while (n < 3){
            Scanner scan = new Scanner(System.in);
            System.out.println("số nguyên n phải > 2, đề nghị nhập lại:");
            n = scan.nextInt();
        }
        // kiểm tra điều kiện
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn!");
        } else {
            System.out.println(n + " là số lẻ");
        }
    }
}
