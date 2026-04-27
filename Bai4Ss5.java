
import java.util.Random;
import java.util.Scanner;

    public class Bai4Ss5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập độ dài n (1 ≤ n ≤ 1000): ");
            int n = scanner.nextInt();

            if (n < 1 || n > 1000) {
                System.out.println("Giá trị n không hợp lệ!");
                return;
            }

            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            Random random = new Random();
            StringBuilder sb = new StringBuilder(n);

            for (int i = 0; i < n; i++) {
                int index = random.nextInt(chars.length());
                sb.append(chars.charAt(index));
            }

            System.out.println("Chuỗi ngẫu nhiên: " + sb.toString());
        }
    }



