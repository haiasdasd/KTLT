package LeTuanHai_IT19C1;
import java.lang.Math;

import java.util.Scanner;
public class Cau8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lần lượt số nguyên a và b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));

    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
}
