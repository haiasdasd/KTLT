package LeTuanHai_IT19C1;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class Cau4 {
    public static void main(String[] args) {
        int a;int b;double x1;int c;double x2;double delta;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập hệ số phương trình ax2 + bx + c =0:");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        delta = (double) (b*b) - 4*a*c;
        if (delta > 0){
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Vậy phương trình có 2 nghiệm là:"+ decimalFormat.format(x1)+" và "+decimalFormat.format(x2));
        }else if(delta == 0){
            x1 = -b/a;
            System.out.println("Vậy phương trình có nghiệm kép là:"+ decimalFormat.format(x1));
        }else{
        System.out.println("Vậy phương trình vô nghiệm");}
    }
}
