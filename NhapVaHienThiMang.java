import java.util.Scanner;

public class NhapVaHienThiMang {
    public static void main(String[] args) {
        int arr[],n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang (n > 0): ");
        n = sc.nextInt();
        while (n <= 0) {
            System.out.println("n phai lon hon 0, vui long nhap lai: ");
            n = sc.nextInt();
        }

        arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Cac phan tu cua mang la:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
