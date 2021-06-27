import java.util.Scanner;
public class BT2 {
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
        //Hàm đếm mảng A chia hết cho 5 nhưng không chia hết cho 6
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0 && A[i] % 6 != 0) {
                count++;
            }
        }
        System.out.println("\n Có " + count + " giá trị chia hết cho 5 mà không chia hết cho 6");
        //  Hàm đếm số phần tử trong mảng A có giá trị lẻ
        int demle = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 1) {
                demle++;
            }
        }
        System.out.println("Có " + demle + " số lẻ trong mạng");
        // Hàm đếm số phần tử mảng A có giá trị lớn hơn giá trị trung bình của các phần tử
        int tong = 0;
        int TB = 0;
        for (int i = 0; i < n; i++) {
            tong += A[i];
        }
        TB = tong / n;
        int demTB = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] >= TB) {
                demTB++;
            }
        }
        System.out.println("Có " + demTB + " phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị trung bình");
        //tách mảng A ra mảng C
        int k = 0;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 1) {
                C[k] = A[i];
                k++;
            }
        }
        System.out.println("Các phần tử của mảng C là: ");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + "\t");
        }
        //Phần tử lặp lại của mảng A


        for (int i = 0; i < n; i++) {
            int a = 0;
            for (int j = i+1; j < n; j++)
            if (A[i] == A[j]) {
                a++;
            }
            if (a >= 1) {
                System.out.println("\nTồn tại giá trị " + A[i] + " lặp lại trong mạng.");
            }
        }

    }
}
