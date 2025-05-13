import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Loops has three main parts:
        // 1- Initialization
        // 2- Condition
        // 3- Body of loop

        // Printing table

        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + number * i); // What if print() instead of println()
        }
         
        // Printing sum of n numbers
        int sum = 0;

        for(int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println(sum);


        scanner.close();
    }
}
