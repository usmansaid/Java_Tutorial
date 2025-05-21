import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eneter num1: ");
        int a = scanner.nextInt();
        
        System.out.print("Eneter num2: ");
        int b = scanner.nextInt();
        scanner.close();
        
        try {
            
            int c = a / b;
            System.out.println("Division: " + c) ;

        } catch (ArithmeticException e) 
        {
            System.out.println("Division by zero is not possible!");

        }
       
        System.out.println("Program continues..."); // This line will run only in exception handling, without Exception Handling, it will not run. So proving that the code continues after exception handling.
    }
}