import java.util.Scanner;

public class KhaiBaoVaNhap {
    public static void main(String[] args) {
        int arr[] [];
        int row , columns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang : ");
        row = sc.nextInt();
        System.out.println("Nhap so cot cua mang : ");
        columns = sc.nextInt();
        arr = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhap phan tu arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
