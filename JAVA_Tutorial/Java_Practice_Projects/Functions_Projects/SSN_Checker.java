import java.util.Scanner;

public class SSN_Checker {

    // Main method for SSN checking
    public static void checking_SSN(Scanner scanner) {

        while (true) {
            System.out.print("Enter the SSN (DDD-DD-DDDD): ");
            String SSN = scanner.next();

            if (SSN_Format(SSN) == true) {
                System.out.println("Your SSN format is Valid!");
            } else {
                System.out.println("Your SSN format is Invalid!");
            }

            while (true) {
                System.out.print("Press 'y' to try again or 'b' to exit: ");
                String input = scanner.next().toLowerCase();

                if (input.equals("y")) {
                    break;
                } else if (input.equals("b")) {
                    return;
                } else {
                    System.out.print("Invalid entry!");
                    continue;
                }

            }

        }
    }

    // Helper function for SSN format checking
    public static boolean SSN_Format(String SSN) {
        return SSN.matches("\\d{3}-\\d{2}-\\d{4}");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checking_SSN(scanner);
    }
}