import java.util.Scanner;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password.length() >= 8) {
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean digit = false;
            boolean specialChar = false;
            for (int i = 0; i < password.length(); i++) {
                String ch = password.substring(i, i + 1);
                if (ch.equals(ch.toUpperCase()) && ch.compareTo("A") >= 0 && ch.compareTo("Z") <= 0) {
                    upperCase = true;
                } else if (ch.equals(ch.toLowerCase()) && ch.compareTo("a") >= 0 && ch.compareTo("z") <= 0) {
                    lowerCase = true;
                } else if (ch.compareTo("0") >= 0 && ch.compareTo("9") <= 0) {
                    digit = true;
                } else {
                    specialChar = true;
                }

            }

            return upperCase && lowerCase && digit && specialChar;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Enter password: \n Password must be: \n 1- At least 8 characters long. \n 2- Must contain UpperCase letters. \n 3- Must contain lowerCase letters. \n 4- Must contain digits. \n 5- Must contain special characters. ");

        String password = scanner.nextLine();
        scanner.close();

        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid!");
        }
    }
}
