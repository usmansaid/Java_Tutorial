import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter an Operator from the list: (+, -, *, /, %)");
        String operator = scanner.next();

        System.out.print("Enter Second Number: ");
        int number2 = scanner.nextInt();

        if(operator.equals("+")){
            int addition = number1 + number2;
            System.out.println("Sum of numbers is: " + addition);
        } 
        else if(operator.equals("-")){
            int subtraction = number1 - number2;
            System.out.println("Subtraction of numbers is: " + subtraction);
        }
        else if(operator.equals("*")){
            int multiplication = number1 * number2;
            System.out.println("Multiplication of numbers is: " + multiplication);
        } 
         else if(operator.equals("/")){
            if(number2 == 0){
                System.out.println("Second number must be greater than 0!");
            }
            else{
                int division = number1 / number2;
                System.out.println("Division of numbers is: " + division);
            }
        } 
        else if(operator.equals("%")){
            int remainder = number1 % number2;
            System.out.println("Remainder of numbers is: " + remainder);
        }
        scanner.close();

    }
}