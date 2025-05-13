import java.util.Scanner;

public class ThreeNumbersSort {

    public static void sortedNumbers(Scanner scanner) {

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Entered Numbers: " + num1 + " " + num2 + " " + num3);

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Sorted Numbers: " + num1 + " " + num2 + " " + num3);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sortedNumbers(scanner);
    }
}
