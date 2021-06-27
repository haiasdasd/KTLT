package LeTuanHai_IT19C1;

import java.util.Scanner;

public class Cau9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng A: ");
        int n = scan.nextInt();
        int[] A = new int[n];
        // Nhập và hiển thị các phần tử trong mảng A
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            A[i] = scan.nextInt();
        }
        System.out.println("\nMảng A là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        //Hàm đếm mảng A chia hết cho 3 nhưng không chia hết cho 2
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("\n Có " + count + " giá trị chia hết cho 3 mà không chia hết cho 2");
        //  Hàm đếm số phần tử trong mảng A có giá trị chẵn
        int demchan = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                demchan++;
            }
        }
        System.out.println("Có " + demchan + " số lẻ trong mạng");
        // Hàm tìm giá trị lớn nhất của mảng A
        int max=A[0];
        for(int i=0;i<n;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        //tách mảng A ra mảng B
        int k = 0;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                C[k] = A[i];
                k++;
            }
        }
        System.out.println("Các phần tử của mảng B là: ");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + "\t");
        }
        //Phần tử X có tồn tại trong mảng A


        int X, t;
        System.out.println("Nhập vào giá trị cần kiểm tra");
        t = scan.nextInt();
        for (X = 0; X < n; X++) {
            if (A[X] == t) {
                System.out.println(t + " tồn tại trong mảng A");
                break;
            }
        }
        if (X == n)
            System.out.println(t + " không tồn tại trong mảng A");

    }
}
