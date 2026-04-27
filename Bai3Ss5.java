
    import java.util.Scanner;

    public class Bai3Ss5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mật khẩu cần kiểm tra: ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Mật khẩu hợp lệ");
            } else {
                System.out.println("Mật khẩu không hợp lệ");
            }
        }

        public static boolean isValidPassword(String password) {
            if (password.length() < 8) {
                return false;
            }

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if ("@#$!%".indexOf(c) != -1) {
                    hasSpecial = true;
                }
            }

            return hasUpper && hasLower && hasDigit && hasSpecial;
        }
    }

