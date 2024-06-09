import java.util.Scanner;
import java.util.regex.Pattern;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        System.out.println("Enter your email address");
        String validateEmail = scanner.nextLine();
        Pattern.matches(regex, validateEmail);
        System.out.println(validateEmail.matches(regex));
    }
}
