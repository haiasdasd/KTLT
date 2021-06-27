package LeTuanHai_IT19C1;

import java.util.Scanner;

public class Cau7 {
    public static void main(String[] args) {
        int x; int y;int d;
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập số nguyên x:");
        x = scan.nextInt();
        while (x < 4){
            Scanner scanx = new Scanner(System.in);
            System.out.println("số nguyên x phải > 3, đề nghị nhập lại:");
            x = scanx.nextInt();
        }
        System.out.println("nhập số nguyên y:");
        y = scan.nextInt();
        while (y < 4){
            Scanner scany = new Scanner(System.in);
            System.out.println("số nguyên y phải > 3, đề nghị nhập lại:");
            y = scany.nextInt();
        }
        System.out.println("số nguyên x là:"+x+"\nsố nguyên y là:"+y);
        d =x; x=y;y=d;
        System.out.println("Sau khi đã hoán vị\nsố nguyên x là:"+x+"\nsố nguyên y là:"+y);
    }
}
