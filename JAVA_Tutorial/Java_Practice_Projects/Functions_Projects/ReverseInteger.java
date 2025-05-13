import java.util.Scanner;

public class ReverseInteger {

    public static void reverseInteger(Scanner scanner){
        System.out.print("Enter an integer you want its reverse: ");
        int integer = scanner.nextInt();

        while(integer != 0){
            int lastDigit = integer % 10;
            System.out.print(lastDigit);
            integer /= 10;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        reverseInteger(scanner);
    }
}
