package LeTuanHai_IT19C1;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        int a; int b;int c;
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập số nguyên a:");
        a = scan.nextInt();
        while (a < 3){
            Scanner scana = new Scanner(System.in);
            System.out.println("số nguyên a phải > 2, đề nghị nhập lại:");
            a = scana.nextInt();
        }
        System.out.println("nhập số nguyên b:");
        b = scan.nextInt();
        while (b < 3){
            Scanner scanb = new Scanner(System.in);
            System.out.println("số nguyên b phải > 2, đề nghị nhập lại:");
            b = scanb.nextInt();
        }
        System.out.println("nhập số nguyên c:");
        c = scan.nextInt();
        while (c < 3){
            Scanner scana = new Scanner(System.in);
            System.out.println("số nguyên c phải > 2, đề nghị nhập lại:");
            c = scana.nextInt();
        }
        int max = a;
        if (max >= b  ) {
            if (max >= c) {
                System.out.println("số nguyên a = " + a + " là số lớn nhất");
            } else {

                System.out.println("số nguyên c = " + c + " là số lớn nhất");
            }
        }            else {
            if ( b > c) {
                System.out.println("số nguyên b = "+b+" là số lớn nhất");
            }else{
                System.out.println("số nguyên c = " + c + " là số lớn nhất");
            }
            }

        }
    }

