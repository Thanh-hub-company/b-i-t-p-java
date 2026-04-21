import java.util.Scanner;


    public class  Bai2Ss4{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập kích thước mảng
            System.out.print("Nhập số hàng: ");
            int rows = scanner.nextInt();
            System.out.print("Nhập số cột: ");
            int cols = scanner.nextInt();

            int[][] arr = new int[rows][cols];

            // Nhập giá trị cho mảng
            System.out.println("Nhập các phần tử cho mảng 2 chiều:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Phần tử [" + i + "][" + j + "]: ");
                    arr[i][j] = scanner.nextInt();
                }
            }

            // Tính tổng số chẵn và số lẻ
            int sumEven = 0;
            int sumOdd = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (arr[i][j] % 2 == 0) {
                        sumEven += arr[i][j];
                    } else {
                        sumOdd += arr[i][j];
                    }
                }
            }

            // In kết quả
            System.out.println("Tổng các số chẵn: " + sumEven);
            System.out.println("Tổng các số lẻ: " + sumOdd);

            scanner.close();
        }
    }


