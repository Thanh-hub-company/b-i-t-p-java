 import java.util.Scanner;
    public class Bai3Ss4 {
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

            // Sắp xếp mảng giảm dần bằng Selection Sort
            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }
                // Hoán đổi
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }

            // In mảng sau khi sắp xếp
            System.out.println("Mảng sau khi sắp xếp giảm dần:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Nhập số cần tìm
            System.out.print("Nhập số cần tìm: ");
            int target = scanner.nextInt();

            // Tìm kiếm tuyến tính
            int linearIndex = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    linearIndex = i;
                    break;
                }
            }

            // Tìm kiếm nhị phân (trên mảng giảm dần)
            int left = 0, right = n - 1;
            int binaryIndex = -1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == target) {
                    binaryIndex = mid;
                    break;
                }
                // Vì mảng giảm dần nên điều kiện đảo ngược
                if (arr[mid] < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // In kết quả tìm kiếm
            if (linearIndex != -1) {
                System.out.println("Tìm kiếm tuyến tính: tìm thấy tại vị trí " + linearIndex);
            } else {
                System.out.println("Tìm kiếm tuyến tính: không tìm thấy.");
            }

            if (binaryIndex != -1) {
                System.out.println("Tìm kiếm nhị phân: tìm thấy tại vị trí " + binaryIndex);
            } else {
                System.out.println("Tìm kiếm nhị phân: không tìm thấy.");
            }

            scanner.close();
        }
    }



