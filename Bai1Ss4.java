import java.util.Scanner;

public class Bai1Ss4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập kích thước mảng
            System.out.print("Nhập kích thước của mảng: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];

            // Nhập giá trị cho mảng
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            // Thuật toán sắp xếp nổi bọt (Bubble Sort) giảm dần
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        // Hoán đổi
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            // In mảng sau khi sắp xếp
            System.out.println("Mảng sau khi sắp xếp giảm dần:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }
