import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class BT3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        int n = scan.nextInt();
        // phân tích số nguyên dương n
        List<Integer> listSo = phantichsoN(n);
        // in kết quả ra màn hình
        System.out.printf("Kết quả: %d = ", n);
        int size = listSo.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listSo.get(i) + " x ");
        }
        System.out.print(listSo.get(size - 1));
    }

    public static List<Integer> phantichsoN(int n) {
        int i = 2;
        List<Integer> listSo = new ArrayList<Integer>();
        // phân tích
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listSo.add(i);
            } else {
                i++;
            }
        }

        if (listSo.isEmpty()) {
            listSo.add(n);
        }
        return listSo;
    }
}
