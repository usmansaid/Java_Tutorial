import java.util.Scanner;

public class NumberPalindrome {

    public static void numberPalindrome(Scanner scanner){
        System.out.print("Enter a possitive integer: ");
        int integer = scanner.nextInt();
        int original = integer; // preserving original value of integer to use it for comparison at last
        int reversed = 0;

        while (integer != 0) {
            int lastDigit = integer % 10;
            reversed = reversed * 10 + lastDigit;
            integer /= 10;
        }
        if(original == reversed){
            System.out.println("Integer is palindrome!");
        }else{
            System.out.println("Integer is not a Palindrome!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberPalindrome(scanner);
    }
}
