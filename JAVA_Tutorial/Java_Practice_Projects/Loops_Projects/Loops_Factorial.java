import java.util.Scanner;

public class Loops_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables Declaration
        int number;
        int factorial;

        // Main calculation
        while (true) {
            System.out.print("Enter a number you want its factorial (Enter -1 to exit): ");
            number = scanner.nextInt();

                // Initializing factorial
                factorial = 1;

            if (number == -1) {
                break;
            } else if (number < 0) {
                System.out.print("Factorial of negative is not possible! Enter again: ");
                continue;
            } else if (number == 0) {
                System.out.println("Factorial of " + number + " is 1.");
            } else {
                for (int i = number; i >= 2; i--) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + number + " is " + factorial);
            }
        }

        scanner.close();
    }
}