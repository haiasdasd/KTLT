package LeTuanHai_IT19C1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class Cau6 {
    public static void main(String[] args) {
        int n; double a;double b;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên n:");
        n = scanner.nextInt();
        a =(double) Math.sqrt(n);
        b = (int) Math.sqrt(n);
        if (a == b){
            System.out.println("Số "+n+" là số chính phương");
        }else {System.out.println("Số "+n+" không phải là số chính phương");}
    }
}
