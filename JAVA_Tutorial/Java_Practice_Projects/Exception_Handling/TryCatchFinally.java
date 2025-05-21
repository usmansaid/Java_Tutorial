package Exception_Handling;

import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second num2: ");
        int num2 = scanner.nextInt();

        
        try{
            int divide = num1 / num2;
            System.out.println(divide);
        }catch(ArithmeticException e){
            System.out.println("Divide by zero, not possible!");
        }finally{
            System.out.println("Exiting...");
            scanner.close();
        }
        // The finally will always run wether the code runs correctly or have an exception. It usually uses for the closing of Objects like Scanner and FileReader.
    }
}