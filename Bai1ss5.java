import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1ss5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "nhập email của bạn :");
        String email = sc.nextLine().trim();

        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if ( matcher.matches()) {
            System.out.println("Email hợp lệ  ");
        }else{
            System.out.println(" email không hợp lệ ");
        }
        sc.close();
    }
}
