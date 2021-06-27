package LeTuanHai_IT19C1;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        int n; int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên n:");
        n = scanner.nextInt();
        a =0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                a++;
            }
        }
        if (a < 3){
            System.out.println("Số "+n+" là số nguyên tố");
        }else {System.out.println("Số "+n+" không phải là số nguyên tố");}
    }
}
