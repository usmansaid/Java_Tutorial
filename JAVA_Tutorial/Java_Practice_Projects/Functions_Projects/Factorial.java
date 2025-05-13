import java.util.Scanner;

public class Factorial {

    public static long findFactorial(Scanner scanner) {
        System.out.println("-------- Factorial Calculation -------- \n");

        while (true) {

            System.out.print("Enter a positive integer (-1 to exit): ");
            int number = scanner.nextInt();
            long factorial = 1;

            if (number == -1) {
                break;
            } else if (number < 0) {
                System.out.println("Factorial of negative is not possible. \n");
                continue;
            } else if (number == 0) {
                System.out.println("Factorial of " + number + " is 1.");
                continue;
            } else {
                for (int i = number; i >= 2; i--) {
                    factorial *= i;
                }
                return factorial;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = findFactorial(scanner);
        if (result == -1) {
            System.out.println("Program exiting...");
        } else {
            System.out.println("Factorial of your entered number is " + findFactorial(scanner));
        }
    }
}