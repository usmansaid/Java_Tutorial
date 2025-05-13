// First you will need to import Scanner package:
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // +> Scanner is a class. scanner is a variable. new Scanner creates a new object takes input.

        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();       // .nextInt() is a method reads datatype of input variable. There are many scanner methods.

        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        int result = num1 + num2;
        System.out.println("Your Sum is: " + result);

        scanner.close(); // You must have to close. Why close is necessary? Because your memory will be reserved even if you didn't use code. So, by closing scanner, it goes to garbage collector to clean up memory.

    }
}
