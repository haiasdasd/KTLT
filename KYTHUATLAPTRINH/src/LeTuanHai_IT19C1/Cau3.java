package LeTuanHai_IT19C1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Cau3 {
    public static void main(String[] args) {
        int a;int b;double x;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập hệ số phương trình ax + b =0:");
        a = scan.nextInt();
        b = scan.nextInt();
        x = (double) -b/a;
        System.out.println("Nghiệm của phương trình là:"+ decimalFormat.format(x));
    }
}
