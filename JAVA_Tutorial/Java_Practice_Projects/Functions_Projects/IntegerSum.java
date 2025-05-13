import java.util.Scanner;

public class IntegerSum {

    public static void sumDigits(Scanner scanner){

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        int sum = 0;

        while(integer != 0){
           int lastDigit = integer % 10;
            sum += lastDigit;
            integer /= 10;
        }

        System.out.println("Sum of all digits in your integer is: " + sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sumDigits(scanner);
    }
}
