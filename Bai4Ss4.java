import java.util.Scanner;

    public class Bai4Ss4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập kích thước mảng
            System.out.print("Nhập số phần tử của mảng: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Mảng không có phần tử");
                return;
            }

            int[] arr = new int[n];

            // Nhập giá trị cho mảng
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            // Tạo mảng mới để lưu kết quả
            int[] result = new int[n];
            int index = 0;

            // Đưa số chẵn vào trước (giữ nguyên thứ tự)
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    result[index++] = arr[i];
                }
            }

            // Đưa số lẻ vào sau (giữ nguyên thứ tự)
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    result[index++] = arr[i];
                }
            }

            // In kết quả
            System.out.println("Mảng sau khi sắp xếp (chẵn trước, lẻ sau):");
            for (int num : result) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }


