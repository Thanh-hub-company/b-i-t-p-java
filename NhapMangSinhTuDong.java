import java.util.Random;
import java.util.Scanner;

public class NhapMangSinhTuDong {
    public static void main(String[] args) {
        int[] arr;
        int n;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so phan tu cua mang (n > 0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("n phai lon hon 0, vui long nhap lai!");
            }
        } while (n <= 0);

        arr = new int[n];
        Random r = new Random();
        System.out.println("Cac phan tu sinh tu dong:");
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t ");
        }
        System.out.println();
    }
}
